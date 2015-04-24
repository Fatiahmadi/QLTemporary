// Generated from Expr.g4 by ANTLR 4.4

package org.tax.exprgen;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code LITExpr}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLITExpr(@NotNull ExprParser.LITExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LITExpr}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLITExpr(@NotNull ExprParser.LITExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ANDExpr}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterANDExpr(@NotNull ExprParser.ANDExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ANDExpr}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitANDExpr(@NotNull ExprParser.ANDExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ADDSUBExpr}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterADDSUBExpr(@NotNull ExprParser.ADDSUBExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ADDSUBExpr}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitADDSUBExpr(@NotNull ExprParser.ADDSUBExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DECIMALLiteral}
	 * labeled alternative in {@link ExprParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterDECIMALLiteral(@NotNull ExprParser.DECIMALLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DECIMALLiteral}
	 * labeled alternative in {@link ExprParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitDECIMALLiteral(@NotNull ExprParser.DECIMALLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INTLiteral}
	 * labeled alternative in {@link ExprParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterINTLiteral(@NotNull ExprParser.INTLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code INTLiteral}
	 * labeled alternative in {@link ExprParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitINTLiteral(@NotNull ExprParser.INTLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BANGExpr}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBANGExpr(@NotNull ExprParser.BANGExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BANGExpr}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBANGExpr(@NotNull ExprParser.BANGExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ORExpr}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterORExpr(@NotNull ExprParser.ORExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ORExpr}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitORExpr(@NotNull ExprParser.ORExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COMPExpr}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCOMPExpr(@NotNull ExprParser.COMPExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COMPExpr}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCOMPExpr(@NotNull ExprParser.COMPExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarLiteral}
	 * labeled alternative in {@link ExprParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterVarLiteral(@NotNull ExprParser.VarLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarLiteral}
	 * labeled alternative in {@link ExprParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitVarLiteral(@NotNull ExprParser.VarLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PARExpr}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPARExpr(@NotNull ExprParser.PARExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PARExpr}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPARExpr(@NotNull ExprParser.PARExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EQUALExpr}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEQUALExpr(@NotNull ExprParser.EQUALExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EQUALExpr}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEQUALExpr(@NotNull ExprParser.EQUALExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BOOLLiteral}
	 * labeled alternative in {@link ExprParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBOOLLiteral(@NotNull ExprParser.BOOLLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BOOLLiteral}
	 * labeled alternative in {@link ExprParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBOOLLiteral(@NotNull ExprParser.BOOLLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#myexpr}.
	 * @param ctx the parse tree
	 */
	void enterMyexpr(@NotNull ExprParser.MyexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#myexpr}.
	 * @param ctx the parse tree
	 */
	void exitMyexpr(@NotNull ExprParser.MyexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull ExprParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull ExprParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MULDIVExpr}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMULDIVExpr(@NotNull ExprParser.MULDIVExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MULDIVExpr}
	 * labeled alternative in {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMULDIVExpr(@NotNull ExprParser.MULDIVExprContext ctx);
}