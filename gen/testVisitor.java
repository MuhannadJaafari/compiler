// Generated from C:/Users/mo_ma/Desktop/Compiler-project/src\test.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link testParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface testVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link testParser#chat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChat(testParser.ChatContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(testParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage(testParser.MessageContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(testParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(testParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#emoticon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmoticon(testParser.EmoticonContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#link}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLink(testParser.LinkContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(testParser.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#mention}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMention(testParser.MentionContext ctx);
}