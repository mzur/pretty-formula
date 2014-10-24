/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import antlr.VanesaFormulaBaseVisitor;
import antlr.VanesaFormulaParser;
import antlr.VanesaFormulaParser.TermContext;
import java.util.InputMismatchException;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;

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
	@Override public String visitNumber(@NotNull VanesaFormulaParser.NumberContext ctx) {
      return ctx.getText();
   }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitNeg_number(@NotNull VanesaFormulaParser.Neg_numberContext ctx) { 
      return ctx.getText(); 
   }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitVariable(@NotNull VanesaFormulaParser.VariableContext ctx) { 
      if (ctx.LODASH().isEmpty()) {
         return ctx.getText();
      } else {
         String re = "";
         // encapsulate subscript in {} so it works for whole words, too
         for (TerminalNode variable : ctx.VARIABLE()) {
            re += "{" + variable.getText() + "}_";
         }
         return re.substring(0, re.length() - 1);
      }
   }
   /**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitNeg_variable(@NotNull VanesaFormulaParser.Neg_variableContext ctx) { return visitChildren(ctx); }
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
      if (ctx.operator != null) {
         switch (ctx.operator.getText()) {
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
               ret = visit(ctx.term(0)) + ctx.operator.getText() + visit(ctx.term(1));
         }
      // FUNCTIONS (must be before the term in parentheses)
      } else if (ctx.function() != null) {
        switch (ctx.function().getText()) {
           case "sqrt":
              if (ctx.term().size() > 1) {
                 throw new InputMismatchException("Square root must not have multiple arguments.");
              }
              ret = "\\sqrt{" + visit(ctx.term(0)) + "}";
              break;
           default:
              ret = ctx.function().getText() + "(";
              for (TermContext term : ctx.term()) {
                 ret += visit(term) + ',';
              }
              ret = ret.substring(0, ret.length() - 1) + ')';
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
