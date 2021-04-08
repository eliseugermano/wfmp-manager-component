package br.health.workflow.db.communication.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "microservice")
@Data
@NoArgsConstructor
public class MicroserviceEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
    @Column
    private Long microservice_id;
	
	@Column(unique=true)
	private String reference; // identifier that is used by DSL users
	
	@Column
	private String host; // address
	
	@Column
	private String protocol; // communication protocol
	
	@Column
	private String clientId; // Oauth2 protocol attribute
	
	@Column
	private String clientSecret; // Oauth2 protocol attribute
	
	@Column
	private String description;
	
	@OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinTable(name = "microservice_endpoint", joinColumns = @JoinColumn(name = "microservice_id") , inverseJoinColumns = @JoinColumn(name = "endpoint_id"))
	private List<EndpointEntity> endpoints;
	
	public EndpointEntity getEndPointByReference(String reference){
		EndpointEntity endpoint = null;
		for (EndpointEntity e : endpoints) {
			if(e.getReference().equals(reference)){
				endpoint = e;
				break;
			}
		}
		return endpoint;
	}

}