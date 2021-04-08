package br.health.workflow.controller.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.Hashtable;

@Data
@NoArgsConstructor
public class WorkflowDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String reference;
	private String accessToken;
	private String userId;
	private Hashtable<String, JSONObject> workflowMemory;
	private String serializedPetriNet;

}
