package de.uni_bielefeld.cebitec.mzurowie.pretty_formula.main;

import de.uni_bielefeld.cebitec.mzurowie.pretty_formula.antlr.VanesaFormulaBaseVisitor;
import de.uni_bielefeld.cebitec.mzurowie.pretty_formula.antlr.VanesaFormulaParser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * ANTLR visitor that parses a VanesaFormula parse tree to a subset of LaTeX
 * commands.
 * @author Martin Zurowietz
 */
public class VanesaFormulaParseRules extends VanesaFormulaBaseVisitor<String> {
   
   /**
	 * {@inheritDoc}
    * 
    * From a number node, the number is returned as text.
	 *
    * @param ctx Number context
    * @return The text content of this node.
	 */
	@Override
   public String visitNumber(@NotNull VanesaFormulaParser.NumberContext ctx) {
      return ctx.getText();
   }
   
	/**
	 * {@inheritDoc}
    * 
    * From a negative number node, the negative number is returned as text.
	 *
    * @param ctx Negative number context
    * @return The number wrapped in "(-" and ")".
	 */
	@Override
   public String visitNeg_number(@NotNull VanesaFormulaParser.Neg_numberContext ctx) { 
      return "\\left(-" + visit(ctx.number()) + "\\right)";
   }
   
	/**
	 * {@inheritDoc}
    * 
    * From a variable node, the variable is returned as text. If it has a
    * subscript part added to it, the subscript part is recursively wrapped
    * in curly braces, so subscript words with length > 1 are possible.
	 *
    * @param ctx Variable context
    * @return The text content of this node. Subscript parts are encapsulated
    * in curly braces.
	 */
	@Override
   public String visitVariable(@NotNull VanesaFormulaParser.VariableContext ctx) { 
      String left = ctx.VARIABLE().getText();
      String right = "";
      
      if (!ctx.INDEX().isEmpty()) {         
         left = "{" + left + "_";
         right = "}";
         for (TerminalNode index : ctx.INDEX()) {
            left += "{" + index.getText().substring(1) + "_";
            right += "}";
         }
         left = left.substring(0, left.length() - 1);
      }
      return left.concat(right);
   }
   
   /**
	 * {@inheritDoc}
    * 
    * From a negative variable node, the variable is returned as text, as
    * determined by {@link #visitVariable(de.uni_bielefeld.cebitec.mzurowie.pretty_formula.antlr.VanesaFormulaParser.VariableContext) }.
	 *
	 * @param ctx Negative variable context
    * @return The variable wrapped in "(-" and ")".
	 */
	@Override
   public String visitNeg_variable(@NotNull VanesaFormulaParser.Neg_variableContext ctx) {
      return "\\left(-" + visit(ctx.variable()) + "\\right)";
   }
   
	/**
	 * {@inheritDoc}
    * 
    * The most important node visitor function. It recognizes the different
    * kinds of terms and applies the custom formatting rules to it. This
    * function contains examples for all possible kinds of terms as well as
    * examples for throwing custom errors properly.
    * 
    * @param ctx Term node context.
    * @return Returns the formula string of the term node (including all its children)
    * formatted according to the rules specified in this function.
	 */
	@Override
   public String visitTerm(@NotNull VanesaFormulaParser.TermContext ctx)
           throws DetailedParseCancellationException {
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
               
            // add more custom operators here
            default:
               ret = visit(ctx.term(0)) + ctx.operator.getText() + visit(ctx.term(1));
         }
      // FUNCTIONS (must be queried before the term in parentheses)
      } else if (ctx.function() != null) {
        switch (ctx.function().getText()) {
           case "sqrt":
              if (ctx.term().size() > 1) {
                 // example for throwing custom exceptions properly
                 throw new DetailedParseCancellationException("Square root "
                         + "must not have multiple arguments.",
                         ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(),
                         ctx.getStop().getCharPositionInLine());
              }
              ret = "\\sqrt{" + visit(ctx.term(0)) + "}";
              break;
              
           case "sin":
           case "cos":
           case "tan":
           case "abs":
              if (ctx.term().size() > 1) {
                 throw new DetailedParseCancellationException("'" +
                         ctx.function().getText() + "' must not have multiple arguments.",
                         ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(),
                         ctx.getStop().getCharPositionInLine());
              }
              ret = "\\" + ctx.function().getText() + "{\\left(" + visit(ctx.term(0)) + "\\right)}";
              break;
              
           case "min":
           case "max":
              ret = "\\" + ctx.function().getText() + "{\\left(";
              ret = ctx.term().stream()
                      .map((term) -> visit(term) + ',')
                      .reduce(ret, String::concat);
              ret = ret.substring(0, ret.length() - 1) + "\\right)}";
              break;
              
           // add more custom functions here
           default:
              ret = ctx.function().getText() + "\\left(";
              ret = ctx.term().stream()
                      .map((term) -> visit(term) + ',')
                      .reduce(ret, String::concat);
              ret = ret.substring(0, ret.length() - 1) + "\\right)";
              break;
        }
      // TERM IN PARENTHESES
      } else if (ctx.LPAREN() != null && ctx.RPAREN() != null) {
         ret = "\\left(" + visit(ctx.term(0)) + "\\right)";
      } else {
         ret = visitChildren(ctx);
      }
      
      return ret;
   }
}