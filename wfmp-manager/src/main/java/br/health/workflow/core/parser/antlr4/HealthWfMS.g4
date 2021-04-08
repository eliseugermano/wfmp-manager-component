grammar HealthWfMS;

root  			: 'workflow' IDENTIFIER '{' firstPlaceDef otherPlaceDef+ '}';

firstPlaceDef	: 'start task' '{' actionDef+ '}';

otherPlaceDef	: 'task' IDENTIFIER '{' trasitionDef+ '}';

trasitionDef	: 'case' eventDef '{' conditionDef '{' actionDef '}' '}'
				| 'case' eventDef '{' actionDef '}'
				;

eventDef		: eventType
				| // epsilon
				;

conditionDef	: 'with' expression
				| // epsilon
				;

actionDef		: (targetDef callDef)+;

eventType		: 'onReceive' kind			// Asynchronous call
				| 'onReturn'  kind endPoint // Synchronous call
				;

kind			: primitive
				| struct;
				
primitive		: 'integer' | 'decimal' | 'boolean' | 'string';

struct			: IDENTIFIER
				| IDENTIFIER '.' struct;

expression		: expression AND expression 	// Logical expression with and
				| expression OR expression  	// Logical expression with or
				| statement						// Logical functions
				| comparison_expr               // Comparison expression
				| LPAREN expression RPAREN    	// Logical expression in parentheses
				| logical_entity                // Logical entity
				;

operand 		: arithmetic_expr;

operator		: '<' | '>' | '<=' | '>=' | '=' | '<>';

arithmetic_expr	: arithmetic_expr MULT arithmetic_expr  // Arithmetic expression multiplication
				| arithmetic_expr DIV arithmetic_expr   // Arithmetic expression division
				| arithmetic_expr PLUS arithmetic_expr  // Arithmetic expression addition
				| arithmetic_expr MINUS arithmetic_expr // Arithmetic expression subtraction
				| MINUS arithmetic_expr                 // Arithmetic expression negation
				| LPAREN arithmetic_expr RPAREN         // Arithmetic expression with parentheses
				| numeric_entity                        // Numeric entity (variable)
				;
				
comparison_expr : operand operator operand 			// Comparison expression with operator
                | LPAREN comparison_expr RPAREN 	// Comparison expression with parentheses
                ;

logical_entity	: (TRUE | FALSE) // Logical constant
				| IDENTIFIER     // Logical variable
				;

targetDef		: 'target' IDENTIFIER
				| // epsilon
				;

callDef			: syncCallDef 'call' endPoint
				| syncCallDef 'call' endPoint '->' 'FromService' '->' struct // Change of place in Petri Net
				| syncCallDef 'call' endPoint '->' 'FromWorkflow' '->' struct // Change of place in Petri Net
				| syncCallDef 'end.workflow'
				| syncCallDef 'end.workflow.export' struct
				;

syncCallDef		: 'sync'
				| // epsilon
				;

statement		: booleanFunction LPAREN object RPAREN
				| timeFunction '.' 'equal' LPAREN value RPAREN
				| timeFunction '.' 'equal' LPAREN value (',' value)* RPAREN
				| timeFunction '.' 'between' LPAREN value ',' value RPAREN
				| 'waitTime' 'until' value // Waits for the specified time after reaching the state
				;

booleanFunction	: 'isTrue'
				| 'isFalse';

timeFunction	: 'currentTime'		// Compare the current time with the specified time 
				| 'currentDate'		// Compare the current date with the specified date
				| 'currentDayWeek'	// Compare the current day of the week with the specified day
				;

value			: NUMBER
				| object;

NUMBER			: [0-9]+;

object			: IDENTIFIER
				| IDENTIFIER '.' IDENTIFIER
				| endPoint;

endPoint		: IDENTIFIER LPAREN RPAREN
				| IDENTIFIER LPAREN attribute (',' attribute)* RPAREN;
				
attribute		: IDENTIFIER
				| IDENTIFIER '.' IDENTIFIER
				;

DECIMAL 		: '-'?[0-9]+('.'[0-9]+)? ;

IDENTIFIER		: [a-zA-Z_][a-zA-Z_0-9]* ;

TRUE  			: 'true';
FALSE 			: 'false';

LPAREN 			: '(' ;
RPAREN 			: ')' ;

MULT  			: '*' ;
DIV   			: '/' ;
PLUS  			: '+' ;
MINUS 			: '-' ;

AND 			: 'and' ;
OR  			: 'or' ;

numeric_entity	: DECIMAL			// Numeric constant
				| IDENTIFIER		// Numeric variable
				;

WS				: [ \t\r\n]+ -> skip ; // Skip spaces, tabs, newlines
