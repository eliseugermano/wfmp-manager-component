package br.health.workflow.db.semantic.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "place")
@Getter
@Setter
@NoArgsConstructor
@JsonIdentityInfo(
		generator = ObjectIdGenerators.PropertyGenerator.class,
		property = "place_id"
)
public class PlaceEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
    @Column
    private Long place_id;
	
	@Column
	private String name;
	
	@ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
	@JoinTable(name = "place_tokens", joinColumns = @JoinColumn(name = "place_id") , inverseJoinColumns = @JoinColumn(name = "token_id"))
	private List<TokenEntity> tokens = new ArrayList<>();
		
	@ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinTable(name = "place_transitions", joinColumns = @JoinColumn(name = "place_id") , inverseJoinColumns = @JoinColumn(name = "transition_id"))
	private List<TransitionEntity> transitions = new ArrayList<>();

	public PlaceEntity(String name) {
		this.name = name;
		tokens = new ArrayList<>();
	}
	
	public void addToken(TokenEntity token){
		this.tokens.add(token);
	}

	public TokenEntity removeToken(String tokenId) {
		for (TokenEntity token: tokens) {
			if (token.getId().equals(tokenId)) {
				tokens.remove(token);
				return token;
			}
		}
		return null;
	}
	
	public void addTransition(EventEntity event, ConditionEntity condition, ActionEntity action, List<PlaceEntity> targetPlace) {
		transitions.add(new TransitionEntity(this.name, event, condition, action, targetPlace));
	}
	
}
