/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author martin
 */
public class FormulaParserTest {
   
   public FormulaParserTest() {
   }
   
   @BeforeClass
   public static void setUpClass() {
   }
   
   @AfterClass
   public static void tearDownClass() {
   }
   
   @Before
   public void setUp() {
   }
   
   @After
   public void tearDown() {
   }

   /**
    * Test of parse method, of class FormulaParser.
    */
   @Test
   public void testParse() {
      System.out.println("parse");
      String formula = "a+b";
      String expResult = "a+b";
      String result = FormulaParser.parse(formula);
      assertEquals(expResult, result);
      formula = "a/b";
      expResult = "\\frac{a}{b}";
      result = FormulaParser.parse(formula);
      assertEquals(expResult, result);
      formula = "a*b";
      expResult = "a\\cdot b";
      result = FormulaParser.parse(formula);
      assertEquals(expResult, result);
      formula = "a-b";
      expResult = "a-b";
      result = FormulaParser.parse(formula);
      assertEquals(expResult, result);
      formula = "a^b";
      expResult = "a^{b}";
      result = FormulaParser.parse(formula);
      assertEquals(expResult, result);
      formula = "sqrt(a)";
      expResult = "\\sqrt{a}";
      result = FormulaParser.parse(formula);
      assertEquals(expResult, result);
      formula = "(1+2*(-3)^(a+5)^5)/(c_1*(-d)-sqrt(10.5))/abs(x)*(3,1415)";
      expResult = "\\frac{\\frac{(1+2\\cdot (-3)^{(a+5)}^{5})}{(c_1\\cdot (-d)-\\sqrt{10.5})}}{abs(x)}\\cdot (3,1415)";
      result = FormulaParser.parse(formula);
      assertEquals(expResult, result);
   }
   
}
