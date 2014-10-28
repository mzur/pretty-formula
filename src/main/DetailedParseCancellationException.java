package main;

import org.antlr.v4.runtime.misc.ParseCancellationException;

/**
 * An ANTLR parse exception that contains additional information like the
 * exact position of the character(-sequence) that produced the error.
 * @author martin
 */
public class DetailedParseCancellationException extends ParseCancellationException {
   
   private final int line;
   private final int charPositionInLine;
   private final int endCharPositionInLine;
   
   public DetailedParseCancellationException() {
      super();
      this.line = -1;
      this.charPositionInLine = -1;
      this.endCharPositionInLine = -1;
   }
   
   public DetailedParseCancellationException(String msg, int line, int charPositionInLine) {
      super(msg);
      this.line = line;
      this.charPositionInLine = charPositionInLine;
      this.endCharPositionInLine = this.charPositionInLine + 1;
   }
   
   public DetailedParseCancellationException(String msg, int line,
           int charPositionInLine, int endCharPositionInLine) {
      super(msg);
      this.line = line;
      this.charPositionInLine = charPositionInLine;
      this.endCharPositionInLine = endCharPositionInLine;
   }
   
   public int getLine() {
      return this.line;
   }
   
   public int getCharPositionInLine() {
      return this.charPositionInLine;
   }
   
   public int getEndCharPositionInLine() {
      return this.endCharPositionInLine;
   }
}
