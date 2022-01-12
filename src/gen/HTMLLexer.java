package gen;// Generated from D:/University/Compiler/2021/Proposal/Compiler-project/src\HTMLLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HTMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HTML_COMMENT=1, HTML_CONDITIONAL_COMMENT=2, XML=3, CDATA=4, NGFOR=5, DTD=6, 
		SCRIPTLET=7, SEA_WS=8, SCRIPT_OPEN=9, STYLE_OPEN=10, TAG_OPEN=11, HTML_TEXT=12, 
		NGIF=13, TAG_CLOSE=14, TAG_SLASH_CLOSE=15, TAG_SLASH=16, TAG_EQUALS=17, 
		TAG_NAME=18, TAG_WHITESPACE=19, SCRIPT_BODY=20, SCRIPT_SHORT_BODY=21, 
		STYLE_BODY=22, STYLE_SHORT_BODY=23, ATTVALUE_VALUE=24, ATTRIBUTE=25;
	public static final int
		TAG=1, SCRIPT=2, STYLE=3, ATTVALUE=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "TAG", "SCRIPT", "STYLE", "ATTVALUE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML", "CDATA", "NGFOR", 
			"DTD", "SCRIPTLET", "SEA_WS", "SCRIPT_OPEN", "STYLE_OPEN", "TAG_OPEN", 
			"HTML_TEXT", "NGIF", "TAG_CLOSE", "TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", 
			"TAG_NAME", "TAG_WHITESPACE", "HEXDIGIT", "DIGIT", "TAG_NameChar", "TAG_NameStartChar", 
			"SCRIPT_BODY", "SCRIPT_SHORT_BODY", "STYLE_BODY", "STYLE_SHORT_BODY", 
			"ATTVALUE_VALUE", "ATTRIBUTE", "ATTCHARS", "ATTCHAR", "HEXCHARS", "DECCHARS", 
			"DOUBLE_QUOTE_STRING", "SINGLE_QUOTE_STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'ng-for'", null, null, null, null, null, 
			"'<'", null, "'ng-if'", "'>'", "'/>'", "'/'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML", "CDATA", "NGFOR", 
			"DTD", "SCRIPTLET", "SEA_WS", "SCRIPT_OPEN", "STYLE_OPEN", "TAG_OPEN", 
			"HTML_TEXT", "NGIF", "TAG_CLOSE", "TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", 
			"TAG_NAME", "TAG_WHITESPACE", "SCRIPT_BODY", "SCRIPT_SHORT_BODY", "STYLE_BODY", 
			"STYLE_SHORT_BODY", "ATTVALUE_VALUE", "ATTRIBUTE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public HTMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HTMLLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u018e\b\1\b\1"+
		"\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\2\7\2"+
		"T\n\2\f\2\16\2W\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3b\n\3\f\3"+
		"\16\3e\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4q\n\4\f\4\16\4"+
		"t\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0083\n"+
		"\5\f\5\16\5\u0086\13\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\7\7\u0097\n\7\f\7\16\7\u009a\13\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\7\b\u00a2\n\b\f\b\16\b\u00a5\13\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00ad\n"+
		"\b\f\b\16\b\u00b0\13\b\3\b\3\b\5\b\u00b4\n\b\3\t\3\t\5\t\u00b8\n\t\3\t"+
		"\6\t\u00bb\n\t\r\t\16\t\u00bc\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n"+
		"\u00c8\n\n\f\n\16\n\u00cb\13\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\7\13\u00d9\n\13\f\13\16\13\u00dc\13\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\r\6\r\u00e7\n\r\r\r\16\r\u00e8\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\7\23\u0102\n\23\f\23\16\23\u0105\13\23"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u0113"+
		"\n\27\3\30\5\30\u0116\n\30\3\31\7\31\u0119\n\31\f\31\16\31\u011c\13\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\7\32"+
		"\u012b\n\32\f\32\16\32\u012e\13\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\7\33\u0137\n\33\f\33\16\33\u013a\13\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\7\34\u0148\n\34\f\34\16\34\u014b\13\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\7\35\u0154\n\35\f\35\16\35\u0157\13"+
		"\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\5\36\u0162\n\36\3\37"+
		"\6\37\u0165\n\37\r\37\16\37\u0166\3\37\5\37\u016a\n\37\3 \5 \u016d\n "+
		"\3!\3!\6!\u0171\n!\r!\16!\u0172\3\"\6\"\u0176\n\"\r\"\16\"\u0177\3\"\5"+
		"\"\u017b\n\"\3#\3#\7#\u017f\n#\f#\16#\u0182\13#\3#\3#\3$\3$\7$\u0188\n"+
		"$\f$\16$\u018b\13$\3$\3$\17Ucr\u0084\u0098\u00a3\u00ae\u00c9\u00da\u011a"+
		"\u012c\u0138\u0149\2%\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f"+
		"\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\2/\2\61\2\63\2\65\26\67\27"+
		"9\30;\31=\32?\33A\2C\2E\2G\2I\2K\2\7\2\3\4\5\6\r\4\2\13\13\"\"\3\2>>\5"+
		"\2\13\f\17\17\"\"\5\2\62;CHch\3\2\62;\4\2/\60aa\5\2\u00b9\u00b9\u0302"+
		"\u0371\u2041\u2042\n\2<<C\\c|\u2072\u2191\u2c02\u2ff1\u3003\ud801\uf902"+
		"\ufdd1\ufdf2\uffff\t\2%%-=??AAC\\aac|\4\2$$>>\4\2))>>\2\u01a1\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\3\37\3\2\2\2\3!\3\2\2\2\3#\3\2\2\2\3%\3\2\2\2\3\'\3\2\2\2\3)\3"+
		"\2\2\2\3+\3\2\2\2\4\65\3\2\2\2\4\67\3\2\2\2\59\3\2\2\2\5;\3\2\2\2\6=\3"+
		"\2\2\2\6?\3\2\2\2\7M\3\2\2\2\t\\\3\2\2\2\13i\3\2\2\2\rw\3\2\2\2\17\u008b"+
		"\3\2\2\2\21\u0092\3\2\2\2\23\u00b3\3\2\2\2\25\u00ba\3\2\2\2\27\u00be\3"+
		"\2\2\2\31\u00d0\3\2\2\2\33\u00e1\3\2\2\2\35\u00e6\3\2\2\2\37\u00ea\3\2"+
		"\2\2!\u00f0\3\2\2\2#\u00f4\3\2\2\2%\u00f9\3\2\2\2\'\u00fb\3\2\2\2)\u00ff"+
		"\3\2\2\2+\u0106\3\2\2\2-\u010a\3\2\2\2/\u010c\3\2\2\2\61\u0112\3\2\2\2"+
		"\63\u0115\3\2\2\2\65\u011a\3\2\2\2\67\u012c\3\2\2\29\u0138\3\2\2\2;\u0149"+
		"\3\2\2\2=\u0155\3\2\2\2?\u0161\3\2\2\2A\u0164\3\2\2\2C\u016c\3\2\2\2E"+
		"\u016e\3\2\2\2G\u0175\3\2\2\2I\u017c\3\2\2\2K\u0185\3\2\2\2MN\7>\2\2N"+
		"O\7#\2\2OP\7/\2\2PQ\7/\2\2QU\3\2\2\2RT\13\2\2\2SR\3\2\2\2TW\3\2\2\2UV"+
		"\3\2\2\2US\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7/\2\2YZ\7/\2\2Z[\7@\2\2[\b\3"+
		"\2\2\2\\]\7>\2\2]^\7#\2\2^_\7]\2\2_c\3\2\2\2`b\13\2\2\2a`\3\2\2\2be\3"+
		"\2\2\2cd\3\2\2\2ca\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7_\2\2gh\7@\2\2h\n\3"+
		"\2\2\2ij\7>\2\2jk\7A\2\2kl\7z\2\2lm\7o\2\2mn\7n\2\2nr\3\2\2\2oq\13\2\2"+
		"\2po\3\2\2\2qt\3\2\2\2rs\3\2\2\2rp\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\7@\2"+
		"\2v\f\3\2\2\2wx\7>\2\2xy\7#\2\2yz\7]\2\2z{\7E\2\2{|\7F\2\2|}\7C\2\2}~"+
		"\7V\2\2~\177\7C\2\2\177\u0080\7]\2\2\u0080\u0084\3\2\2\2\u0081\u0083\13"+
		"\2\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0085\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7_"+
		"\2\2\u0088\u0089\7_\2\2\u0089\u008a\7@\2\2\u008a\16\3\2\2\2\u008b\u008c"+
		"\7p\2\2\u008c\u008d\7i\2\2\u008d\u008e\7/\2\2\u008e\u008f\7h\2\2\u008f"+
		"\u0090\7q\2\2\u0090\u0091\7t\2\2\u0091\20\3\2\2\2\u0092\u0093\7>\2\2\u0093"+
		"\u0094\7#\2\2\u0094\u0098\3\2\2\2\u0095\u0097\13\2\2\2\u0096\u0095\3\2"+
		"\2\2\u0097\u009a\3\2\2\2\u0098\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
		"\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7@\2\2\u009c\22\3\2\2\2"+
		"\u009d\u009e\7>\2\2\u009e\u009f\7A\2\2\u009f\u00a3\3\2\2\2\u00a0\u00a2"+
		"\13\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a4\3\2\2\2"+
		"\u00a3\u00a1\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7"+
		"\7A\2\2\u00a7\u00b4\7@\2\2\u00a8\u00a9\7>\2\2\u00a9\u00aa\7\'\2\2\u00aa"+
		"\u00ae\3\2\2\2\u00ab\u00ad\13\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3"+
		"\2\2\2\u00ae\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b1\u00b2\7\'\2\2\u00b2\u00b4\7@\2\2\u00b3\u009d\3\2"+
		"\2\2\u00b3\u00a8\3\2\2\2\u00b4\24\3\2\2\2\u00b5\u00bb\t\2\2\2\u00b6\u00b8"+
		"\7\17\2\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2"+
		"\u00b9\u00bb\7\f\2\2\u00ba\u00b5\3\2\2\2\u00ba\u00b7\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\26\3\2\2\2\u00be"+
		"\u00bf\7>\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1\7e\2\2\u00c1\u00c2\7t\2\2"+
		"\u00c2\u00c3\7k\2\2\u00c3\u00c4\7r\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c9"+
		"\3\2\2\2\u00c6\u00c8\13\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2"+
		"\u00c9\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9"+
		"\3\2\2\2\u00cc\u00cd\7@\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\b\n\2\2\u00cf"+
		"\30\3\2\2\2\u00d0\u00d1\7>\2\2\u00d1\u00d2\7u\2\2\u00d2\u00d3\7v\2\2\u00d3"+
		"\u00d4\7{\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7g\2\2\u00d6\u00da\3\2\2"+
		"\2\u00d7\u00d9\13\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dd\u00de\7@\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\b\13\3\2\u00e0"+
		"\32\3\2\2\2\u00e1\u00e2\7>\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\b\f\4\2"+
		"\u00e4\34\3\2\2\2\u00e5\u00e7\n\3\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8"+
		"\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\36\3\2\2\2\u00ea"+
		"\u00eb\7p\2\2\u00eb\u00ec\7i\2\2\u00ec\u00ed\7/\2\2\u00ed\u00ee\7k\2\2"+
		"\u00ee\u00ef\7h\2\2\u00ef \3\2\2\2\u00f0\u00f1\7@\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f3\b\17\5\2\u00f3\"\3\2\2\2\u00f4\u00f5\7\61\2\2\u00f5\u00f6"+
		"\7@\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\b\20\5\2\u00f8$\3\2\2\2\u00f9"+
		"\u00fa\7\61\2\2\u00fa&\3\2\2\2\u00fb\u00fc\7?\2\2\u00fc\u00fd\3\2\2\2"+
		"\u00fd\u00fe\b\22\6\2\u00fe(\3\2\2\2\u00ff\u0103\5\63\30\2\u0100\u0102"+
		"\5\61\27\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2"+
		"\u0103\u0104\3\2\2\2\u0104*\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\t"+
		"\4\2\2\u0107\u0108\3\2\2\2\u0108\u0109\b\24\7\2\u0109,\3\2\2\2\u010a\u010b"+
		"\t\5\2\2\u010b.\3\2\2\2\u010c\u010d\t\6\2\2\u010d\60\3\2\2\2\u010e\u0113"+
		"\5\63\30\2\u010f\u0113\t\7\2\2\u0110\u0113\5/\26\2\u0111\u0113\t\b\2\2"+
		"\u0112\u010e\3\2\2\2\u0112\u010f\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0111"+
		"\3\2\2\2\u0113\62\3\2\2\2\u0114\u0116\t\t\2\2\u0115\u0114\3\2\2\2\u0116"+
		"\64\3\2\2\2\u0117\u0119\13\2\2\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2"+
		"\2\u011a\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011a"+
		"\3\2\2\2\u011d\u011e\7>\2\2\u011e\u011f\7\61\2\2\u011f\u0120\7u\2\2\u0120"+
		"\u0121\7e\2\2\u0121\u0122\7t\2\2\u0122\u0123\7k\2\2\u0123\u0124\7r\2\2"+
		"\u0124\u0125\7v\2\2\u0125\u0126\7@\2\2\u0126\u0127\3\2\2\2\u0127\u0128"+
		"\b\31\5\2\u0128\66\3\2\2\2\u0129\u012b\13\2\2\2\u012a\u0129\3\2\2\2\u012b"+
		"\u012e\3\2\2\2\u012c\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012f\3\2"+
		"\2\2\u012e\u012c\3\2\2\2\u012f\u0130\7>\2\2\u0130\u0131\7\61\2\2\u0131"+
		"\u0132\7@\2\2\u0132\u0133\3\2\2\2\u0133\u0134\b\32\5\2\u01348\3\2\2\2"+
		"\u0135\u0137\13\2\2\2\u0136\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0139"+
		"\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b"+
		"\u013c\7>\2\2\u013c\u013d\7\61\2\2\u013d\u013e\7u\2\2\u013e\u013f\7v\2"+
		"\2\u013f\u0140\7{\2\2\u0140\u0141\7n\2\2\u0141\u0142\7g\2\2\u0142\u0143"+
		"\7@\2\2\u0143\u0144\3\2\2\2\u0144\u0145\b\33\5\2\u0145:\3\2\2\2\u0146"+
		"\u0148\13\2\2\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u014a\3"+
		"\2\2\2\u0149\u0147\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c"+
		"\u014d\7>\2\2\u014d\u014e\7\61\2\2\u014e\u014f\7@\2\2\u014f\u0150\3\2"+
		"\2\2\u0150\u0151\b\34\5\2\u0151<\3\2\2\2\u0152\u0154\7\"\2\2\u0153\u0152"+
		"\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0159\5?\36\2\u0159\u015a\3\2"+
		"\2\2\u015a\u015b\b\35\5\2\u015b>\3\2\2\2\u015c\u0162\5I#\2\u015d\u0162"+
		"\5K$\2\u015e\u0162\5A\37\2\u015f\u0162\5E!\2\u0160\u0162\5G\"\2\u0161"+
		"\u015c\3\2\2\2\u0161\u015d\3\2\2\2\u0161\u015e\3\2\2\2\u0161\u015f\3\2"+
		"\2\2\u0161\u0160\3\2\2\2\u0162@\3\2\2\2\u0163\u0165\5C \2\u0164\u0163"+
		"\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u0169\3\2\2\2\u0168\u016a\7\"\2\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2"+
		"\2\2\u016aB\3\2\2\2\u016b\u016d\t\n\2\2\u016c\u016b\3\2\2\2\u016dD\3\2"+
		"\2\2\u016e\u0170\7%\2\2\u016f\u0171\t\5\2\2\u0170\u016f\3\2\2\2\u0171"+
		"\u0172\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173F\3\2\2\2"+
		"\u0174\u0176\t\6\2\2\u0175\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0175"+
		"\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u017b\7\'\2\2\u017a"+
		"\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017bH\3\2\2\2\u017c\u0180\7$\2\2\u017d"+
		"\u017f\n\13\2\2\u017e\u017d\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3"+
		"\2\2\2\u0180\u0181\3\2\2\2\u0181\u0183\3\2\2\2\u0182\u0180\3\2\2\2\u0183"+
		"\u0184\7$\2\2\u0184J\3\2\2\2\u0185\u0189\7)\2\2\u0186\u0188\n\f\2\2\u0187"+
		"\u0186\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2"+
		"\2\2\u018a\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018d\7)\2\2\u018d"+
		"L\3\2\2\2&\2\3\4\5\6Ucr\u0084\u0098\u00a3\u00ae\u00b3\u00b7\u00ba\u00bc"+
		"\u00c9\u00da\u00e8\u0103\u0112\u0115\u011a\u012c\u0138\u0149\u0155\u0161"+
		"\u0166\u0169\u016c\u0172\u0177\u017a\u0180\u0189\b\7\4\2\7\5\2\7\3\2\6"+
		"\2\2\7\6\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}