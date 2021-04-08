package br.health.workflow.controller;

import br.health.workflow.core.communication.AsyncCommunication;
import br.health.workflow.core.data.Buffer;
import lombok.extern.log4j.Log4j2;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/amqp")
@Log4j2
public class MessageQueueController {
	
	@Autowired
	private AsyncCommunication asyncCommunication;
	
	/**
	 * Publish a message in a RabbitMQ topic
	 * 
	 * @param data message
	 * @param dataType message type
	 * @param exchange RabbitMQ exchange
	 * @param route RabbitMQ route
	 * @param token JWT
	 * @return HTTP Status
	 */
	@RequestMapping(value = "/publish", method = RequestMethod.POST)
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity userPatient(@RequestBody String data, @RequestHeader("Data-Type") String dataType, @RequestHeader("Exchange") String exchange, @RequestHeader("Route") String route, @RequestHeader("Access-Token") String token) {
		try {
			asyncCommunication.sendMessage(data, dataType, exchange, route, token);
		} catch (Exception e) {
			log.error(e);
			return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity(HttpStatus.OK);
	}
	
	/**
	 * Listening a queue in a RabbitMQ node
	 * 
	 * @param queue name
	 */
	@RequestMapping(value = "/subscribe", method = RequestMethod.POST)
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity listenerQueue(@RequestHeader("Queue") String queue) {
		try {
			asyncCommunication.listenerQueue(queue, new Buffer());
		} catch (Exception e) {
			log.error(e);
			return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		}
  		return new ResponseEntity(HttpStatus.OK);
    }
	
	/**
	 * Create a exchange in a RabbitMQ node
	 * 
	 * @param data message queue structure
	 */
  	@RequestMapping(value = "/exchange", method = RequestMethod.POST)
	@PreAuthorize("hasRole('ADMIN')")
	public void createExchange(@RequestBody String data) {
  		JSONObject json = new JSONObject(data);
  		asyncCommunication.createExchange(json.getString("name"));
  	}
  	
  	/**
	 * Create a queue in a RabbitMQ node
	 * 
	 * @param data message queue structure
	 */
  	@RequestMapping(value = "/queue", method = RequestMethod.POST)
	@PreAuthorize("hasRole('ADMIN')")
	public void createQueue(@RequestBody String data) {
  		JSONObject json = new JSONObject(data);
  		asyncCommunication.createQueue(json.getString("name"), json.getString("exchange"), json.getString("route"));
  	}
  	
  	/**
	 * Delete a queue in a RabbitMQ node
	 * 
	 * @param data message queue structure
	 */
  	@RequestMapping(value = "/queue", method = RequestMethod.DELETE)
	@PreAuthorize("hasRole('ADMIN')")
	public void deleteQueue(@RequestBody String data) {
  		JSONObject json = new JSONObject(data);
  		asyncCommunication.deleteQueue(json.getString("name"));
  	}

}