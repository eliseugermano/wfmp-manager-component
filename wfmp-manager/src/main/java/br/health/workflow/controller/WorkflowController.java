package br.health.workflow.controller;

import br.health.workflow.controller.dto.WorkflowDTO;
import br.health.workflow.core.communication.AsyncCommunication;
import br.health.workflow.core.communication.SyncCommunication;
import br.health.workflow.core.communication.config.RestTemplateConfig;
import br.health.workflow.core.data.Buffer;
import br.health.workflow.db.semantic.entity.PetriNetEntity;
import br.health.workflow.service.WorkflowService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.task.TaskExecutor;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Async;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

@RestController
@RequestMapping("/api/workflow")
@Log4j2
public class WorkflowController {

	@Autowired
	private WorkflowService workflowService;
  	
  	@Autowired
  	private AsyncCommunication asyncCommunication;
  	
  	@Value("${google.host.worker}")
  	private String workerHost;

	@Autowired
	private TaskExecutor taskExecutor;
  	
  	private Buffer buffer = new Buffer();
	    
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	@PreAuthorize("hasRole('ADMIN') || hasRole('HEALTH_PROFESSIONAL')")
	public @ResponseBody PetriNetEntity register(@RequestParam("uploadedFile") MultipartFile file) throws IOException{
		return workflowService.register(file);
	}
	
	@RequestMapping(value = "/run", method = RequestMethod.POST)
	@PreAuthorize("hasRole('ADMIN') || hasRole('HEALTH_PROFESSIONAL') || hasRole('PATIENT')")
	public @ResponseBody HashMap<String, Object> runProcess(@RequestHeader("Authorization") String authorization, @RequestBody WorkflowDTO workflowDTO){
		log.info("[Authorization] \t\t-> {}", authorization);

		PetriNetEntity workflow = workflowService.getByReference(workflowDTO.getReference());
		try {
			String serializedPetriNet = new ObjectMapper().writeValueAsString(workflow);
			workflowDTO.setSerializedPetriNet(serializedPetriNet);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		log.info("[JSON] \t\t-> [Publish] {}", workflow.getName());

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
		headers.add("Authorization", authorization);

		RestTemplateConfig restTemplateAttributes = new RestTemplateConfig(
				headers,
				workflowDTO,
				workerHost,
				"/api/worker/run",
				HttpMethod.POST,
				Boolean.TRUE
				);

		// Send to worker
		workflowService.sendToWorker(restTemplateAttributes);
		
		// response message
		HashMap<String, Object> response = new LinkedHashMap<>();
		response.put("id", workflowDTO.getReference());
		response.put("status", "running");
		return response;
	}
	
	@RequestMapping(value = "/publish", method = RequestMethod.POST)
	@PreAuthorize("hasRole('ADMIN') || hasRole('HEALTH_PROFESSIONAL') || hasRole('PATIENT')")
	public ResponseEntity userPatient(@RequestBody String data, @RequestHeader("Data-Type") String dataType, @RequestHeader("Exchange") String exchange, @RequestHeader("Route") String route, @RequestHeader("Access-Token") String token) {
		try {
			asyncCommunication.sendMessage(data, dataType, exchange, route, token);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@RequestMapping(value = "/subscribe", method = RequestMethod.POST)
	@PreAuthorize("hasRole('ADMIN') || hasRole('HEALTH_PROFESSIONAL') || hasRole('PATIENT')")
	public ResponseEntity receiveMessage(@RequestHeader("Queue") String queue) {
		try {
			asyncCommunication.listenerQueue(queue, buffer);
		} catch (Exception e) {
			log.error(e);
			return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		}
  		return new ResponseEntity(HttpStatus.OK);
    }
	
	@RequestMapping(value = "/create/queues/batch", method = RequestMethod.POST)
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity testCreateQueues(@RequestHeader("quantity") int quantity) {
		taskExecutor.execute(() -> {
			try {
				long tempoInicial = System.currentTimeMillis();
				log.info("\t >>>>>>>>>>>>> Tempo Inicial ["+tempoInicial+"]");
				for (int i = 0; i < quantity; i++) {
					asyncCommunication.createQueue("queue"+i, "service_data", "user003.bloodpressure");
				}
				long tempoFinal = System.currentTimeMillis();
				log.info("\t >>>>>>>>>>>>> Tempo final ["+tempoFinal+"]");
				log.info("\t >>>>>>>>>>>>> Processing time "+(tempoFinal - tempoInicial)+" ms.");
			} catch (Exception e) {
				log.error(e);
			}
		});
  		return new ResponseEntity(HttpStatus.OK);
    }
	
	@RequestMapping(value = "/delete/queues/batch", method = RequestMethod.DELETE)
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity testDeleteQueues(@RequestHeader("quantity") int quantity) {
		taskExecutor.execute(() -> {
			try {
				long tempoInicial = System.currentTimeMillis();
				log.info("\t >>>>>>>>>>>>> Tempo Inicial ["+tempoInicial+"]");
				for (int i = 0; i < quantity; i++) {
					asyncCommunication.deleteQueue("queue"+i);
				}
				long tempoFinal = System.currentTimeMillis();
				log.info("\t >>>>>>>>>>>>> Tempo final ["+tempoFinal+"]");
				log.info("\t >>>>>>>>>>>>> Processing time "+(tempoFinal - tempoInicial)+" ms.");
			} catch (Exception e) {
				log.error(e);
			}
		});
  		return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(value = "/reference/{reference}", method = RequestMethod.GET)
	@PreAuthorize("hasRole('ADMIN') || hasRole('HEALTH_PROFESSIONAL') || hasRole('PATIENT')")
	public ResponseEntity getPetriNet(@PathVariable("reference") String reference) {
		PetriNetEntity petriNet = workflowService.getByReference(reference);
		if (petriNet == null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(petriNet, HttpStatus.OK);
	}

	@RequestMapping(value = "/authorities", method = RequestMethod.GET, produces = "application/json")
	@ApiOperation(value = "Busca um roles pelo token JWT", response = GrantedAuthority[].class)
	public ResponseEntity<?> getAuthorities() {
		return new ResponseEntity<>(SecurityContextHolder.getContext().getAuthentication().getAuthorities(), HttpStatus.OK);
	}
}
