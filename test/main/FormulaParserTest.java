/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author martin
 */
public class FormulaParserTest {
   String formula;
   String expResult;
   String result;
   

   public FormulaParserTest() {
      this.formula = "";
      this.expResult = "";
      this.result = "";
   }

   @Before
   public void setUp() throws Exception {
      this.formula = "";
      this.expResult = "";
      this.result = "";
   }
   
   @Test
   public void testSimple() {
      this.formula = "a+b";
      this.expResult = "a+b";
      this.doTest();
      this.formula = "a-b";
      this.expResult = "a-b";
      this.doTest();
   }
   
   @Test
   public void testComplex() {
      this.formula = "(1+2*(-3)^(a+5)^5)/(c_1*(-d)-sqrt(10.5))/abs(x)*(3,1415)";
      this.expResult = "\\frac{\\frac{(1+2\\cdot (-3)^{(a+5)}^{5})}{(c_1\\cdot (-d)-\\sqrt{10.5})}}{abs(x)}\\cdot (3,1415)";
      this.doTest();
   }
   
   @Test
   public void testFrac() {
      this.formula = "a/b";
      this.expResult = "\\frac{a}{b}";
      this.doTest();
   }
   
   @Test
   public void testCdot() {
      this.formula = "a*b";
      this.expResult = "a\\cdot b";
      this.doTest();
   }
   
   @Test
   public void testPow() {
      this.formula = "a^b";
      this.expResult = "a^{b}";
      this.doTest();
   }
   
   @Test
   public void testSqrt() {
      this.formula = "sqrt(a)";
      this.expResult = "\\sqrt{a}";
      this.doTest();
   }
   
   @Test
   public void testPriority() {
      this.formula = "a+b/c";
      this.expResult = "a+\\frac{b}{c}";
      this.doTest();
   }
   
//   @Test
//   public void testLodash() {
//      this.formula = "a_abcef";
//      this.expResult = "a_{bcdef}";
//      this.doTest();
//   }
   
   private void doTest() {
      this.result = FormulaParser.parseToLatex(formula);
      assertEquals(expResult, result);
   }
   
}
