// Generated from C:/Users/mo_ma/Desktop/Compiler-project/src\test.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class testParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, SAYS=9, 
		SHOUTS=10, WORD=11, WHITESPACE=12, NEWLINE=13, TEXT=14;
	public static final int
		RULE_chat = 0, RULE_line = 1, RULE_message = 2, RULE_name = 3, RULE_command = 4, 
		RULE_emoticon = 5, RULE_link = 6, RULE_color = 7, RULE_mention = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"chat", "line", "message", "name", "command", "emoticon", "link", "color", 
			"mention"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'-'", "')'", "'('", "'['", "']'", "'/'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "SAYS", "SHOUTS", 
			"WORD", "WHITESPACE", "NEWLINE", "TEXT"
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

	@Override
	public String getGrammarFileName() { return "test.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public testParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ChatContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(testParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ChatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterChat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitChat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitChat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChatContext chat() throws RecognitionException {
		ChatContext _localctx = new ChatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_chat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				line();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(23);
			match(EOF);
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

	public static class LineContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public MessageContext message() {
			return getRuleContext(MessageContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(testParser.NEWLINE, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			name();
			setState(26);
			command();
			setState(27);
			message();
			setState(28);
			match(NEWLINE);
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

	public static class MessageContext extends ParserRuleContext {
		public EmoticonContext emoticon() {
			return getRuleContext(EmoticonContext.class,0);
		}
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public MentionContext mention() {
			return getRuleContext(MentionContext.class,0);
		}
		public TerminalNode WORD() { return getToken(testParser.WORD, 0); }
		public TerminalNode WHITESPACE() { return getToken(testParser.WHITESPACE, 0); }
		public MessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitMessage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitMessage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageContext message() throws RecognitionException {
		MessageContext _localctx = new MessageContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(30);
				emoticon();
				}
				break;
			case T__4:
				{
				setState(31);
				link();
				}
				break;
			case T__6:
				{
				setState(32);
				color();
				}
				break;
			case T__7:
				{
				setState(33);
				mention();
				}
				break;
			case WORD:
				{
				setState(34);
				match(WORD);
				}
				break;
			case WHITESPACE:
				{
				setState(35);
				match(WHITESPACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(testParser.WORD, 0); }
		public TerminalNode WHITESPACE() { return getToken(testParser.WHITESPACE, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(WORD);
			setState(39);
			match(WHITESPACE);
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

	public static class CommandContext extends ParserRuleContext {
		public TerminalNode WHITESPACE() { return getToken(testParser.WHITESPACE, 0); }
		public TerminalNode SAYS() { return getToken(testParser.SAYS, 0); }
		public TerminalNode SHOUTS() { return getToken(testParser.SHOUTS, 0); }
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_la = _input.LA(1);
			if ( !(_la==SAYS || _la==SHOUTS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(42);
			match(T__0);
			setState(43);
			match(WHITESPACE);
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

	public static class EmoticonContext extends ParserRuleContext {
		public EmoticonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emoticon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterEmoticon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitEmoticon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitEmoticon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmoticonContext emoticon() throws RecognitionException {
		EmoticonContext _localctx = new EmoticonContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_emoticon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(45);
				match(T__0);
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(46);
					match(T__1);
					}
				}

				setState(49);
				match(T__2);
				}
				break;
			case 2:
				{
				setState(50);
				match(T__0);
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(51);
					match(T__1);
					}
				}

				setState(54);
				match(T__3);
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

	public static class LinkContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(testParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(testParser.TEXT, i);
		}
		public LinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitLink(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitLink(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkContext link() throws RecognitionException {
		LinkContext _localctx = new LinkContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__4);
			setState(58);
			match(TEXT);
			setState(59);
			match(T__5);
			setState(60);
			match(T__3);
			setState(61);
			match(TEXT);
			setState(62);
			match(T__2);
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

	public static class ColorContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(testParser.WORD, 0); }
		public MessageContext message() {
			return getRuleContext(MessageContext.class,0);
		}
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__6);
			setState(65);
			match(WORD);
			setState(66);
			match(T__6);
			setState(67);
			message();
			setState(68);
			match(T__6);
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

	public static class MentionContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(testParser.WORD, 0); }
		public MentionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mention; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterMention(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitMention(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof testVisitor ) return ((testVisitor<? extends T>)visitor).visitMention(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MentionContext mention() throws RecognitionException {
		MentionContext _localctx = new MentionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mention);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__7);
			setState(71);
			match(WORD);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20L\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6\2\26"+
		"\n\2\r\2\16\2\27\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4\'\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\5\7\62\n\7\3\7\3\7\3\7\5"+
		"\7\67\n\7\3\7\5\7:\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\3\3\2\13\f\2K\2\25"+
		"\3\2\2\2\4\33\3\2\2\2\6&\3\2\2\2\b(\3\2\2\2\n+\3\2\2\2\f9\3\2\2\2\16;"+
		"\3\2\2\2\20B\3\2\2\2\22H\3\2\2\2\24\26\5\4\3\2\25\24\3\2\2\2\26\27\3\2"+
		"\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\31\3\2\2\2\31\32\7\2\2\3\32\3\3\2"+
		"\2\2\33\34\5\b\5\2\34\35\5\n\6\2\35\36\5\6\4\2\36\37\7\17\2\2\37\5\3\2"+
		"\2\2 \'\5\f\7\2!\'\5\16\b\2\"\'\5\20\t\2#\'\5\22\n\2$\'\7\r\2\2%\'\7\16"+
		"\2\2& \3\2\2\2&!\3\2\2\2&\"\3\2\2\2&#\3\2\2\2&$\3\2\2\2&%\3\2\2\2\'\7"+
		"\3\2\2\2()\7\r\2\2)*\7\16\2\2*\t\3\2\2\2+,\t\2\2\2,-\7\3\2\2-.\7\16\2"+
		"\2.\13\3\2\2\2/\61\7\3\2\2\60\62\7\4\2\2\61\60\3\2\2\2\61\62\3\2\2\2\62"+
		"\63\3\2\2\2\63:\7\5\2\2\64\66\7\3\2\2\65\67\7\4\2\2\66\65\3\2\2\2\66\67"+
		"\3\2\2\2\678\3\2\2\28:\7\6\2\29/\3\2\2\29\64\3\2\2\2:\r\3\2\2\2;<\7\7"+
		"\2\2<=\7\20\2\2=>\7\b\2\2>?\7\6\2\2?@\7\20\2\2@A\7\5\2\2A\17\3\2\2\2B"+
		"C\7\t\2\2CD\7\r\2\2DE\7\t\2\2EF\5\6\4\2FG\7\t\2\2G\21\3\2\2\2HI\7\n\2"+
		"\2IJ\7\r\2\2J\23\3\2\2\2\7\27&\61\669";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}