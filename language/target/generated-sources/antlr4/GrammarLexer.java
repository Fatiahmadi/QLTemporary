// Generated from Grammar.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, LOWERCASE=2, UPPERCASE=3, DIGIT=4, ID=5, INT=6, IFTAG=7, BOOLEANLITERAL=8, 
		LPAR=9, RPAR=10, ASSIGN=11, GT=12, LT=13, BANG=14, TILDE=15, QUESTION=16, 
		EQUAL=17, LE=18, GE=19, NOTEQUAL=20, AND=21, OR=22, INC=23, DEC=24, ADD=25, 
		SUB=26, MUL=27, DIV=28, BITAND=29, BITOR=30, CARET=31, MOD=32, SINGLEQUOTE=33, 
		DOULEQUOTE=34, NEWLINE=35, COLON=36, LBRA=37, RBRA=38, SLASH=39, STRING=40, 
		PRIMITIVETYPE=41, WS=42, COMMENT=43;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'"
	};
	public static final String[] ruleNames = {
		"T__0", "LOWERCASE", "UPPERCASE", "DIGIT", "ID", "INT", "IFTAG", "BOOLEANLITERAL", 
		"LPAR", "RPAR", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "EQUAL", 
		"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
		"DIV", "BITAND", "BITOR", "CARET", "MOD", "SINGLEQUOTE", "DOULEQUOTE", 
		"NEWLINE", "COLON", "LBRA", "RBRA", "SLASH", "STRING", "PRIMITIVETYPE", 
		"WS", "COMMENT"
	};


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2-\u0102\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\5\6g\n\6\3\6"+
		"\3\6\3\6\7\6l\n\6\f\6\16\6o\13\6\3\7\6\7r\n\7\r\7\16\7s\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0082\n\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\6$\u00c1\n$\r$\16"+
		"$\u00c2\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3)\7)\u00d1\n)\f)\16)\u00d4"+
		"\13)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\5*\u00ec\n*\3+\6+\u00ef\n+\r+\16+\u00f0\3+\3+\3,\3,\3,\3,\7,\u00f9\n"+
		",\f,\16,\u00fc\13,\3,\3,\3,\3,\3,\3\u00fa\2-\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U,W-\3\2\t\3\2c|\3\2C\\\3\2\62;\4\2\f\f\17\17\4\2$$^^\6\2\f\f\17\17$"+
		"$^^\5\2\13\f\17\17\"\"\u010e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5^\3\2\2\2"+
		"\7`\3\2\2\2\tb\3\2\2\2\13f\3\2\2\2\rq\3\2\2\2\17u\3\2\2\2\21\u0081\3\2"+
		"\2\2\23\u0083\3\2\2\2\25\u0085\3\2\2\2\27\u0087\3\2\2\2\31\u0089\3\2\2"+
		"\2\33\u008b\3\2\2\2\35\u008d\3\2\2\2\37\u008f\3\2\2\2!\u0091\3\2\2\2#"+
		"\u0093\3\2\2\2%\u0096\3\2\2\2\'\u0099\3\2\2\2)\u009c\3\2\2\2+\u009f\3"+
		"\2\2\2-\u00a2\3\2\2\2/\u00a5\3\2\2\2\61\u00a8\3\2\2\2\63\u00ab\3\2\2\2"+
		"\65\u00ad\3\2\2\2\67\u00af\3\2\2\29\u00b1\3\2\2\2;\u00b3\3\2\2\2=\u00b5"+
		"\3\2\2\2?\u00b7\3\2\2\2A\u00b9\3\2\2\2C\u00bb\3\2\2\2E\u00bd\3\2\2\2G"+
		"\u00c0\3\2\2\2I\u00c4\3\2\2\2K\u00c6\3\2\2\2M\u00c8\3\2\2\2O\u00ca\3\2"+
		"\2\2Q\u00cc\3\2\2\2S\u00eb\3\2\2\2U\u00ee\3\2\2\2W\u00f4\3\2\2\2YZ\7h"+
		"\2\2Z[\7q\2\2[\\\7t\2\2\\]\7o\2\2]\4\3\2\2\2^_\t\2\2\2_\6\3\2\2\2`a\t"+
		"\3\2\2a\b\3\2\2\2bc\t\4\2\2c\n\3\2\2\2dg\5\5\3\2eg\5\7\4\2fd\3\2\2\2f"+
		"e\3\2\2\2gm\3\2\2\2hl\5\5\3\2il\5\7\4\2jl\5\t\5\2kh\3\2\2\2ki\3\2\2\2"+
		"kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\f\3\2\2\2om\3\2\2\2pr\5\t\5"+
		"\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t\16\3\2\2\2uv\7k\2\2vw\7h\2"+
		"\2w\20\3\2\2\2xy\7v\2\2yz\7t\2\2z{\7w\2\2{\u0082\7g\2\2|}\7h\2\2}~\7c"+
		"\2\2~\177\7n\2\2\177\u0080\7u\2\2\u0080\u0082\7g\2\2\u0081x\3\2\2\2\u0081"+
		"|\3\2\2\2\u0082\22\3\2\2\2\u0083\u0084\7*\2\2\u0084\24\3\2\2\2\u0085\u0086"+
		"\7+\2\2\u0086\26\3\2\2\2\u0087\u0088\7?\2\2\u0088\30\3\2\2\2\u0089\u008a"+
		"\7@\2\2\u008a\32\3\2\2\2\u008b\u008c\7>\2\2\u008c\34\3\2\2\2\u008d\u008e"+
		"\7#\2\2\u008e\36\3\2\2\2\u008f\u0090\7\u0080\2\2\u0090 \3\2\2\2\u0091"+
		"\u0092\7A\2\2\u0092\"\3\2\2\2\u0093\u0094\7?\2\2\u0094\u0095\7?\2\2\u0095"+
		"$\3\2\2\2\u0096\u0097\7>\2\2\u0097\u0098\7?\2\2\u0098&\3\2\2\2\u0099\u009a"+
		"\7@\2\2\u009a\u009b\7?\2\2\u009b(\3\2\2\2\u009c\u009d\7#\2\2\u009d\u009e"+
		"\7?\2\2\u009e*\3\2\2\2\u009f\u00a0\7(\2\2\u00a0\u00a1\7(\2\2\u00a1,\3"+
		"\2\2\2\u00a2\u00a3\7~\2\2\u00a3\u00a4\7~\2\2\u00a4.\3\2\2\2\u00a5\u00a6"+
		"\7-\2\2\u00a6\u00a7\7-\2\2\u00a7\60\3\2\2\2\u00a8\u00a9\7/\2\2\u00a9\u00aa"+
		"\7/\2\2\u00aa\62\3\2\2\2\u00ab\u00ac\7-\2\2\u00ac\64\3\2\2\2\u00ad\u00ae"+
		"\7/\2\2\u00ae\66\3\2\2\2\u00af\u00b0\7,\2\2\u00b08\3\2\2\2\u00b1\u00b2"+
		"\7\61\2\2\u00b2:\3\2\2\2\u00b3\u00b4\7(\2\2\u00b4<\3\2\2\2\u00b5\u00b6"+
		"\7~\2\2\u00b6>\3\2\2\2\u00b7\u00b8\7`\2\2\u00b8@\3\2\2\2\u00b9\u00ba\7"+
		"\'\2\2\u00baB\3\2\2\2\u00bb\u00bc\7)\2\2\u00bcD\3\2\2\2\u00bd\u00be\7"+
		"$\2\2\u00beF\3\2\2\2\u00bf\u00c1\t\5\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2"+
		"\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3H\3\2\2\2\u00c4"+
		"\u00c5\7<\2\2\u00c5J\3\2\2\2\u00c6\u00c7\7}\2\2\u00c7L\3\2\2\2\u00c8\u00c9"+
		"\7\177\2\2\u00c9N\3\2\2\2\u00ca\u00cb\7\61\2\2\u00cbP\3\2\2\2\u00cc\u00d2"+
		"\7$\2\2\u00cd\u00ce\7^\2\2\u00ce\u00d1\t\6\2\2\u00cf\u00d1\n\7\2\2\u00d0"+
		"\u00cd\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d6\7$\2\2\u00d6R\3\2\2\2\u00d7\u00d8\7d\2\2\u00d8\u00d9\7q\2\2\u00d9"+
		"\u00da\7q\2\2\u00da\u00db\7n\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7c\2\2"+
		"\u00dd\u00ec\7p\2\2\u00de\u00df\7u\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1"+
		"\7t\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7p\2\2\u00e3\u00ec\7i\2\2\u00e4"+
		"\u00e5\7k\2\2\u00e5\u00e6\7p\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7g\2\2"+
		"\u00e8\u00e9\7i\2\2\u00e9\u00ea\7g\2\2\u00ea\u00ec\7t\2\2\u00eb\u00d7"+
		"\3\2\2\2\u00eb\u00de\3\2\2\2\u00eb\u00e4\3\2\2\2\u00ecT\3\2\2\2\u00ed"+
		"\u00ef\t\b\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\b+\2\2\u00f3"+
		"V\3\2\2\2\u00f4\u00f5\7\61\2\2\u00f5\u00f6\7,\2\2\u00f6\u00fa\3\2\2\2"+
		"\u00f7\u00f9\13\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd"+
		"\u00fe\7,\2\2\u00fe\u00ff\7\61\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\b,"+
		"\2\2\u0101X\3\2\2\2\16\2fkms\u0081\u00c2\u00d0\u00d2\u00eb\u00f0\u00fa"+
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