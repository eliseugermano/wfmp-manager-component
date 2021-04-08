package br.health.workflow.core.communication;

import br.health.workflow.core.communication.config.RestTemplateConfig;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Set;

@Log4j2
@Component
public class SyncCommunication {

	@Autowired
	private RestTemplate rest;

	public ResponseEntity restRequest(RestTemplateConfig attributes) {
		log.info("RestTemplate attributes: {}", attributes);
		HttpEntity<?> entityReq = new HttpEntity<>(attributes.getBody(), attributes.getHttpHeaders());
		StringBuilder url = new StringBuilder();

		if (attributes.getQueryParams() != null) {
			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(attributes.getApiHost() + attributes.getPath()).queryParams(attributes.getQueryParams());
			url.append(builder.build().toString());
		} else {
			url.append(attributes.getApiHost());
			url.append(attributes.getPath());
		}

		if (attributes.getPathVariables() != null) {
			Set<String> keys = attributes.getPathVariables().keySet();
			for (String key: keys)
				url.replace(url.indexOf(key), url.indexOf(key) + key.length(), attributes.getPathVariables().get(key));
		}

		ResponseEntity<?> response;
		try {
			if (attributes.getPageable()) {
				response = rest.exchange(
						url.toString(),
						attributes.getHttpMethod(),
						entityReq,
						String.class
				);
			} else if (attributes.getSingleReturn()) {
				response = rest.exchange(
						url.toString(),
						attributes.getHttpMethod(),
						entityReq,
						new ParameterizedTypeReference<String>() {}
				);
			} else {
				response = rest.exchange(
						url.toString(),
						attributes.getHttpMethod(),
						entityReq,
						new ParameterizedTypeReference<List<?>>() {}
				);
			}
		} catch (HttpClientErrorException exception) {
			response = new ResponseEntity<>(exception.getResponseBodyAsString(), exception.getStatusCode());
		}
		log.info("Request response: {}", response);
		return response;
	}

}
