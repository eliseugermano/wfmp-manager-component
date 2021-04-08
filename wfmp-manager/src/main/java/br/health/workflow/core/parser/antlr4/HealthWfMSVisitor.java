// Generated from br\health\workflow\core\parser\antlr4\HealthWfMS.g4 by ANTLR 4.2
package br.health.workflow.core.parser.antlr4;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HealthWfMSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HealthWfMSVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HealthWfMSParser#struct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct(@NotNull HealthWfMSParser.StructContext ctx);

	/**
	 * Visit a parse tree produced by {@link HealthWfMSParser#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive(@NotNull HealthWfMSParser.PrimitiveContext ctx);

	/**
	 * Visit a parse tree produced by {@link HealthWfMSParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_expr(@NotNull HealthWfMSParser.Arithmetic_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link HealthWfMSParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(@NotNull HealthWfMSParser.OperatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link HealthWfMSParser#logical_entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_entity(@NotNull HealthWfMSParser.Logical_entityContext ctx);

	/**
	 * Visit a parse tree produced by {@link HealthWfMSParser#targetDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTargetDef(@NotNull HealthWfMSParser.TargetDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link HealthWfMSParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(@NotNull HealthWfMSParser.RootContext ctx);

	/**
	 * Visit a parse tree produced by {@link HealthWfMSParser#eventDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventDef(@NotNull HealthWfMSParser.EventDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link HealthWfMSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull HealthWfMSParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link HealthWfMSParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(@NotNull HealthWfMSParser.AttributeContext ctx);

	/**
	 * Visit a parse tree produced by {@link HealthWfMSParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull HealthWfMSParser.ValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link HealthWfMSParser#firstPlaceDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstPlaceDef(@NotNull HealthWfMSParser.FirstPlaceDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link HealthWfMSParser#numeric_entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_entity(@NotNull HealthWfMSParser.Numeric_entityContext ctx);

	/**
	 * Visit a parse tree produced by {@link HealthWfMSParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull HealthWfMSParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link HealthWfMSParser#comparison_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_expr(@NotNull HealthWfMSParser.Comparison_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link HealthWfMSParser#kind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKind(@NotNull HealthWfMSParser.KindContext ctx);

	/**
	 * Visit a parse tree produced by {@link HealthWfMSParser#trasitionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrasitionDef(@NotNull HealthWfMSParser.TrasitionDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link HealthWfMSParser#booleanFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanFunction(@NotNull HealthWfMSParser.BooleanFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link HealthWfMSParser#eventType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventType(@NotNull HealthWfMSParser.EventTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link HealthWfMSParser#endPoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndPoint(@NotNull HealthWfMSParser.EndPointContext ctx);

	/**
	 * Visit a parse tree produced by {@link HealthWfMSParser#callDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallDef(@NotNull HealthWfMSParser.CallDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link HealthWfMSParser#syncCallDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyncCallDef(@NotNull HealthWfMSParser.SyncCallDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link HealthWfMSParser#conditionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionDef(@NotNull HealthWfMSParser.ConditionDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link HealthWfMSParser#actionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionDef(@NotNull HealthWfMSParser.ActionDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link HealthWfMSParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(@NotNull HealthWfMSParser.OperandContext ctx);

	/**
	 * Visit a parse tree produced by {@link HealthWfMSParser#timeFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeFunction(@NotNull HealthWfMSParser.TimeFunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link HealthWfMSParser#otherPlaceDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherPlaceDef(@NotNull HealthWfMSParser.OtherPlaceDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link HealthWfMSParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(@NotNull HealthWfMSParser.ObjectContext ctx);
}