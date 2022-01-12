// Generated from C:/Users/mo_ma/Desktop/Compiler-project/src\test.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testParser}.
 */
public interface testListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testParser#chat}.
	 * @param ctx the parse tree
	 */
	void enterChat(testParser.ChatContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#chat}.
	 * @param ctx the parse tree
	 */
	void exitChat(testParser.ChatContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(testParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(testParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#message}.
	 * @param ctx the parse tree
	 */
	void enterMessage(testParser.MessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#message}.
	 * @param ctx the parse tree
	 */
	void exitMessage(testParser.MessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(testParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(testParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(testParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(testParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#emoticon}.
	 * @param ctx the parse tree
	 */
	void enterEmoticon(testParser.EmoticonContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#emoticon}.
	 * @param ctx the parse tree
	 */
	void exitEmoticon(testParser.EmoticonContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#link}.
	 * @param ctx the parse tree
	 */
	void enterLink(testParser.LinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#link}.
	 * @param ctx the parse tree
	 */
	void exitLink(testParser.LinkContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(testParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(testParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#mention}.
	 * @param ctx the parse tree
	 */
	void enterMention(testParser.MentionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#mention}.
	 * @param ctx the parse tree
	 */
	void exitMention(testParser.MentionContext ctx);
}