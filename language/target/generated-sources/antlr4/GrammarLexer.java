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
		T__19=1, T__18=2, T__17=3, T__16=4, T__15=5, T__14=6, T__13=7, T__12=8, 
		T__11=9, T__10=10, T__9=11, T__8=12, T__7=13, T__6=14, T__5=15, T__4=16, 
		T__3=17, T__2=18, T__1=19, T__0=20, LOWERCASE=21, UPPERCASE=22, DIGIT=23, 
		ID=24, INT=25, BOOLEANLITERAL=26, ASSIGN=27, QUESTION=28, INC=29, DEC=30, 
		SUB=31, DOULEQUOTE=32, NEWLINE=33, COLON=34, SLASH=35, STRING=36, WS=37, 
		COMMENT=38;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'"
	};
	public static final String[] ruleNames = {
		"T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", 
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "LOWERCASE", "UPPERCASE", "DIGIT", "ID", "INT", 
		"BOOLEANLITERAL", "ASSIGN", "QUESTION", "INC", "DEC", "SUB", "DOULEQUOTE", 
		"NEWLINE", "COLON", "SLASH", "STRING", "WS", "COMMENT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2(\u00eb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\5\31\u009b\n\31\3\31\3\31\3\31\7\31\u00a0"+
		"\n\31\f\31\16\31\u00a3\13\31\3\32\6\32\u00a6\n\32\r\32\16\32\u00a7\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00b3\n\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\6\"\u00c4\n\"\r\""+
		"\16\"\u00c5\3#\3#\3$\3$\3%\3%\3%\3%\7%\u00d0\n%\f%\16%\u00d3\13%\3%\3"+
		"%\3&\6&\u00d8\n&\r&\16&\u00d9\3&\3&\3\'\3\'\3\'\3\'\7\'\u00e2\n\'\f\'"+
		"\16\'\u00e5\13\'\3\'\3\'\3\'\3\'\3\'\3\u00e3\2(\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(\3"+
		"\2\t\3\2c|\3\2C\\\3\2\62;\4\2\f\f\17\17\4\2$$^^\6\2\f\f\17\17$$^^\5\2"+
		"\13\f\17\17\"\"\u00f5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5"+
		"W\3\2\2\2\7_\3\2\2\2\tb\3\2\2\2\13d\3\2\2\2\rg\3\2\2\2\17j\3\2\2\2\21"+
		"m\3\2\2\2\23p\3\2\2\2\25r\3\2\2\2\27u\3\2\2\2\31w\3\2\2\2\33z\3\2\2\2"+
		"\35|\3\2\2\2\37\u0083\3\2\2\2!\u0085\3\2\2\2#\u0087\3\2\2\2%\u0089\3\2"+
		"\2\2\'\u008b\3\2\2\2)\u008d\3\2\2\2+\u0092\3\2\2\2-\u0094\3\2\2\2/\u0096"+
		"\3\2\2\2\61\u009a\3\2\2\2\63\u00a5\3\2\2\2\65\u00b2\3\2\2\2\67\u00b4\3"+
		"\2\2\29\u00b6\3\2\2\2;\u00b8\3\2\2\2=\u00bb\3\2\2\2?\u00be\3\2\2\2A\u00c0"+
		"\3\2\2\2C\u00c3\3\2\2\2E\u00c7\3\2\2\2G\u00c9\3\2\2\2I\u00cb\3\2\2\2K"+
		"\u00d7\3\2\2\2M\u00dd\3\2\2\2OP\7d\2\2PQ\7q\2\2QR\7q\2\2RS\7n\2\2ST\7"+
		"g\2\2TU\7c\2\2UV\7p\2\2V\4\3\2\2\2WX\7k\2\2XY\7p\2\2YZ\7v\2\2Z[\7g\2\2"+
		"[\\\7i\2\2\\]\7g\2\2]^\7t\2\2^\6\3\2\2\2_`\7#\2\2`a\7?\2\2a\b\3\2\2\2"+
		"bc\7}\2\2c\n\3\2\2\2de\7?\2\2ef\7>\2\2f\f\3\2\2\2gh\7@\2\2hi\7?\2\2i\16"+
		"\3\2\2\2jk\7~\2\2kl\7~\2\2l\20\3\2\2\2mn\7?\2\2no\7?\2\2o\22\3\2\2\2p"+
		"q\7>\2\2q\24\3\2\2\2rs\7(\2\2st\7(\2\2t\26\3\2\2\2uv\7\177\2\2v\30\3\2"+
		"\2\2wx\7k\2\2xy\7h\2\2y\32\3\2\2\2z{\7@\2\2{\34\3\2\2\2|}\7u\2\2}~\7v"+
		"\2\2~\177\7t\2\2\177\u0080\7k\2\2\u0080\u0081\7p\2\2\u0081\u0082\7i\2"+
		"\2\u0082\36\3\2\2\2\u0083\u0084\7\'\2\2\u0084 \3\2\2\2\u0085\u0086\7*"+
		"\2\2\u0086\"\3\2\2\2\u0087\u0088\7+\2\2\u0088$\3\2\2\2\u0089\u008a\7,"+
		"\2\2\u008a&\3\2\2\2\u008b\u008c\7-\2\2\u008c(\3\2\2\2\u008d\u008e\7h\2"+
		"\2\u008e\u008f\7q\2\2\u008f\u0090\7t\2\2\u0090\u0091\7o\2\2\u0091*\3\2"+
		"\2\2\u0092\u0093\t\2\2\2\u0093,\3\2\2\2\u0094\u0095\t\3\2\2\u0095.\3\2"+
		"\2\2\u0096\u0097\t\4\2\2\u0097\60\3\2\2\2\u0098\u009b\5+\26\2\u0099\u009b"+
		"\5-\27\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\u00a1\3\2\2\2\u009c"+
		"\u00a0\5+\26\2\u009d\u00a0\5-\27\2\u009e\u00a0\5/\30\2\u009f\u009c\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\62\3\2\2\2\u00a3\u00a1\3\2\2"+
		"\2\u00a4\u00a6\5/\30\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5"+
		"\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\64\3\2\2\2\u00a9\u00aa\7v\2\2\u00aa"+
		"\u00ab\7t\2\2\u00ab\u00ac\7w\2\2\u00ac\u00b3\7g\2\2\u00ad\u00ae\7h\2\2"+
		"\u00ae\u00af\7c\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1\7u\2\2\u00b1\u00b3"+
		"\7g\2\2\u00b2\u00a9\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b3\66\3\2\2\2\u00b4"+
		"\u00b5\7?\2\2\u00b58\3\2\2\2\u00b6\u00b7\7A\2\2\u00b7:\3\2\2\2\u00b8\u00b9"+
		"\7-\2\2\u00b9\u00ba\7-\2\2\u00ba<\3\2\2\2\u00bb\u00bc\7/\2\2\u00bc\u00bd"+
		"\7/\2\2\u00bd>\3\2\2\2\u00be\u00bf\7/\2\2\u00bf@\3\2\2\2\u00c0\u00c1\7"+
		"$\2\2\u00c1B\3\2\2\2\u00c2\u00c4\t\5\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6D\3\2\2\2\u00c7"+
		"\u00c8\7<\2\2\u00c8F\3\2\2\2\u00c9\u00ca\7\61\2\2\u00caH\3\2\2\2\u00cb"+
		"\u00d1\7$\2\2\u00cc\u00cd\7^\2\2\u00cd\u00d0\t\6\2\2\u00ce\u00d0\n\7\2"+
		"\2\u00cf\u00cc\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf"+
		"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d5\7$\2\2\u00d5J\3\2\2\2\u00d6\u00d8\t\b\2\2\u00d7\u00d6\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\u00dc\b&\2\2\u00dcL\3\2\2\2\u00dd\u00de\7\61\2\2\u00de\u00df"+
		"\7,\2\2\u00df\u00e3\3\2\2\2\u00e0\u00e2\13\2\2\2\u00e1\u00e0\3\2\2\2\u00e2"+
		"\u00e5\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e6\3\2"+
		"\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\7,\2\2\u00e7\u00e8\7\61\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00ea\b\'\2\2\u00eaN\3\2\2\2\r\2\u009a\u009f\u00a1"+
		"\u00a7\u00b2\u00c5\u00cf\u00d1\u00d9\u00e3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}