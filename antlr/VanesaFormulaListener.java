// Generated from VanesaFormula.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VanesaFormulaParser}.
 */
public interface VanesaFormulaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VanesaFormulaParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull VanesaFormulaParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link VanesaFormulaParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull VanesaFormulaParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link VanesaFormulaParser#neg_number}.
	 * @param ctx the parse tree
	 */
	void enterNeg_number(@NotNull VanesaFormulaParser.Neg_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link VanesaFormulaParser#neg_number}.
	 * @param ctx the parse tree
	 */
	void exitNeg_number(@NotNull VanesaFormulaParser.Neg_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link VanesaFormulaParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull VanesaFormulaParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link VanesaFormulaParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull VanesaFormulaParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link VanesaFormulaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull VanesaFormulaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VanesaFormulaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull VanesaFormulaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VanesaFormulaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull VanesaFormulaParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link VanesaFormulaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull VanesaFormulaParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link VanesaFormulaParser#neg_variable}.
	 * @param ctx the parse tree
	 */
	void enterNeg_variable(@NotNull VanesaFormulaParser.Neg_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link VanesaFormulaParser#neg_variable}.
	 * @param ctx the parse tree
	 */
	void exitNeg_variable(@NotNull VanesaFormulaParser.Neg_variableContext ctx);
}