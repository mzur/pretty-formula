/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import javax.swing.JLabel;
import org.scilab.forge.jlatexmath.ParseException;
import org.scilab.forge.jlatexmath.TeXConstants;
import org.scilab.forge.jlatexmath.TeXFormula;
import org.scilab.forge.jlatexmath.TeXIcon;

/**
 *
 * @author martin
 */
public class FormulaRenderer {
   
   private static final String latexControlCharacters = "\\_{}$";
   
   public static void renderFormula (String f, JLabel l) {
      
      try {
         Graphics g = l.getGraphics();
         BufferedImage image = FormulaRenderer.createImage(f);
         g.clearRect(0, 0, l.getWidth(), l.getHeight());
         g.drawImage(image, 0, 0, null);
      } catch (ParseException e) {
         e.printStackTrace();
      }
   }
   
   private static BufferedImage createImage (String f) throws ParseException {
      TeXFormula formula = new TeXFormula(f);

      // render the formla to an icon of the same size as the formula.
      TeXIcon icon = formula.createTeXIcon(TeXConstants.STYLE_DISPLAY, 20);

      // insert a border 
      icon.setInsets(new Insets(5, 5, 5, 5));

      // now create an actual image of the rendered equation
      BufferedImage image = new BufferedImage(icon.getIconWidth(),
            icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
      Graphics2D g2 = image.createGraphics();
      g2.setColor(Color.white);
      g2.fillRect(0, 0, icon.getIconWidth(), icon.getIconHeight());
      JLabel jl = new JLabel();
      jl.setForeground(new Color(0, 0, 0));
      icon.paintIcon(jl, g2, 0, 0);

      return image;
   }
   
}
