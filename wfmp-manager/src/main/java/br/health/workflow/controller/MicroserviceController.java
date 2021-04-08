package br.health.workflow.controller;

import br.health.workflow.db.communication.entity.MicroserviceEntity;
import br.health.workflow.db.communication.repository.MicroserviceRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/microservice")
@Log4j2
public class MicroserviceController {

	@Autowired
	private MicroserviceRepository microserviceRepository;


	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> getMicroservice(@PathVariable("id") Long id){
		MicroserviceEntity microservice = microserviceRepository.findById(id).orElse(null);
		if (microservice == null)
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(microservice, HttpStatus.OK);
	}

	@RequestMapping(value = "reference/{reference}", method = RequestMethod.GET)
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> getMicroservice(@PathVariable("reference") String reference){
		MicroserviceEntity microservice = microserviceRepository.findByReference(reference);
		if (microservice == null)
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(microservice, HttpStatus.OK);
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> getMicroservices(){
		Iterable<MicroserviceEntity> all = microserviceRepository.findAll();
		List<MicroserviceEntity> microserviceList = new ArrayList<>();
		all.forEach(microserviceList::add);
		return new ResponseEntity<>(microserviceList, HttpStatus.OK);
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> register(@RequestBody MicroserviceEntity microservice){
		MicroserviceEntity savedMicroservice = microserviceRepository.save(microservice);
		if (savedMicroservice.getMicroservice_id() == null)
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		return new ResponseEntity<>(microservice, HttpStatus.OK);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> update(@RequestBody MicroserviceEntity microservice){
		MicroserviceEntity savedMicroservice = microserviceRepository.save(microservice);
		if (savedMicroservice.getMicroservice_id() == null)
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		return new ResponseEntity<>(microservice, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> delete(@PathVariable("id") Long id){
		MicroserviceEntity microservice = microserviceRepository.findById(id).orElse(null);
		if (microservice == null)
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		microserviceRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
