package de.uni_bielefeld.cebitec.mzurowie.pretty_formula.main;

import de.uni_bielefeld.cebitec.mzurowie.pretty_formula.antlr.VanesaFormulaBaseVisitor;
import de.uni_bielefeld.cebitec.mzurowie.pretty_formula.antlr.VanesaFormulaParser;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * ANTLR visitor that parses a VanesaFormula parse tree to a subset of LaTeX
 * commands.
 * @author martin
 */
public class VanesaFormulaParseRules extends VanesaFormulaBaseVisitor<String> {
   
   /**
	 * {@inheritDoc}
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
    * @param ctx Negative number context
    * @return The number wrapped in "(-" and ")".
	 */
	@Override
   public String visitNeg_number(@NotNull VanesaFormulaParser.Neg_numberContext ctx) { 
      return "(-" + visit(ctx.number()) + ")";
   }
   
	/**
	 * {@inheritDoc}
	 *
    * @param ctx Variable context
    * @return The text content of this node. Subscript parts are encapsulated
    * in curly braces.
	 */
	@Override
   public String visitVariable(@NotNull VanesaFormulaParser.VariableContext ctx) { 
      if (ctx.LODASH().isEmpty()) {
         return ctx.getText();
      } else {
         String re = "";
         re = ctx.VARIABLE().stream()
                 .map((variable) -> "{" + variable.getText() + "}_")
                 .reduce(re, String::concat);
         return re.substring(0, re.length() - 1);
      }
   }
   
   /**
	 * {@inheritDoc}
	 *
	 * @param ctx Negative variable context
    * @return The variable wrapped in "(-" and ")".
	 */
	@Override
   public String visitNeg_variable(@NotNull VanesaFormulaParser.Neg_variableContext ctx) {
      return "(-" + visit(ctx.variable()) + ")";
   }
   
	/**
	 * {@inheritDoc}
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
                 throw new DetailedParseCancellationException("Square root must"
                         + " not have multiple arguments.",
                         ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(),
                         ctx.getStop().getCharPositionInLine());
              }
              ret = "\\sqrt{" + visit(ctx.term(0)) + "}";
              break;
           // add more custom functions here
           default:
              ret = ctx.function().getText() + "(";
              ret = ctx.term().stream()
                      .map((term) -> visit(term) + ',')
                      .reduce(ret, String::concat);
              ret = ret.substring(0, ret.length() - 1) + ')';
              break;
        }
      // TERM IN PARENTHESES
      } else if (ctx.LPAREN() != null && ctx.RPAREN() != null) {
         ret = "(" + visit(ctx.term(0)) + ")";
      } else {
         ret = visitChildren(ctx);
      }
      
      return ret;
   }
}