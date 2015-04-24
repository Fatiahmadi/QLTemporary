// Generated from Common.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DECIMAL=1, INT=2, DIGIT=3, LOWERCASE=4, UPPERCASE=5, BOOLEANLITERAL=6, 
		ID=7, LPAR=8, RPAR=9, ASSIGN=10, GT=11, LT=12, BANG=13, TILDE=14, QUESTION=15, 
		EQUAL=16, LE=17, GE=18, NOTEQUAL=19, AND=20, OR=21, INC=22, DEC=23, ADD=24, 
		SUB=25, MUL=26, DIV=27, BITAND=28, BITOR=29, CARET=30, MOD=31, SINGLEQUOTE=32, 
		DOULEQUOTE=33, NEWLINE=34, COLON=35, LBRA=36, RBRA=37, SLASH=38, WS=39;
	public static final String[] tokenNames = {
		"<INVALID>", "DECIMAL", "INT", "DIGIT", "LOWERCASE", "UPPERCASE", "BOOLEANLITERAL", 
		"ID", "'('", "')'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "'=='", 
		"'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", 
		"'*'", "DIV", "'&'", "'|'", "'^'", "'%'", "'''", "'\"'", "NEWLINE", "':'", 
		"'{'", "'}'", "SLASH", "WS"
	};
	public static final int
		RULE_variable = 0;
	public static final String[] ruleNames = {
		"variable"
	};

	@Override
	public String getGrammarFileName() { return "Common.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CommonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CommonParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2); match(ID);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\7\4\2\t\2\3\2\3"+
		"\2\3\2\2\2\3\2\2\2\5\2\4\3\2\2\2\4\5\7\t\2\2\5\3\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}