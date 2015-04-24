// Generated from Tax.g4 by ANTLR 4.4

package org.tax.taxgen;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TaxParser}.
 */
public interface TaxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TaxParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(@NotNull TaxParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaxParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(@NotNull TaxParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaxParser#questionnaire}.
	 * @param ctx the parse tree
	 */
	void enterQuestionnaire(@NotNull TaxParser.QuestionnaireContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaxParser#questionnaire}.
	 * @param ctx the parse tree
	 */
	void exitQuestionnaire(@NotNull TaxParser.QuestionnaireContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull TaxParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull TaxParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaxParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(@NotNull TaxParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaxParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(@NotNull TaxParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaxParser#questions}.
	 * @param ctx the parse tree
	 */
	void enterQuestions(@NotNull TaxParser.QuestionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaxParser#questions}.
	 * @param ctx the parse tree
	 */
	void exitQuestions(@NotNull TaxParser.QuestionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaxParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(@NotNull TaxParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaxParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(@NotNull TaxParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaxParser#questionlist}.
	 * @param ctx the parse tree
	 */
	void enterQuestionlist(@NotNull TaxParser.QuestionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaxParser#questionlist}.
	 * @param ctx the parse tree
	 */
	void exitQuestionlist(@NotNull TaxParser.QuestionlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaxParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull TaxParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaxParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull TaxParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaxParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull TaxParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaxParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull TaxParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaxParser#ifquestionlist}.
	 * @param ctx the parse tree
	 */
	void enterIfquestionlist(@NotNull TaxParser.IfquestionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaxParser#ifquestionlist}.
	 * @param ctx the parse tree
	 */
	void exitIfquestionlist(@NotNull TaxParser.IfquestionlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaxParser#nonifquestionlist}.
	 * @param ctx the parse tree
	 */
	void enterNonifquestionlist(@NotNull TaxParser.NonifquestionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaxParser#nonifquestionlist}.
	 * @param ctx the parse tree
	 */
	void exitNonifquestionlist(@NotNull TaxParser.NonifquestionlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaxParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull TaxParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaxParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull TaxParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaxParser#enumItem}.
	 * @param ctx the parse tree
	 */
	void enterEnumItem(@NotNull TaxParser.EnumItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaxParser#enumItem}.
	 * @param ctx the parse tree
	 */
	void exitEnumItem(@NotNull TaxParser.EnumItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaxParser#questionStatement}.
	 * @param ctx the parse tree
	 */
	void enterQuestionStatement(@NotNull TaxParser.QuestionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaxParser#questionStatement}.
	 * @param ctx the parse tree
	 */
	void exitQuestionStatement(@NotNull TaxParser.QuestionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaxParser#enumeration}.
	 * @param ctx the parse tree
	 */
	void enterEnumeration(@NotNull TaxParser.EnumerationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaxParser#enumeration}.
	 * @param ctx the parse tree
	 */
	void exitEnumeration(@NotNull TaxParser.EnumerationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaxParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(@NotNull TaxParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaxParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(@NotNull TaxParser.PrimitiveTypeContext ctx);
}