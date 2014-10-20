/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import antlr.VanesaFormulaLexer;
import antlr.VanesaFormulaParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 *
 * @author martin
 */
public class FormulaParser {
   private static VanesaFormulaParseRules extractor;
   
   static {
      FormulaParser.extractor = new VanesaFormulaParseRules();
   }
   
   private FormulaParser() { }
   
   public static String parse(String formula) {
      VanesaFormulaLexer lexer = new VanesaFormulaLexer(new ANTLRInputStream(formula));
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      VanesaFormulaParser parser = new VanesaFormulaParser(tokens);
      
      ParserRuleContext tree = parser.expr();
      
      return FormulaParser.extractor.visit(tree);
   }
}
