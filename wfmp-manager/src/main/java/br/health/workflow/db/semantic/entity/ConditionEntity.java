package br.health.workflow.db.semantic.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * grammar
 *
 * conditionDef	: 'with' expression 'end'
 * expression	: expression operator expression
 * 	            | statement
 * 	            | binaryOperation;
*/

@Entity
@Table(name = "condition")
@Data
@NoArgsConstructor
public class ConditionEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
    @Column
    private Long condition_id;
	
	@OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinColumn(name = "binary_operation_id")
	private BinaryOperationEntity binaryOperation = null;
	
	@OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinColumn(name = "time_function_id")
	private TimeFunctionEntity timeFunction = null;

	public boolean statementEval(String booleanCondition, boolean value){
		if(booleanCondition.equals("isTrue"))
			return value;
		else
			return !value;
	}

}
