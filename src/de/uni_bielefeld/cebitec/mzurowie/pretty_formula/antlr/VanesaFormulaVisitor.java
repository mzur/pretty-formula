// Generated from /media/martin/data/uni/ws1415/pretty-formula/src/antlr/VanesaFormula.g4 by ANTLR 4.4
package de.uni_bielefeld.cebitec.mzurowie.pretty_formula.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VanesaFormulaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VanesaFormulaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VanesaFormulaParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull VanesaFormulaParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link VanesaFormulaParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull VanesaFormulaParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VanesaFormulaParser#neg_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeg_number(@NotNull VanesaFormulaParser.Neg_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link VanesaFormulaParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull VanesaFormulaParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link VanesaFormulaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull VanesaFormulaParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VanesaFormulaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(@NotNull VanesaFormulaParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link VanesaFormulaParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(@NotNull VanesaFormulaParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link VanesaFormulaParser#neg_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeg_variable(@NotNull VanesaFormulaParser.Neg_variableContext ctx);
}