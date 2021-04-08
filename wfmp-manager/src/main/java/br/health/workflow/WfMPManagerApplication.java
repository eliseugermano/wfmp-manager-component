package br.health.workflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class WfMPManagerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(WfMPManagerApplication.class, args);
	}

}
