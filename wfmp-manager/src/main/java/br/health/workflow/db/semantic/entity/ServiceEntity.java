package br.health.workflow.db.semantic.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "service")
@Data
@NoArgsConstructor
public class ServiceEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
    @Column
    private Long service_id;
	
	@Column
	private String name;

}
