// Generated from br\u005Cufscar\dc\compiladores\twine\LittleTwine.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.twine;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LittleTwineLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, IDENT=6, CADEIA=7, CADEIA_CONTEUDO=8, 
		ENDL=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "ALGARISMO", "LETRA", "IDENT", 
			"CADEIA", "CADEIA_CONTEUDO", "ENDL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'@'", "'->'", "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "IDENT", "CADEIA", "CADEIA_CONTEUDO", 
			"ENDL"
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

	void erroLexico(String msg) { throw new ParseCancellationException(msg); }

	public LittleTwineLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LittleTwine.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13F\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\5\t+\n\t\3\t\3\t\3\t\7\t\60\n\t\f\t\16\t\63\13\t\3\n\3\n\7"+
		"\n\67\n\n\f\n\16\n:\13\n\3\n\3\n\3\13\7\13?\n\13\f\13\16\13B\13\13\3\f"+
		"\5\fE\n\f\2\2\r\3\3\5\4\7\5\t\6\13\7\r\2\17\2\21\b\23\t\25\n\27\13\3\2"+
		"\6\4\2C\\c|\5\2\f\f\17\17$$\7\2%%*+//@@BB\4\2\13\f\17\17\2I\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5\33\3\2\2\2\7\35\3\2"+
		"\2\2\t\37\3\2\2\2\13\"\3\2\2\2\r$\3\2\2\2\17&\3\2\2\2\21*\3\2\2\2\23\64"+
		"\3\2\2\2\25@\3\2\2\2\27D\3\2\2\2\31\32\7*\2\2\32\4\3\2\2\2\33\34\7+\2"+
		"\2\34\6\3\2\2\2\35\36\7B\2\2\36\b\3\2\2\2\37 \7/\2\2 !\7@\2\2!\n\3\2\2"+
		"\2\"#\7%\2\2#\f\3\2\2\2$%\4\62;\2%\16\3\2\2\2&\'\t\2\2\2\'\20\3\2\2\2"+
		"(+\5\17\b\2)+\7a\2\2*(\3\2\2\2*)\3\2\2\2+\61\3\2\2\2,\60\7a\2\2-\60\5"+
		"\r\7\2.\60\5\17\b\2/,\3\2\2\2/-\3\2\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3"+
		"\2\2\2\61\62\3\2\2\2\62\22\3\2\2\2\63\61\3\2\2\2\648\7$\2\2\65\67\n\3"+
		"\2\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2"+
		"\2;<\7$\2\2<\24\3\2\2\2=?\n\4\2\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2"+
		"\2\2A\26\3\2\2\2B@\3\2\2\2CE\t\5\2\2DC\3\2\2\2E\30\3\2\2\2\t\2*/\618@"+
		"D\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}