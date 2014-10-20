package antlr;

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
		RULE_expr = 0, RULE_additive = 1, RULE_multiplicative = 2, RULE_power = 3, 
		RULE_function = 4, RULE_atom = 5, RULE_number = 6, RULE_neg_number = 7, 
		RULE_variable = 8, RULE_neg_variable = 9;
	public static final String[] ruleNames = {
		"expr", "additive", "multiplicative", "power", "function", "atom", "number", 
		"neg_number", "variable", "neg_variable"
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
			setState(20); additive();
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
		public List<MultiplicativeContext> multiplicative() {
			return getRuleContexts(MultiplicativeContext.class);
		}
		public TerminalNode MINUS(int i) {
			return getToken(VanesaFormulaParser.MINUS, i);
		}
		public MultiplicativeContext multiplicative(int i) {
			return getRuleContext(MultiplicativeContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(VanesaFormulaParser.PLUS); }
		public List<TerminalNode> MINUS() { return getTokens(VanesaFormulaParser.MINUS); }
		public TerminalNode PLUS(int i) {
			return getToken(VanesaFormulaParser.PLUS, i);
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
			setState(22); multiplicative();
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(23);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(24); multiplicative();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class MultiplicativeContext extends ParserRuleContext {
		public TerminalNode MULT(int i) {
			return getToken(VanesaFormulaParser.MULT, i);
		}
		public List<TerminalNode> MULT() { return getTokens(VanesaFormulaParser.MULT); }
		public List<PowerContext> power() {
			return getRuleContexts(PowerContext.class);
		}
		public PowerContext power(int i) {
			return getRuleContext(PowerContext.class,i);
		}
		public List<TerminalNode> DIV() { return getTokens(VanesaFormulaParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(VanesaFormulaParser.DIV, i);
		}
		public MultiplicativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VanesaFormulaListener ) ((VanesaFormulaListener)listener).enterMultiplicative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VanesaFormulaListener ) ((VanesaFormulaListener)listener).exitMultiplicative(this);
		}
	}

	public final MultiplicativeContext multiplicative() throws RecognitionException {
		MultiplicativeContext _localctx = new MultiplicativeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_multiplicative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); power();
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(31);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(32); power();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class PowerContext extends ParserRuleContext {
		public TerminalNode POW(int i) {
			return getToken(VanesaFormulaParser.POW, i);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public List<TerminalNode> POW() { return getTokens(VanesaFormulaParser.POW); }
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VanesaFormulaListener ) ((VanesaFormulaListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VanesaFormulaListener ) ((VanesaFormulaListener)listener).exitPower(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_power);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); function();
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POW) {
				{
				{
				setState(39); match(POW);
				setState(40); function();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(VanesaFormulaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VanesaFormulaParser.RPAREN, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VanesaFormulaListener ) ((VanesaFormulaListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VanesaFormulaListener ) ((VanesaFormulaListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		try {
			setState(52);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46); atom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47); variable();
				setState(48); match(LPAREN);
				setState(49); atom();
				setState(50); match(RPAREN);
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
		enterRule(_localctx, 10, RULE_atom);
		try {
			setState(62);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54); number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55); neg_number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56); variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(57); neg_variable();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(58); match(LPAREN);
				setState(59); additive();
				setState(60); match(RPAREN);
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
		enterRule(_localctx, 12, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); match(NUMBER);
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
		enterRule(_localctx, 14, RULE_neg_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); match(LPAREN);
			setState(67); match(MINUS);
			setState(68); match(NUMBER);
			setState(69); match(RPAREN);
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
		enterRule(_localctx, 16, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); match(VARIABLE);
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
		enterRule(_localctx, 18, RULE_neg_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); match(LPAREN);
			setState(74); match(MINUS);
			setState(75); match(VARIABLE);
			setState(76); match(RPAREN);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\16Q\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\3\3\3\3\3\7\3\34\n\3\f\3\16\3\37\13\3\3\4\3\4\3\4\7\4$\n\4\f"+
		"\4\16\4\'\13\4\3\5\3\5\3\5\7\5,\n\5\f\5\16\5/\13\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\67\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7A\n\7\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f"+
		"\16\20\22\24\2\4\3\2\3\4\3\2\5\6N\2\26\3\2\2\2\4\30\3\2\2\2\6 \3\2\2\2"+
		"\b(\3\2\2\2\n\66\3\2\2\2\f@\3\2\2\2\16B\3\2\2\2\20D\3\2\2\2\22I\3\2\2"+
		"\2\24K\3\2\2\2\26\27\5\4\3\2\27\3\3\2\2\2\30\35\5\6\4\2\31\32\t\2\2\2"+
		"\32\34\5\6\4\2\33\31\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2"+
		"\36\5\3\2\2\2\37\35\3\2\2\2 %\5\b\5\2!\"\t\3\2\2\"$\5\b\5\2#!\3\2\2\2"+
		"$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\7\3\2\2\2\'%\3\2\2\2(-\5\n\6\2)*\7\7"+
		"\2\2*,\5\n\6\2+)\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\t\3\2\2\2/-\3"+
		"\2\2\2\60\67\5\f\7\2\61\62\5\22\n\2\62\63\7\b\2\2\63\64\5\f\7\2\64\65"+
		"\7\t\2\2\65\67\3\2\2\2\66\60\3\2\2\2\66\61\3\2\2\2\67\13\3\2\2\28A\5\16"+
		"\b\29A\5\20\t\2:A\5\22\n\2;A\5\24\13\2<=\7\b\2\2=>\5\4\3\2>?\7\t\2\2?"+
		"A\3\2\2\2@8\3\2\2\2@9\3\2\2\2@:\3\2\2\2@;\3\2\2\2@<\3\2\2\2A\r\3\2\2\2"+
		"BC\7\n\2\2C\17\3\2\2\2DE\7\b\2\2EF\7\4\2\2FG\7\n\2\2GH\7\t\2\2H\21\3\2"+
		"\2\2IJ\7\13\2\2J\23\3\2\2\2KL\7\b\2\2LM\7\4\2\2MN\7\13\2\2NO\7\t\2\2O"+
		"\25\3\2\2\2\7\35%-\66@";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}