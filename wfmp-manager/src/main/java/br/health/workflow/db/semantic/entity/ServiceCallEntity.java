package br.health.workflow.db.semantic.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "service_call")
@Data
@NoArgsConstructor
public class ServiceCallEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
    @Column
    private Long service_call_id;
	
	@Column
	private String endPoint;
	
	@Column
	private String parameter;
	
	@Column
	private boolean callWorkflow=false; // is workflow to true value and is service to false value
	
	@Column
	private boolean syncCallService=false;
	
	@Column
	private String export;
	
	@Transient
	private boolean andSplit = false;

}