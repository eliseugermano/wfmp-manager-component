package br.health.workflow.db.semantic.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "petrinet")
@Data
@NoArgsConstructor
public class PetriNetEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
    @Column
    private Long petrinet_id;
	
	@Column(unique=true)
	private String name;
	
	@OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinColumn(name = "place_id")
	private PlaceEntity start;
	
	private String amqpQueueName;
	private String amqpRoute;
	
}
