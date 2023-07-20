// Generated from /Users/fredyvelasquez/Downloads/Lab0-Compiladores-main/yapl.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class yaplParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, CLASS=19, ELSE=20, FALSE=21, FI=22, IF=23, IN=24, INHERITS=25, 
		ISVOID=26, LOOP=27, POOL=28, THEN=29, WHILE=30, NEW=31, NOT=32, TRUE=33, 
		LET=34, TYPE_ID=35, OBJECT_ID=36, SELF=37, SELF_TYPE=38, STRING=39, WHITESPACE=40, 
		NEWLINE=41, INT=42, COMMENT=43, COMMENT_BLOCK=44;
	public static final int
		RULE_prog = 0, RULE_class_def = 1, RULE_feature = 2, RULE_formal = 3, 
		RULE_expr = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "class_def", "feature", "formal", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "'('", "','", "')'", "':'", "'<-'", "'@'", 
			"'.'", "'+'", "'-'", "'*'", "'/'", "'~'", "'<'", "'<='", "'='", null, 
			null, "'false'", null, null, null, null, null, null, null, null, null, 
			null, null, "'true'", "'let'", null, null, "'self'", "'SELF_TYPE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "CLASS", "ELSE", "FALSE", "FI", 
			"IF", "IN", "INHERITS", "ISVOID", "LOOP", "POOL", "THEN", "WHILE", "NEW", 
			"NOT", "TRUE", "LET", "TYPE_ID", "OBJECT_ID", "SELF", "SELF_TYPE", "STRING", 
			"WHITESPACE", "NEWLINE", "INT", "COMMENT", "COMMENT_BLOCK"
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
	public String getGrammarFileName() { return "yapl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public yaplParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<Class_defContext> class_def() {
			return getRuleContexts(Class_defContext.class);
		}
		public Class_defContext class_def(int i) {
			return getRuleContext(Class_defContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				class_def();
				setState(11);
				match(T__0);
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASS );
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

	public static class Class_defContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(yaplParser.CLASS, 0); }
		public List<TerminalNode> TYPE_ID() { return getTokens(yaplParser.TYPE_ID); }
		public TerminalNode TYPE_ID(int i) {
			return getToken(yaplParser.TYPE_ID, i);
		}
		public TerminalNode INHERITS() { return getToken(yaplParser.INHERITS, 0); }
		public List<FeatureContext> feature() {
			return getRuleContexts(FeatureContext.class);
		}
		public FeatureContext feature(int i) {
			return getRuleContext(FeatureContext.class,i);
		}
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def; }
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(CLASS);
			setState(18);
			match(TYPE_ID);
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(19);
				match(INHERITS);
				setState(20);
				match(TYPE_ID);
				}
			}

			setState(23);
			match(T__1);
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE_ID || _la==OBJECT_ID) {
				{
				{
				setState(24);
				feature();
				setState(25);
				match(T__0);
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
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

	public static class FeatureContext extends ParserRuleContext {
		public List<TerminalNode> TYPE_ID() { return getTokens(yaplParser.TYPE_ID); }
		public TerminalNode TYPE_ID(int i) {
			return getToken(yaplParser.TYPE_ID, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OBJECT_ID() { return getToken(yaplParser.OBJECT_ID, 0); }
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_feature);
		int _la;
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				_la = _input.LA(1);
				if ( !(_la==TYPE_ID || _la==OBJECT_ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(35);
					match(T__3);
					setState(44);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TYPE_ID || _la==OBJECT_ID) {
						{
						setState(36);
						formal();
						setState(41);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__4) {
							{
							{
							setState(37);
							match(T__4);
							setState(38);
							formal();
							}
							}
							setState(43);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(46);
					match(T__5);
					}
				}

				setState(49);
				match(T__6);
				setState(50);
				match(TYPE_ID);
				setState(51);
				match(T__1);
				setState(52);
				expr(0);
				setState(53);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				_la = _input.LA(1);
				if ( !(_la==TYPE_ID || _la==OBJECT_ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(56);
				match(T__6);
				setState(57);
				match(TYPE_ID);
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(58);
					match(T__7);
					setState(59);
					expr(0);
					}
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

	public static class FormalContext extends ParserRuleContext {
		public List<TerminalNode> TYPE_ID() { return getTokens(yaplParser.TYPE_ID); }
		public TerminalNode TYPE_ID(int i) {
			return getToken(yaplParser.TYPE_ID, i);
		}
		public TerminalNode OBJECT_ID() { return getToken(yaplParser.OBJECT_ID, 0); }
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !(_la==TYPE_ID || _la==OBJECT_ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(65);
			match(T__6);
			setState(66);
			match(TYPE_ID);
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

	public static class ExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> TYPE_ID() { return getTokens(yaplParser.TYPE_ID); }
		public TerminalNode TYPE_ID(int i) {
			return getToken(yaplParser.TYPE_ID, i);
		}
		public List<TerminalNode> OBJECT_ID() { return getTokens(yaplParser.OBJECT_ID); }
		public TerminalNode OBJECT_ID(int i) {
			return getToken(yaplParser.OBJECT_ID, i);
		}
		public TerminalNode IF() { return getToken(yaplParser.IF, 0); }
		public TerminalNode THEN() { return getToken(yaplParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(yaplParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(yaplParser.FI, 0); }
		public TerminalNode WHILE() { return getToken(yaplParser.WHILE, 0); }
		public TerminalNode LOOP() { return getToken(yaplParser.LOOP, 0); }
		public TerminalNode POOL() { return getToken(yaplParser.POOL, 0); }
		public TerminalNode LET() { return getToken(yaplParser.LET, 0); }
		public TerminalNode IN() { return getToken(yaplParser.IN, 0); }
		public TerminalNode NEW() { return getToken(yaplParser.NEW, 0); }
		public TerminalNode ISVOID() { return getToken(yaplParser.ISVOID, 0); }
		public TerminalNode NOT() { return getToken(yaplParser.NOT, 0); }
		public TerminalNode INT() { return getToken(yaplParser.INT, 0); }
		public TerminalNode STRING() { return getToken(yaplParser.STRING, 0); }
		public TerminalNode TRUE() { return getToken(yaplParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(yaplParser.FALSE, 0); }
		public TerminalNode SELF() { return getToken(yaplParser.SELF, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(69);
				_la = _input.LA(1);
				if ( !(_la==TYPE_ID || _la==OBJECT_ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(70);
				match(T__7);
				setState(71);
				expr(23);
				}
				break;
			case 2:
				{
				setState(72);
				_la = _input.LA(1);
				if ( !(_la==TYPE_ID || _la==OBJECT_ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(73);
				match(T__3);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__11) | (1L << T__14) | (1L << FALSE) | (1L << IF) | (1L << ISVOID) | (1L << WHILE) | (1L << NEW) | (1L << NOT) | (1L << TRUE) | (1L << LET) | (1L << TYPE_ID) | (1L << OBJECT_ID) | (1L << SELF) | (1L << STRING) | (1L << INT))) != 0)) {
					{
					setState(74);
					expr(0);
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(75);
						match(T__4);
						setState(76);
						expr(0);
						}
						}
						setState(81);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(84);
				match(T__5);
				}
				break;
			case 3:
				{
				setState(85);
				match(IF);
				setState(86);
				expr(0);
				setState(87);
				match(THEN);
				setState(88);
				expr(0);
				setState(89);
				match(ELSE);
				setState(90);
				expr(0);
				setState(91);
				match(FI);
				}
				break;
			case 4:
				{
				setState(93);
				match(WHILE);
				setState(94);
				expr(0);
				setState(95);
				match(LOOP);
				setState(96);
				expr(0);
				setState(97);
				match(POOL);
				}
				break;
			case 5:
				{
				setState(99);
				match(T__1);
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(100);
					expr(0);
					setState(101);
					match(T__0);
					}
					}
					setState(105); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__11) | (1L << T__14) | (1L << FALSE) | (1L << IF) | (1L << ISVOID) | (1L << WHILE) | (1L << NEW) | (1L << NOT) | (1L << TRUE) | (1L << LET) | (1L << TYPE_ID) | (1L << OBJECT_ID) | (1L << SELF) | (1L << STRING) | (1L << INT))) != 0) );
				setState(107);
				match(T__2);
				}
				break;
			case 6:
				{
				setState(109);
				match(LET);
				setState(110);
				_la = _input.LA(1);
				if ( !(_la==TYPE_ID || _la==OBJECT_ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(111);
				match(T__6);
				setState(112);
				match(TYPE_ID);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(113);
					match(T__7);
					setState(114);
					expr(0);
					}
				}

				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(117);
					match(T__4);
					setState(118);
					_la = _input.LA(1);
					if ( !(_la==TYPE_ID || _la==OBJECT_ID) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(119);
					match(T__6);
					setState(120);
					match(TYPE_ID);
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__7) {
						{
						setState(121);
						match(T__7);
						setState(122);
						expr(0);
						}
					}

					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(130);
				match(IN);
				setState(131);
				expr(17);
				}
				break;
			case 7:
				{
				setState(132);
				match(NEW);
				setState(133);
				match(TYPE_ID);
				}
				break;
			case 8:
				{
				setState(134);
				match(ISVOID);
				setState(135);
				expr(15);
				}
				break;
			case 9:
				{
				setState(136);
				match(T__11);
				setState(137);
				expr(12);
				}
				break;
			case 10:
				{
				setState(138);
				match(T__14);
				setState(139);
				expr(11);
				}
				break;
			case 11:
				{
				setState(140);
				match(NOT);
				setState(141);
				expr(8);
				}
				break;
			case 12:
				{
				setState(142);
				match(T__3);
				setState(143);
				expr(0);
				setState(144);
				match(T__5);
				}
				break;
			case 13:
				{
				setState(146);
				_la = _input.LA(1);
				if ( !(_la==TYPE_ID || _la==OBJECT_ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 14:
				{
				setState(147);
				match(INT);
				}
				break;
			case 15:
				{
				setState(148);
				match(STRING);
				}
				break;
			case 16:
				{
				setState(149);
				match(TRUE);
				}
				break;
			case 17:
				{
				setState(150);
				match(FALSE);
				}
				break;
			case 18:
				{
				setState(151);
				match(SELF);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(185);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(154);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(155);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__11) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(156);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(157);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(158);
						_la = _input.LA(1);
						if ( !(_la==T__12 || _la==T__13) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(159);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(160);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(161);
						_la = _input.LA(1);
						if ( !(_la==T__15 || _la==T__16) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(162);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(163);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(164);
						match(T__17);
						setState(165);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(166);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(169);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__8) {
							{
							setState(167);
							match(T__8);
							setState(168);
							match(TYPE_ID);
							}
						}

						setState(171);
						match(T__9);
						setState(172);
						_la = _input.LA(1);
						if ( !(_la==TYPE_ID || _la==OBJECT_ID) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(173);
						match(T__3);
						setState(182);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__11) | (1L << T__14) | (1L << FALSE) | (1L << IF) | (1L << ISVOID) | (1L << WHILE) | (1L << NEW) | (1L << NOT) | (1L << TRUE) | (1L << LET) | (1L << TYPE_ID) | (1L << OBJECT_ID) | (1L << SELF) | (1L << STRING) | (1L << INT))) != 0)) {
							{
							setState(174);
							expr(0);
							setState(179);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__4) {
								{
								{
								setState(175);
								match(T__4);
								setState(176);
								expr(0);
								}
								}
								setState(181);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(184);
						match(T__5);
						}
						break;
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 22);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u00c1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\6\2\20\n\2\r\2\16\2\21\3\3"+
		"\3\3\3\3\3\3\5\3\30\n\3\3\3\3\3\3\3\3\3\7\3\36\n\3\f\3\16\3!\13\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\7\4*\n\4\f\4\16\4-\13\4\5\4/\n\4\3\4\5\4\62\n"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\5\4A\n\4\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6P\n\6\f\6\16\6S\13\6"+
		"\5\6U\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\6\6j\n\6\r\6\16\6k\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6v\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6~\n\6\7\6\u0080\n\6\f\6\16\6\u0083"+
		"\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u009b\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ac\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6"+
		"\u00b4\n\6\f\6\16\6\u00b7\13\6\5\6\u00b9\n\6\3\6\7\6\u00bc\n\6\f\6\16"+
		"\6\u00bf\13\6\3\6\2\3\n\7\2\4\6\b\n\2\6\3\2%&\3\2\r\16\3\2\17\20\3\2\22"+
		"\23\2\u00e2\2\17\3\2\2\2\4\23\3\2\2\2\6@\3\2\2\2\bB\3\2\2\2\n\u009a\3"+
		"\2\2\2\f\r\5\4\3\2\r\16\7\3\2\2\16\20\3\2\2\2\17\f\3\2\2\2\20\21\3\2\2"+
		"\2\21\17\3\2\2\2\21\22\3\2\2\2\22\3\3\2\2\2\23\24\7\25\2\2\24\27\7%\2"+
		"\2\25\26\7\33\2\2\26\30\7%\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\31\3\2\2"+
		"\2\31\37\7\4\2\2\32\33\5\6\4\2\33\34\7\3\2\2\34\36\3\2\2\2\35\32\3\2\2"+
		"\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"#\7\5"+
		"\2\2#\5\3\2\2\2$\61\t\2\2\2%.\7\6\2\2&+\5\b\5\2\'(\7\7\2\2(*\5\b\5\2)"+
		"\'\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,/\3\2\2\2-+\3\2\2\2.&\3\2\2\2"+
		"./\3\2\2\2/\60\3\2\2\2\60\62\7\b\2\2\61%\3\2\2\2\61\62\3\2\2\2\62\63\3"+
		"\2\2\2\63\64\7\t\2\2\64\65\7%\2\2\65\66\7\4\2\2\66\67\5\n\6\2\678\7\5"+
		"\2\28A\3\2\2\29:\t\2\2\2:;\7\t\2\2;>\7%\2\2<=\7\n\2\2=?\5\n\6\2><\3\2"+
		"\2\2>?\3\2\2\2?A\3\2\2\2@$\3\2\2\2@9\3\2\2\2A\7\3\2\2\2BC\t\2\2\2CD\7"+
		"\t\2\2DE\7%\2\2E\t\3\2\2\2FG\b\6\1\2GH\t\2\2\2HI\7\n\2\2I\u009b\5\n\6"+
		"\31JK\t\2\2\2KT\7\6\2\2LQ\5\n\6\2MN\7\7\2\2NP\5\n\6\2OM\3\2\2\2PS\3\2"+
		"\2\2QO\3\2\2\2QR\3\2\2\2RU\3\2\2\2SQ\3\2\2\2TL\3\2\2\2TU\3\2\2\2UV\3\2"+
		"\2\2V\u009b\7\b\2\2WX\7\31\2\2XY\5\n\6\2YZ\7\37\2\2Z[\5\n\6\2[\\\7\26"+
		"\2\2\\]\5\n\6\2]^\7\30\2\2^\u009b\3\2\2\2_`\7 \2\2`a\5\n\6\2ab\7\35\2"+
		"\2bc\5\n\6\2cd\7\36\2\2d\u009b\3\2\2\2ei\7\4\2\2fg\5\n\6\2gh\7\3\2\2h"+
		"j\3\2\2\2if\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7\5\2\2"+
		"n\u009b\3\2\2\2op\7$\2\2pq\t\2\2\2qr\7\t\2\2ru\7%\2\2st\7\n\2\2tv\5\n"+
		"\6\2us\3\2\2\2uv\3\2\2\2v\u0081\3\2\2\2wx\7\7\2\2xy\t\2\2\2yz\7\t\2\2"+
		"z}\7%\2\2{|\7\n\2\2|~\5\n\6\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177w"+
		"\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7\32\2\2\u0085\u009b\5"+
		"\n\6\23\u0086\u0087\7!\2\2\u0087\u009b\7%\2\2\u0088\u0089\7\34\2\2\u0089"+
		"\u009b\5\n\6\21\u008a\u008b\7\16\2\2\u008b\u009b\5\n\6\16\u008c\u008d"+
		"\7\21\2\2\u008d\u009b\5\n\6\r\u008e\u008f\7\"\2\2\u008f\u009b\5\n\6\n"+
		"\u0090\u0091\7\6\2\2\u0091\u0092\5\n\6\2\u0092\u0093\7\b\2\2\u0093\u009b"+
		"\3\2\2\2\u0094\u009b\t\2\2\2\u0095\u009b\7,\2\2\u0096\u009b\7)\2\2\u0097"+
		"\u009b\7#\2\2\u0098\u009b\7\27\2\2\u0099\u009b\7\'\2\2\u009aF\3\2\2\2"+
		"\u009aJ\3\2\2\2\u009aW\3\2\2\2\u009a_\3\2\2\2\u009ae\3\2\2\2\u009ao\3"+
		"\2\2\2\u009a\u0086\3\2\2\2\u009a\u0088\3\2\2\2\u009a\u008a\3\2\2\2\u009a"+
		"\u008c\3\2\2\2\u009a\u008e\3\2\2\2\u009a\u0090\3\2\2\2\u009a\u0094\3\2"+
		"\2\2\u009a\u0095\3\2\2\2\u009a\u0096\3\2\2\2\u009a\u0097\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\u00bd\3\2\2\2\u009c\u009d\f\20"+
		"\2\2\u009d\u009e\t\3\2\2\u009e\u00bc\5\n\6\21\u009f\u00a0\f\17\2\2\u00a0"+
		"\u00a1\t\4\2\2\u00a1\u00bc\5\n\6\20\u00a2\u00a3\f\f\2\2\u00a3\u00a4\t"+
		"\5\2\2\u00a4\u00bc\5\n\6\r\u00a5\u00a6\f\13\2\2\u00a6\u00a7\7\24\2\2\u00a7"+
		"\u00bc\5\n\6\f\u00a8\u00ab\f\30\2\2\u00a9\u00aa\7\13\2\2\u00aa\u00ac\7"+
		"%\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ae\7\f\2\2\u00ae\u00af\t\2\2\2\u00af\u00b8\7\6\2\2\u00b0\u00b5\5\n"+
		"\6\2\u00b1\u00b2\7\7\2\2\u00b2\u00b4\5\n\6\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b9\3\2"+
		"\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b0\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bc\7\b\2\2\u00bb\u009c\3\2\2\2\u00bb\u009f\3\2"+
		"\2\2\u00bb\u00a2\3\2\2\2\u00bb\u00a5\3\2\2\2\u00bb\u00a8\3\2\2\2\u00bc"+
		"\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\13\3\2\2"+
		"\2\u00bf\u00bd\3\2\2\2\26\21\27\37+.\61>@QTku}\u0081\u009a\u00ab\u00b5"+
		"\u00b8\u00bb\u00bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}