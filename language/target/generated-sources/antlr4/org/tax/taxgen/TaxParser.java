// Generated from Tax.g4 by ANTLR 4.4

package org.tax.taxgen;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TaxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, STRING=3, PRIMITIVETYPE=4, FORMTAG=5, IFTAG=6, WS=7, COMMENT=8, 
		DECIMAL=9, INT=10, DIGIT=11, LOWERCASE=12, UPPERCASE=13, BOOLEANLITERAL=14, 
		ID=15, LPAR=16, RPAR=17, ASSIGN=18, GT=19, LT=20, BANG=21, TILDE=22, QUESTION=23, 
		EQUAL=24, LE=25, GE=26, NOTEQUAL=27, AND=28, OR=29, INC=30, DEC=31, ADD=32, 
		SUB=33, MUL=34, DIV=35, BITAND=36, BITOR=37, CARET=38, MOD=39, SINGLEQUOTE=40, 
		DOULEQUOTE=41, NEWLINE=42, COLON=43, LBRA=44, RBRA=45, SLASH=46;
	public static final String[] tokenNames = {
		"<INVALID>", "'..'", "','", "STRING", "PRIMITIVETYPE", "'form'", "'if'", 
		"WS", "COMMENT", "DECIMAL", "INT", "DIGIT", "LOWERCASE", "UPPERCASE", 
		"BOOLEANLITERAL", "ID", "'('", "')'", "'='", "'>'", "'<'", "'!'", "'~'", 
		"'?'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", 
		"'+'", "'-'", "'*'", "DIV", "'&'", "'|'", "'^'", "'%'", "'''", "'\"'", 
		"NEWLINE", "':'", "'{'", "'}'", "SLASH"
	};
	public static final int
		RULE_prog = 0, RULE_questionnaire = 1, RULE_questions = 2, RULE_nonifquestionlist = 3, 
		RULE_questionlist = 4, RULE_ifquestionlist = 5, RULE_question = 6, RULE_questionStatement = 7, 
		RULE_type = 8, RULE_primitiveType = 9, RULE_enumeration = 10, RULE_enumItem = 11, 
		RULE_expression = 12, RULE_range = 13, RULE_date = 14, RULE_variable = 15;
	public static final String[] ruleNames = {
		"prog", "questionnaire", "questions", "nonifquestionlist", "questionlist", 
		"ifquestionlist", "question", "questionStatement", "type", "primitiveType", 
		"enumeration", "enumItem", "expression", "range", "date", "variable"
	};

	@Override
	public String getGrammarFileName() { return "Tax.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TaxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(TaxParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(TaxParser.NEWLINE, i);
		}
		public QuestionnaireContext questionnaire() {
			return getRuleContext(QuestionnaireContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaxListener ) ((TaxListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaxListener ) ((TaxListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(32); questionnaire();
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(33); match(NEWLINE);
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class QuestionnaireContext extends ParserRuleContext {
		public TerminalNode FORMTAG() { return getToken(TaxParser.FORMTAG, 0); }
		public QuestionsContext questions() {
			return getRuleContext(QuestionsContext.class,0);
		}
		public TerminalNode LBRA() { return getToken(TaxParser.LBRA, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode RBRA() { return getToken(TaxParser.RBRA, 0); }
		public QuestionnaireContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionnaire; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaxListener ) ((TaxListener)listener).enterQuestionnaire(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaxListener ) ((TaxListener)listener).exitQuestionnaire(this);
		}
	}

	public final QuestionnaireContext questionnaire() throws RecognitionException {
		QuestionnaireContext _localctx = new QuestionnaireContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_questionnaire);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); match(FORMTAG);
			setState(40); variable();
			setState(41); match(LBRA);
			setState(42); questions();
			setState(43); match(RBRA);
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
		public QuestionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaxListener ) ((TaxListener)listener).enterQuestions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaxListener ) ((TaxListener)listener).exitQuestions(this);
		}
	}

	public final QuestionsContext questions() throws RecognitionException {
		QuestionsContext _localctx = new QuestionsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_questions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IFTAG || _la==ID) {
				{
				setState(47);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(45); nonifquestionlist();
					}
					break;
				case IFTAG:
					{
					setState(46); ifquestionlist();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(51);
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
			if ( listener instanceof TaxListener ) ((TaxListener)listener).enterNonifquestionlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaxListener ) ((TaxListener)listener).exitNonifquestionlist(this);
		}
	}

	public final NonifquestionlistContext nonifquestionlist() throws RecognitionException {
		NonifquestionlistContext _localctx = new NonifquestionlistContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_nonifquestionlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); questionlist();
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
			if ( listener instanceof TaxListener ) ((TaxListener)listener).enterQuestionlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaxListener ) ((TaxListener)listener).exitQuestionlist(this);
		}
	}

	public final QuestionlistContext questionlist() throws RecognitionException {
		QuestionlistContext _localctx = new QuestionlistContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_questionlist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(54); question();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(57); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		public QuestionlistContext questionlist() {
			return getRuleContext(QuestionlistContext.class,0);
		}
		public TerminalNode IFTAG() { return getToken(TaxParser.IFTAG, 0); }
		public TerminalNode LPAR() { return getToken(TaxParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(TaxParser.RPAR, 0); }
		public TerminalNode LBRA() { return getToken(TaxParser.LBRA, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode RBRA() { return getToken(TaxParser.RBRA, 0); }
		public IfquestionlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifquestionlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaxListener ) ((TaxListener)listener).enterIfquestionlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaxListener ) ((TaxListener)listener).exitIfquestionlist(this);
		}
	}

	public final IfquestionlistContext ifquestionlist() throws RecognitionException {
		IfquestionlistContext _localctx = new IfquestionlistContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifquestionlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); match(IFTAG);
			setState(60); match(LPAR);
			setState(61); variable();
			setState(62); match(RPAR);
			setState(63); match(LBRA);
			setState(64); questionlist();
			setState(65); match(RBRA);
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
			if ( listener instanceof TaxListener ) ((TaxListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaxListener ) ((TaxListener)listener).exitQuestion(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); variable();
			setState(68); match(COLON);
			setState(69); questionStatement();
			setState(70); type();
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
		public TerminalNode STRING() { return getToken(TaxParser.STRING, 0); }
		public QuestionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaxListener ) ((TaxListener)listener).enterQuestionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaxListener ) ((TaxListener)listener).exitQuestionStatement(this);
		}
	}

	public final QuestionStatementContext questionStatement() throws RecognitionException {
		QuestionStatementContext _localctx = new QuestionStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_questionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(STRING);
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
		public EnumerationContext enumeration() {
			return getRuleContext(EnumerationContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(TaxParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(TaxParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaxListener ) ((TaxListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaxListener ) ((TaxListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		int _la;
		try {
			setState(83);
			switch (_input.LA(1)) {
			case PRIMITIVETYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(74); primitiveType();
				setState(79);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(75); match(LPAR);
					setState(76); expression();
					setState(77); match(RPAR);
					}
				}

				}
				break;
			case LBRA:
				enterOuterAlt(_localctx, 2);
				{
				setState(81); enumeration();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(82); range();
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode PRIMITIVETYPE() { return getToken(TaxParser.PRIMITIVETYPE, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaxListener ) ((TaxListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaxListener ) ((TaxListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_primitiveType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); match(PRIMITIVETYPE);
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

	public static class EnumerationContext extends ParserRuleContext {
		public List<EnumItemContext> enumItem() {
			return getRuleContexts(EnumItemContext.class);
		}
		public EnumItemContext enumItem(int i) {
			return getRuleContext(EnumItemContext.class,i);
		}
		public TerminalNode LBRA() { return getToken(TaxParser.LBRA, 0); }
		public TerminalNode RBRA() { return getToken(TaxParser.RBRA, 0); }
		public EnumerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaxListener ) ((TaxListener)listener).enterEnumeration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaxListener ) ((TaxListener)listener).exitEnumeration(this);
		}
	}

	public final EnumerationContext enumeration() throws RecognitionException {
		EnumerationContext _localctx = new EnumerationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_enumeration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); match(LBRA);
			setState(88); enumItem();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(89); match(T__0);
				setState(90); enumItem();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96); match(RBRA);
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

	public static class EnumItemContext extends ParserRuleContext {
		public EnumItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaxListener ) ((TaxListener)listener).enterEnumItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaxListener ) ((TaxListener)listener).exitEnumItem(this);
		}
	}

	public final EnumItemContext enumItem() throws RecognitionException {
		EnumItemContext _localctx = new EnumItemContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enumItem);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(98);
					matchWildcard();
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(TaxParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(TaxParser.RPAR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaxListener ) ((TaxListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaxListener ) ((TaxListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		try {
			int _alt;
			setState(118);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(104); match(LPAR);
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(105);
						matchWildcard();
						}
						} 
					}
					setState(110);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(111); match(RPAR);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(112);
						matchWildcard();
						}
						} 
					}
					setState(117);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
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

	public static class RangeContext extends ParserRuleContext {
		public TerminalNode INT(int i) {
			return getToken(TaxParser.INT, i);
		}
		public List<TerminalNode> INT() { return getTokens(TaxParser.INT); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaxListener ) ((TaxListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaxListener ) ((TaxListener)listener).exitRange(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); match(INT);
			setState(121); match(T__1);
			setState(122); match(INT);
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

	public static class DateContext extends ParserRuleContext {
		public TerminalNode DIGIT(int i) {
			return getToken(TaxParser.DIGIT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(TaxParser.DIGIT); }
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaxListener ) ((TaxListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaxListener ) ((TaxListener)listener).exitDate(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); match(DIGIT);
			setState(125); match(DIGIT);
			setState(126); match(SUB);
			setState(127); match(DIGIT);
			setState(128); match(DIGIT);
			setState(129); match(SUB);
			setState(130); match(DIGIT);
			setState(131); match(DIGIT);
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
		public TerminalNode ID() { return getToken(TaxParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaxListener ) ((TaxListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaxListener ) ((TaxListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133); match(ID);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\u008a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\7\2%\n\2\f\2\16\2(\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\7\4\62\n\4\f"+
		"\4\16\4\65\13\4\3\5\3\5\3\6\6\6:\n\6\r\6\16\6;\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\nR\n\n\3\n"+
		"\3\n\5\nV\n\n\3\13\3\13\3\f\3\f\3\f\3\f\7\f^\n\f\f\f\16\fa\13\f\3\f\3"+
		"\f\3\r\7\rf\n\r\f\r\16\ri\13\r\3\16\3\16\7\16m\n\16\f\16\16\16p\13\16"+
		"\3\16\3\16\7\16t\n\16\f\16\16\16w\13\16\5\16y\n\16\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\5gnu\2\22"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\2\u0085\2\"\3\2\2\2\4)\3\2"+
		"\2\2\6\63\3\2\2\2\b\66\3\2\2\2\n9\3\2\2\2\f=\3\2\2\2\16E\3\2\2\2\20J\3"+
		"\2\2\2\22U\3\2\2\2\24W\3\2\2\2\26Y\3\2\2\2\30g\3\2\2\2\32x\3\2\2\2\34"+
		"z\3\2\2\2\36~\3\2\2\2 \u0087\3\2\2\2\"&\5\4\3\2#%\7,\2\2$#\3\2\2\2%(\3"+
		"\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\3\3\2\2\2(&\3\2\2\2)*\7\7\2\2*+\5 \21\2"+
		"+,\7.\2\2,-\5\6\4\2-.\7/\2\2.\5\3\2\2\2/\62\5\b\5\2\60\62\5\f\7\2\61/"+
		"\3\2\2\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\7"+
		"\3\2\2\2\65\63\3\2\2\2\66\67\5\n\6\2\67\t\3\2\2\28:\5\16\b\298\3\2\2\2"+
		":;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\13\3\2\2\2=>\7\b\2\2>?\7\22\2\2?@\5 \21"+
		"\2@A\7\23\2\2AB\7.\2\2BC\5\n\6\2CD\7/\2\2D\r\3\2\2\2EF\5 \21\2FG\7-\2"+
		"\2GH\5\20\t\2HI\5\22\n\2I\17\3\2\2\2JK\7\5\2\2K\21\3\2\2\2LQ\5\24\13\2"+
		"MN\7\22\2\2NO\5\32\16\2OP\7\23\2\2PR\3\2\2\2QM\3\2\2\2QR\3\2\2\2RV\3\2"+
		"\2\2SV\5\26\f\2TV\5\34\17\2UL\3\2\2\2US\3\2\2\2UT\3\2\2\2V\23\3\2\2\2"+
		"WX\7\6\2\2X\25\3\2\2\2YZ\7.\2\2Z_\5\30\r\2[\\\7\4\2\2\\^\5\30\r\2][\3"+
		"\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\7/\2\2c\27"+
		"\3\2\2\2df\13\2\2\2ed\3\2\2\2fi\3\2\2\2gh\3\2\2\2ge\3\2\2\2h\31\3\2\2"+
		"\2ig\3\2\2\2jn\7\22\2\2km\13\2\2\2lk\3\2\2\2mp\3\2\2\2no\3\2\2\2nl\3\2"+
		"\2\2oq\3\2\2\2pn\3\2\2\2qy\7\23\2\2rt\13\2\2\2sr\3\2\2\2tw\3\2\2\2uv\3"+
		"\2\2\2us\3\2\2\2vy\3\2\2\2wu\3\2\2\2xj\3\2\2\2xu\3\2\2\2y\33\3\2\2\2z"+
		"{\7\f\2\2{|\7\3\2\2|}\7\f\2\2}\35\3\2\2\2~\177\7\r\2\2\177\u0080\7\r\2"+
		"\2\u0080\u0081\7#\2\2\u0081\u0082\7\r\2\2\u0082\u0083\7\r\2\2\u0083\u0084"+
		"\7#\2\2\u0084\u0085\7\r\2\2\u0085\u0086\7\r\2\2\u0086\37\3\2\2\2\u0087"+
		"\u0088\7\21\2\2\u0088!\3\2\2\2\r&\61\63;QU_gnux";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}