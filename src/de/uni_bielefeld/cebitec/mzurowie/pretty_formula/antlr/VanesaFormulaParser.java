// Generated from /media/martin/data/uni/ws1415/pretty-formula/src/de/uni_bielefeld/cebitec/mzurowie/pretty_formula/antlr/VanesaFormula.g4 by ANTLR 4.4
package de.uni_bielefeld.cebitec.mzurowie.pretty_formula.antlr;
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
		INDEX=1, VARIABLE=2, NUMBER=3, WS=4, DIGIT=5, CHAR=6, PLUS=7, MINUS=8, 
		MULT=9, DIV=10, POW=11, LODASH=12, LPAREN=13, RPAREN=14, COMMA=15;
	public static final String[] tokenNames = {
		"<INVALID>", "INDEX", "VARIABLE", "NUMBER", "WS", "DIGIT", "CHAR", "'+'", 
		"'-'", "'*'", "'/'", "'^'", "'_'", "'('", "')'", "','"
	};
	public static final int
		RULE_expr = 0, RULE_term = 1, RULE_atom = 2, RULE_number = 3, RULE_neg_number = 4, 
		RULE_variable = 5, RULE_neg_variable = 6, RULE_function = 7;
	public static final String[] ruleNames = {
		"expr", "term", "atom", "number", "neg_number", "variable", "neg_variable", 
		"function"
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VanesaFormulaVisitor ) return ((VanesaFormulaVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); term(0);
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
		public Token operator;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode MULT() { return getToken(VanesaFormulaParser.MULT, 0); }
		public TerminalNode RPAREN() { return getToken(VanesaFormulaParser.RPAREN, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(VanesaFormulaParser.COMMA, i);
		}
		public TerminalNode LPAREN() { return getToken(VanesaFormulaParser.LPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(VanesaFormulaParser.COMMA); }
		public TerminalNode PLUS() { return getToken(VanesaFormulaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(VanesaFormulaParser.MINUS, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode POW() { return getToken(VanesaFormulaParser.POW, 0); }
		public TerminalNode DIV() { return getToken(VanesaFormulaParser.DIV, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VanesaFormulaVisitor ) return ((VanesaFormulaVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
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
			setState(36);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(19); match(LPAREN);
				setState(20); term(0);
				setState(21); match(RPAREN);
				}
				break;
			case 2:
				{
				setState(23); atom();
				}
				break;
			case 3:
				{
				setState(24); function();
				setState(25); match(LPAREN);
				setState(26); term(0);
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(27); match(COMMA);
					setState(28); term(0);
					}
					}
					setState(33);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(34); match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(50);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(38);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(39); ((TermContext)_localctx).operator = match(POW);
						setState(40); term(4);
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(41);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(42); ((TermContext)_localctx).operator = match(DIV);
						setState(43); term(4);
						}
						break;
					case 3:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(44);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(45); ((TermContext)_localctx).operator = match(MULT);
						setState(46); term(3);
						}
						break;
					case 4:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(47);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(48);
						((TermContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((TermContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(49); term(2);
						}
						break;
					}
					} 
				}
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class AtomContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Neg_variableContext neg_variable() {
			return getRuleContext(Neg_variableContext.class,0);
		}
		public Neg_numberContext neg_number() {
			return getRuleContext(Neg_numberContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VanesaFormulaVisitor ) return ((VanesaFormulaVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atom);
		try {
			setState(59);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55); number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56); neg_number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57); variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(58); neg_variable();
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
		public TerminalNode NUMBER(int i) {
			return getToken(VanesaFormulaParser.NUMBER, i);
		}
		public TerminalNode COMMA() { return getToken(VanesaFormulaParser.COMMA, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(VanesaFormulaParser.NUMBER); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VanesaFormulaVisitor ) return ((VanesaFormulaVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); match(NUMBER);
			setState(64);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(62); match(COMMA);
				setState(63); match(NUMBER);
				}
				break;
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

	public static class Neg_numberContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VanesaFormulaParser.LPAREN, 0); }
		public TerminalNode MINUS() { return getToken(VanesaFormulaParser.MINUS, 0); }
		public TerminalNode RPAREN() { return getToken(VanesaFormulaParser.RPAREN, 0); }
		public Neg_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neg_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VanesaFormulaVisitor ) return ((VanesaFormulaVisitor<? extends T>)visitor).visitNeg_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Neg_numberContext neg_number() throws RecognitionException {
		Neg_numberContext _localctx = new Neg_numberContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_neg_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); match(LPAREN);
			setState(67); match(MINUS);
			setState(68); number();
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
		public List<TerminalNode> INDEX() { return getTokens(VanesaFormulaParser.INDEX); }
		public TerminalNode VARIABLE() { return getToken(VanesaFormulaParser.VARIABLE, 0); }
		public TerminalNode INDEX(int i) {
			return getToken(VanesaFormulaParser.INDEX, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VanesaFormulaVisitor ) return ((VanesaFormulaVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(71); match(VARIABLE);
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(72); match(INDEX);
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class Neg_variableContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(VanesaFormulaParser.LPAREN, 0); }
		public TerminalNode MINUS() { return getToken(VanesaFormulaParser.MINUS, 0); }
		public TerminalNode RPAREN() { return getToken(VanesaFormulaParser.RPAREN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Neg_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neg_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VanesaFormulaVisitor ) return ((VanesaFormulaVisitor<? extends T>)visitor).visitNeg_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Neg_variableContext neg_variable() throws RecognitionException {
		Neg_variableContext _localctx = new Neg_variableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_neg_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(LPAREN);
			setState(79); match(MINUS);
			setState(80); variable();
			setState(81); match(RPAREN);
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
		public TerminalNode VARIABLE() { return getToken(VanesaFormulaParser.VARIABLE, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VanesaFormulaVisitor ) return ((VanesaFormulaVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); match(VARIABLE);
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
		case 0: return precpred(_ctx, 4);
		case 1: return precpred(_ctx, 3);
		case 2: return precpred(_ctx, 2);
		case 3: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21X\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3 \n\3\f\3\16\3#\13\3\3\3\3\3\5\3\'"+
		"\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\65\n\3\f\3\16"+
		"\38\13\3\3\4\3\4\3\4\3\4\5\4>\n\4\3\5\3\5\3\5\5\5C\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\7\7L\n\7\f\7\16\7O\13\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\2"+
		"\3\4\n\2\4\6\b\n\f\16\20\2\3\3\2\t\n[\2\22\3\2\2\2\4&\3\2\2\2\6=\3\2\2"+
		"\2\b?\3\2\2\2\nD\3\2\2\2\fI\3\2\2\2\16P\3\2\2\2\20U\3\2\2\2\22\23\5\4"+
		"\3\2\23\3\3\2\2\2\24\25\b\3\1\2\25\26\7\17\2\2\26\27\5\4\3\2\27\30\7\20"+
		"\2\2\30\'\3\2\2\2\31\'\5\6\4\2\32\33\5\20\t\2\33\34\7\17\2\2\34!\5\4\3"+
		"\2\35\36\7\21\2\2\36 \5\4\3\2\37\35\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3"+
		"\2\2\2\"$\3\2\2\2#!\3\2\2\2$%\7\20\2\2%\'\3\2\2\2&\24\3\2\2\2&\31\3\2"+
		"\2\2&\32\3\2\2\2\'\66\3\2\2\2()\f\6\2\2)*\7\r\2\2*\65\5\4\3\6+,\f\5\2"+
		"\2,-\7\f\2\2-\65\5\4\3\6./\f\4\2\2/\60\7\13\2\2\60\65\5\4\3\5\61\62\f"+
		"\3\2\2\62\63\t\2\2\2\63\65\5\4\3\4\64(\3\2\2\2\64+\3\2\2\2\64.\3\2\2\2"+
		"\64\61\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\5\3\2\2\28\66"+
		"\3\2\2\29>\5\b\5\2:>\5\n\6\2;>\5\f\7\2<>\5\16\b\2=9\3\2\2\2=:\3\2\2\2"+
		"=;\3\2\2\2=<\3\2\2\2>\7\3\2\2\2?B\7\5\2\2@A\7\21\2\2AC\7\5\2\2B@\3\2\2"+
		"\2BC\3\2\2\2C\t\3\2\2\2DE\7\17\2\2EF\7\n\2\2FG\5\b\5\2GH\7\20\2\2H\13"+
		"\3\2\2\2IM\7\4\2\2JL\7\3\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N"+
		"\r\3\2\2\2OM\3\2\2\2PQ\7\17\2\2QR\7\n\2\2RS\5\f\7\2ST\7\20\2\2T\17\3\2"+
		"\2\2UV\7\4\2\2V\21\3\2\2\2\t!&\64\66=BM";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}