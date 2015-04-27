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
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, LOWERCASE=7, UPPERCASE=8, 
		DIGIT=9, ID=10, INT=11, IFTAG=12, BOOLEANLITERAL=13, ASSIGN=14, GT=15, 
		LT=16, BANG=17, TILDE=18, QUESTION=19, EQUAL=20, LE=21, GE=22, NOTEQUAL=23, 
		AND=24, OR=25, INC=26, DEC=27, ADD=28, SUB=29, MUL=30, DIV=31, BITAND=32, 
		BITOR=33, CARET=34, MOD=35, SINGLEQUOTE=36, DOULEQUOTE=37, NEWLINE=38, 
		COLON=39, SLASH=40, STRING=41, PRIMITIVETYPE=42, WS=43, COMMENT=44;
	public static final String[] tokenNames = {
		"<INVALID>", "' ('", "'('", "')'", "'{'", "'form'", "'}'", "LOWERCASE", 
		"UPPERCASE", "DIGIT", "ID", "INT", "'if'", "BOOLEANLITERAL", "'='", "'>'", 
		"'<'", "'!'", "'~'", "'?'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", 
		"'++'", "'--'", "'+'", "'-'", "'*'", "DIV", "'&'", "'|'", "'^'", "'%'", 
		"'''", "'\"'", "NEWLINE", "':'", "SLASH", "STRING", "PRIMITIVETYPE", "WS", 
		"COMMENT"
	};
	public static final int
		RULE_variable = 0, RULE_expression = 1, RULE_myexpr = 2, RULE_literal = 3, 
		RULE_prog = 4, RULE_questionnaire = 5, RULE_questions = 6, RULE_nonifquestionlist = 7, 
		RULE_questionlist = 8, RULE_ifquestionlist = 9, RULE_question = 10, RULE_questionStatement = 11, 
		RULE_type = 12, RULE_primitiveType = 13;
	public static final String[] ruleNames = {
		"variable", "expression", "myexpr", "literal", "prog", "questionnaire", 
		"questions", "nonifquestionlist", "questionlist", "ifquestionlist", "question", 
		"questionStatement", "type", "primitiveType"
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
		enterRule(_localctx, 0, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); match(ID);
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
		public TerminalNode AND() { return getToken(GrammarParser.AND, 0); }
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
		public TerminalNode SUB() { return getToken(GrammarParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(GrammarParser.ADD, 0); }
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
		public TerminalNode EQUAL() { return getToken(GrammarParser.EQUAL, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOTEQUAL() { return getToken(GrammarParser.NOTEQUAL, 0); }
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
		public TerminalNode OR() { return getToken(GrammarParser.OR, 0); }
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
		public TerminalNode GE() { return getToken(GrammarParser.GE, 0); }
		public TerminalNode LT() { return getToken(GrammarParser.LT, 0); }
		public TerminalNode GT() { return getToken(GrammarParser.GT, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LE() { return getToken(GrammarParser.LE, 0); }
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
		public TerminalNode MOD() { return getToken(GrammarParser.MOD, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode DIV() { return getToken(GrammarParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(GrammarParser.MUL, 0); }
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
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				_localctx = new LITExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(31); literal();
				}
				break;
			case 2:
				{
				_localctx = new PARExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				{
				setState(32); match(T__4);
				setState(33); expression(0);
				setState(34); match(T__3);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(56);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ANDExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(38);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(39); ((ANDExprContext)_localctx).op = match(AND);
						setState(40); expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ORExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(41);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(42); ((ORExprContext)_localctx).op = match(OR);
						setState(43); expression(7);
						}
						break;
					case 3:
						{
						_localctx = new COMPExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(44);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(45);
						((COMPExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE))) != 0)) ) {
							((COMPExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(46); expression(6);
						}
						break;
					case 4:
						{
						_localctx = new EQUALExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(47);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(48);
						((EQUALExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((EQUALExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(49); expression(5);
						}
						break;
					case 5:
						{
						_localctx = new MULDIVExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(50);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(51);
						((MULDIVExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MULDIVExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(52); expression(4);
						}
						break;
					case 6:
						{
						_localctx = new ADDSUBExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(53);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(54);
						((ADDSUBExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ADDSUBExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(55); expression(3);
						}
						break;
					}
					} 
				}
				setState(60);
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
		enterRule(_localctx, 4, RULE_myexpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(61); expression(0);
					setState(62); match(NEWLINE);
					}
					} 
				}
				setState(68);
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
		enterRule(_localctx, 6, RULE_literal);
		try {
			setState(73);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70); match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71); variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(72); match(BOOLEANLITERAL);
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
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(75); questionnaire();
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(76); match(NEWLINE);
					}
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(86);
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
		public QuestionsContext questions() {
			return getRuleContext(QuestionsContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); match(T__1);
			setState(88); variable();
			setState(89); match(T__2);
			setState(90); questions();
			setState(91); match(T__0);
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

	public static class QuestionsContext extends ParserRuleContext {
		public IfquestionlistContext ifquestionlist() {
			return getRuleContext(IfquestionlistContext.class,0);
		}
		public NonifquestionlistContext nonifquestionlist() {
			return getRuleContext(NonifquestionlistContext.class,0);
		}
		public QuestionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterQuestions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitQuestions(this);
		}
	}

	public final QuestionsContext questions() throws RecognitionException {
		QuestionsContext _localctx = new QuestionsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_questions);
		int _la;
		try {
			setState(102);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(93); match(T__4);
				setState(94); nonifquestionlist();
				}
				break;
			case IFTAG:
				enterOuterAlt(_localctx, 2);
				{
				setState(95); ifquestionlist();
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(96); match(T__3);
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public QuestionlistContext questionlist() {
			return getRuleContext(QuestionlistContext.class,0);
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
		enterRule(_localctx, 14, RULE_nonifquestionlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); questionlist();
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

	public static class QuestionlistContext extends ParserRuleContext {
		public QuestionContext question(int i) {
			return getRuleContext(QuestionContext.class,i);
		}
		public List<QuestionContext> question() {
			return getRuleContexts(QuestionContext.class);
		}
		public QuestionlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterQuestionlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitQuestionlist(this);
		}
	}

	public final QuestionlistContext questionlist() throws RecognitionException {
		QuestionlistContext _localctx = new QuestionlistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_questionlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(106); question();
				}
				}
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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
		public QuestionlistContext questionlist() {
			return getRuleContext(QuestionlistContext.class,0);
		}
		public TerminalNode IFTAG() { return getToken(GrammarParser.IFTAG, 0); }
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
		enterRule(_localctx, 18, RULE_ifquestionlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); match(IFTAG);
			setState(112); match(T__4);
			setState(113); variable();
			setState(114); match(T__3);
			setState(115); match(T__2);
			setState(116); questionlist();
			setState(117); match(T__0);
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
		enterRule(_localctx, 20, RULE_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); variable();
			setState(120); match(COLON);
			setState(121); questionStatement();
			setState(122); type();
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
		enterRule(_localctx, 22, RULE_questionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); match(STRING);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 24, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); primitiveType();
			setState(131);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(127); match(T__5);
				setState(128); expression(0);
				setState(129); match(T__3);
				}
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode PRIMITIVETYPE() { return getToken(GrammarParser.PRIMITIVETYPE, 0); }
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
		enterRule(_localctx, 26, RULE_primitiveType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133); match(PRIMITIVETYPE);
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
		case 1: return expression_sempred((ExpressionContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u008a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3\'\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\7\3;\n\3\f\3\16\3>\13\3\3\4\3\4\3\4\7\4C\n\4\f\4\16\4F"+
		"\13\4\3\5\3\5\3\5\3\5\5\5L\n\5\3\6\3\6\7\6P\n\6\f\6\16\6S\13\6\7\6U\n"+
		"\6\f\6\16\6X\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7\bd\n\b\f\b"+
		"\16\bg\13\b\5\bi\n\b\3\t\3\t\3\n\6\nn\n\n\r\n\16\no\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u0086\n\16\3\17\3\17\3\17\2\3\4\20\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\2\6\4\2\21\22\27\30\4\2\26\26\31\31\4\2 !%%\3\2\36\37\u008c"+
		"\2\36\3\2\2\2\4&\3\2\2\2\6D\3\2\2\2\bK\3\2\2\2\nV\3\2\2\2\fY\3\2\2\2\16"+
		"h\3\2\2\2\20j\3\2\2\2\22m\3\2\2\2\24q\3\2\2\2\26y\3\2\2\2\30~\3\2\2\2"+
		"\32\u0080\3\2\2\2\34\u0087\3\2\2\2\36\37\7\f\2\2\37\3\3\2\2\2 !\b\3\1"+
		"\2!\'\5\b\5\2\"#\7\4\2\2#$\5\4\3\2$%\7\5\2\2%\'\3\2\2\2& \3\2\2\2&\"\3"+
		"\2\2\2\'<\3\2\2\2()\f\t\2\2)*\7\32\2\2*;\5\4\3\n+,\f\b\2\2,-\7\33\2\2"+
		"-;\5\4\3\t./\f\7\2\2/\60\t\2\2\2\60;\5\4\3\b\61\62\f\6\2\2\62\63\t\3\2"+
		"\2\63;\5\4\3\7\64\65\f\5\2\2\65\66\t\4\2\2\66;\5\4\3\6\678\f\4\2\289\t"+
		"\5\2\29;\5\4\3\5:(\3\2\2\2:+\3\2\2\2:.\3\2\2\2:\61\3\2\2\2:\64\3\2\2\2"+
		":\67\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\5\3\2\2\2><\3\2\2\2?@\5\4"+
		"\3\2@A\7(\2\2AC\3\2\2\2B?\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\7\3\2"+
		"\2\2FD\3\2\2\2GL\3\2\2\2HL\7\r\2\2IL\5\2\2\2JL\7\17\2\2KG\3\2\2\2KH\3"+
		"\2\2\2KI\3\2\2\2KJ\3\2\2\2L\t\3\2\2\2MQ\5\f\7\2NP\7(\2\2ON\3\2\2\2PS\3"+
		"\2\2\2QO\3\2\2\2QR\3\2\2\2RU\3\2\2\2SQ\3\2\2\2TM\3\2\2\2UX\3\2\2\2VT\3"+
		"\2\2\2VW\3\2\2\2W\13\3\2\2\2XV\3\2\2\2YZ\7\7\2\2Z[\5\2\2\2[\\\7\6\2\2"+
		"\\]\5\16\b\2]^\7\b\2\2^\r\3\2\2\2_`\7\4\2\2`i\5\20\t\2ae\5\24\13\2bd\7"+
		"\5\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fi\3\2\2\2ge\3\2\2\2h_\3"+
		"\2\2\2ha\3\2\2\2i\17\3\2\2\2jk\5\22\n\2k\21\3\2\2\2ln\5\26\f\2ml\3\2\2"+
		"\2no\3\2\2\2om\3\2\2\2op\3\2\2\2p\23\3\2\2\2qr\7\16\2\2rs\7\4\2\2st\5"+
		"\2\2\2tu\7\5\2\2uv\7\6\2\2vw\5\22\n\2wx\7\b\2\2x\25\3\2\2\2yz\5\2\2\2"+
		"z{\7)\2\2{|\5\30\r\2|}\5\32\16\2}\27\3\2\2\2~\177\7+\2\2\177\31\3\2\2"+
		"\2\u0080\u0085\5\34\17\2\u0081\u0082\7\3\2\2\u0082\u0083\5\4\3\2\u0083"+
		"\u0084\7\5\2\2\u0084\u0086\3\2\2\2\u0085\u0081\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\33\3\2\2\2\u0087\u0088\7,\2\2\u0088\35\3\2\2\2\r&:<DKQVeho"+
		"\u0085";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}