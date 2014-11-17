package de.uni_bielefeld.cebitec.mzurowie.pretty_formula.main;

import de.uni_bielefeld.cebitec.mzurowie.pretty_formula.antlr.VanesaFormulaLexer;
import de.uni_bielefeld.cebitec.mzurowie.pretty_formula.antlr.VanesaFormulaParser;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.batik.dom.svg.SVGDOMImplementation;
import org.apache.batik.svggen.SVGGeneratorContext;
import org.apache.batik.svggen.SVGGraphics2D;
import org.scilab.forge.jlatexmath.ParseException;
import org.scilab.forge.jlatexmath.TeXConstants;
import org.scilab.forge.jlatexmath.TeXFormula;
import org.scilab.forge.jlatexmath.TeXIcon;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;

/**
 *
 * @author Martin Zurowietz
 */
public class FormulaParser {
   private static final VanesaFormulaParseRules EXTRACTOR = new VanesaFormulaParseRules();

   private FormulaParser() { }
   
   /**
    * Parses a mathematical formula like "(a+b)/c" to a pretty image and saves
    * it as an SVG file.
    * 
    * @param formula A raw formula input String.
    * @param file The SVG file to save to.
    * @throws ParseException When parsing the LaTeX formula failed.
    * @throws IOException When writing the file failed.
    * @throws DetailedParseCancellationException When parsing the raw formula to
    * LaTeX failed.
    */
   public static void saveToSVG(String formula, File file)
           throws ParseException, IOException, DetailedParseCancellationException {
         String latexFormula = FormulaParser.parseToLatex(formula);
         TeXIcon icon = FormulaParser.getTeXIcon(latexFormula);
         
         DOMImplementation domImpl = SVGDOMImplementation.getDOMImplementation();
         Document document =domImpl.createDocument(
                 SVGDOMImplementation.SVG_NAMESPACE_URI, "svg", null);
         SVGGeneratorContext ctx = SVGGeneratorContext.createDefault(document);
         
         SVGGraphics2D g2 = new SVGGraphics2D(ctx, true);
         g2.setSVGCanvasSize(new Dimension(icon.getIconWidth(),icon.getIconHeight()));
         
         icon.paintIcon(null, g2, 0, 0);

         try (FileOutputStream svgs = new FileOutputStream(file)) {
            Writer out = new OutputStreamWriter(svgs, "UTF-8");
            g2.stream(out, false);
            svgs.flush();
         }
    }

   /**
    * Parses a mathematical formula String like "(a+b)/c" to a pretty image.
    * 
    * @param formula A raw formula input String.
    * @return An image object containing the rendered formula.
    * @throws ParseException When the formula rendering fails.
    * @throws DetailedParseCancellationException when the formula parsing fails.
    */
   public static BufferedImage parseToImage(String formula)
           throws ParseException, DetailedParseCancellationException {
      String latexFormula = FormulaParser.parseToLatex(formula);
      TeXIcon icon = FormulaParser.getTeXIcon(latexFormula);

      // now create an actual image of the rendered equation
      BufferedImage image = new BufferedImage(icon.getIconWidth(),
            icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
      Graphics2D g2 = image.createGraphics();
      g2.setColor(Color.white);
      g2.fillRect(0, 0, icon.getIconWidth(), icon.getIconHeight());
      icon.paintIcon(null, g2, 0, 0);

      return image;
   }

   /**
    * Parses a mathematical formula String like "(a+b)/c" to valid math LaTeX.
    * 
    * @param formula A raw formula input String.
    * @return The formula parsed to a small subset of LaTeX.
    * @throws DetailedParseCancellationException When the parsing fails.
    */
   public static String parseToLatex(String formula)
           throws DetailedParseCancellationException {
      VanesaFormulaLexer lexer = new VanesaFormulaLexer(new ANTLRInputStream(formula));
      lexer.removeErrorListeners();
      lexer.addErrorListener(ThrowingErrorListener.INSTANCE);

      CommonTokenStream tokens = new CommonTokenStream(lexer);

      VanesaFormulaParser parser = new VanesaFormulaParser(tokens);
      parser.removeErrorListeners();
      parser.addErrorListener(ThrowingErrorListener.INSTANCE);

      ParserRuleContext tree = parser.expr();

      return FormulaParser.EXTRACTOR.visit(tree);
   }
   
   /**
    * Renders a valid LaTeX math formula to an icon.
    * 
    * @param formula Valid LaTeX formula.
    * @return Rendered Icon.
    * @throws ParseException When rendering has failed (e.g. the formula was
    * not valid).
    */
   private static TeXIcon getTeXIcon(String formula) throws ParseException {
      TeXFormula latexFormula = new TeXFormula(formula);

      // render the formla to an icon of the same size as the formula.
      TeXIcon icon = latexFormula.createTeXIcon(TeXConstants.STYLE_DISPLAY, 20);

      // insert a border 
      icon.setInsets(new Insets(5, 5, 5, 5));
      
      return icon;
   }

}
