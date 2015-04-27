// Generated from Grammar.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(GrammarParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(GrammarParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MULDIVExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMULDIVExpr(GrammarParser.MULDIVExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MULDIVExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMULDIVExpr(GrammarParser.MULDIVExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EQUALExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEQUALExpr(GrammarParser.EQUALExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EQUALExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEQUALExpr(GrammarParser.EQUALExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ANDExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterANDExpr(GrammarParser.ANDExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ANDExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitANDExpr(GrammarParser.ANDExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LITExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLITExpr(GrammarParser.LITExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LITExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLITExpr(GrammarParser.LITExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ADDSUBExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterADDSUBExpr(GrammarParser.ADDSUBExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ADDSUBExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitADDSUBExpr(GrammarParser.ADDSUBExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ORExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterORExpr(GrammarParser.ORExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ORExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitORExpr(GrammarParser.ORExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COMPExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCOMPExpr(GrammarParser.COMPExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COMPExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCOMPExpr(GrammarParser.COMPExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PARExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPARExpr(GrammarParser.PARExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PARExpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPARExpr(GrammarParser.PARExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#myexpr}.
	 * @param ctx the parse tree
	 */
	void enterMyexpr(GrammarParser.MyexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#myexpr}.
	 * @param ctx the parse tree
	 */
	void exitMyexpr(GrammarParser.MyexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(GrammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(GrammarParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(GrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(GrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#questionnaire}.
	 * @param ctx the parse tree
	 */
	void enterQuestionnaire(GrammarParser.QuestionnaireContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#questionnaire}.
	 * @param ctx the parse tree
	 */
	void exitQuestionnaire(GrammarParser.QuestionnaireContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#questions}.
	 * @param ctx the parse tree
	 */
	void enterQuestions(GrammarParser.QuestionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#questions}.
	 * @param ctx the parse tree
	 */
	void exitQuestions(GrammarParser.QuestionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#nonifquestionlist}.
	 * @param ctx the parse tree
	 */
	void enterNonifquestionlist(GrammarParser.NonifquestionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#nonifquestionlist}.
	 * @param ctx the parse tree
	 */
	void exitNonifquestionlist(GrammarParser.NonifquestionlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#questionlist}.
	 * @param ctx the parse tree
	 */
	void enterQuestionlist(GrammarParser.QuestionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#questionlist}.
	 * @param ctx the parse tree
	 */
	void exitQuestionlist(GrammarParser.QuestionlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ifquestionlist}.
	 * @param ctx the parse tree
	 */
	void enterIfquestionlist(GrammarParser.IfquestionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ifquestionlist}.
	 * @param ctx the parse tree
	 */
	void exitIfquestionlist(GrammarParser.IfquestionlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(GrammarParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(GrammarParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#questionStatement}.
	 * @param ctx the parse tree
	 */
	void enterQuestionStatement(GrammarParser.QuestionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#questionStatement}.
	 * @param ctx the parse tree
	 */
	void exitQuestionStatement(GrammarParser.QuestionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(GrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(GrammarParser.PrimitiveTypeContext ctx);
}