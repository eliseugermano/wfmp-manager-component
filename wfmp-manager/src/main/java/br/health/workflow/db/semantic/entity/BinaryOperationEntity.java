package br.health.workflow.db.semantic.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "binary_operation")
@Data
@NoArgsConstructor
public class BinaryOperationEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
    @Column
    private Long binary_operation_id;
	
	@Column
	private String booleanCondition;
	
	@Column
	private String objectCondition;
	
	@Column
	private String attrCondition;
	
	@Column
	private String operator;

	
	public BinaryOperationEntity(String booleanCondition, String objectCondition, String attrCondition, String operator) {
		super();
		this.booleanCondition = booleanCondition;
		this.objectCondition = objectCondition;
		this.attrCondition = attrCondition;
		this.operator = operator;
	}
	
	public boolean booleanOperationValue(boolean booleanValue1, boolean booleanValue2, String operator) {
		switch (operator) {
		case "==":
			return (booleanValue1 == booleanValue2);
		case "and":
			return (booleanValue1 && booleanValue2);
		case "or":
			return (booleanValue1 || booleanValue2);
		default:
			return false;
		}
	}
	
	public boolean relationalOperation(int aritmeticValue1, int aritmeticValue2, String operator) {
		switch (operator) {
		case "==":
			return (aritmeticValue1 == aritmeticValue2);
		case "!=":
			return (aritmeticValue1 != aritmeticValue2);
		case "<":
			return (aritmeticValue1 < aritmeticValue2);
		case ">":
			return (aritmeticValue1 > aritmeticValue2);
		case "<=":
			return (aritmeticValue1 <= aritmeticValue2);
		case ">=":
			return (aritmeticValue1 >= aritmeticValue2);
		default:
			return false;
		}
	}

}
