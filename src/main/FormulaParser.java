/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import antlr.VanesaFormulaLexer;
import antlr.VanesaFormulaListener;
import antlr.VanesaFormulaParser;
import antlr.VanesaFormulaParser.ExprContext;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 *
 * @author martin
 */
public class FormulaParser {
   private FormulaParser() {
      
   }
   
   public static void parse(String formula) {
      VanesaFormulaLexer lexer = new VanesaFormulaLexer(new ANTLRInputStream(formula));
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      VanesaFormulaParser parser = new VanesaFormulaParser(tokens);
      
      ParserRuleContext tree = parser.expr();
      ParseTreeWalker walker = new ParseTreeWalker();
      VanesaFormulaParseRules extractor = new VanesaFormulaParseRules();
      walker.walk(extractor, tree);
      System.out.println(extractor.getFormula());
   }
}
