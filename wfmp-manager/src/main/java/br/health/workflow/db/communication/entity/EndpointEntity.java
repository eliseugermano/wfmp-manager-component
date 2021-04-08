package br.health.workflow.db.communication.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "endpoint")
@Data
@NoArgsConstructor
public class EndpointEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
    @Column
    private Long endpoint_id;
	
	@Column
	private String reference; // identifier that is used by DSL users
	
	@Column
	private String resource; // Web Service Resource
	
	@Column
	private String method; // HTTP Method
	
	@Column
	private String acceptType; // Input type
	
	@Column
	private String contentType; // Output type
	
	@Column
	private String dataStructure; // Data type
	
	@Column
	private String protocol; // Communication Protocol
	
	public EndpointEntity(String resource, String method, String acceptType, String contentType) {
		this.resource = resource;
		this.method = method;
		this.acceptType = acceptType;
		this.contentType = contentType;
	}

}
