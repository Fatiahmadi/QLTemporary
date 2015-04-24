// Generated from Common.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CommonParser}.
 */
public interface CommonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CommonParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull CommonParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull CommonParser.VariableContext ctx);
}