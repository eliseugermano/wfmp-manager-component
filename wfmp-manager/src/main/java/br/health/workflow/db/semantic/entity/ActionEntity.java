package br.health.workflow.db.semantic.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "action")
@Data
@NoArgsConstructor
public class ActionEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
    @Column
    private Long action_id;
	
	@OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	@Fetch(FetchMode.SUBSELECT)
	@JoinTable(name = "action_calls", joinColumns = @JoinColumn(name = "action_id") , inverseJoinColumns = @JoinColumn(name = "service_call_id"))
	private List<ServiceCallEntity> calls;

}
