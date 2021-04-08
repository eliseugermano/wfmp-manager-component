package br.health.workflow.db.semantic.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * grammar
 *
 * statement		:
 * 					| timeFunction '=> {equal,' value '}'
 * 					| timeFunction '=> {equal, {' value (' or 'value)*'}}'
 * 					| timeFunction '=> {between, {'value' and 'value'}}';
 * timeFunction	: 'currentTime'
 * 				| 'currentDate'
 * 				| 'currentDayWeek'
 * 				| 'waitTime';
*/

@Entity
@Table(name = "time_function")
@Data
@NoArgsConstructor
public class TimeFunctionEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
    @Column
    private Long time_function_id;
	
	@Column
	private String type;
	
	@Column
	private String operator;
	
	@ElementCollection
	@CollectionTable(name ="range")
	private List<String> range;

}
