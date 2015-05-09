// Generated from Grammar.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__19=1, T__18=2, T__17=3, T__16=4, T__15=5, T__14=6, T__13=7, T__12=8, 
		T__11=9, T__10=10, T__9=11, T__8=12, T__7=13, T__6=14, T__5=15, T__4=16, 
		T__3=17, T__2=18, T__1=19, T__0=20, INT=21, BOOLEANLITERAL=22, ASSIGN=23, 
		QUESTION=24, INC=25, DEC=26, SUB=27, DOULEQUOTE=28, NEWLINE=29, COLON=30, 
		SLASH=31, LOWERCASE=32, UPPERCASE=33, DIGIT=34, ID=35, STRING=36, WS=37, 
		COMMENT=38;
	public static final String[] tokenNames = {
		"<INVALID>", "'boolean'", "'integer'", "'!='", "'{'", "'=<'", "'>='", 
		"'||'", "'=='", "'<'", "'&&'", "'}'", "'if'", "'>'", "'string'", "'%'", 
		"'('", "')'", "'*'", "'+'", "'form'", "INT", "BOOLEANLITERAL", "'='", 
		"'?'", "'++'", "'--'", "'-'", "'\"'", "NEWLINE", "':'", "'/'", "LOWERCASE", 
		"UPPERCASE", "DIGIT", "ID", "STRING", "WS", "COMMENT"
	};
	public static final int
		RULE_expression = 0, RULE_myexpr = 1, RULE_literal = 2, RULE_variable = 3, 
		RULE_prog = 4, RULE_questionnaire = 5, RULE_nonifquestionlist = 6, RULE_ifquestionlist = 7, 
		RULE_question = 8, RULE_questionStatement = 9, RULE_type = 10, RULE_primitiveType = 11;
	public static final String[] ruleNames = {
		"expression", "myexpr", "literal", "variable", "prog", "questionnaire", 
		"nonifquestionlist", "ifquestionlist", "question", "questionStatement", 
		"type", "primitiveType"
	};

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LITExprContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LITExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLITExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLITExpr(this);
		}
	}
	public static class ANDExprContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ANDExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterANDExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitANDExpr(this);
		}
	}
	public static class ADDSUBExprContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ADDSUBExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterADDSUBExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitADDSUBExpr(this);
		}
	}
	public static class PARExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PARExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPARExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPARExpr(this);
		}
	}
	public static class EQUALExprContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public EQUALExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEQUALExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEQUALExpr(this);
		}
	}
	public static class ORExprContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ORExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterORExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitORExpr(this);
		}
	}
	public static class COMPExprContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public COMPExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCOMPExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCOMPExpr(this);
		}
	}
	public static class MULDIVExprContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public MULDIVExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMULDIVExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMULDIVExpr(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				_localctx = new LITExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(25); literal();
				}
				break;
			case 2:
				{
				_localctx = new PARExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				{
				setState(26); match(T__4);
				setState(27); expression(0);
				setState(28); match(T__3);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(50);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ANDExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(32);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(33); ((ANDExprContext)_localctx).op = match(T__10);
						setState(34); expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ORExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(35);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(36); ((ORExprContext)_localctx).op = match(T__13);
						setState(37); expression(7);
						}
						break;
					case 3:
						{
						_localctx = new COMPExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(38);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(39);
						((COMPExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__14) | (1L << T__11) | (1L << T__7))) != 0)) ) {
							((COMPExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(40); expression(6);
						}
						break;
					case 4:
						{
						_localctx = new EQUALExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(41);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(42);
						((EQUALExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__12) ) {
							((EQUALExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(43); expression(5);
						}
						break;
					case 5:
						{
						_localctx = new MULDIVExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(44);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(45);
						((MULDIVExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__2) | (1L << SLASH))) != 0)) ) {
							((MULDIVExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(46); expression(4);
						}
						break;
					case 6:
						{
						_localctx = new ADDSUBExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(47);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(48);
						((ADDSUBExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__1 || _la==SUB) ) {
							((ADDSUBExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(49); expression(3);
						}
						break;
					}
					} 
				}
				setState(54);
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

	public static class MyexprContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(GrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GrammarParser.NEWLINE, i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public MyexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMyexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMyexpr(this);
		}
	}

	public final MyexprContext myexpr() throws RecognitionException {
		MyexprContext _localctx = new MyexprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_myexpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(55); expression(0);
					setState(56); match(NEWLINE);
					}
					} 
				}
				setState(62);
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
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode BOOLEANLITERAL() { return getToken(GrammarParser.BOOLEANLITERAL, 0); }
		public TerminalNode INT() { return getToken(GrammarParser.INT, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_literal);
		try {
			setState(67);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64); match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65); variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66); match(BOOLEANLITERAL);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); match(ID);
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

	public static class ProgContext extends ParserRuleContext {
		public QuestionnaireContext questionnaire(int i) {
			return getRuleContext(QuestionnaireContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GrammarParser.NEWLINE, i);
		}
		public List<QuestionnaireContext> questionnaire() {
			return getRuleContexts(QuestionnaireContext.class);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(71); questionnaire();
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(72); match(NEWLINE);
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(82);
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

	public static class QuestionnaireContext extends ParserRuleContext {
		public List<IfquestionlistContext> ifquestionlist() {
			return getRuleContexts(IfquestionlistContext.class);
		}
		public List<NonifquestionlistContext> nonifquestionlist() {
			return getRuleContexts(NonifquestionlistContext.class);
		}
		public NonifquestionlistContext nonifquestionlist(int i) {
			return getRuleContext(NonifquestionlistContext.class,i);
		}
		public IfquestionlistContext ifquestionlist(int i) {
			return getRuleContext(IfquestionlistContext.class,i);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public QuestionnaireContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionnaire; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterQuestionnaire(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitQuestionnaire(this);
		}
	}

	public final QuestionnaireContext questionnaire() throws RecognitionException {
		QuestionnaireContext _localctx = new QuestionnaireContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_questionnaire);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); match(T__0);
			setState(84); variable();
			setState(85); match(T__16);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==ID) {
				{
				setState(88);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(86); ifquestionlist();
					}
					break;
				case ID:
					{
					setState(87); nonifquestionlist();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93); match(T__9);
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

	public static class NonifquestionlistContext extends ParserRuleContext {
		public QuestionContext question(int i) {
			return getRuleContext(QuestionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GrammarParser.NEWLINE, i);
		}
		public List<QuestionContext> question() {
			return getRuleContexts(QuestionContext.class);
		}
		public NonifquestionlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonifquestionlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNonifquestionlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNonifquestionlist(this);
		}
	}

	public final NonifquestionlistContext nonifquestionlist() throws RecognitionException {
		NonifquestionlistContext _localctx = new NonifquestionlistContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nonifquestionlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(95); question();
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(96); match(NEWLINE);
						}
						}
						setState(101);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(104); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class IfquestionlistContext extends ParserRuleContext {
		public List<IfquestionlistContext> ifquestionlist() {
			return getRuleContexts(IfquestionlistContext.class);
		}
		public QuestionContext question(int i) {
			return getRuleContext(QuestionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GrammarParser.NEWLINE, i);
		}
		public List<QuestionContext> question() {
			return getRuleContexts(QuestionContext.class);
		}
		public IfquestionlistContext ifquestionlist(int i) {
			return getRuleContext(IfquestionlistContext.class,i);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public IfquestionlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifquestionlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIfquestionlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIfquestionlist(this);
		}
	}

	public final IfquestionlistContext ifquestionlist() throws RecognitionException {
		IfquestionlistContext _localctx = new IfquestionlistContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifquestionlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106); match(T__8);
			setState(107); match(T__4);
			setState(108); variable();
			setState(109); match(T__3);
			setState(110); match(T__16);
			setState(125); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(125);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(111); question();
					setState(115);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(112); match(NEWLINE);
							}
							} 
						}
						setState(117);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
					}
					}
					break;
				case T__8:
					{
					setState(118); ifquestionlist();
					setState(122);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(119); match(NEWLINE);
							}
							} 
						}
						setState(124);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__8 || _la==ID );
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(129); match(NEWLINE);
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135); match(T__9);
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

	public static class QuestionContext extends ParserRuleContext {
		public QuestionStatementContext questionStatement() {
			return getRuleContext(QuestionStatementContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitQuestion(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); variable();
			setState(138); match(COLON);
			setState(139); questionStatement();
			setState(140); type();
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

	public static class QuestionStatementContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public QuestionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterQuestionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitQuestionStatement(this);
		}
	}

	public final QuestionStatementContext questionStatement() throws RecognitionException {
		QuestionStatementContext _localctx = new QuestionStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_questionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); match(STRING);
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

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); primitiveType();
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__18) | (1L << T__6))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		case 0: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 7);
		case 1: return precpred(_ctx, 6);
		case 2: return precpred(_ctx, 5);
		case 3: return precpred(_ctx, 4);
		case 4: return precpred(_ctx, 3);
		case 5: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u0097\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\5\2!\n\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\65\n\2\f\2"+
		"\16\28\13\2\3\3\3\3\3\3\7\3=\n\3\f\3\16\3@\13\3\3\4\3\4\3\4\3\4\5\4F\n"+
		"\4\3\5\3\5\3\6\3\6\7\6L\n\6\f\6\16\6O\13\6\7\6Q\n\6\f\6\16\6T\13\6\3\7"+
		"\3\7\3\7\3\7\3\7\7\7[\n\7\f\7\16\7^\13\7\3\7\3\7\3\b\3\b\7\bd\n\b\f\b"+
		"\16\bg\13\b\6\bi\n\b\r\b\16\bj\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tt\n\t\f"+
		"\t\16\tw\13\t\3\t\3\t\7\t{\n\t\f\t\16\t~\13\t\6\t\u0080\n\t\r\t\16\t\u0081"+
		"\3\t\7\t\u0085\n\t\f\t\16\t\u0088\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\2\3\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\7\5"+
		"\2\7\b\13\13\17\17\4\2\5\5\n\n\5\2\21\21\24\24!!\4\2\25\25\35\35\4\2\3"+
		"\4\20\20\u00a0\2 \3\2\2\2\4>\3\2\2\2\6E\3\2\2\2\bG\3\2\2\2\nR\3\2\2\2"+
		"\fU\3\2\2\2\16h\3\2\2\2\20l\3\2\2\2\22\u008b\3\2\2\2\24\u0090\3\2\2\2"+
		"\26\u0092\3\2\2\2\30\u0094\3\2\2\2\32\33\b\2\1\2\33!\5\6\4\2\34\35\7\22"+
		"\2\2\35\36\5\2\2\2\36\37\7\23\2\2\37!\3\2\2\2 \32\3\2\2\2 \34\3\2\2\2"+
		"!\66\3\2\2\2\"#\f\t\2\2#$\7\f\2\2$\65\5\2\2\n%&\f\b\2\2&\'\7\t\2\2\'\65"+
		"\5\2\2\t()\f\7\2\2)*\t\2\2\2*\65\5\2\2\b+,\f\6\2\2,-\t\3\2\2-\65\5\2\2"+
		"\7./\f\5\2\2/\60\t\4\2\2\60\65\5\2\2\6\61\62\f\4\2\2\62\63\t\5\2\2\63"+
		"\65\5\2\2\5\64\"\3\2\2\2\64%\3\2\2\2\64(\3\2\2\2\64+\3\2\2\2\64.\3\2\2"+
		"\2\64\61\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\3\3\2\2\2"+
		"8\66\3\2\2\29:\5\2\2\2:;\7\37\2\2;=\3\2\2\2<9\3\2\2\2=@\3\2\2\2><\3\2"+
		"\2\2>?\3\2\2\2?\5\3\2\2\2@>\3\2\2\2AF\3\2\2\2BF\7\27\2\2CF\5\b\5\2DF\7"+
		"\30\2\2EA\3\2\2\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2F\7\3\2\2\2GH\7%\2\2H\t"+
		"\3\2\2\2IM\5\f\7\2JL\7\37\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2"+
		"NQ\3\2\2\2OM\3\2\2\2PI\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\13\3\2\2"+
		"\2TR\3\2\2\2UV\7\26\2\2VW\5\b\5\2W\\\7\6\2\2X[\5\20\t\2Y[\5\16\b\2ZX\3"+
		"\2\2\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2"+
		"_`\7\r\2\2`\r\3\2\2\2ae\5\22\n\2bd\7\37\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2"+
		"\2\2ef\3\2\2\2fi\3\2\2\2ge\3\2\2\2ha\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2"+
		"\2\2k\17\3\2\2\2lm\7\16\2\2mn\7\22\2\2no\5\b\5\2op\7\23\2\2p\177\7\6\2"+
		"\2qu\5\22\n\2rt\7\37\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\u0080"+
		"\3\2\2\2wu\3\2\2\2x|\5\20\t\2y{\7\37\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2"+
		"|}\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2\177q\3\2\2\2\177x\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0086\3\2\2\2\u0083"+
		"\u0085\7\37\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089"+
		"\u008a\7\r\2\2\u008a\21\3\2\2\2\u008b\u008c\5\b\5\2\u008c\u008d\7 \2\2"+
		"\u008d\u008e\5\24\13\2\u008e\u008f\5\26\f\2\u008f\23\3\2\2\2\u0090\u0091"+
		"\7&\2\2\u0091\25\3\2\2\2\u0092\u0093\5\30\r\2\u0093\27\3\2\2\2\u0094\u0095"+
		"\t\6\2\2\u0095\31\3\2\2\2\22 \64\66>EMRZ\\eju|\177\u0081\u0086";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}