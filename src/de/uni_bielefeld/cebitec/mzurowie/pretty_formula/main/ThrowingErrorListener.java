package de.uni_bielefeld.cebitec.mzurowie.pretty_formula.main;


import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

/**
 * An ANTLR ErrorListener that throws a custom error instead of logging them
 * to the console ({@link org.antlr.v4.runtime.ConsoleErrorListener}) or throwing
 * a non-descriptive error ({@link org.antlr.v4.runtime.BailErrorStrategy}).
 * @author martin
 */
public class ThrowingErrorListener extends BaseErrorListener {

   
public static final ThrowingErrorListener INSTANCE = new ThrowingErrorListener();


@Override
public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
        int line, int charPositionInLine, String msg, RecognitionException e)
        throws ParseCancellationException {
      throw new DetailedParseCancellationException(msg, line, charPositionInLine);
   }

}