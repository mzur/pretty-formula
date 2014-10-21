/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import antlr.VanesaFormulaBaseVisitor;
import antlr.VanesaFormulaParser;
import org.antlr.v4.runtime.misc.NotNull;

/**
 *
 * @author martin
 */
public class VanesaFormulaParseRules extends VanesaFormulaBaseVisitor<String> {
   /**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
    * @param ctx Atom node context.
    * @return Returns the text of the atom node.
	 */
	@Override public String visitAtom(@NotNull VanesaFormulaParser.AtomContext ctx) {
      return ctx.getText();
   }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
    * @param ctx Term node context.
    * @return Returns the formula string of the term node (including all its children)
    * formatted according to the rules specified in this function.
	 */
	@Override public String visitTerm(@NotNull VanesaFormulaParser.TermContext ctx) {
      String ret;
      
      // OPERATORS
      if (ctx.operator() != null) {
         switch (ctx.operator().getText()) {
            case "/":
               ret = "\\frac{" + visit(ctx.term(0)) + "}{" + visit(ctx.term(1)) + "}";
               break;
            case "*":
               ret = visit(ctx.term(0)) + "\\cdot " + visit(ctx.term(1));
               break;
            case "^":
               ret = visit(ctx.term(0)) + "^{" + visit(ctx.term(1)) + "}";
               break;
            default:
               ret = visit(ctx.term(0)) + ctx.operator().getText() + visit(ctx.term(1));
         }
      // FUNCTIONS (must be before the term in parentheses)
      } else if (ctx.function() != null) {
        switch (ctx.function().getText()) {
           case "sqrt":
              ret = "\\sqrt{" + visit(ctx.term(0)) + "}";
              break;
           default:
              ret = ctx.function().getText() + "(" + visit(ctx.term(0)) + ")";
              break;
        }
      // TERM IN PARENTHESES
      } else if (ctx.LPAREN() != null && ctx.RPAREN() != null) {
         /*
          * Usually the parentheses could be ommitted here but that would lead
          * to falsy behaviour in cases like "(a+b)^c" which would be parsed to
          * "a+b^{c}". Like this there are lots of parentheses in the formula
          * but it is always correct.
          */
         ret = "(" + visit(ctx.term(0)) + ")";
      } else {
         ret = visitChildren(ctx);
      }
      
      return ret;
   }
}
