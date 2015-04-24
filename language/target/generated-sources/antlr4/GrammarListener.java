// Generated from Grammar.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code LITExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLITExpr(@NotNull GrammarParser.LITExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LITExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLITExpr(@NotNull GrammarParser.LITExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ANDExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterANDExpr(@NotNull GrammarParser.ANDExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ANDExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitANDExpr(@NotNull GrammarParser.ANDExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#questionnaire}.
	 * @param ctx the parse tree
	 */
	void enterQuestionnaire(@NotNull GrammarParser.QuestionnaireContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#questionnaire}.
	 * @param ctx the parse tree
	 */
	void exitQuestionnaire(@NotNull GrammarParser.QuestionnaireContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ADDSUBExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterADDSUBExpr(@NotNull GrammarParser.ADDSUBExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ADDSUBExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitADDSUBExpr(@NotNull GrammarParser.ADDSUBExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(@NotNull GrammarParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(@NotNull GrammarParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#questions}.
	 * @param ctx the parse tree
	 */
	void enterQuestions(@NotNull GrammarParser.QuestionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#questions}.
	 * @param ctx the parse tree
	 */
	void exitQuestions(@NotNull GrammarParser.QuestionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ORExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterORExpr(@NotNull GrammarParser.ORExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ORExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitORExpr(@NotNull GrammarParser.ORExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COMPExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCOMPExpr(@NotNull GrammarParser.COMPExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COMPExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCOMPExpr(@NotNull GrammarParser.COMPExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#questionlist}.
	 * @param ctx the parse tree
	 */
	void enterQuestionlist(@NotNull GrammarParser.QuestionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#questionlist}.
	 * @param ctx the parse tree
	 */
	void exitQuestionlist(@NotNull GrammarParser.QuestionlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull GrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull GrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull GrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull GrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull GrammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull GrammarParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PARExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPARExpr(@NotNull GrammarParser.PARExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PARExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPARExpr(@NotNull GrammarParser.PARExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EQUALExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEQUALExpr(@NotNull GrammarParser.EQUALExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EQUALExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEQUALExpr(@NotNull GrammarParser.EQUALExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ifquestionlist}.
	 * @param ctx the parse tree
	 */
	void enterIfquestionlist(@NotNull GrammarParser.IfquestionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ifquestionlist}.
	 * @param ctx the parse tree
	 */
	void exitIfquestionlist(@NotNull GrammarParser.IfquestionlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#nonifquestionlist}.
	 * @param ctx the parse tree
	 */
	void enterNonifquestionlist(@NotNull GrammarParser.NonifquestionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#nonifquestionlist}.
	 * @param ctx the parse tree
	 */
	void exitNonifquestionlist(@NotNull GrammarParser.NonifquestionlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull GrammarParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull GrammarParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#myexpr}.
	 * @param ctx the parse tree
	 */
	void enterMyexpr(@NotNull GrammarParser.MyexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#myexpr}.
	 * @param ctx the parse tree
	 */
	void exitMyexpr(@NotNull GrammarParser.MyexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#questionStatement}.
	 * @param ctx the parse tree
	 */
	void enterQuestionStatement(@NotNull GrammarParser.QuestionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#questionStatement}.
	 * @param ctx the parse tree
	 */
	void exitQuestionStatement(@NotNull GrammarParser.QuestionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MULDIVExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMULDIVExpr(@NotNull GrammarParser.MULDIVExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MULDIVExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMULDIVExpr(@NotNull GrammarParser.MULDIVExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(@NotNull GrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(@NotNull GrammarParser.PrimitiveTypeContext ctx);
}