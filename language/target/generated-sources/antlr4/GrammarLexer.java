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
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, LOWERCASE=7, UPPERCASE=8, 
		DIGIT=9, ID=10, INT=11, IFTAG=12, BOOLEANLITERAL=13, ASSIGN=14, GT=15, 
		LT=16, BANG=17, TILDE=18, QUESTION=19, EQUAL=20, LE=21, GE=22, NOTEQUAL=23, 
		AND=24, OR=25, INC=26, DEC=27, ADD=28, SUB=29, MUL=30, DIV=31, BITAND=32, 
		BITOR=33, CARET=34, MOD=35, SINGLEQUOTE=36, DOULEQUOTE=37, NEWLINE=38, 
		COLON=39, SLASH=40, STRING=41, PRIMITIVETYPE=42, WS=43, COMMENT=44;
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
		"'('", "')'", "'*'", "'+'", "','"
	};
	public static final String[] ruleNames = {
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "LOWERCASE", "UPPERCASE", 
		"DIGIT", "ID", "INT", "IFTAG", "BOOLEANLITERAL", "ASSIGN", "GT", "LT", 
		"BANG", "TILDE", "QUESTION", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", 
		"INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", 
		"MOD", "SINGLEQUOTE", "DOULEQUOTE", "NEWLINE", "COLON", "SLASH", "STRING", 
		"PRIMITIVETYPE", "WS", "COMMENT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2.\u0107\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\5\13t\n\13\3\13\3\13\3\13\7\13"+
		"y\n\13\f\13\16\13|\13\13\3\f\6\f\177\n\f\r\f\16\f\u0080\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u008f\n\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\6\'\u00ca\n\'\r\'\16\'\u00cb\3"+
		"(\3(\3)\3)\3*\3*\3*\3*\7*\u00d6\n*\f*\16*\u00d9\13*\3*\3*\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u00f1\n+\3,\6,\u00f4"+
		"\n,\r,\16,\u00f5\3,\3,\3-\3-\3-\3-\7-\u00fe\n-\f-\16-\u0101\13-\3-\3-"+
		"\3-\3-\3-\3\u00ff\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.\3\2\t\3\2c|\3\2C"+
		"\\\3\2\62;\4\2\f\f\17\17\4\2$$^^\6\2\f\f\17\17$$^^\5\2\13\f\17\17\"\""+
		"\u0113\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5^\3\2\2\2\7`\3\2\2"+
		"\2\tb\3\2\2\2\13d\3\2\2\2\ri\3\2\2\2\17k\3\2\2\2\21m\3\2\2\2\23o\3\2\2"+
		"\2\25s\3\2\2\2\27~\3\2\2\2\31\u0082\3\2\2\2\33\u008e\3\2\2\2\35\u0090"+
		"\3\2\2\2\37\u0092\3\2\2\2!\u0094\3\2\2\2#\u0096\3\2\2\2%\u0098\3\2\2\2"+
		"\'\u009a\3\2\2\2)\u009c\3\2\2\2+\u009f\3\2\2\2-\u00a2\3\2\2\2/\u00a5\3"+
		"\2\2\2\61\u00a8\3\2\2\2\63\u00ab\3\2\2\2\65\u00ae\3\2\2\2\67\u00b1\3\2"+
		"\2\29\u00b4\3\2\2\2;\u00b6\3\2\2\2=\u00b8\3\2\2\2?\u00ba\3\2\2\2A\u00bc"+
		"\3\2\2\2C\u00be\3\2\2\2E\u00c0\3\2\2\2G\u00c2\3\2\2\2I\u00c4\3\2\2\2K"+
		"\u00c6\3\2\2\2M\u00c9\3\2\2\2O\u00cd\3\2\2\2Q\u00cf\3\2\2\2S\u00d1\3\2"+
		"\2\2U\u00f0\3\2\2\2W\u00f3\3\2\2\2Y\u00f9\3\2\2\2[\\\7\"\2\2\\]\7*\2\2"+
		"]\4\3\2\2\2^_\7*\2\2_\6\3\2\2\2`a\7+\2\2a\b\3\2\2\2bc\7}\2\2c\n\3\2\2"+
		"\2de\7h\2\2ef\7q\2\2fg\7t\2\2gh\7o\2\2h\f\3\2\2\2ij\7\177\2\2j\16\3\2"+
		"\2\2kl\t\2\2\2l\20\3\2\2\2mn\t\3\2\2n\22\3\2\2\2op\t\4\2\2p\24\3\2\2\2"+
		"qt\5\17\b\2rt\5\21\t\2sq\3\2\2\2sr\3\2\2\2tz\3\2\2\2uy\5\17\b\2vy\5\21"+
		"\t\2wy\5\23\n\2xu\3\2\2\2xv\3\2\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3"+
		"\2\2\2{\26\3\2\2\2|z\3\2\2\2}\177\5\23\n\2~}\3\2\2\2\177\u0080\3\2\2\2"+
		"\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\30\3\2\2\2\u0082\u0083\7k\2"+
		"\2\u0083\u0084\7h\2\2\u0084\32\3\2\2\2\u0085\u0086\7v\2\2\u0086\u0087"+
		"\7t\2\2\u0087\u0088\7w\2\2\u0088\u008f\7g\2\2\u0089\u008a\7h\2\2\u008a"+
		"\u008b\7c\2\2\u008b\u008c\7n\2\2\u008c\u008d\7u\2\2\u008d\u008f\7g\2\2"+
		"\u008e\u0085\3\2\2\2\u008e\u0089\3\2\2\2\u008f\34\3\2\2\2\u0090\u0091"+
		"\7?\2\2\u0091\36\3\2\2\2\u0092\u0093\7@\2\2\u0093 \3\2\2\2\u0094\u0095"+
		"\7>\2\2\u0095\"\3\2\2\2\u0096\u0097\7#\2\2\u0097$\3\2\2\2\u0098\u0099"+
		"\7\u0080\2\2\u0099&\3\2\2\2\u009a\u009b\7A\2\2\u009b(\3\2\2\2\u009c\u009d"+
		"\7?\2\2\u009d\u009e\7?\2\2\u009e*\3\2\2\2\u009f\u00a0\7>\2\2\u00a0\u00a1"+
		"\7?\2\2\u00a1,\3\2\2\2\u00a2\u00a3\7@\2\2\u00a3\u00a4\7?\2\2\u00a4.\3"+
		"\2\2\2\u00a5\u00a6\7#\2\2\u00a6\u00a7\7?\2\2\u00a7\60\3\2\2\2\u00a8\u00a9"+
		"\7(\2\2\u00a9\u00aa\7(\2\2\u00aa\62\3\2\2\2\u00ab\u00ac\7~\2\2\u00ac\u00ad"+
		"\7~\2\2\u00ad\64\3\2\2\2\u00ae\u00af\7-\2\2\u00af\u00b0\7-\2\2\u00b0\66"+
		"\3\2\2\2\u00b1\u00b2\7/\2\2\u00b2\u00b3\7/\2\2\u00b38\3\2\2\2\u00b4\u00b5"+
		"\7-\2\2\u00b5:\3\2\2\2\u00b6\u00b7\7/\2\2\u00b7<\3\2\2\2\u00b8\u00b9\7"+
		",\2\2\u00b9>\3\2\2\2\u00ba\u00bb\7\61\2\2\u00bb@\3\2\2\2\u00bc\u00bd\7"+
		"(\2\2\u00bdB\3\2\2\2\u00be\u00bf\7~\2\2\u00bfD\3\2\2\2\u00c0\u00c1\7`"+
		"\2\2\u00c1F\3\2\2\2\u00c2\u00c3\7\'\2\2\u00c3H\3\2\2\2\u00c4\u00c5\7)"+
		"\2\2\u00c5J\3\2\2\2\u00c6\u00c7\7$\2\2\u00c7L\3\2\2\2\u00c8\u00ca\t\5"+
		"\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00ccN\3\2\2\2\u00cd\u00ce\7<\2\2\u00ceP\3\2\2\2\u00cf"+
		"\u00d0\7\61\2\2\u00d0R\3\2\2\2\u00d1\u00d7\7$\2\2\u00d2\u00d3\7^\2\2\u00d3"+
		"\u00d6\t\6\2\2\u00d4\u00d6\n\7\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d4\3\2"+
		"\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7$\2\2\u00dbT\3\2\2\2\u00dc"+
		"\u00dd\7d\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7q\2\2\u00df\u00e0\7n\2\2"+
		"\u00e0\u00e1\7g\2\2\u00e1\u00e2\7c\2\2\u00e2\u00f1\7p\2\2\u00e3\u00e4"+
		"\7u\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7k\2\2\u00e7"+
		"\u00e8\7p\2\2\u00e8\u00f1\7i\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7p\2\2"+
		"\u00eb\u00ec\7v\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7i\2\2\u00ee\u00ef"+
		"\7g\2\2\u00ef\u00f1\7t\2\2\u00f0\u00dc\3\2\2\2\u00f0\u00e3\3\2\2\2\u00f0"+
		"\u00e9\3\2\2\2\u00f1V\3\2\2\2\u00f2\u00f4\t\b\2\2\u00f3\u00f2\3\2\2\2"+
		"\u00f4\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7"+
		"\3\2\2\2\u00f7\u00f8\b,\2\2\u00f8X\3\2\2\2\u00f9\u00fa\7\61\2\2\u00fa"+
		"\u00fb\7,\2\2\u00fb\u00ff\3\2\2\2\u00fc\u00fe\13\2\2\2\u00fd\u00fc\3\2"+
		"\2\2\u00fe\u0101\3\2\2\2\u00ff\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100"+
		"\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\7,\2\2\u0103\u0104\7\61"+
		"\2\2\u0104\u0105\3\2\2\2\u0105\u0106\b-\2\2\u0106Z\3\2\2\2\16\2sxz\u0080"+
		"\u008e\u00cb\u00d5\u00d7\u00f0\u00f5\u00ff\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}