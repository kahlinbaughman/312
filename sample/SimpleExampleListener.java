// Generated from SimpleExample.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleExampleParser}.
 */
public interface SimpleExampleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleExampleParser#greeting}.
	 * @param ctx the parse tree
	 */
	void enterGreeting(SimpleExampleParser.GreetingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExampleParser#greeting}.
	 * @param ctx the parse tree
	 */
	void exitGreeting(SimpleExampleParser.GreetingContext ctx);
}