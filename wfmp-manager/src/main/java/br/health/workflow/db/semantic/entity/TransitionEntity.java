package br.health.workflow.db.semantic.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "transition")
@Getter
@Setter
@NoArgsConstructor
@JsonIdentityInfo(
		generator = ObjectIdGenerators.PropertyGenerator.class,
		property = "transition_id"
)
public class TransitionEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
    @Column
    private Long transition_id;
	
	@OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinColumn(name = "event_id")
	private EventEntity event;
	
	@OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinColumn(name = "condition_id")
	private ConditionEntity condition;
	
	// @Fetch(FetchMode.SUBSELECT)
	
	@OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinColumn(name = "action_id")
	private ActionEntity action = new ActionEntity();
	
	@Column
	private String sourcePlaceName; // size > 1 => and join
	
	@ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinTable(name = "places_target", joinColumns = @JoinColumn(name = "transition_id") , inverseJoinColumns = @JoinColumn(name = "place_target_id"))
	private List<PlaceEntity> targets; // size > 1 => and split

	public TransitionEntity(String sourcePlaceName, EventEntity event, ConditionEntity condition, ActionEntity action, List<PlaceEntity> targets) {
		this.sourcePlaceName = sourcePlaceName;
		this.targets = targets;
		
		this.event = event;
		this.condition = condition;
		this.action = action;
	}

}
