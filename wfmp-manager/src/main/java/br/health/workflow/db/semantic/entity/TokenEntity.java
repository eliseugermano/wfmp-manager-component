package br.health.workflow.db.semantic.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "token")
@Data
@NoArgsConstructor
public class TokenEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
    @Column
    private Long token_id;
	
	@Column
	private String id;

}
