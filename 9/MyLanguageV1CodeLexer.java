// Generated from MyLanguageV1Code.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyLanguageV1CodeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ENDIF=2, PRINT=3, INT=4, DO=5, WHILE=6, PLUS=7, MINUS=8, EQUAL=9, 
		ASSIGN=10, NOTEQUAL=11, SEMICOLON=12, LPAREN=13, RPAREN=14, COMMA=15, 
		INTEGER=16, NAME=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IF", "ENDIF", "PRINT", "INT", "DO", "WHILE", "PLUS", "MINUS", "EQUAL", 
		"ASSIGN", "NOTEQUAL", "SEMICOLON", "LPAREN", "RPAREN", "COMMA", "INTEGER", 
		"NAME", "WS"
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


	public MyLanguageV1CodeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyLanguageV1Code.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24j\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\7\21Z\n\21\f\21\16\21]\13\21\3\22\6\22`\n\22\r\22\16\22a\3"+
		"\23\6\23e\n\23\r\23\16\23f\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\5\3\2"+
		"\62;\3\2c|\5\2\13\f\17\17\"\"\2l\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5*\3\2\2\2"+
		"\7\60\3\2\2\2\t\66\3\2\2\2\13:\3\2\2\2\r=\3\2\2\2\17C\3\2\2\2\21E\3\2"+
		"\2\2\23G\3\2\2\2\25J\3\2\2\2\27L\3\2\2\2\31O\3\2\2\2\33Q\3\2\2\2\35S\3"+
		"\2\2\2\37U\3\2\2\2!W\3\2\2\2#_\3\2\2\2%d\3\2\2\2\'(\7k\2\2()\7h\2\2)\4"+
		"\3\2\2\2*+\7g\2\2+,\7p\2\2,-\7f\2\2-.\7k\2\2./\7h\2\2/\6\3\2\2\2\60\61"+
		"\7r\2\2\61\62\7t\2\2\62\63\7k\2\2\63\64\7p\2\2\64\65\7v\2\2\65\b\3\2\2"+
		"\2\66\67\7k\2\2\678\7p\2\289\7v\2\29\n\3\2\2\2:;\7f\2\2;<\7q\2\2<\f\3"+
		"\2\2\2=>\7y\2\2>?\7j\2\2?@\7k\2\2@A\7n\2\2AB\7g\2\2B\16\3\2\2\2CD\7-\2"+
		"\2D\20\3\2\2\2EF\7/\2\2F\22\3\2\2\2GH\7?\2\2HI\7?\2\2I\24\3\2\2\2JK\7"+
		"?\2\2K\26\3\2\2\2LM\7#\2\2MN\7?\2\2N\30\3\2\2\2OP\7=\2\2P\32\3\2\2\2Q"+
		"R\7*\2\2R\34\3\2\2\2ST\7+\2\2T\36\3\2\2\2UV\7.\2\2V \3\2\2\2W[\t\2\2\2"+
		"XZ\t\2\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\"\3\2\2\2][\3\2"+
		"\2\2^`\t\3\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2b$\3\2\2\2ce\t\4"+
		"\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\b\23\2\2i&\3"+
		"\2\2\2\6\2[af\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}