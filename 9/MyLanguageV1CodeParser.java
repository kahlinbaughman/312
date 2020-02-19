// Generated from MyLanguageV1Code.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyLanguageV1CodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ENDIF=2, PRINT=3, INT=4, DO=5, WHILE=6, PLUS=7, MINUS=8, EQUAL=9, 
		ASSIGN=10, NOTEQUAL=11, SEMICOLON=12, LPAREN=13, RPAREN=14, COMMA=15, 
		INTEGER=16, NAME=17, WS=18;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_statement = 2, RULE_dostmt = 3, 
		RULE_ifstmt = 4, RULE_multiprnt = 5, RULE_printstmt = 6, RULE_assignstmt = 7, 
		RULE_expression = 8, RULE_term = 9, RULE_identifier = 10, RULE_integer = 11;
	public static final String[] ruleNames = {
		"program", "declaration", "statement", "dostmt", "ifstmt", "multiprnt", 
		"printstmt", "assignstmt", "expression", "term", "identifier", "integer"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'endif'", "'print'", "'int'", "'do'", "'while'", "'+'", 
		"'-'", "'=='", "'='", "'!='", "';'", "'('", "')'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IF", "ENDIF", "PRINT", "INT", "DO", "WHILE", "PLUS", "MINUS", "EQUAL", 
		"ASSIGN", "NOTEQUAL", "SEMICOLON", "LPAREN", "RPAREN", "COMMA", "INTEGER", 
		"NAME", "WS"
	};
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
	public String getGrammarFileName() { return "MyLanguageV1Code.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyLanguageV1CodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("%include \"asm_io.inc\"");
			               System.out.println("segment .bss"); 
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(25);
				declaration();
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			System.out.println("segment .text");
			               System.out.println("\tglobal asm_main");
			               System.out.println("asm_main:");
			               System.out.println("\tenter 0,0");
			               System.out.println("\tpusha"); 
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << DO) | (1L << NAME))) != 0)) {
				{
				{
				setState(32);
				statement();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			System.out.println("\tpopa");
			               System.out.println("\tmov eax,0");
			               System.out.println("\tleave");
			               System.out.println("\tret"); 
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

	public static class DeclarationContext extends ParserRuleContext {
		public Token a;
		public TerminalNode INT() { return getToken(MyLanguageV1CodeParser.INT, 0); }
		public TerminalNode SEMICOLON() { return getToken(MyLanguageV1CodeParser.SEMICOLON, 0); }
		public TerminalNode NAME() { return getToken(MyLanguageV1CodeParser.NAME, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			int a; 
			setState(41);
			match(INT);
			setState(42);
			((DeclarationContext)_localctx).a = match(NAME);
			setState(43);
			match(SEMICOLON);
			System.out.println("\t"+(((DeclarationContext)_localctx).a!=null?((DeclarationContext)_localctx).a.getText():null) + "  resd 1");
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
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public PrintstmtContext printstmt() {
			return getRuleContext(PrintstmtContext.class,0);
		}
		public AssignstmtContext assignstmt() {
			return getRuleContext(AssignstmtContext.class,0);
		}
		public DostmtContext dostmt() {
			return getRuleContext(DostmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				ifstmt();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				printstmt();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				assignstmt();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				dostmt();
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

	public static class DostmtContext extends ParserRuleContext {
		public Token DO;
		public IdentifierContext a;
		public IntegerContext b;
		public TerminalNode DO() { return getToken(MyLanguageV1CodeParser.DO, 0); }
		public TerminalNode WHILE() { return getToken(MyLanguageV1CodeParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(MyLanguageV1CodeParser.LPAREN, 0); }
		public TerminalNode NOTEQUAL() { return getToken(MyLanguageV1CodeParser.NOTEQUAL, 0); }
		public TerminalNode RPAREN() { return getToken(MyLanguageV1CodeParser.RPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DostmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dostmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterDostmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitDostmt(this);
		}
	}

	public final DostmtContext dostmt() throws RecognitionException {
		DostmtContext _localctx = new DostmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dostmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			int a,b;
			String label;
			setState(54);
			((DostmtContext)_localctx).DO = match(DO);
			label = "label_"+Integer.toString((((DostmtContext)_localctx).DO!=null?((DostmtContext)_localctx).DO.getTokenIndex():0));
				         System.out.println(label+":");
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << DO) | (1L << NAME))) != 0)) {
				{
				{
				setState(56);
				statement();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(WHILE);
			setState(63);
			match(LPAREN);
			setState(64);
			((DostmtContext)_localctx).a = identifier();
			setState(65);
			match(NOTEQUAL);
			setState(66);
			((DostmtContext)_localctx).b = integer();
			setState(67);
			match(RPAREN);
			System.out.println("\tcmp dword "+((DostmtContext)_localctx).a.toString+","+((DostmtContext)_localctx).b.toString);
			             System.out.println("\tjnz "+label); 
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

	public static class IfstmtContext extends ParserRuleContext {
		public Token IF;
		public IdentifierContext a;
		public IntegerContext b;
		public TerminalNode IF() { return getToken(MyLanguageV1CodeParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(MyLanguageV1CodeParser.LPAREN, 0); }
		public TerminalNode EQUAL() { return getToken(MyLanguageV1CodeParser.EQUAL, 0); }
		public TerminalNode RPAREN() { return getToken(MyLanguageV1CodeParser.RPAREN, 0); }
		public TerminalNode ENDIF() { return getToken(MyLanguageV1CodeParser.ENDIF, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitIfstmt(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			int a,b;
			String label;
			setState(72);
			((IfstmtContext)_localctx).IF = match(IF);
			setState(73);
			match(LPAREN);
			setState(74);
			((IfstmtContext)_localctx).a = identifier();
			setState(75);
			match(EQUAL);
			setState(76);
			((IfstmtContext)_localctx).b = integer();
			setState(77);
			match(RPAREN);
			System.out.println("\tcmp dword "+((IfstmtContext)_localctx).a.toString+","+((IfstmtContext)_localctx).b.toString);
			             label = "label_"+Integer.toString((((IfstmtContext)_localctx).IF!=null?((IfstmtContext)_localctx).IF.getTokenIndex():0));
			             System.out.println("\tjnz "+label); 
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << DO) | (1L << NAME))) != 0)) {
				{
				{
				setState(79);
				statement();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 System.out.println(label+":"); 
			setState(86);
			match(ENDIF);
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

	public static class MultiprntContext extends ParserRuleContext {
		public TermContext term;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(MyLanguageV1CodeParser.COMMA, 0); }
		public MultiprntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiprnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterMultiprnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitMultiprnt(this);
		}
	}

	public final MultiprntContext multiprnt() throws RecognitionException {
		MultiprntContext _localctx = new MultiprntContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_multiprnt);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				((MultiprntContext)_localctx).term = term();
				setState(89);
				match(COMMA);
				System.out.println("\tmov eax, "+((MultiprntContext)_localctx).term.toString);
				                 System.out.println("\tcall print_int");
				                 System.out.println("\tcall print_nl");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				((MultiprntContext)_localctx).term = term();
				System.out.println("\tmov eax, "+((MultiprntContext)_localctx).term.toString);
				                 System.out.println("\tcall print_int");
				                 System.out.println("\tcall print_nl");
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

	public static class PrintstmtContext extends ParserRuleContext {
		public TermContext term;
		public TerminalNode PRINT() { return getToken(MyLanguageV1CodeParser.PRINT, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MyLanguageV1CodeParser.SEMICOLON, 0); }
		public List<MultiprntContext> multiprnt() {
			return getRuleContexts(MultiprntContext.class);
		}
		public MultiprntContext multiprnt(int i) {
			return getRuleContext(MultiprntContext.class,i);
		}
		public PrintstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterPrintstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitPrintstmt(this);
		}
	}

	public final PrintstmtContext printstmt() throws RecognitionException {
		PrintstmtContext _localctx = new PrintstmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_printstmt);
		int _la;
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(PRINT);
				setState(98);
				((PrintstmtContext)_localctx).term = term();
				setState(99);
				match(SEMICOLON);
				System.out.println("\tmov eax, "+((PrintstmtContext)_localctx).term.toString);
				                System.out.println("\tcall print_int");
				                System.out.println("\tcall print_nl");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(PRINT);
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(103);
					multiprnt();
					}
					}
					setState(106); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INTEGER || _la==NAME );
				setState(108);
				match(SEMICOLON);
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

	public static class AssignstmtContext extends ParserRuleContext {
		public Token a;
		public TerminalNode ASSIGN() { return getToken(MyLanguageV1CodeParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MyLanguageV1CodeParser.SEMICOLON, 0); }
		public TerminalNode NAME() { return getToken(MyLanguageV1CodeParser.NAME, 0); }
		public AssignstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterAssignstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitAssignstmt(this);
		}
	}

	public final AssignstmtContext assignstmt() throws RecognitionException {
		AssignstmtContext _localctx = new AssignstmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			int a; 
			setState(113);
			((AssignstmtContext)_localctx).a = match(NAME);
			setState(114);
			match(ASSIGN);
			setState(115);
			expression();
			setState(116);
			match(SEMICOLON);
			System.out.println("\tmov ["+(((AssignstmtContext)_localctx).a!=null?((AssignstmtContext)_localctx).a.getText():null)+"], eax");
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
		public TermContext a;
		public TermContext b;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(MyLanguageV1CodeParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MyLanguageV1CodeParser.MINUS, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expression);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				int a,b; 
				setState(120);
				((ExpressionContext)_localctx).a = term();
				System.out.println("\tmov eax,"+((ExpressionContext)_localctx).a.toString);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				((ExpressionContext)_localctx).a = term();
				setState(124);
				match(PLUS);
				setState(125);
				((ExpressionContext)_localctx).b = term();
				System.out.println("\tmov eax,"+((ExpressionContext)_localctx).a.toString);
				System.out.println("\tadd eax,"+((ExpressionContext)_localctx).b.toString);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				((ExpressionContext)_localctx).a = term();
				setState(130);
				match(MINUS);
				setState(131);
				((ExpressionContext)_localctx).b = term();
				System.out.println("\tmov eax,"+((ExpressionContext)_localctx).a.toString);
				System.out.println("\tsub eax,"+((ExpressionContext)_localctx).b.toString);
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

	public static class TermContext extends ParserRuleContext {
		public String toString;
		public IdentifierContext identifier;
		public IntegerContext integer;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_term);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				((TermContext)_localctx).identifier = identifier();
				((TermContext)_localctx).toString =  ((TermContext)_localctx).identifier.toString;
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				((TermContext)_localctx).integer = integer();
				((TermContext)_localctx).toString =  ((TermContext)_localctx).integer.toString;
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

	public static class IdentifierContext extends ParserRuleContext {
		public String toString;
		public Token NAME;
		public TerminalNode NAME() { return getToken(MyLanguageV1CodeParser.NAME, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			((IdentifierContext)_localctx).NAME = match(NAME);
			((IdentifierContext)_localctx).toString =  "["+(((IdentifierContext)_localctx).NAME!=null?((IdentifierContext)_localctx).NAME.getText():null)+"]";
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

	public static class IntegerContext extends ParserRuleContext {
		public String toString;
		public Token INTEGER;
		public TerminalNode INTEGER() { return getToken(MyLanguageV1CodeParser.INTEGER, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageV1CodeListener ) ((MyLanguageV1CodeListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			((IntegerContext)_localctx).INTEGER = match(INTEGER);
			((IntegerContext)_localctx).toString =  (((IntegerContext)_localctx).INTEGER!=null?((IntegerContext)_localctx).INTEGER.getText():null);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24\u009a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\3\2\7\2$\n"+
		"\2\f\2\16\2\'\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4"+
		"\65\n\4\3\5\3\5\3\5\3\5\3\5\7\5<\n\5\f\5\16\5?\13\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6S\n\6\f\6\16"+
		"\6V\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7b\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\6\bk\n\b\r\b\16\bl\3\b\3\b\5\bq\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u008a\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0092\n\13\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2\u009a"+
		"\2\32\3\2\2\2\4*\3\2\2\2\6\64\3\2\2\2\b\66\3\2\2\2\nH\3\2\2\2\fa\3\2\2"+
		"\2\16p\3\2\2\2\20r\3\2\2\2\22\u0089\3\2\2\2\24\u0091\3\2\2\2\26\u0093"+
		"\3\2\2\2\30\u0096\3\2\2\2\32\36\b\2\1\2\33\35\5\4\3\2\34\33\3\2\2\2\35"+
		" \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \36\3\2\2\2!%\b\2\1"+
		"\2\"$\5\6\4\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3"+
		"\2\2\2()\b\2\1\2)\3\3\2\2\2*+\b\3\1\2+,\7\6\2\2,-\7\23\2\2-.\7\16\2\2"+
		"./\b\3\1\2/\5\3\2\2\2\60\65\5\n\6\2\61\65\5\16\b\2\62\65\5\20\t\2\63\65"+
		"\5\b\5\2\64\60\3\2\2\2\64\61\3\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65\7"+
		"\3\2\2\2\66\67\b\5\1\2\678\b\5\1\289\7\7\2\29=\b\5\1\2:<\5\6\4\2;:\3\2"+
		"\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7\b\2\2AB\7\17"+
		"\2\2BC\5\26\f\2CD\7\r\2\2DE\5\30\r\2EF\7\20\2\2FG\b\5\1\2G\t\3\2\2\2H"+
		"I\b\6\1\2IJ\b\6\1\2JK\7\3\2\2KL\7\17\2\2LM\5\26\f\2MN\7\13\2\2NO\5\30"+
		"\r\2OP\7\20\2\2PT\b\6\1\2QS\5\6\4\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3"+
		"\2\2\2UW\3\2\2\2VT\3\2\2\2WX\b\6\1\2XY\7\4\2\2Y\13\3\2\2\2Z[\5\24\13\2"+
		"[\\\7\21\2\2\\]\b\7\1\2]b\3\2\2\2^_\5\24\13\2_`\b\7\1\2`b\3\2\2\2aZ\3"+
		"\2\2\2a^\3\2\2\2b\r\3\2\2\2cd\7\5\2\2de\5\24\13\2ef\7\16\2\2fg\b\b\1\2"+
		"gq\3\2\2\2hj\7\5\2\2ik\5\f\7\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2"+
		"mn\3\2\2\2no\7\16\2\2oq\3\2\2\2pc\3\2\2\2ph\3\2\2\2q\17\3\2\2\2rs\b\t"+
		"\1\2st\7\23\2\2tu\7\f\2\2uv\5\22\n\2vw\7\16\2\2wx\b\t\1\2x\21\3\2\2\2"+
		"yz\b\n\1\2z{\5\24\13\2{|\b\n\1\2|\u008a\3\2\2\2}~\5\24\13\2~\177\7\t\2"+
		"\2\177\u0080\5\24\13\2\u0080\u0081\b\n\1\2\u0081\u0082\b\n\1\2\u0082\u008a"+
		"\3\2\2\2\u0083\u0084\5\24\13\2\u0084\u0085\7\n\2\2\u0085\u0086\5\24\13"+
		"\2\u0086\u0087\b\n\1\2\u0087\u0088\b\n\1\2\u0088\u008a\3\2\2\2\u0089y"+
		"\3\2\2\2\u0089}\3\2\2\2\u0089\u0083\3\2\2\2\u008a\23\3\2\2\2\u008b\u008c"+
		"\5\26\f\2\u008c\u008d\b\13\1\2\u008d\u0092\3\2\2\2\u008e\u008f\5\30\r"+
		"\2\u008f\u0090\b\13\1\2\u0090\u0092\3\2\2\2\u0091\u008b\3\2\2\2\u0091"+
		"\u008e\3\2\2\2\u0092\25\3\2\2\2\u0093\u0094\7\23\2\2\u0094\u0095\b\f\1"+
		"\2\u0095\27\3\2\2\2\u0096\u0097\7\22\2\2\u0097\u0098\b\r\1\2\u0098\31"+
		"\3\2\2\2\f\36%\64=Talp\u0089\u0091";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}