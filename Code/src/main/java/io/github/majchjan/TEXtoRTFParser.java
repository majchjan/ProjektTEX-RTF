// Generated from D:/Programs/IntelliJ/saves/GitHub_majchjan/ProjektTEX-RTF/Code/src/main/java/io/github/majchjan/TEXtoRTF.g4 by ANTLR 4.13.1
package io.github.majchjan;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TEXtoRTFParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, DOCUMENT_CLASS_ARTICLE=2, BEGIN_DOCUMENT=3, END_DOCUMENT=4, TITLE=5, 
		AUTHOR=6, MAKE_TITLE=7, BEGIN_ENUMERATE=8, END_ENUMERATE=9, BEGIN_ITEMIZE=10, 
		END_ITEMIZE=11, ITEM=12, SECTION=13, SUBSECTION=14, SUBSUBSECTION=15, 
		DOTS=16, TEXT=17, LEFT_BRACE=18, RIGHT_BRACE=19;
	public static final int
		RULE_start = 0, RULE_hdr = 1, RULE_cont = 2, RULE_sect = 3, RULE_tkt = 4, 
		RULE_lst = 5, RULE_numbered_list = 6, RULE_bulleted_list = 7, RULE_brc = 8, 
		RULE_tmn = 9, RULE_tmb = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "hdr", "cont", "sect", "tkt", "lst", "numbered_list", "bulleted_list", 
			"brc", "tmn", "tmb"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'\\documentclass{article}'", "'\\begin{document}'", "'\\end{document}'", 
			"'\\title'", "'\\author'", "'\\maketitle'", "'\\begin{enumerate}'", "'\\end{enumerate}'", 
			"'\\begin{itemize}'", "'\\end{itemize}'", "'\\item'", "'\\section'", 
			"'\\subsection'", "'\\subsubsection'", "'\\dots'", null, "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "DOCUMENT_CLASS_ARTICLE", "BEGIN_DOCUMENT", "END_DOCUMENT", 
			"TITLE", "AUTHOR", "MAKE_TITLE", "BEGIN_ENUMERATE", "END_ENUMERATE", 
			"BEGIN_ITEMIZE", "END_ITEMIZE", "ITEM", "SECTION", "SUBSECTION", "SUBSUBSECTION", 
			"DOTS", "TEXT", "LEFT_BRACE", "RIGHT_BRACE"
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
	public String getGrammarFileName() { return "TEXtoRTF.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TEXtoRTFParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public TerminalNode DOCUMENT_CLASS_ARTICLE() { return getToken(TEXtoRTFParser.DOCUMENT_CLASS_ARTICLE, 0); }
		public HdrContext hdr() {
			return getRuleContext(HdrContext.class,0);
		}
		public TerminalNode BEGIN_DOCUMENT() { return getToken(TEXtoRTFParser.BEGIN_DOCUMENT, 0); }
		public ContContext cont() {
			return getRuleContext(ContContext.class,0);
		}
		public TerminalNode END_DOCUMENT() { return getToken(TEXtoRTFParser.END_DOCUMENT, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXtoRTFListener ) ((TEXtoRTFListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXtoRTFListener ) ((TEXtoRTFListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXtoRTFVisitor ) return ((TEXtoRTFVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(DOCUMENT_CLASS_ARTICLE);
			setState(23);
			hdr();
			setState(24);
			match(BEGIN_DOCUMENT);
			setState(25);
			cont();
			setState(26);
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
		public TerminalNode TITLE() { return getToken(TEXtoRTFParser.TITLE, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(TEXtoRTFParser.LEFT_BRACE, 0); }
		public TerminalNode TEXT() { return getToken(TEXtoRTFParser.TEXT, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(TEXtoRTFParser.RIGHT_BRACE, 0); }
		public HdrContext hdr() {
			return getRuleContext(HdrContext.class,0);
		}
		public TerminalNode AUTHOR() { return getToken(TEXtoRTFParser.AUTHOR, 0); }
		public HdrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hdr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXtoRTFListener ) ((TEXtoRTFListener)listener).enterHdr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXtoRTFListener ) ((TEXtoRTFListener)listener).exitHdr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXtoRTFVisitor ) return ((TEXtoRTFVisitor<? extends T>)visitor).visitHdr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HdrContext hdr() throws RecognitionException {
		HdrContext _localctx = new HdrContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_hdr);
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(TITLE);
				setState(29);
				match(LEFT_BRACE);
				setState(30);
				match(TEXT);
				setState(31);
				match(RIGHT_BRACE);
				setState(32);
				hdr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				match(TITLE);
				setState(34);
				match(LEFT_BRACE);
				setState(35);
				match(TEXT);
				setState(36);
				match(RIGHT_BRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				match(AUTHOR);
				setState(38);
				match(LEFT_BRACE);
				setState(39);
				match(TEXT);
				setState(40);
				match(RIGHT_BRACE);
				setState(41);
				hdr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				match(AUTHOR);
				setState(43);
				match(LEFT_BRACE);
				setState(44);
				match(TEXT);
				setState(45);
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
		public TerminalNode MAKE_TITLE() { return getToken(TEXtoRTFParser.MAKE_TITLE, 0); }
		public ContContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cont; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXtoRTFListener ) ((TEXtoRTFListener)listener).enterCont(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXtoRTFListener ) ((TEXtoRTFListener)listener).exitCont(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXtoRTFVisitor ) return ((TEXtoRTFVisitor<? extends T>)visitor).visitCont(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContContext cont() throws RecognitionException {
		ContContext _localctx = new ContContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cont);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				sect();
				setState(49);
				cont();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				sect();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				tkt();
				setState(53);
				cont();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				tkt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(56);
				lst();
				setState(57);
				cont();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				lst();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(60);
				match(MAKE_TITLE);
				setState(61);
				cont();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(62);
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
		public TerminalNode SECTION() { return getToken(TEXtoRTFParser.SECTION, 0); }
		public BrcContext brc() {
			return getRuleContext(BrcContext.class,0);
		}
		public TerminalNode SUBSECTION() { return getToken(TEXtoRTFParser.SUBSECTION, 0); }
		public TerminalNode SUBSUBSECTION() { return getToken(TEXtoRTFParser.SUBSUBSECTION, 0); }
		public SectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXtoRTFListener ) ((TEXtoRTFListener)listener).enterSect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXtoRTFListener ) ((TEXtoRTFListener)listener).exitSect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXtoRTFVisitor ) return ((TEXtoRTFVisitor<? extends T>)visitor).visitSect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectContext sect() throws RecognitionException {
		SectContext _localctx = new SectContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sect);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SECTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(SECTION);
				setState(66);
				brc();
				}
				break;
			case SUBSECTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(SUBSECTION);
				setState(68);
				brc();
				}
				break;
			case SUBSUBSECTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				match(SUBSUBSECTION);
				setState(70);
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
		public TerminalNode TEXT() { return getToken(TEXtoRTFParser.TEXT, 0); }
		public TktContext tkt() {
			return getRuleContext(TktContext.class,0);
		}
		public TerminalNode DOTS() { return getToken(TEXtoRTFParser.DOTS, 0); }
		public TktContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tkt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXtoRTFListener ) ((TEXtoRTFListener)listener).enterTkt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXtoRTFListener ) ((TEXtoRTFListener)listener).exitTkt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXtoRTFVisitor ) return ((TEXtoRTFVisitor<? extends T>)visitor).visitTkt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TktContext tkt() throws RecognitionException {
		TktContext _localctx = new TktContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tkt);
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(TEXT);
				setState(74);
				tkt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(TEXT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				match(DOTS);
				setState(77);
				tkt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
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
		public Numbered_listContext numbered_list() {
			return getRuleContext(Numbered_listContext.class,0);
		}
		public Bulleted_listContext bulleted_list() {
			return getRuleContext(Bulleted_listContext.class,0);
		}
		public LstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXtoRTFListener ) ((TEXtoRTFListener)listener).enterLst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXtoRTFListener ) ((TEXtoRTFListener)listener).exitLst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXtoRTFVisitor ) return ((TEXtoRTFVisitor<? extends T>)visitor).visitLst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LstContext lst() throws RecognitionException {
		LstContext _localctx = new LstContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lst);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN_ENUMERATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				numbered_list();
				}
				break;
			case BEGIN_ITEMIZE:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				bulleted_list();
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
	public static class Numbered_listContext extends ParserRuleContext {
		public TerminalNode BEGIN_ENUMERATE() { return getToken(TEXtoRTFParser.BEGIN_ENUMERATE, 0); }
		public TmnContext tmn() {
			return getRuleContext(TmnContext.class,0);
		}
		public TerminalNode END_ENUMERATE() { return getToken(TEXtoRTFParser.END_ENUMERATE, 0); }
		public Numbered_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numbered_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXtoRTFListener ) ((TEXtoRTFListener)listener).enterNumbered_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXtoRTFListener ) ((TEXtoRTFListener)listener).exitNumbered_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXtoRTFVisitor ) return ((TEXtoRTFVisitor<? extends T>)visitor).visitNumbered_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numbered_listContext numbered_list() throws RecognitionException {
		Numbered_listContext _localctx = new Numbered_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_numbered_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(BEGIN_ENUMERATE);
			setState(86);
			tmn();
			setState(87);
			match(END_ENUMERATE);
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
	public static class Bulleted_listContext extends ParserRuleContext {
		public TerminalNode BEGIN_ITEMIZE() { return getToken(TEXtoRTFParser.BEGIN_ITEMIZE, 0); }
		public TmbContext tmb() {
			return getRuleContext(TmbContext.class,0);
		}
		public TerminalNode END_ITEMIZE() { return getToken(TEXtoRTFParser.END_ITEMIZE, 0); }
		public Bulleted_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bulleted_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXtoRTFListener ) ((TEXtoRTFListener)listener).enterBulleted_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXtoRTFListener ) ((TEXtoRTFListener)listener).exitBulleted_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXtoRTFVisitor ) return ((TEXtoRTFVisitor<? extends T>)visitor).visitBulleted_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bulleted_listContext bulleted_list() throws RecognitionException {
		Bulleted_listContext _localctx = new Bulleted_listContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bulleted_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(BEGIN_ITEMIZE);
			setState(90);
			tmb();
			setState(91);
			match(END_ITEMIZE);
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
		public TerminalNode LEFT_BRACE() { return getToken(TEXtoRTFParser.LEFT_BRACE, 0); }
		public TerminalNode TEXT() { return getToken(TEXtoRTFParser.TEXT, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(TEXtoRTFParser.RIGHT_BRACE, 0); }
		public BrcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXtoRTFListener ) ((TEXtoRTFListener)listener).enterBrc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXtoRTFListener ) ((TEXtoRTFListener)listener).exitBrc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXtoRTFVisitor ) return ((TEXtoRTFVisitor<? extends T>)visitor).visitBrc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BrcContext brc() throws RecognitionException {
		BrcContext _localctx = new BrcContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_brc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(LEFT_BRACE);
			setState(94);
			match(TEXT);
			setState(95);
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
	public static class TmnContext extends ParserRuleContext {
		public TerminalNode ITEM() { return getToken(TEXtoRTFParser.ITEM, 0); }
		public TktContext tkt() {
			return getRuleContext(TktContext.class,0);
		}
		public TmnContext tmn() {
			return getRuleContext(TmnContext.class,0);
		}
		public TmnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXtoRTFListener ) ((TEXtoRTFListener)listener).enterTmn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXtoRTFListener ) ((TEXtoRTFListener)listener).exitTmn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXtoRTFVisitor ) return ((TEXtoRTFVisitor<? extends T>)visitor).visitTmn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmnContext tmn() throws RecognitionException {
		TmnContext _localctx = new TmnContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tmn);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(ITEM);
				setState(98);
				tkt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(ITEM);
				setState(100);
				tkt();
				setState(101);
				tmn();
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
	public static class TmbContext extends ParserRuleContext {
		public TerminalNode ITEM() { return getToken(TEXtoRTFParser.ITEM, 0); }
		public TktContext tkt() {
			return getRuleContext(TktContext.class,0);
		}
		public TmbContext tmb() {
			return getRuleContext(TmbContext.class,0);
		}
		public TmbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXtoRTFListener ) ((TEXtoRTFListener)listener).enterTmb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXtoRTFListener ) ((TEXtoRTFListener)listener).exitTmb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXtoRTFVisitor ) return ((TEXtoRTFVisitor<? extends T>)visitor).visitTmb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TmbContext tmb() throws RecognitionException {
		TmbContext _localctx = new TmbContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tmb);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(ITEM);
				setState(106);
				tkt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(ITEM);
				setState(108);
				tkt();
				setState(109);
				tmb();
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
		"\u0004\u0001\u0013r\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001/\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002@\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003H\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004P\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005T\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\th\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\np\b\n\u0001\n\u0000\u0000\u000b\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0000x\u0000\u0016"+
		"\u0001\u0000\u0000\u0000\u0002.\u0001\u0000\u0000\u0000\u0004?\u0001\u0000"+
		"\u0000\u0000\u0006G\u0001\u0000\u0000\u0000\bO\u0001\u0000\u0000\u0000"+
		"\nS\u0001\u0000\u0000\u0000\fU\u0001\u0000\u0000\u0000\u000eY\u0001\u0000"+
		"\u0000\u0000\u0010]\u0001\u0000\u0000\u0000\u0012g\u0001\u0000\u0000\u0000"+
		"\u0014o\u0001\u0000\u0000\u0000\u0016\u0017\u0005\u0002\u0000\u0000\u0017"+
		"\u0018\u0003\u0002\u0001\u0000\u0018\u0019\u0005\u0003\u0000\u0000\u0019"+
		"\u001a\u0003\u0004\u0002\u0000\u001a\u001b\u0005\u0004\u0000\u0000\u001b"+
		"\u0001\u0001\u0000\u0000\u0000\u001c\u001d\u0005\u0005\u0000\u0000\u001d"+
		"\u001e\u0005\u0012\u0000\u0000\u001e\u001f\u0005\u0011\u0000\u0000\u001f"+
		" \u0005\u0013\u0000\u0000 /\u0003\u0002\u0001\u0000!\"\u0005\u0005\u0000"+
		"\u0000\"#\u0005\u0012\u0000\u0000#$\u0005\u0011\u0000\u0000$/\u0005\u0013"+
		"\u0000\u0000%&\u0005\u0006\u0000\u0000&\'\u0005\u0012\u0000\u0000\'(\u0005"+
		"\u0011\u0000\u0000()\u0005\u0013\u0000\u0000)/\u0003\u0002\u0001\u0000"+
		"*+\u0005\u0006\u0000\u0000+,\u0005\u0012\u0000\u0000,-\u0005\u0011\u0000"+
		"\u0000-/\u0005\u0013\u0000\u0000.\u001c\u0001\u0000\u0000\u0000.!\u0001"+
		"\u0000\u0000\u0000.%\u0001\u0000\u0000\u0000.*\u0001\u0000\u0000\u0000"+
		"/\u0003\u0001\u0000\u0000\u000001\u0003\u0006\u0003\u000012\u0003\u0004"+
		"\u0002\u00002@\u0001\u0000\u0000\u00003@\u0003\u0006\u0003\u000045\u0003"+
		"\b\u0004\u000056\u0003\u0004\u0002\u00006@\u0001\u0000\u0000\u00007@\u0003"+
		"\b\u0004\u000089\u0003\n\u0005\u00009:\u0003\u0004\u0002\u0000:@\u0001"+
		"\u0000\u0000\u0000;@\u0003\n\u0005\u0000<=\u0005\u0007\u0000\u0000=@\u0003"+
		"\u0004\u0002\u0000>@\u0005\u0007\u0000\u0000?0\u0001\u0000\u0000\u0000"+
		"?3\u0001\u0000\u0000\u0000?4\u0001\u0000\u0000\u0000?7\u0001\u0000\u0000"+
		"\u0000?8\u0001\u0000\u0000\u0000?;\u0001\u0000\u0000\u0000?<\u0001\u0000"+
		"\u0000\u0000?>\u0001\u0000\u0000\u0000@\u0005\u0001\u0000\u0000\u0000"+
		"AB\u0005\r\u0000\u0000BH\u0003\u0010\b\u0000CD\u0005\u000e\u0000\u0000"+
		"DH\u0003\u0010\b\u0000EF\u0005\u000f\u0000\u0000FH\u0003\u0010\b\u0000"+
		"GA\u0001\u0000\u0000\u0000GC\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000H\u0007\u0001\u0000\u0000\u0000IJ\u0005\u0011\u0000\u0000JP\u0003"+
		"\b\u0004\u0000KP\u0005\u0011\u0000\u0000LM\u0005\u0010\u0000\u0000MP\u0003"+
		"\b\u0004\u0000NP\u0005\u0010\u0000\u0000OI\u0001\u0000\u0000\u0000OK\u0001"+
		"\u0000\u0000\u0000OL\u0001\u0000\u0000\u0000ON\u0001\u0000\u0000\u0000"+
		"P\t\u0001\u0000\u0000\u0000QT\u0003\f\u0006\u0000RT\u0003\u000e\u0007"+
		"\u0000SQ\u0001\u0000\u0000\u0000SR\u0001\u0000\u0000\u0000T\u000b\u0001"+
		"\u0000\u0000\u0000UV\u0005\b\u0000\u0000VW\u0003\u0012\t\u0000WX\u0005"+
		"\t\u0000\u0000X\r\u0001\u0000\u0000\u0000YZ\u0005\n\u0000\u0000Z[\u0003"+
		"\u0014\n\u0000[\\\u0005\u000b\u0000\u0000\\\u000f\u0001\u0000\u0000\u0000"+
		"]^\u0005\u0012\u0000\u0000^_\u0005\u0011\u0000\u0000_`\u0005\u0013\u0000"+
		"\u0000`\u0011\u0001\u0000\u0000\u0000ab\u0005\f\u0000\u0000bh\u0003\b"+
		"\u0004\u0000cd\u0005\f\u0000\u0000de\u0003\b\u0004\u0000ef\u0003\u0012"+
		"\t\u0000fh\u0001\u0000\u0000\u0000ga\u0001\u0000\u0000\u0000gc\u0001\u0000"+
		"\u0000\u0000h\u0013\u0001\u0000\u0000\u0000ij\u0005\f\u0000\u0000jp\u0003"+
		"\b\u0004\u0000kl\u0005\f\u0000\u0000lm\u0003\b\u0004\u0000mn\u0003\u0014"+
		"\n\u0000np\u0001\u0000\u0000\u0000oi\u0001\u0000\u0000\u0000ok\u0001\u0000"+
		"\u0000\u0000p\u0015\u0001\u0000\u0000\u0000\u0007.?GOSgo";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}