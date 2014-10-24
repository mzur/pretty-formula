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
		T__0=1, PLUS=2, MINUS=3, MULT=4, DIV=5, POW=6, LODASH=7, LPAREN=8, RPAREN=9, 
		NUMBER=10, VARIABLE=11, WS=12, DIGIT=13, CHAR=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'"
	};
	public static final String[] ruleNames = {
		"T__0", "PLUS", "MINUS", "MULT", "DIV", "POW", "LODASH", "LPAREN", "RPAREN", 
		"NUMBER", "VARIABLE", "WS", "DIGIT", "CHAR"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20N\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\6\13\63\n\13\r\13\16\13"+
		"\64\3\13\3\13\6\139\n\13\r\13\16\13:\5\13=\n\13\3\f\6\f@\n\f\r\f\16\f"+
		"A\3\r\6\rE\n\r\r\r\16\rF\3\r\3\r\3\16\3\16\3\17\3\17\2\2\20\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\3\2\6\4\2"+
		"..\60\60\5\2\13\f\17\17\"\"\3\2\62;\5\2\62;C\\c|R\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5!\3\2\2\2\7#\3\2\2\2\t%\3\2\2\2\13\'\3"+
		"\2\2\2\r)\3\2\2\2\17+\3\2\2\2\21-\3\2\2\2\23/\3\2\2\2\25\62\3\2\2\2\27"+
		"?\3\2\2\2\31D\3\2\2\2\33J\3\2\2\2\35L\3\2\2\2\37 \7.\2\2 \4\3\2\2\2!\""+
		"\7-\2\2\"\6\3\2\2\2#$\7/\2\2$\b\3\2\2\2%&\7,\2\2&\n\3\2\2\2\'(\7\61\2"+
		"\2(\f\3\2\2\2)*\7`\2\2*\16\3\2\2\2+,\7a\2\2,\20\3\2\2\2-.\7*\2\2.\22\3"+
		"\2\2\2/\60\7+\2\2\60\24\3\2\2\2\61\63\5\33\16\2\62\61\3\2\2\2\63\64\3"+
		"\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65<\3\2\2\2\668\t\2\2\2\679\5\33\16"+
		"\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<\66\3\2\2\2<=\3"+
		"\2\2\2=\26\3\2\2\2>@\5\35\17\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2"+
		"B\30\3\2\2\2CE\t\3\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2"+
		"\2HI\b\r\2\2I\32\3\2\2\2JK\t\4\2\2K\34\3\2\2\2LM\t\5\2\2M\36\3\2\2\2\b"+
		"\2\64:<AF\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}