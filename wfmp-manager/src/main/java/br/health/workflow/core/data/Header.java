package br.health.workflow.core.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Header {
	
	private String type;
	private String token;

}
