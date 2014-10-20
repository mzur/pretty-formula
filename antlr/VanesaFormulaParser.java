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
		RULE_expr = 0, RULE_term = 1, RULE_number = 2, RULE_neg_number = 3, RULE_variable = 4, 
		RULE_neg_variable = 5;
	public static final String[] ruleNames = {
		"expr", "term", "number", "neg_number", "variable", "neg_variable"
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
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
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
			setState(12); term(0);
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

	public static class TermContext extends ParserRuleContext {
		public TermContext left;
		public Token op;
		public TermContext right;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode MULT() { return getToken(VanesaFormulaParser.MULT, 0); }
		public Neg_numberContext neg_number() {
			return getRuleContext(Neg_numberContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VanesaFormulaParser.RPAREN, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Neg_variableContext neg_variable() {
			return getRuleContext(Neg_variableContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VanesaFormulaParser.LPAREN, 0); }
		public TerminalNode PLUS() { return getToken(VanesaFormulaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(VanesaFormulaParser.MINUS, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode POW() { return getToken(VanesaFormulaParser.POW, 0); }
		public TerminalNode DIV() { return getToken(VanesaFormulaParser.DIV, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VanesaFormulaListener ) ((VanesaFormulaListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VanesaFormulaListener ) ((VanesaFormulaListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(15); match(LPAREN);
				setState(16); term(0);
				setState(17); match(RPAREN);
				}
				break;
			case 2:
				{
				setState(19); number();
				}
				break;
			case 3:
				{
				setState(20); neg_number();
				}
				break;
			case 4:
				{
				setState(21); variable();
				}
				break;
			case 5:
				{
				setState(22); neg_variable();
				}
				break;
			case 6:
				{
				setState(23); variable();
				setState(24); match(LPAREN);
				setState(25); term(0);
				setState(26); match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(39);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(30);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(31); ((TermContext)_localctx).op = match(POW);
						setState(32); ((TermContext)_localctx).right = term(4);
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(33);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(34);
						((TermContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((TermContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(35); ((TermContext)_localctx).right = term(3);
						}
						break;
					case 3:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(36);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(37);
						((TermContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((TermContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(38); ((TermContext)_localctx).right = term(2);
						}
						break;
					}
					} 
				}
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
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
		enterRule(_localctx, 4, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); match(NUMBER);
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
		enterRule(_localctx, 6, RULE_neg_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); match(LPAREN);
			setState(47); match(MINUS);
			setState(48); match(NUMBER);
			setState(49); match(RPAREN);
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
		enterRule(_localctx, 8, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); match(VARIABLE);
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
		enterRule(_localctx, 10, RULE_neg_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); match(LPAREN);
			setState(54); match(MINUS);
			setState(55); match(VARIABLE);
			setState(56); match(RPAREN);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1: return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 3);
		case 1: return precpred(_ctx, 2);
		case 2: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\16=\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\37\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\7\3*\n\3\f\3\16\3-\13\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\2\3\4\b\2\4\6\b\n\f\2\4\3\2\5\6\3\2\3\4>\2\16\3\2"+
		"\2\2\4\36\3\2\2\2\6.\3\2\2\2\b\60\3\2\2\2\n\65\3\2\2\2\f\67\3\2\2\2\16"+
		"\17\5\4\3\2\17\3\3\2\2\2\20\21\b\3\1\2\21\22\7\b\2\2\22\23\5\4\3\2\23"+
		"\24\7\t\2\2\24\37\3\2\2\2\25\37\5\6\4\2\26\37\5\b\5\2\27\37\5\n\6\2\30"+
		"\37\5\f\7\2\31\32\5\n\6\2\32\33\7\b\2\2\33\34\5\4\3\2\34\35\7\t\2\2\35"+
		"\37\3\2\2\2\36\20\3\2\2\2\36\25\3\2\2\2\36\26\3\2\2\2\36\27\3\2\2\2\36"+
		"\30\3\2\2\2\36\31\3\2\2\2\37+\3\2\2\2 !\f\5\2\2!\"\7\7\2\2\"*\5\4\3\6"+
		"#$\f\4\2\2$%\t\2\2\2%*\5\4\3\5&\'\f\3\2\2\'(\t\3\2\2(*\5\4\3\4) \3\2\2"+
		"\2)#\3\2\2\2)&\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\5\3\2\2\2-+\3\2"+
		"\2\2./\7\n\2\2/\7\3\2\2\2\60\61\7\b\2\2\61\62\7\4\2\2\62\63\7\n\2\2\63"+
		"\64\7\t\2\2\64\t\3\2\2\2\65\66\7\13\2\2\66\13\3\2\2\2\678\7\b\2\289\7"+
		"\4\2\29:\7\13\2\2:;\7\t\2\2;\r\3\2\2\2\5\36)+";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}