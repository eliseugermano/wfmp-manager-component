// Generated from br\health\workflow\core\parser\antlr4\HealthWfMS.g4 by ANTLR 4.2
package br.health.workflow.core.parser.antlr4;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HealthWfMSParser}.
 */
public interface HealthWfMSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HealthWfMSParser#struct}.
	 * @param ctx the parse tree
	 */
	void enterStruct(@NotNull HealthWfMSParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by {@link HealthWfMSParser#struct}.
	 * @param ctx the parse tree
	 */
	void exitStruct(@NotNull HealthWfMSParser.StructContext ctx);

	/**
	 * Enter a parse tree produced by {@link HealthWfMSParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive(@NotNull HealthWfMSParser.PrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link HealthWfMSParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive(@NotNull HealthWfMSParser.PrimitiveContext ctx);

	/**
	 * Enter a parse tree produced by {@link HealthWfMSParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_expr(@NotNull HealthWfMSParser.Arithmetic_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HealthWfMSParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_expr(@NotNull HealthWfMSParser.Arithmetic_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link HealthWfMSParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(@NotNull HealthWfMSParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HealthWfMSParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(@NotNull HealthWfMSParser.OperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link HealthWfMSParser#logical_entity}.
	 * @param ctx the parse tree
	 */
	void enterLogical_entity(@NotNull HealthWfMSParser.Logical_entityContext ctx);
	/**
	 * Exit a parse tree produced by {@link HealthWfMSParser#logical_entity}.
	 * @param ctx the parse tree
	 */
	void exitLogical_entity(@NotNull HealthWfMSParser.Logical_entityContext ctx);

	/**
	 * Enter a parse tree produced by {@link HealthWfMSParser#targetDef}.
	 * @param ctx the parse tree
	 */
	void enterTargetDef(@NotNull HealthWfMSParser.TargetDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link HealthWfMSParser#targetDef}.
	 * @param ctx the parse tree
	 */
	void exitTargetDef(@NotNull HealthWfMSParser.TargetDefContext ctx);

	/**
	 * Enter a parse tree produced by {@link HealthWfMSParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(@NotNull HealthWfMSParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link HealthWfMSParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(@NotNull HealthWfMSParser.RootContext ctx);

	/**
	 * Enter a parse tree produced by {@link HealthWfMSParser#eventDef}.
	 * @param ctx the parse tree
	 */
	void enterEventDef(@NotNull HealthWfMSParser.EventDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link HealthWfMSParser#eventDef}.
	 * @param ctx the parse tree
	 */
	void exitEventDef(@NotNull HealthWfMSParser.EventDefContext ctx);

	/**
	 * Enter a parse tree produced by {@link HealthWfMSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull HealthWfMSParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HealthWfMSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull HealthWfMSParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link HealthWfMSParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(@NotNull HealthWfMSParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HealthWfMSParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(@NotNull HealthWfMSParser.AttributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link HealthWfMSParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull HealthWfMSParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HealthWfMSParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull HealthWfMSParser.ValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link HealthWfMSParser#firstPlaceDef}.
	 * @param ctx the parse tree
	 */
	void enterFirstPlaceDef(@NotNull HealthWfMSParser.FirstPlaceDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link HealthWfMSParser#firstPlaceDef}.
	 * @param ctx the parse tree
	 */
	void exitFirstPlaceDef(@NotNull HealthWfMSParser.FirstPlaceDefContext ctx);

	/**
	 * Enter a parse tree produced by {@link HealthWfMSParser#numeric_entity}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_entity(@NotNull HealthWfMSParser.Numeric_entityContext ctx);
	/**
	 * Exit a parse tree produced by {@link HealthWfMSParser#numeric_entity}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_entity(@NotNull HealthWfMSParser.Numeric_entityContext ctx);

	/**
	 * Enter a parse tree produced by {@link HealthWfMSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull HealthWfMSParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HealthWfMSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull HealthWfMSParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link HealthWfMSParser#comparison_expr}.
	 * @param ctx the parse tree
	 */
	void enterComparison_expr(@NotNull HealthWfMSParser.Comparison_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HealthWfMSParser#comparison_expr}.
	 * @param ctx the parse tree
	 */
	void exitComparison_expr(@NotNull HealthWfMSParser.Comparison_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link HealthWfMSParser#kind}.
	 * @param ctx the parse tree
	 */
	void enterKind(@NotNull HealthWfMSParser.KindContext ctx);
	/**
	 * Exit a parse tree produced by {@link HealthWfMSParser#kind}.
	 * @param ctx the parse tree
	 */
	void exitKind(@NotNull HealthWfMSParser.KindContext ctx);

	/**
	 * Enter a parse tree produced by {@link HealthWfMSParser#trasitionDef}.
	 * @param ctx the parse tree
	 */
	void enterTrasitionDef(@NotNull HealthWfMSParser.TrasitionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link HealthWfMSParser#trasitionDef}.
	 * @param ctx the parse tree
	 */
	void exitTrasitionDef(@NotNull HealthWfMSParser.TrasitionDefContext ctx);

	/**
	 * Enter a parse tree produced by {@link HealthWfMSParser#booleanFunction}.
	 * @param ctx the parse tree
	 */
	void enterBooleanFunction(@NotNull HealthWfMSParser.BooleanFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HealthWfMSParser#booleanFunction}.
	 * @param ctx the parse tree
	 */
	void exitBooleanFunction(@NotNull HealthWfMSParser.BooleanFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link HealthWfMSParser#eventType}.
	 * @param ctx the parse tree
	 */
	void enterEventType(@NotNull HealthWfMSParser.EventTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HealthWfMSParser#eventType}.
	 * @param ctx the parse tree
	 */
	void exitEventType(@NotNull HealthWfMSParser.EventTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link HealthWfMSParser#endPoint}.
	 * @param ctx the parse tree
	 */
	void enterEndPoint(@NotNull HealthWfMSParser.EndPointContext ctx);
	/**
	 * Exit a parse tree produced by {@link HealthWfMSParser#endPoint}.
	 * @param ctx the parse tree
	 */
	void exitEndPoint(@NotNull HealthWfMSParser.EndPointContext ctx);

	/**
	 * Enter a parse tree produced by {@link HealthWfMSParser#callDef}.
	 * @param ctx the parse tree
	 */
	void enterCallDef(@NotNull HealthWfMSParser.CallDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link HealthWfMSParser#callDef}.
	 * @param ctx the parse tree
	 */
	void exitCallDef(@NotNull HealthWfMSParser.CallDefContext ctx);

	/**
	 * Enter a parse tree produced by {@link HealthWfMSParser#syncCallDef}.
	 * @param ctx the parse tree
	 */
	void enterSyncCallDef(@NotNull HealthWfMSParser.SyncCallDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link HealthWfMSParser#syncCallDef}.
	 * @param ctx the parse tree
	 */
	void exitSyncCallDef(@NotNull HealthWfMSParser.SyncCallDefContext ctx);

	/**
	 * Enter a parse tree produced by {@link HealthWfMSParser#conditionDef}.
	 * @param ctx the parse tree
	 */
	void enterConditionDef(@NotNull HealthWfMSParser.ConditionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link HealthWfMSParser#conditionDef}.
	 * @param ctx the parse tree
	 */
	void exitConditionDef(@NotNull HealthWfMSParser.ConditionDefContext ctx);

	/**
	 * Enter a parse tree produced by {@link HealthWfMSParser#actionDef}.
	 * @param ctx the parse tree
	 */
	void enterActionDef(@NotNull HealthWfMSParser.ActionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link HealthWfMSParser#actionDef}.
	 * @param ctx the parse tree
	 */
	void exitActionDef(@NotNull HealthWfMSParser.ActionDefContext ctx);

	/**
	 * Enter a parse tree produced by {@link HealthWfMSParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(@NotNull HealthWfMSParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link HealthWfMSParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(@NotNull HealthWfMSParser.OperandContext ctx);

	/**
	 * Enter a parse tree produced by {@link HealthWfMSParser#timeFunction}.
	 * @param ctx the parse tree
	 */
	void enterTimeFunction(@NotNull HealthWfMSParser.TimeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HealthWfMSParser#timeFunction}.
	 * @param ctx the parse tree
	 */
	void exitTimeFunction(@NotNull HealthWfMSParser.TimeFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link HealthWfMSParser#otherPlaceDef}.
	 * @param ctx the parse tree
	 */
	void enterOtherPlaceDef(@NotNull HealthWfMSParser.OtherPlaceDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link HealthWfMSParser#otherPlaceDef}.
	 * @param ctx the parse tree
	 */
	void exitOtherPlaceDef(@NotNull HealthWfMSParser.OtherPlaceDefContext ctx);

	/**
	 * Enter a parse tree produced by {@link HealthWfMSParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(@NotNull HealthWfMSParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link HealthWfMSParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(@NotNull HealthWfMSParser.ObjectContext ctx);
}