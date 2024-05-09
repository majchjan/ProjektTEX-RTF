// Generated from D:/Programs/IntelliJ/saves/testANTLR/g.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class gParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOCUMENT_CLASS_ARTICLE=1, BEGIN_DOCUMENT=2, END_DOCUMENT=3, TITLE=4, AUTHOR=5, 
		MAKE_TITLE=6, BEGIN_ENUMERATE=7, END_ENUMERATE=8, BEGIN_ITEMIZE=9, END_ITEMIZE=10, 
		ITEM=11, SECTION=12, SUBSECTION=13, SUBSUBSECTION=14, DOTS=15, TEXT=16, 
		LEFT_BRACE=17, RIGHT_BRACE=18;
	public static final int
		RULE_start = 0, RULE_hdr = 1, RULE_cont = 2, RULE_sect = 3, RULE_tkt = 4, 
		RULE_lst = 5, RULE_brc = 6, RULE_tm = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "hdr", "cont", "sect", "tkt", "lst", "brc", "tm"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\documentclass{article}'", "'\\begin{document}'", "'\\end{document}'", 
			"'\\title'", "'\\author'", "'\\maketitle'", "'\\begin{enumerate}'", "'\\end{enumerate}'", 
			"'\\begin{itemize}'", "'\\end{itemize}'", "'\\item'", "'\\section'", 
			"'\\subsection'", "'\\subsubsection'", "'\\dots'", null, "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOCUMENT_CLASS_ARTICLE", "BEGIN_DOCUMENT", "END_DOCUMENT", "TITLE", 
			"AUTHOR", "MAKE_TITLE", "BEGIN_ENUMERATE", "END_ENUMERATE", "BEGIN_ITEMIZE", 
			"END_ITEMIZE", "ITEM", "SECTION", "SUBSECTION", "SUBSUBSECTION", "DOTS", 
			"TEXT", "LEFT_BRACE", "RIGHT_BRACE"
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
	public String getGrammarFileName() { return "g.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public TerminalNode DOCUMENT_CLASS_ARTICLE() { return getToken(gParser.DOCUMENT_CLASS_ARTICLE, 0); }
		public HdrContext hdr() {
			return getRuleContext(HdrContext.class,0);
		}
		public TerminalNode BEGIN_DOCUMENT() { return getToken(gParser.BEGIN_DOCUMENT, 0); }
		public ContContext cont() {
			return getRuleContext(ContContext.class,0);
		}
		public TerminalNode END_DOCUMENT() { return getToken(gParser.END_DOCUMENT, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(DOCUMENT_CLASS_ARTICLE);
			setState(17);
			hdr();
			setState(18);
			match(BEGIN_DOCUMENT);
			setState(19);
			cont();
			setState(20);
			match(END_DOCUMENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HdrContext extends ParserRuleContext {
		public TerminalNode TITLE() { return getToken(gParser.TITLE, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(gParser.LEFT_BRACE, 0); }
		public TerminalNode TEXT() { return getToken(gParser.TEXT, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(gParser.RIGHT_BRACE, 0); }
		public HdrContext hdr() {
			return getRuleContext(HdrContext.class,0);
		}
		public TerminalNode AUTHOR() { return getToken(gParser.AUTHOR, 0); }
		public HdrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hdr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterHdr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitHdr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitHdr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HdrContext hdr() throws RecognitionException {
		HdrContext _localctx = new HdrContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_hdr);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				match(TITLE);
				setState(23);
				match(LEFT_BRACE);
				setState(24);
				match(TEXT);
				setState(25);
				match(RIGHT_BRACE);
				setState(26);
				hdr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				match(TITLE);
				setState(28);
				match(LEFT_BRACE);
				setState(29);
				match(TEXT);
				setState(30);
				match(RIGHT_BRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				match(AUTHOR);
				setState(32);
				match(LEFT_BRACE);
				setState(33);
				match(TEXT);
				setState(34);
				match(RIGHT_BRACE);
				setState(35);
				hdr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				match(AUTHOR);
				setState(37);
				match(LEFT_BRACE);
				setState(38);
				match(TEXT);
				setState(39);
				match(RIGHT_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ContContext extends ParserRuleContext {
		public SectContext sect() {
			return getRuleContext(SectContext.class,0);
		}
		public ContContext cont() {
			return getRuleContext(ContContext.class,0);
		}
		public TktContext tkt() {
			return getRuleContext(TktContext.class,0);
		}
		public LstContext lst() {
			return getRuleContext(LstContext.class,0);
		}
		public TerminalNode MAKE_TITLE() { return getToken(gParser.MAKE_TITLE, 0); }
		public ContContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cont; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterCont(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitCont(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCont(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContContext cont() throws RecognitionException {
		ContContext _localctx = new ContContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cont);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				sect();
				setState(43);
				cont();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				sect();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				tkt();
				setState(47);
				cont();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				tkt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				lst();
				setState(51);
				cont();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(53);
				lst();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(54);
				match(MAKE_TITLE);
				setState(55);
				cont();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(56);
				match(MAKE_TITLE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SectContext extends ParserRuleContext {
		public TerminalNode SECTION() { return getToken(gParser.SECTION, 0); }
		public BrcContext brc() {
			return getRuleContext(BrcContext.class,0);
		}
		public TerminalNode SUBSECTION() { return getToken(gParser.SUBSECTION, 0); }
		public TerminalNode SUBSUBSECTION() { return getToken(gParser.SUBSUBSECTION, 0); }
		public SectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectContext sect() throws RecognitionException {
		SectContext _localctx = new SectContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sect);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SECTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(SECTION);
				setState(60);
				brc();
				}
				break;
			case SUBSECTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(SUBSECTION);
				setState(62);
				brc();
				}
				break;
			case SUBSUBSECTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				match(SUBSUBSECTION);
				setState(64);
				brc();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TktContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(gParser.TEXT, 0); }
		public TktContext tkt() {
			return getRuleContext(TktContext.class,0);
		}
		public TerminalNode DOTS() { return getToken(gParser.DOTS, 0); }
		public TktContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tkt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterTkt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitTkt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitTkt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TktContext tkt() throws RecognitionException {
		TktContext _localctx = new TktContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tkt);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(TEXT);
				setState(68);
				tkt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(TEXT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				match(DOTS);
				setState(71);
				tkt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				match(DOTS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LstContext extends ParserRuleContext {
		public TerminalNode BEGIN_ENUMERATE() { return getToken(gParser.BEGIN_ENUMERATE, 0); }
		public List<TmContext> tm() {
			return getRuleContexts(TmContext.class);
		}
		public TmContext tm(int i) {
			return getRuleContext(TmContext.class,i);
		}
		public LstContext lst() {
			return getRuleContext(LstContext.class,0);
		}
		public TerminalNode END_ENUMERATE() { return getToken(gParser.END_ENUMERATE, 0); }
		public TerminalNode BEGIN_ITEMIZE() { return getToken(gParser.BEGIN_ITEMIZE, 0); }
		public TerminalNode END_ITEMIZE() { return getToken(gParser.END_ITEMIZE, 0); }
		public LstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterLst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitLst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitLst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LstContext lst() throws RecognitionException {
		LstContext _localctx = new LstContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lst);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(BEGIN_ENUMERATE);
				setState(76);
				tm();
				setState(77);
				lst();
				setState(78);
				match(END_ENUMERATE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(BEGIN_ENUMERATE);
				setState(81);
				tm();
				setState(82);
				lst();
				setState(83);
				tm();
				setState(84);
				match(END_ENUMERATE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				match(BEGIN_ENUMERATE);
				setState(87);
				tm();
				setState(88);
				match(END_ENUMERATE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				match(BEGIN_ITEMIZE);
				setState(91);
				tm();
				setState(92);
				lst();
				setState(93);
				match(END_ITEMIZE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				match(BEGIN_ITEMIZE);
				setState(96);
				tm();
				setState(97);
				lst();
				setState(98);
				tm();
				setState(99);
				match(END_ITEMIZE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(101);
				match(BEGIN_ITEMIZE);
				setState(102);
				tm();
				setState(103);
				match(END_ITEMIZE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BrcContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(gParser.LEFT_BRACE, 0); }
		public TerminalNode TEXT() { return getToken(gParser.TEXT, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(gParser.RIGHT_BRACE, 0); }
		public BrcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterBrc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitBrc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBrc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BrcContext brc() throws RecognitionException {
		BrcContext _localctx = new BrcContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_brc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(LEFT_BRACE);
			setState(108);
			match(TEXT);
			setState(109);
			match(RIGHT_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TmContext extends ParserRuleContext {
		public TerminalNode ITEM() { return getToken(gParser.ITEM, 0); }
		public TktContext tkt() {
			return getRuleContext(TktContext.class,0);
		}
		public TmContext tm() {
			return getRuleContext(TmContext.class,0);
		}
		public TmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterTm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitTm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitTm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmContext tm() throws RecognitionException {
		TmContext _localctx = new TmContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tm);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(ITEM);
				setState(112);
				tkt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(ITEM);
				setState(114);
				tkt();
				setState(115);
				tm();
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

	public static final String _serializedATN =
		"\u0004\u0001\u0012x\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001)\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002:\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003B\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004J\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005j\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007v\b"+
		"\u0007\u0001\u0007\u0000\u0000\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000"+
		"\u0000\u0084\u0000\u0010\u0001\u0000\u0000\u0000\u0002(\u0001\u0000\u0000"+
		"\u0000\u00049\u0001\u0000\u0000\u0000\u0006A\u0001\u0000\u0000\u0000\b"+
		"I\u0001\u0000\u0000\u0000\ni\u0001\u0000\u0000\u0000\fk\u0001\u0000\u0000"+
		"\u0000\u000eu\u0001\u0000\u0000\u0000\u0010\u0011\u0005\u0001\u0000\u0000"+
		"\u0011\u0012\u0003\u0002\u0001\u0000\u0012\u0013\u0005\u0002\u0000\u0000"+
		"\u0013\u0014\u0003\u0004\u0002\u0000\u0014\u0015\u0005\u0003\u0000\u0000"+
		"\u0015\u0001\u0001\u0000\u0000\u0000\u0016\u0017\u0005\u0004\u0000\u0000"+
		"\u0017\u0018\u0005\u0011\u0000\u0000\u0018\u0019\u0005\u0010\u0000\u0000"+
		"\u0019\u001a\u0005\u0012\u0000\u0000\u001a)\u0003\u0002\u0001\u0000\u001b"+
		"\u001c\u0005\u0004\u0000\u0000\u001c\u001d\u0005\u0011\u0000\u0000\u001d"+
		"\u001e\u0005\u0010\u0000\u0000\u001e)\u0005\u0012\u0000\u0000\u001f \u0005"+
		"\u0005\u0000\u0000 !\u0005\u0011\u0000\u0000!\"\u0005\u0010\u0000\u0000"+
		"\"#\u0005\u0012\u0000\u0000#)\u0003\u0002\u0001\u0000$%\u0005\u0005\u0000"+
		"\u0000%&\u0005\u0011\u0000\u0000&\'\u0005\u0010\u0000\u0000\')\u0005\u0012"+
		"\u0000\u0000(\u0016\u0001\u0000\u0000\u0000(\u001b\u0001\u0000\u0000\u0000"+
		"(\u001f\u0001\u0000\u0000\u0000($\u0001\u0000\u0000\u0000)\u0003\u0001"+
		"\u0000\u0000\u0000*+\u0003\u0006\u0003\u0000+,\u0003\u0004\u0002\u0000"+
		",:\u0001\u0000\u0000\u0000-:\u0003\u0006\u0003\u0000./\u0003\b\u0004\u0000"+
		"/0\u0003\u0004\u0002\u00000:\u0001\u0000\u0000\u00001:\u0003\b\u0004\u0000"+
		"23\u0003\n\u0005\u000034\u0003\u0004\u0002\u00004:\u0001\u0000\u0000\u0000"+
		"5:\u0003\n\u0005\u000067\u0005\u0006\u0000\u00007:\u0003\u0004\u0002\u0000"+
		"8:\u0005\u0006\u0000\u00009*\u0001\u0000\u0000\u00009-\u0001\u0000\u0000"+
		"\u00009.\u0001\u0000\u0000\u000091\u0001\u0000\u0000\u000092\u0001\u0000"+
		"\u0000\u000095\u0001\u0000\u0000\u000096\u0001\u0000\u0000\u000098\u0001"+
		"\u0000\u0000\u0000:\u0005\u0001\u0000\u0000\u0000;<\u0005\f\u0000\u0000"+
		"<B\u0003\f\u0006\u0000=>\u0005\r\u0000\u0000>B\u0003\f\u0006\u0000?@\u0005"+
		"\u000e\u0000\u0000@B\u0003\f\u0006\u0000A;\u0001\u0000\u0000\u0000A=\u0001"+
		"\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000B\u0007\u0001\u0000\u0000"+
		"\u0000CD\u0005\u0010\u0000\u0000DJ\u0003\b\u0004\u0000EJ\u0005\u0010\u0000"+
		"\u0000FG\u0005\u000f\u0000\u0000GJ\u0003\b\u0004\u0000HJ\u0005\u000f\u0000"+
		"\u0000IC\u0001\u0000\u0000\u0000IE\u0001\u0000\u0000\u0000IF\u0001\u0000"+
		"\u0000\u0000IH\u0001\u0000\u0000\u0000J\t\u0001\u0000\u0000\u0000KL\u0005"+
		"\u0007\u0000\u0000LM\u0003\u000e\u0007\u0000MN\u0003\n\u0005\u0000NO\u0005"+
		"\b\u0000\u0000Oj\u0001\u0000\u0000\u0000PQ\u0005\u0007\u0000\u0000QR\u0003"+
		"\u000e\u0007\u0000RS\u0003\n\u0005\u0000ST\u0003\u000e\u0007\u0000TU\u0005"+
		"\b\u0000\u0000Uj\u0001\u0000\u0000\u0000VW\u0005\u0007\u0000\u0000WX\u0003"+
		"\u000e\u0007\u0000XY\u0005\b\u0000\u0000Yj\u0001\u0000\u0000\u0000Z[\u0005"+
		"\t\u0000\u0000[\\\u0003\u000e\u0007\u0000\\]\u0003\n\u0005\u0000]^\u0005"+
		"\n\u0000\u0000^j\u0001\u0000\u0000\u0000_`\u0005\t\u0000\u0000`a\u0003"+
		"\u000e\u0007\u0000ab\u0003\n\u0005\u0000bc\u0003\u000e\u0007\u0000cd\u0005"+
		"\n\u0000\u0000dj\u0001\u0000\u0000\u0000ef\u0005\t\u0000\u0000fg\u0003"+
		"\u000e\u0007\u0000gh\u0005\n\u0000\u0000hj\u0001\u0000\u0000\u0000iK\u0001"+
		"\u0000\u0000\u0000iP\u0001\u0000\u0000\u0000iV\u0001\u0000\u0000\u0000"+
		"iZ\u0001\u0000\u0000\u0000i_\u0001\u0000\u0000\u0000ie\u0001\u0000\u0000"+
		"\u0000j\u000b\u0001\u0000\u0000\u0000kl\u0005\u0011\u0000\u0000lm\u0005"+
		"\u0010\u0000\u0000mn\u0005\u0012\u0000\u0000n\r\u0001\u0000\u0000\u0000"+
		"op\u0005\u000b\u0000\u0000pv\u0003\b\u0004\u0000qr\u0005\u000b\u0000\u0000"+
		"rs\u0003\b\u0004\u0000st\u0003\u000e\u0007\u0000tv\u0001\u0000\u0000\u0000"+
		"uo\u0001\u0000\u0000\u0000uq\u0001\u0000\u0000\u0000v\u000f\u0001\u0000"+
		"\u0000\u0000\u0006(9AIiu";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}