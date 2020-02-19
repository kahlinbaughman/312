// Generated from MyLanguageV1Code.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyLanguageV1CodeParser}.
 */
public interface MyLanguageV1CodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MyLanguageV1CodeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MyLanguageV1CodeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(MyLanguageV1CodeParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(MyLanguageV1CodeParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MyLanguageV1CodeParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MyLanguageV1CodeParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#dostmt}.
	 * @param ctx the parse tree
	 */
	void enterDostmt(MyLanguageV1CodeParser.DostmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#dostmt}.
	 * @param ctx the parse tree
	 */
	void exitDostmt(MyLanguageV1CodeParser.DostmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(MyLanguageV1CodeParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(MyLanguageV1CodeParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#multiprnt}.
	 * @param ctx the parse tree
	 */
	void enterMultiprnt(MyLanguageV1CodeParser.MultiprntContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#multiprnt}.
	 * @param ctx the parse tree
	 */
	void exitMultiprnt(MyLanguageV1CodeParser.MultiprntContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintstmt(MyLanguageV1CodeParser.PrintstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintstmt(MyLanguageV1CodeParser.PrintstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#assignstmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignstmt(MyLanguageV1CodeParser.AssignstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#assignstmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignstmt(MyLanguageV1CodeParser.AssignstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MyLanguageV1CodeParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MyLanguageV1CodeParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(MyLanguageV1CodeParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(MyLanguageV1CodeParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(MyLanguageV1CodeParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(MyLanguageV1CodeParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageV1CodeParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(MyLanguageV1CodeParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageV1CodeParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(MyLanguageV1CodeParser.IntegerContext ctx);
}