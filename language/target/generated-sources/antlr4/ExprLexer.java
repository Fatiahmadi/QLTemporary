// Generated from Expr.g4 by ANTLR 4.4

package org.tax.exprgen;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''"
	};
	public static final String[] ruleNames = {
		"DECIMAL", "INT", "DIGIT", "LOWERCASE", "UPPERCASE", "BOOLEANLITERAL", 
		"ID", "LPAR", "RPAR", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
		"EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", 
		"MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", "SINGLEQUOTE", "DOULEQUOTE", 
		"NEWLINE", "COLON", "LBRA", "RBRA", "SLASH", "WS"
	};


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2)\u00d6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\6\2T\n\2\r\2"+
		"\16\2U\3\2\6\2Y\n\2\r\2\16\2Z\3\2\3\2\6\2_\n\2\r\2\16\2`\5\2c\n\2\3\3"+
		"\6\3f\n\3\r\3\16\3g\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7y\n\7\3\b\3\b\5\b}\n\b\3\b\3\b\3\b\7\b\u0082\n\b\f\b\16"+
		"\b\u0085\13\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\6#\u00c4\n#\r#\16#\u00c5\3$\3$\3%\3%\3&\3&\3\'\3\'"+
		"\3(\6(\u00d1\n(\r(\16(\u00d2\3(\3(\2\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)\3\2\7\3"+
		"\2\62;\3\2c|\3\2C\\\4\2\f\f\17\17\5\2\13\f\17\17\"\"\u00e1\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3b\3\2\2\2\5e\3\2\2\2\7i\3\2\2\2\tk"+
		"\3\2\2\2\13m\3\2\2\2\rx\3\2\2\2\17|\3\2\2\2\21\u0086\3\2\2\2\23\u0088"+
		"\3\2\2\2\25\u008a\3\2\2\2\27\u008c\3\2\2\2\31\u008e\3\2\2\2\33\u0090\3"+
		"\2\2\2\35\u0092\3\2\2\2\37\u0094\3\2\2\2!\u0096\3\2\2\2#\u0099\3\2\2\2"+
		"%\u009c\3\2\2\2\'\u009f\3\2\2\2)\u00a2\3\2\2\2+\u00a5\3\2\2\2-\u00a8\3"+
		"\2\2\2/\u00ab\3\2\2\2\61\u00ae\3\2\2\2\63\u00b0\3\2\2\2\65\u00b2\3\2\2"+
		"\2\67\u00b4\3\2\2\29\u00b6\3\2\2\2;\u00b8\3\2\2\2=\u00ba\3\2\2\2?\u00bc"+
		"\3\2\2\2A\u00be\3\2\2\2C\u00c0\3\2\2\2E\u00c3\3\2\2\2G\u00c7\3\2\2\2I"+
		"\u00c9\3\2\2\2K\u00cb\3\2\2\2M\u00cd\3\2\2\2O\u00d0\3\2\2\2QS\7\60\2\2"+
		"RT\5\7\4\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2Vc\3\2\2\2WY\5\7\4\2"+
		"XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\^\7\60\2\2]_\5\7"+
		"\4\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2bQ\3\2\2\2bX\3\2"+
		"\2\2c\4\3\2\2\2df\5\7\4\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\6\3"+
		"\2\2\2ij\t\2\2\2j\b\3\2\2\2kl\t\3\2\2l\n\3\2\2\2mn\t\4\2\2n\f\3\2\2\2"+
		"op\7v\2\2pq\7t\2\2qr\7w\2\2ry\7g\2\2st\7h\2\2tu\7c\2\2uv\7n\2\2vw\7u\2"+
		"\2wy\7g\2\2xo\3\2\2\2xs\3\2\2\2y\16\3\2\2\2z}\5\t\5\2{}\5\13\6\2|z\3\2"+
		"\2\2|{\3\2\2\2}\u0083\3\2\2\2~\u0082\5\t\5\2\177\u0082\5\13\6\2\u0080"+
		"\u0082\5\7\4\2\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082"+
		"\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\20\3\2\2"+
		"\2\u0085\u0083\3\2\2\2\u0086\u0087\7*\2\2\u0087\22\3\2\2\2\u0088\u0089"+
		"\7+\2\2\u0089\24\3\2\2\2\u008a\u008b\7?\2\2\u008b\26\3\2\2\2\u008c\u008d"+
		"\7@\2\2\u008d\30\3\2\2\2\u008e\u008f\7>\2\2\u008f\32\3\2\2\2\u0090\u0091"+
		"\7#\2\2\u0091\34\3\2\2\2\u0092\u0093\7\u0080\2\2\u0093\36\3\2\2\2\u0094"+
		"\u0095\7A\2\2\u0095 \3\2\2\2\u0096\u0097\7?\2\2\u0097\u0098\7?\2\2\u0098"+
		"\"\3\2\2\2\u0099\u009a\7>\2\2\u009a\u009b\7?\2\2\u009b$\3\2\2\2\u009c"+
		"\u009d\7@\2\2\u009d\u009e\7?\2\2\u009e&\3\2\2\2\u009f\u00a0\7#\2\2\u00a0"+
		"\u00a1\7?\2\2\u00a1(\3\2\2\2\u00a2\u00a3\7(\2\2\u00a3\u00a4\7(\2\2\u00a4"+
		"*\3\2\2\2\u00a5\u00a6\7~\2\2\u00a6\u00a7\7~\2\2\u00a7,\3\2\2\2\u00a8\u00a9"+
		"\7-\2\2\u00a9\u00aa\7-\2\2\u00aa.\3\2\2\2\u00ab\u00ac\7/\2\2\u00ac\u00ad"+
		"\7/\2\2\u00ad\60\3\2\2\2\u00ae\u00af\7-\2\2\u00af\62\3\2\2\2\u00b0\u00b1"+
		"\7/\2\2\u00b1\64\3\2\2\2\u00b2\u00b3\7,\2\2\u00b3\66\3\2\2\2\u00b4\u00b5"+
		"\7\61\2\2\u00b58\3\2\2\2\u00b6\u00b7\7(\2\2\u00b7:\3\2\2\2\u00b8\u00b9"+
		"\7~\2\2\u00b9<\3\2\2\2\u00ba\u00bb\7`\2\2\u00bb>\3\2\2\2\u00bc\u00bd\7"+
		"\'\2\2\u00bd@\3\2\2\2\u00be\u00bf\7)\2\2\u00bfB\3\2\2\2\u00c0\u00c1\7"+
		"$\2\2\u00c1D\3\2\2\2\u00c2\u00c4\t\5\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6F\3\2\2\2\u00c7"+
		"\u00c8\7<\2\2\u00c8H\3\2\2\2\u00c9\u00ca\7}\2\2\u00caJ\3\2\2\2\u00cb\u00cc"+
		"\7\177\2\2\u00ccL\3\2\2\2\u00cd\u00ce\7\61\2\2\u00ceN\3\2\2\2\u00cf\u00d1"+
		"\t\6\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\b(\2\2\u00d5P\3\2\2\2\16"+
		"\2UZ`bgx|\u0081\u0083\u00c5\u00d2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}