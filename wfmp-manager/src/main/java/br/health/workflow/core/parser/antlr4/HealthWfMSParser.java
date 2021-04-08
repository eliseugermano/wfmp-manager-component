// Generated from br\health\workflow\core\parser\antlr4\HealthWfMS.g4 by ANTLR 4.2
package br.health.workflow.core.parser.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HealthWfMSParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__37=1, T__36=2, T__35=3, T__34=4, T__33=5, T__32=6, T__31=7, T__30=8, 
		T__29=9, T__28=10, T__27=11, T__26=12, T__25=13, T__24=14, T__23=15, T__22=16, 
		T__21=17, T__20=18, T__19=19, T__18=20, T__17=21, T__16=22, T__15=23, 
		T__14=24, T__13=25, T__12=26, T__11=27, T__10=28, T__9=29, T__8=30, T__7=31, 
		T__6=32, T__5=33, T__4=34, T__3=35, T__2=36, T__1=37, T__0=38, NUMBER=39, 
		DECIMAL=40, IDENTIFIER=41, TRUE=42, FALSE=43, LPAREN=44, RPAREN=45, MULT=46, 
		DIV=47, PLUS=48, MINUS=49, AND=50, OR=51, WS=52;
	public static final String[] tokenNames = {
		"<INVALID>", "'sync'", "'decimal'", "'waitTime'", "'start task'", "'currentDayWeek'", 
		"'integer'", "'onReceive'", "'{'", "'target'", "'='", "'}'", "'call'", 
		"'FromWorkflow'", "'<='", "'end.workflow.export'", "'task'", "'between'", 
		"'isFalse'", "','", "'.'", "'onReturn'", "'->'", "'case'", "'currentDate'", 
		"'end.workflow'", "'boolean'", "'>='", "'<'", "'with'", "'>'", "'until'", 
		"'workflow'", "'<>'", "'currentTime'", "'string'", "'FromService'", "'isTrue'", 
		"'equal'", "NUMBER", "DECIMAL", "IDENTIFIER", "'true'", "'false'", "'('", 
		"')'", "'*'", "'/'", "'+'", "'-'", "'and'", "'or'", "WS"
	};
	public static final int
		RULE_root = 0, RULE_firstPlaceDef = 1, RULE_otherPlaceDef = 2, RULE_trasitionDef = 3, 
		RULE_eventDef = 4, RULE_conditionDef = 5, RULE_actionDef = 6, RULE_eventType = 7, 
		RULE_kind = 8, RULE_primitive = 9, RULE_struct = 10, RULE_expression = 11, 
		RULE_operand = 12, RULE_operator = 13, RULE_arithmetic_expr = 14, RULE_comparison_expr = 15, 
		RULE_logical_entity = 16, RULE_targetDef = 17, RULE_callDef = 18, RULE_syncCallDef = 19, 
		RULE_statement = 20, RULE_booleanFunction = 21, RULE_timeFunction = 22, 
		RULE_value = 23, RULE_object = 24, RULE_endPoint = 25, RULE_attribute = 26, 
		RULE_numeric_entity = 27;
	public static final String[] ruleNames = {
		"root", "firstPlaceDef", "otherPlaceDef", "trasitionDef", "eventDef", 
		"conditionDef", "actionDef", "eventType", "kind", "primitive", "struct", 
		"expression", "operand", "operator", "arithmetic_expr", "comparison_expr", 
		"logical_entity", "targetDef", "callDef", "syncCallDef", "statement", 
		"booleanFunction", "timeFunction", "value", "object", "endPoint", "attribute", 
		"numeric_entity"
	};

	@Override
	public String getGrammarFileName() { return "HealthWfMS.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HealthWfMSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RootContext extends ParserRuleContext {
		public FirstPlaceDefContext firstPlaceDef() {
			return getRuleContext(FirstPlaceDefContext.class,0);
		}
		public OtherPlaceDefContext otherPlaceDef(int i) {
			return getRuleContext(OtherPlaceDefContext.class,i);
		}
		public List<OtherPlaceDefContext> otherPlaceDef() {
			return getRuleContexts(OtherPlaceDefContext.class);
		}
		public TerminalNode IDENTIFIER() { return getToken(HealthWfMSParser.IDENTIFIER, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HealthWfMSVisitor ) return ((HealthWfMSVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); match(32);
			setState(57); match(IDENTIFIER);
			setState(58); match(8);
			setState(59); firstPlaceDef();
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60); otherPlaceDef();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==16 );
			setState(65); match(11);
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

	public static class FirstPlaceDefContext extends ParserRuleContext {
		public List<ActionDefContext> actionDef() {
			return getRuleContexts(ActionDefContext.class);
		}
		public ActionDefContext actionDef(int i) {
			return getRuleContext(ActionDefContext.class,i);
		}
		public FirstPlaceDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstPlaceDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).enterFirstPlaceDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).exitFirstPlaceDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HealthWfMSVisitor ) return ((HealthWfMSVisitor<? extends T>)visitor).visitFirstPlaceDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirstPlaceDefContext firstPlaceDef() throws RecognitionException {
		FirstPlaceDefContext _localctx = new FirstPlaceDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_firstPlaceDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); match(4);
			setState(68); match(8);
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(69); actionDef();
				}
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 9) | (1L << 12) | (1L << 15) | (1L << 25))) != 0) );
			setState(74); match(11);
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

	public static class OtherPlaceDefContext extends ParserRuleContext {
		public List<TrasitionDefContext> trasitionDef() {
			return getRuleContexts(TrasitionDefContext.class);
		}
		public TrasitionDefContext trasitionDef(int i) {
			return getRuleContext(TrasitionDefContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(HealthWfMSParser.IDENTIFIER, 0); }
		public OtherPlaceDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherPlaceDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).enterOtherPlaceDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).exitOtherPlaceDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HealthWfMSVisitor ) return ((HealthWfMSVisitor<? extends T>)visitor).visitOtherPlaceDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherPlaceDefContext otherPlaceDef() throws RecognitionException {
		OtherPlaceDefContext _localctx = new OtherPlaceDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_otherPlaceDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); match(16);
			setState(77); match(IDENTIFIER);
			setState(78); match(8);
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(79); trasitionDef();
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==23 );
			setState(84); match(11);
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

	public static class TrasitionDefContext extends ParserRuleContext {
		public ConditionDefContext conditionDef() {
			return getRuleContext(ConditionDefContext.class,0);
		}
		public EventDefContext eventDef() {
			return getRuleContext(EventDefContext.class,0);
		}
		public ActionDefContext actionDef() {
			return getRuleContext(ActionDefContext.class,0);
		}
		public TrasitionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trasitionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).enterTrasitionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).exitTrasitionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HealthWfMSVisitor ) return ((HealthWfMSVisitor<? extends T>)visitor).visitTrasitionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrasitionDefContext trasitionDef() throws RecognitionException {
		TrasitionDefContext _localctx = new TrasitionDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_trasitionDef);
		try {
			setState(101);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86); match(23);
				setState(87); eventDef();
				setState(88); match(8);
				setState(89); conditionDef();
				setState(90); match(8);
				setState(91); actionDef();
				setState(92); match(11);
				setState(93); match(11);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95); match(23);
				setState(96); eventDef();
				setState(97); match(8);
				setState(98); actionDef();
				setState(99); match(11);
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

	public static class EventDefContext extends ParserRuleContext {
		public EventTypeContext eventType() {
			return getRuleContext(EventTypeContext.class,0);
		}
		public EventDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).enterEventDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).exitEventDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HealthWfMSVisitor ) return ((HealthWfMSVisitor<? extends T>)visitor).visitEventDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventDefContext eventDef() throws RecognitionException {
		EventDefContext _localctx = new EventDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_eventDef);
		try {
			setState(105);
			switch (_input.LA(1)) {
			case 7:
			case 21:
				enterOuterAlt(_localctx, 1);
				{
				setState(103); eventType();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ConditionDefContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).enterConditionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).exitConditionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HealthWfMSVisitor ) return ((HealthWfMSVisitor<? extends T>)visitor).visitConditionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionDefContext conditionDef() throws RecognitionException {
		ConditionDefContext _localctx = new ConditionDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conditionDef);
		try {
			setState(110);
			switch (_input.LA(1)) {
			case 29:
				enterOuterAlt(_localctx, 1);
				{
				setState(107); match(29);
				setState(108); expression(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ActionDefContext extends ParserRuleContext {
		public List<TargetDefContext> targetDef() {
			return getRuleContexts(TargetDefContext.class);
		}
		public List<CallDefContext> callDef() {
			return getRuleContexts(CallDefContext.class);
		}
		public CallDefContext callDef(int i) {
			return getRuleContext(CallDefContext.class,i);
		}
		public TargetDefContext targetDef(int i) {
			return getRuleContext(TargetDefContext.class,i);
		}
		public ActionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).enterActionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).exitActionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HealthWfMSVisitor ) return ((HealthWfMSVisitor<? extends T>)visitor).visitActionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionDefContext actionDef() throws RecognitionException {
		ActionDefContext _localctx = new ActionDefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_actionDef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(112); targetDef();
					setState(113); callDef();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(117); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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

	public static class EventTypeContext extends ParserRuleContext {
		public EndPointContext endPoint() {
			return getRuleContext(EndPointContext.class,0);
		}
		public KindContext kind() {
			return getRuleContext(KindContext.class,0);
		}
		public EventTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).enterEventType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).exitEventType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HealthWfMSVisitor ) return ((HealthWfMSVisitor<? extends T>)visitor).visitEventType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventTypeContext eventType() throws RecognitionException {
		EventTypeContext _localctx = new EventTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_eventType);
		try {
			setState(125);
			switch (_input.LA(1)) {
			case 7:
				enterOuterAlt(_localctx, 1);
				{
				setState(119); match(7);
				setState(120); kind();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 2);
				{
				setState(121); match(21);
				setState(122); kind();
				setState(123); endPoint();
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

	public static class KindContext extends ParserRuleContext {
		public StructContext struct() {
			return getRuleContext(StructContext.class,0);
		}
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public KindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).enterKind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).exitKind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HealthWfMSVisitor ) return ((HealthWfMSVisitor<? extends T>)visitor).visitKind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KindContext kind() throws RecognitionException {
		KindContext _localctx = new KindContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_kind);
		try {
			setState(129);
			switch (_input.LA(1)) {
			case 2:
			case 6:
			case 26:
			case 35:
				enterOuterAlt(_localctx, 1);
				{
				setState(127); primitive();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(128); struct();
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

	public static class PrimitiveContext extends ParserRuleContext {
		public PrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).enterPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).exitPrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HealthWfMSVisitor ) return ((HealthWfMSVisitor<? extends T>)visitor).visitPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_primitive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 26) | (1L << 35))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class StructContext extends ParserRuleContext {
		public StructContext struct() {
			return getRuleContext(StructContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(HealthWfMSParser.IDENTIFIER, 0); }
		public StructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HealthWfMSVisitor ) return ((HealthWfMSVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_struct);
		try {
			setState(137);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133); match(IDENTIFIER);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134); match(IDENTIFIER);
				setState(135); match(20);
				setState(136); struct();
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HealthWfMSParser.LPAREN, 0); }
		public Comparison_exprContext comparison_expr() {
			return getRuleContext(Comparison_exprContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Logical_entityContext logical_entity() {
			return getRuleContext(Logical_entityContext.class,0);
		}
		public TerminalNode AND() { return getToken(HealthWfMSParser.AND, 0); }
		public TerminalNode RPAREN() { return getToken(HealthWfMSParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode OR() { return getToken(HealthWfMSParser.OR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HealthWfMSVisitor ) return ((HealthWfMSVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(140); statement();
				}
				break;

			case 2:
				{
				setState(141); comparison_expr();
				}
				break;

			case 3:
				{
				setState(142); match(LPAREN);
				setState(143); expression(0);
				setState(144); match(RPAREN);
				}
				break;

			case 4:
				{
				setState(146); logical_entity();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(155);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(149);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(150); match(AND);
						setState(151); expression(7);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(152);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(153); match(OR);
						setState(154); expression(6);
						}
						break;
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class OperandContext extends ParserRuleContext {
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HealthWfMSVisitor ) return ((HealthWfMSVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); arithmetic_expr(0);
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

	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HealthWfMSVisitor ) return ((HealthWfMSVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 10) | (1L << 14) | (1L << 27) | (1L << 28) | (1L << 30) | (1L << 33))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Arithmetic_exprContext extends ParserRuleContext {
		public List<Arithmetic_exprContext> arithmetic_expr() {
			return getRuleContexts(Arithmetic_exprContext.class);
		}
		public TerminalNode LPAREN() { return getToken(HealthWfMSParser.LPAREN, 0); }
		public TerminalNode MULT() { return getToken(HealthWfMSParser.MULT, 0); }
		public TerminalNode MINUS() { return getToken(HealthWfMSParser.MINUS, 0); }
		public TerminalNode RPAREN() { return getToken(HealthWfMSParser.RPAREN, 0); }
		public TerminalNode PLUS() { return getToken(HealthWfMSParser.PLUS, 0); }
		public Arithmetic_exprContext arithmetic_expr(int i) {
			return getRuleContext(Arithmetic_exprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(HealthWfMSParser.DIV, 0); }
		public Numeric_entityContext numeric_entity() {
			return getRuleContext(Numeric_entityContext.class,0);
		}
		public Arithmetic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).enterArithmetic_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).exitArithmetic_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HealthWfMSVisitor ) return ((HealthWfMSVisitor<? extends T>)visitor).visitArithmetic_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_exprContext arithmetic_expr() throws RecognitionException {
		return arithmetic_expr(0);
	}

	private Arithmetic_exprContext arithmetic_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arithmetic_exprContext _localctx = new Arithmetic_exprContext(_ctx, _parentState);
		Arithmetic_exprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_arithmetic_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			switch (_input.LA(1)) {
			case MINUS:
				{
				setState(165); match(MINUS);
				setState(166); arithmetic_expr(3);
				}
				break;
			case LPAREN:
				{
				setState(167); match(LPAREN);
				setState(168); arithmetic_expr(0);
				setState(169); match(RPAREN);
				}
				break;
			case DECIMAL:
			case IDENTIFIER:
				{
				setState(171); numeric_entity();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(186);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new Arithmetic_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expr);
						setState(174);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(175); match(MULT);
						setState(176); arithmetic_expr(8);
						}
						break;

					case 2:
						{
						_localctx = new Arithmetic_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expr);
						setState(177);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(178); match(DIV);
						setState(179); arithmetic_expr(7);
						}
						break;

					case 3:
						{
						_localctx = new Arithmetic_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expr);
						setState(180);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(181); match(PLUS);
						setState(182); arithmetic_expr(6);
						}
						break;

					case 4:
						{
						_localctx = new Arithmetic_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expr);
						setState(183);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(184); match(MINUS);
						setState(185); arithmetic_expr(5);
						}
						break;
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class Comparison_exprContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HealthWfMSParser.LPAREN, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Comparison_exprContext comparison_expr() {
			return getRuleContext(Comparison_exprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HealthWfMSParser.RPAREN, 0); }
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public Comparison_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).enterComparison_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).exitComparison_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HealthWfMSVisitor ) return ((HealthWfMSVisitor<? extends T>)visitor).visitComparison_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_exprContext comparison_expr() throws RecognitionException {
		Comparison_exprContext _localctx = new Comparison_exprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comparison_expr);
		try {
			setState(199);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191); operand();
				setState(192); operator();
				setState(193); operand();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195); match(LPAREN);
				setState(196); comparison_expr();
				setState(197); match(RPAREN);
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

	public static class Logical_entityContext extends ParserRuleContext {
		public TerminalNode FALSE() { return getToken(HealthWfMSParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(HealthWfMSParser.TRUE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HealthWfMSParser.IDENTIFIER, 0); }
		public Logical_entityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_entity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).enterLogical_entity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).exitLogical_entity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HealthWfMSVisitor ) return ((HealthWfMSVisitor<? extends T>)visitor).visitLogical_entity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_entityContext logical_entity() throws RecognitionException {
		Logical_entityContext _localctx = new Logical_entityContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_logical_entity);
		int _la;
		try {
			setState(203);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(202); match(IDENTIFIER);
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

	public static class TargetDefContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(HealthWfMSParser.IDENTIFIER, 0); }
		public TargetDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_targetDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).enterTargetDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).exitTargetDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HealthWfMSVisitor ) return ((HealthWfMSVisitor<? extends T>)visitor).visitTargetDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetDefContext targetDef() throws RecognitionException {
		TargetDefContext _localctx = new TargetDefContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_targetDef);
		try {
			setState(208);
			switch (_input.LA(1)) {
			case 9:
				enterOuterAlt(_localctx, 1);
				{
				setState(205); match(9);
				setState(206); match(IDENTIFIER);
				}
				break;
			case 1:
			case 12:
			case 15:
			case 25:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class CallDefContext extends ParserRuleContext {
		public StructContext struct() {
			return getRuleContext(StructContext.class,0);
		}
		public EndPointContext endPoint() {
			return getRuleContext(EndPointContext.class,0);
		}
		public SyncCallDefContext syncCallDef() {
			return getRuleContext(SyncCallDefContext.class,0);
		}
		public CallDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).enterCallDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).exitCallDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HealthWfMSVisitor ) return ((HealthWfMSVisitor<? extends T>)visitor).visitCallDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallDefContext callDef() throws RecognitionException {
		CallDefContext _localctx = new CallDefContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_callDef);
		try {
			setState(237);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210); syncCallDef();
				setState(211); match(12);
				setState(212); endPoint();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214); syncCallDef();
				setState(215); match(12);
				setState(216); endPoint();
				setState(217); match(22);
				setState(218); match(36);
				setState(219); match(22);
				setState(220); struct();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(222); syncCallDef();
				setState(223); match(12);
				setState(224); endPoint();
				setState(225); match(22);
				setState(226); match(13);
				setState(227); match(22);
				setState(228); struct();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(230); syncCallDef();
				setState(231); match(25);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(233); syncCallDef();
				setState(234); match(15);
				setState(235); struct();
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

	public static class SyncCallDefContext extends ParserRuleContext {
		public SyncCallDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syncCallDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).enterSyncCallDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).exitSyncCallDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HealthWfMSVisitor ) return ((HealthWfMSVisitor<? extends T>)visitor).visitSyncCallDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SyncCallDefContext syncCallDef() throws RecognitionException {
		SyncCallDefContext _localctx = new SyncCallDefContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_syncCallDef);
		try {
			setState(241);
			switch (_input.LA(1)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239); match(1);
				}
				break;
			case 12:
			case 15:
			case 25:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class StatementContext extends ParserRuleContext {
		public BooleanFunctionContext booleanFunction() {
			return getRuleContext(BooleanFunctionContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(HealthWfMSParser.LPAREN, 0); }
		public TimeFunctionContext timeFunction() {
			return getRuleContext(TimeFunctionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HealthWfMSParser.RPAREN, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HealthWfMSVisitor ) return ((HealthWfMSVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_statement);
		int _la;
		try {
			setState(281);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243); booleanFunction();
				setState(244); match(LPAREN);
				setState(245); object();
				setState(246); match(RPAREN);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248); timeFunction();
				setState(249); match(20);
				setState(250); match(38);
				setState(251); match(LPAREN);
				setState(252); value();
				setState(253); match(RPAREN);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(255); timeFunction();
				setState(256); match(20);
				setState(257); match(38);
				setState(258); match(LPAREN);
				setState(259); value();
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==19) {
					{
					{
					setState(260); match(19);
					setState(261); value();
					}
					}
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(267); match(RPAREN);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(269); timeFunction();
				setState(270); match(20);
				setState(271); match(17);
				setState(272); match(LPAREN);
				setState(273); value();
				setState(274); match(19);
				setState(275); value();
				setState(276); match(RPAREN);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(278); match(3);
				setState(279); match(31);
				setState(280); value();
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

	public static class BooleanFunctionContext extends ParserRuleContext {
		public BooleanFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).enterBooleanFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).exitBooleanFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HealthWfMSVisitor ) return ((HealthWfMSVisitor<? extends T>)visitor).visitBooleanFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanFunctionContext booleanFunction() throws RecognitionException {
		BooleanFunctionContext _localctx = new BooleanFunctionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_booleanFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_la = _input.LA(1);
			if ( !(_la==18 || _la==37) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class TimeFunctionContext extends ParserRuleContext {
		public TimeFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).enterTimeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).exitTimeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HealthWfMSVisitor ) return ((HealthWfMSVisitor<? extends T>)visitor).visitTimeFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeFunctionContext timeFunction() throws RecognitionException {
		TimeFunctionContext _localctx = new TimeFunctionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_timeFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 24) | (1L << 34))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(HealthWfMSParser.NUMBER, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HealthWfMSVisitor ) return ((HealthWfMSVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_value);
		try {
			setState(289);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(287); match(NUMBER);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(288); object();
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

	public static class ObjectContext extends ParserRuleContext {
		public EndPointContext endPoint() {
			return getRuleContext(EndPointContext.class,0);
		}
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HealthWfMSParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(HealthWfMSParser.IDENTIFIER); }
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HealthWfMSVisitor ) return ((HealthWfMSVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_object);
		try {
			setState(296);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291); match(IDENTIFIER);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292); match(IDENTIFIER);
				setState(293); match(20);
				setState(294); match(IDENTIFIER);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(295); endPoint();
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

	public static class EndPointContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public TerminalNode LPAREN() { return getToken(HealthWfMSParser.LPAREN, 0); }
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(HealthWfMSParser.RPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HealthWfMSParser.IDENTIFIER, 0); }
		public EndPointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endPoint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).enterEndPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).exitEndPoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HealthWfMSVisitor ) return ((HealthWfMSVisitor<? extends T>)visitor).visitEndPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndPointContext endPoint() throws RecognitionException {
		EndPointContext _localctx = new EndPointContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_endPoint);
		int _la;
		try {
			setState(313);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298); match(IDENTIFIER);
				setState(299); match(LPAREN);
				setState(300); match(RPAREN);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301); match(IDENTIFIER);
				setState(302); match(LPAREN);
				setState(303); attribute();
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==19) {
					{
					{
					setState(304); match(19);
					setState(305); attribute();
					}
					}
					setState(310);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(311); match(RPAREN);
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

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HealthWfMSParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(HealthWfMSParser.IDENTIFIER); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HealthWfMSVisitor ) return ((HealthWfMSVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_attribute);
		try {
			setState(319);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315); match(IDENTIFIER);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316); match(IDENTIFIER);
				setState(317); match(20);
				setState(318); match(IDENTIFIER);
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

	public static class Numeric_entityContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(HealthWfMSParser.DECIMAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HealthWfMSParser.IDENTIFIER, 0); }
		public Numeric_entityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_entity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).enterNumeric_entity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HealthWfMSListener ) ((HealthWfMSListener)listener).exitNumeric_entity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HealthWfMSVisitor ) return ((HealthWfMSVisitor<? extends T>)visitor).visitNumeric_entity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_entityContext numeric_entity() throws RecognitionException {
		Numeric_entityContext _localctx = new Numeric_entityContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_numeric_entity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_la = _input.LA(1);
			if ( !(_la==DECIMAL || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11: return expression_sempred((ExpressionContext)_localctx, predIndex);

		case 14: return arithmetic_expr_sempred((Arithmetic_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 6);

		case 1: return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean arithmetic_expr_sempred(Arithmetic_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 7);

		case 3: return precpred(_ctx, 6);

		case 4: return precpred(_ctx, 5);

		case 5: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\66\u0146\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\6\2@\n\2"+
		"\r\2\16\2A\3\2\3\2\3\3\3\3\3\3\6\3I\n\3\r\3\16\3J\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\6\4S\n\4\r\4\16\4T\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5h\n\5\3\6\3\6\5\6l\n\6\3\7\3\7\3\7\5\7q\n\7"+
		"\3\b\3\b\3\b\6\bv\n\b\r\b\16\bw\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0080\n\t"+
		"\3\n\3\n\5\n\u0084\n\n\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u008c\n\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0096\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u009e"+
		"\n\r\f\r\16\r\u00a1\13\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00af\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\7\20\u00bd\n\20\f\20\16\20\u00c0\13\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ca\n\21\3\22\3\22\5\22\u00ce\n"+
		"\22\3\23\3\23\3\23\5\23\u00d3\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f0\n\24\3\25\3\25\5\25\u00f4\n"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\7\26\u0109\n\26\f\26\16\26\u010c\13\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5"+
		"\26\u011c\n\26\3\27\3\27\3\30\3\30\3\31\3\31\5\31\u0124\n\31\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u012b\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\7\33\u0135\n\33\f\33\16\33\u0138\13\33\3\33\3\33\5\33\u013c\n\33\3\34"+
		"\3\34\3\34\3\34\5\34\u0142\n\34\3\35\3\35\3\35\2\4\30\36\36\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\b\6\2\4\4\b\b\34"+
		"\34%%\7\2\f\f\20\20\35\36  ##\3\2,-\4\2\24\24\'\'\5\2\7\7\32\32$$\3\2"+
		"*+\u0151\2:\3\2\2\2\4E\3\2\2\2\6N\3\2\2\2\bg\3\2\2\2\nk\3\2\2\2\fp\3\2"+
		"\2\2\16u\3\2\2\2\20\177\3\2\2\2\22\u0083\3\2\2\2\24\u0085\3\2\2\2\26\u008b"+
		"\3\2\2\2\30\u0095\3\2\2\2\32\u00a2\3\2\2\2\34\u00a4\3\2\2\2\36\u00ae\3"+
		"\2\2\2 \u00c9\3\2\2\2\"\u00cd\3\2\2\2$\u00d2\3\2\2\2&\u00ef\3\2\2\2(\u00f3"+
		"\3\2\2\2*\u011b\3\2\2\2,\u011d\3\2\2\2.\u011f\3\2\2\2\60\u0123\3\2\2\2"+
		"\62\u012a\3\2\2\2\64\u013b\3\2\2\2\66\u0141\3\2\2\28\u0143\3\2\2\2:;\7"+
		"\"\2\2;<\7+\2\2<=\7\n\2\2=?\5\4\3\2>@\5\6\4\2?>\3\2\2\2@A\3\2\2\2A?\3"+
		"\2\2\2AB\3\2\2\2BC\3\2\2\2CD\7\r\2\2D\3\3\2\2\2EF\7\6\2\2FH\7\n\2\2GI"+
		"\5\16\b\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\r\2\2"+
		"M\5\3\2\2\2NO\7\22\2\2OP\7+\2\2PR\7\n\2\2QS\5\b\5\2RQ\3\2\2\2ST\3\2\2"+
		"\2TR\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\7\r\2\2W\7\3\2\2\2XY\7\31\2\2YZ\5\n"+
		"\6\2Z[\7\n\2\2[\\\5\f\7\2\\]\7\n\2\2]^\5\16\b\2^_\7\r\2\2_`\7\r\2\2`h"+
		"\3\2\2\2ab\7\31\2\2bc\5\n\6\2cd\7\n\2\2de\5\16\b\2ef\7\r\2\2fh\3\2\2\2"+
		"gX\3\2\2\2ga\3\2\2\2h\t\3\2\2\2il\5\20\t\2jl\3\2\2\2ki\3\2\2\2kj\3\2\2"+
		"\2l\13\3\2\2\2mn\7\37\2\2nq\5\30\r\2oq\3\2\2\2pm\3\2\2\2po\3\2\2\2q\r"+
		"\3\2\2\2rs\5$\23\2st\5&\24\2tv\3\2\2\2ur\3\2\2\2vw\3\2\2\2wu\3\2\2\2w"+
		"x\3\2\2\2x\17\3\2\2\2yz\7\t\2\2z\u0080\5\22\n\2{|\7\27\2\2|}\5\22\n\2"+
		"}~\5\64\33\2~\u0080\3\2\2\2\177y\3\2\2\2\177{\3\2\2\2\u0080\21\3\2\2\2"+
		"\u0081\u0084\5\24\13\2\u0082\u0084\5\26\f\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0082\3\2\2\2\u0084\23\3\2\2\2\u0085\u0086\t\2\2\2\u0086\25\3\2\2\2\u0087"+
		"\u008c\7+\2\2\u0088\u0089\7+\2\2\u0089\u008a\7\26\2\2\u008a\u008c\5\26"+
		"\f\2\u008b\u0087\3\2\2\2\u008b\u0088\3\2\2\2\u008c\27\3\2\2\2\u008d\u008e"+
		"\b\r\1\2\u008e\u0096\5*\26\2\u008f\u0096\5 \21\2\u0090\u0091\7.\2\2\u0091"+
		"\u0092\5\30\r\2\u0092\u0093\7/\2\2\u0093\u0096\3\2\2\2\u0094\u0096\5\""+
		"\22\2\u0095\u008d\3\2\2\2\u0095\u008f\3\2\2\2\u0095\u0090\3\2\2\2\u0095"+
		"\u0094\3\2\2\2\u0096\u009f\3\2\2\2\u0097\u0098\f\b\2\2\u0098\u0099\7\64"+
		"\2\2\u0099\u009e\5\30\r\t\u009a\u009b\f\7\2\2\u009b\u009c\7\65\2\2\u009c"+
		"\u009e\5\30\r\b\u009d\u0097\3\2\2\2\u009d\u009a\3\2\2\2\u009e\u00a1\3"+
		"\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\31\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00a3\5\36\20\2\u00a3\33\3\2\2\2\u00a4\u00a5\t\3"+
		"\2\2\u00a5\35\3\2\2\2\u00a6\u00a7\b\20\1\2\u00a7\u00a8\7\63\2\2\u00a8"+
		"\u00af\5\36\20\5\u00a9\u00aa\7.\2\2\u00aa\u00ab\5\36\20\2\u00ab\u00ac"+
		"\7/\2\2\u00ac\u00af\3\2\2\2\u00ad\u00af\58\35\2\u00ae\u00a6\3\2\2\2\u00ae"+
		"\u00a9\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00be\3\2\2\2\u00b0\u00b1\f\t"+
		"\2\2\u00b1\u00b2\7\60\2\2\u00b2\u00bd\5\36\20\n\u00b3\u00b4\f\b\2\2\u00b4"+
		"\u00b5\7\61\2\2\u00b5\u00bd\5\36\20\t\u00b6\u00b7\f\7\2\2\u00b7\u00b8"+
		"\7\62\2\2\u00b8\u00bd\5\36\20\b\u00b9\u00ba\f\6\2\2\u00ba\u00bb\7\63\2"+
		"\2\u00bb\u00bd\5\36\20\7\u00bc\u00b0\3\2\2\2\u00bc\u00b3\3\2\2\2\u00bc"+
		"\u00b6\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\37\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2"+
		"\5\32\16\2\u00c2\u00c3\5\34\17\2\u00c3\u00c4\5\32\16\2\u00c4\u00ca\3\2"+
		"\2\2\u00c5\u00c6\7.\2\2\u00c6\u00c7\5 \21\2\u00c7\u00c8\7/\2\2\u00c8\u00ca"+
		"\3\2\2\2\u00c9\u00c1\3\2\2\2\u00c9\u00c5\3\2\2\2\u00ca!\3\2\2\2\u00cb"+
		"\u00ce\t\4\2\2\u00cc\u00ce\7+\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2"+
		"\2\2\u00ce#\3\2\2\2\u00cf\u00d0\7\13\2\2\u00d0\u00d3\7+\2\2\u00d1\u00d3"+
		"\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3%\3\2\2\2\u00d4"+
		"\u00d5\5(\25\2\u00d5\u00d6\7\16\2\2\u00d6\u00d7\5\64\33\2\u00d7\u00f0"+
		"\3\2\2\2\u00d8\u00d9\5(\25\2\u00d9\u00da\7\16\2\2\u00da\u00db\5\64\33"+
		"\2\u00db\u00dc\7\30\2\2\u00dc\u00dd\7&\2\2\u00dd\u00de\7\30\2\2\u00de"+
		"\u00df\5\26\f\2\u00df\u00f0\3\2\2\2\u00e0\u00e1\5(\25\2\u00e1\u00e2\7"+
		"\16\2\2\u00e2\u00e3\5\64\33\2\u00e3\u00e4\7\30\2\2\u00e4\u00e5\7\17\2"+
		"\2\u00e5\u00e6\7\30\2\2\u00e6\u00e7\5\26\f\2\u00e7\u00f0\3\2\2\2\u00e8"+
		"\u00e9\5(\25\2\u00e9\u00ea\7\33\2\2\u00ea\u00f0\3\2\2\2\u00eb\u00ec\5"+
		"(\25\2\u00ec\u00ed\7\21\2\2\u00ed\u00ee\5\26\f\2\u00ee\u00f0\3\2\2\2\u00ef"+
		"\u00d4\3\2\2\2\u00ef\u00d8\3\2\2\2\u00ef\u00e0\3\2\2\2\u00ef\u00e8\3\2"+
		"\2\2\u00ef\u00eb\3\2\2\2\u00f0\'\3\2\2\2\u00f1\u00f4\7\3\2\2\u00f2\u00f4"+
		"\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4)\3\2\2\2\u00f5"+
		"\u00f6\5,\27\2\u00f6\u00f7\7.\2\2\u00f7\u00f8\5\62\32\2\u00f8\u00f9\7"+
		"/\2\2\u00f9\u011c\3\2\2\2\u00fa\u00fb\5.\30\2\u00fb\u00fc\7\26\2\2\u00fc"+
		"\u00fd\7(\2\2\u00fd\u00fe\7.\2\2\u00fe\u00ff\5\60\31\2\u00ff\u0100\7/"+
		"\2\2\u0100\u011c\3\2\2\2\u0101\u0102\5.\30\2\u0102\u0103\7\26\2\2\u0103"+
		"\u0104\7(\2\2\u0104\u0105\7.\2\2\u0105\u010a\5\60\31\2\u0106\u0107\7\25"+
		"\2\2\u0107\u0109\5\60\31\2\u0108\u0106\3\2\2\2\u0109\u010c\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u010a\3\2"+
		"\2\2\u010d\u010e\7/\2\2\u010e\u011c\3\2\2\2\u010f\u0110\5.\30\2\u0110"+
		"\u0111\7\26\2\2\u0111\u0112\7\23\2\2\u0112\u0113\7.\2\2\u0113\u0114\5"+
		"\60\31\2\u0114\u0115\7\25\2\2\u0115\u0116\5\60\31\2\u0116\u0117\7/\2\2"+
		"\u0117\u011c\3\2\2\2\u0118\u0119\7\5\2\2\u0119\u011a\7!\2\2\u011a\u011c"+
		"\5\60\31\2\u011b\u00f5\3\2\2\2\u011b\u00fa\3\2\2\2\u011b\u0101\3\2\2\2"+
		"\u011b\u010f\3\2\2\2\u011b\u0118\3\2\2\2\u011c+\3\2\2\2\u011d\u011e\t"+
		"\5\2\2\u011e-\3\2\2\2\u011f\u0120\t\6\2\2\u0120/\3\2\2\2\u0121\u0124\7"+
		")\2\2\u0122\u0124\5\62\32\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124"+
		"\61\3\2\2\2\u0125\u012b\7+\2\2\u0126\u0127\7+\2\2\u0127\u0128\7\26\2\2"+
		"\u0128\u012b\7+\2\2\u0129\u012b\5\64\33\2\u012a\u0125\3\2\2\2\u012a\u0126"+
		"\3\2\2\2\u012a\u0129\3\2\2\2\u012b\63\3\2\2\2\u012c\u012d\7+\2\2\u012d"+
		"\u012e\7.\2\2\u012e\u013c\7/\2\2\u012f\u0130\7+\2\2\u0130\u0131\7.\2\2"+
		"\u0131\u0136\5\66\34\2\u0132\u0133\7\25\2\2\u0133\u0135\5\66\34\2\u0134"+
		"\u0132\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2"+
		"\2\2\u0137\u0139\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\7/\2\2\u013a"+
		"\u013c\3\2\2\2\u013b\u012c\3\2\2\2\u013b\u012f\3\2\2\2\u013c\65\3\2\2"+
		"\2\u013d\u0142\7+\2\2\u013e\u013f\7+\2\2\u013f\u0140\7\26\2\2\u0140\u0142"+
		"\7+\2\2\u0141\u013d\3\2\2\2\u0141\u013e\3\2\2\2\u0142\67\3\2\2\2\u0143"+
		"\u0144\t\7\2\2\u01449\3\2\2\2\36AJTgkpw\177\u0083\u008b\u0095\u009d\u009f"+
		"\u00ae\u00bc\u00be\u00c9\u00cd\u00d2\u00ef\u00f3\u010a\u011b\u0123\u012a"+
		"\u0136\u013b\u0141";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}