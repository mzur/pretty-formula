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
	 */
	@Override public String visitAtom(@NotNull VanesaFormulaParser.AtomContext ctx) {
      return ctx.getText();
   }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitTerm(@NotNull VanesaFormulaParser.TermContext ctx) {
      String ret = "";
      
      if (ctx.operator() != null) {
         // OPERATORS
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
      } else if (ctx.function() != null) {
        // FUNCTIONS (must be before the term in parentheses)
        switch (ctx.function().getText()) {
           case "sqrt":
              ret = "\\sqrt{" + visit(ctx.term(0)) + "}";
              break;
           default:
              ret = ctx.function().getText() + "(" + visit(ctx.term(0)) + ")";
              break;
        }
      } else if (ctx.LPAREN() != null && ctx.RPAREN() != null) {
         // TERM IN PARENTHESES
         ret = "(" + visit(ctx.term(0)) + ")";
      } else {
         ret = visitChildren(ctx);
      }
      
      return ret;
   }
}
