// Generated from /media/martin/data/uni/ws1415/pretty-formula/src/de/uni_bielefeld/cebitec/mzurowie/pretty_formula/antlr/VanesaFormula.g4 by ANTLR 4.4
package de.uni_bielefeld.cebitec.mzurowie.pretty_formula.antlr;
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
		VARIABLE=1, WS=2, DIGIT=3, CHAR=4, PLUS=5, MINUS=6, MULT=7, DIV=8, POW=9, 
		LODASH=10, LPAREN=11, RPAREN=12, COMMA=13, DOT=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'"
	};
	public static final String[] ruleNames = {
		"VARIABLE", "WS", "DIGIT", "CHAR", "PLUS", "MINUS", "MULT", "DIV", "POW", 
		"LODASH", "LPAREN", "RPAREN", "COMMA", "DOT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20C\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\6\2!\n\2\r\2\16\2\"\3\3\6"+
		"\3&\n\3\r\3\16\3\'\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\2\2\20\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\3\2"+
		"\5\5\2\13\f\17\17\"\"\3\2\62;\5\2\62;C\\c|D\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\3 \3\2\2\2\5%\3\2\2\2\7+\3\2\2\2\t-\3\2\2\2\13/\3\2\2\2"+
		"\r\61\3\2\2\2\17\63\3\2\2\2\21\65\3\2\2\2\23\67\3\2\2\2\259\3\2\2\2\27"+
		";\3\2\2\2\31=\3\2\2\2\33?\3\2\2\2\35A\3\2\2\2\37!\5\t\5\2 \37\3\2\2\2"+
		"!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\4\3\2\2\2$&\t\2\2\2%$\3\2\2\2&\'\3"+
		"\2\2\2\'%\3\2\2\2\'(\3\2\2\2()\3\2\2\2)*\b\3\2\2*\6\3\2\2\2+,\t\3\2\2"+
		",\b\3\2\2\2-.\t\4\2\2.\n\3\2\2\2/\60\7-\2\2\60\f\3\2\2\2\61\62\7/\2\2"+
		"\62\16\3\2\2\2\63\64\7,\2\2\64\20\3\2\2\2\65\66\7\61\2\2\66\22\3\2\2\2"+
		"\678\7`\2\28\24\3\2\2\29:\7a\2\2:\26\3\2\2\2;<\7*\2\2<\30\3\2\2\2=>\7"+
		"+\2\2>\32\3\2\2\2?@\7.\2\2@\34\3\2\2\2AB\7\60\2\2B\36\3\2\2\2\5\2\"\'"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}