// Generated from /media/martin/data/uni/ws1415/pretty-formula/src/antlr/VanesaFormula.g4 by ANTLR 4.4
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VanesaFormulaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, MULT=3, DIV=4, POW=5, LODASH=6, LPAREN=7, RPAREN=8, NUMBER=9, 
		VARIABLE=10, WS=11, DIGIT=12, CHAR=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'"
	};
	public static final String[] ruleNames = {
		"PLUS", "MINUS", "MULT", "DIV", "POW", "LODASH", "LPAREN", "RPAREN", "NUMBER", 
		"VARIABLE", "WS", "DIGIT", "CHAR"
	};


	public VanesaFormulaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "VanesaFormula.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17J\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\6\n/\n\n\r\n\16\n\60\3\n\3\n\6\n\65\n\n\r"+
		"\n\16\n\66\5\n9\n\n\3\13\6\13<\n\13\r\13\16\13=\3\f\6\fA\n\f\r\f\16\f"+
		"B\3\f\3\f\3\r\3\r\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\3\2\6\4\2..\60\60\5\2\13\f\17\17\"\"\3\2"+
		"\62;\5\2\62;C\\c|N\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5\37\3\2\2\2\7"+
		"!\3\2\2\2\t#\3\2\2\2\13%\3\2\2\2\r\'\3\2\2\2\17)\3\2\2\2\21+\3\2\2\2\23"+
		".\3\2\2\2\25;\3\2\2\2\27@\3\2\2\2\31F\3\2\2\2\33H\3\2\2\2\35\36\7-\2\2"+
		"\36\4\3\2\2\2\37 \7/\2\2 \6\3\2\2\2!\"\7,\2\2\"\b\3\2\2\2#$\7\61\2\2$"+
		"\n\3\2\2\2%&\7`\2\2&\f\3\2\2\2\'(\7a\2\2(\16\3\2\2\2)*\7*\2\2*\20\3\2"+
		"\2\2+,\7+\2\2,\22\3\2\2\2-/\5\31\r\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2"+
		"\60\61\3\2\2\2\618\3\2\2\2\62\64\t\2\2\2\63\65\5\31\r\2\64\63\3\2\2\2"+
		"\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\62\3\2\2\289\3"+
		"\2\2\29\24\3\2\2\2:<\5\33\16\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2"+
		">\26\3\2\2\2?A\t\3\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CD\3\2\2"+
		"\2DE\b\f\2\2E\30\3\2\2\2FG\t\4\2\2G\32\3\2\2\2HI\t\5\2\2I\34\3\2\2\2\b"+
		"\2\60\668=B\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}