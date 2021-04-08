package br.health.workflow.db.semantic.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "event")
@Data
@NoArgsConstructor
public class EventEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
    @Column
    private Long event_id;
	
	@Column
	private String eventType; 	// onReceive
	
	@Column
	private String objectKind; 	// BloodPressure
	
	@Column 
	private boolean multipleKinds=false;

	
	public EventEntity(String eventType, String objectKind) {
		this.eventType = eventType;
		this.objectKind = objectKind;
	}

}
