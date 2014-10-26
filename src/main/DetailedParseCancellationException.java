/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import org.antlr.v4.runtime.misc.ParseCancellationException;

/**
 *
 * @author martin
 */
public class DetailedParseCancellationException extends ParseCancellationException {
   
   private final int line;
   private final int charPositionInLine;
   
   public DetailedParseCancellationException(String msg, int line, int charPositionInLine) {
      super(msg);
      this.line = line;
      this.charPositionInLine = charPositionInLine;
   }
   
   public int getLine() {
      return this.line;
   }
   
   public int getCharPositionInLine() {
      return this.charPositionInLine;
   }
}
