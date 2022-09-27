// Generated from br\u005Cufscar\dc\compiladores\twine\LittleTwine.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.twine;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LittleTwineParser}.
 */
public interface LittleTwineListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LittleTwineParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(LittleTwineParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleTwineParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(LittleTwineParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleTwineParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(LittleTwineParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleTwineParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(LittleTwineParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleTwineParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LittleTwineParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleTwineParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LittleTwineParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleTwineParser#id_reference}.
	 * @param ctx the parse tree
	 */
	void enterId_reference(LittleTwineParser.Id_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleTwineParser#id_reference}.
	 * @param ctx the parse tree
	 */
	void exitId_reference(LittleTwineParser.Id_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleTwineParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(LittleTwineParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleTwineParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(LittleTwineParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link LittleTwineParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(LittleTwineParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LittleTwineParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(LittleTwineParser.ContentContext ctx);
}