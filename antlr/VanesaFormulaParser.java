// Generated from VanesaFormula.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VanesaFormulaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, MULT=3, DIV=4, POW=5, LPAREN=6, RPAREN=7, NUMBER=8, VARIABLE=9, 
		WS=10, DIGIT=11, CHAR=12;
	public static final String[] tokenNames = {
		"<INVALID>", "'+'", "'-'", "'*'", "'/'", "'^'", "'('", "')'", "NUMBER", 
		"VARIABLE", "WS", "DIGIT", "CHAR"
	};
	public static final int
		RULE_expr = 0, RULE_additive = 1, RULE_atom = 2, RULE_number = 3, RULE_neg_number = 4, 
		RULE_variable = 5, RULE_neg_variable = 6;
	public static final String[] ruleNames = {
		"expr", "additive", "atom", "number", "neg_number", "variable", "neg_variable"
	};

	@Override
	public String getGrammarFileName() { return "VanesaFormula.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VanesaFormulaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExprContext extends ParserRuleContext {
		public AdditiveContext additive() {
			return getRuleContext(AdditiveContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VanesaFormulaListener ) ((VanesaFormulaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VanesaFormulaListener ) ((VanesaFormulaListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14); additive();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveContext extends ParserRuleContext {
		public AtomContext left;
		public Token op;
		public AtomContext right;
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(VanesaFormulaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(VanesaFormulaParser.MINUS, 0); }
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AdditiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VanesaFormulaListener ) ((VanesaFormulaListener)listener).enterAdditive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VanesaFormulaListener ) ((VanesaFormulaListener)listener).exitAdditive(this);
		}
	}

	public final AdditiveContext additive() throws RecognitionException {
		AdditiveContext _localctx = new AdditiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_additive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); ((AdditiveContext)_localctx).left = atom();
			setState(17);
			((AdditiveContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
				((AdditiveContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(18); ((AdditiveContext)_localctx).right = atom();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Neg_variableContext neg_variable() {
			return getRuleContext(Neg_variableContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VanesaFormulaParser.LPAREN, 0); }
		public Neg_numberContext neg_number() {
			return getRuleContext(Neg_numberContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VanesaFormulaParser.RPAREN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AdditiveContext additive() {
			return getRuleContext(AdditiveContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VanesaFormulaListener ) ((VanesaFormulaListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VanesaFormulaListener ) ((VanesaFormulaListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atom);
		try {
			setState(28);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(20); number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(21); neg_number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(22); variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(23); neg_variable();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(24); match(LPAREN);
				setState(25); additive();
				setState(26); match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(VanesaFormulaParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VanesaFormulaListener ) ((VanesaFormulaListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VanesaFormulaListener ) ((VanesaFormulaListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Neg_numberContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(VanesaFormulaParser.LPAREN, 0); }
		public TerminalNode MINUS() { return getToken(VanesaFormulaParser.MINUS, 0); }
		public TerminalNode RPAREN() { return getToken(VanesaFormulaParser.RPAREN, 0); }
		public TerminalNode NUMBER() { return getToken(VanesaFormulaParser.NUMBER, 0); }
		public Neg_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neg_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VanesaFormulaListener ) ((VanesaFormulaListener)listener).enterNeg_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VanesaFormulaListener ) ((VanesaFormulaListener)listener).exitNeg_number(this);
		}
	}

	public final Neg_numberContext neg_number() throws RecognitionException {
		Neg_numberContext _localctx = new Neg_numberContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_neg_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); match(LPAREN);
			setState(33); match(MINUS);
			setState(34); match(NUMBER);
			setState(35); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(VanesaFormulaParser.VARIABLE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VanesaFormulaListener ) ((VanesaFormulaListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VanesaFormulaListener ) ((VanesaFormulaListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); match(VARIABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Neg_variableContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(VanesaFormulaParser.LPAREN, 0); }
		public TerminalNode MINUS() { return getToken(VanesaFormulaParser.MINUS, 0); }
		public TerminalNode RPAREN() { return getToken(VanesaFormulaParser.RPAREN, 0); }
		public TerminalNode VARIABLE() { return getToken(VanesaFormulaParser.VARIABLE, 0); }
		public Neg_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neg_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VanesaFormulaListener ) ((VanesaFormulaListener)listener).enterNeg_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VanesaFormulaListener ) ((VanesaFormulaListener)listener).exitNeg_variable(this);
		}
	}

	public final Neg_variableContext neg_variable() throws RecognitionException {
		Neg_variableContext _localctx = new Neg_variableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_neg_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); match(LPAREN);
			setState(40); match(MINUS);
			setState(41); match(VARIABLE);
			setState(42); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\16/\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\37\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\3\3\2\3\4+\2\20"+
		"\3\2\2\2\4\22\3\2\2\2\6\36\3\2\2\2\b \3\2\2\2\n\"\3\2\2\2\f\'\3\2\2\2"+
		"\16)\3\2\2\2\20\21\5\4\3\2\21\3\3\2\2\2\22\23\5\6\4\2\23\24\t\2\2\2\24"+
		"\25\5\6\4\2\25\5\3\2\2\2\26\37\5\b\5\2\27\37\5\n\6\2\30\37\5\f\7\2\31"+
		"\37\5\16\b\2\32\33\7\b\2\2\33\34\5\4\3\2\34\35\7\t\2\2\35\37\3\2\2\2\36"+
		"\26\3\2\2\2\36\27\3\2\2\2\36\30\3\2\2\2\36\31\3\2\2\2\36\32\3\2\2\2\37"+
		"\7\3\2\2\2 !\7\n\2\2!\t\3\2\2\2\"#\7\b\2\2#$\7\4\2\2$%\7\n\2\2%&\7\t\2"+
		"\2&\13\3\2\2\2\'(\7\13\2\2(\r\3\2\2\2)*\7\b\2\2*+\7\4\2\2+,\7\13\2\2,"+
		"-\7\t\2\2-\17\3\2\2\2\3\36";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}