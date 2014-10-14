// Generated from vanesa_formula.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link vanesa_formulaParser}.
 */
public interface vanesa_formulaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link vanesa_formulaParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull vanesa_formulaParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link vanesa_formulaParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull vanesa_formulaParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link vanesa_formulaParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull vanesa_formulaParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link vanesa_formulaParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull vanesa_formulaParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link vanesa_formulaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull vanesa_formulaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link vanesa_formulaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull vanesa_formulaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link vanesa_formulaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull vanesa_formulaParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link vanesa_formulaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull vanesa_formulaParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link vanesa_formulaParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(@NotNull vanesa_formulaParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link vanesa_formulaParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(@NotNull vanesa_formulaParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link vanesa_formulaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull vanesa_formulaParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link vanesa_formulaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull vanesa_formulaParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link vanesa_formulaParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull vanesa_formulaParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link vanesa_formulaParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull vanesa_formulaParser.AtomContext ctx);
}