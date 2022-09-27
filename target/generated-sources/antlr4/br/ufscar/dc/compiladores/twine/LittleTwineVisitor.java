// Generated from br\u005Cufscar\dc\compiladores\twine\LittleTwine.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.twine;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LittleTwineParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LittleTwineVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LittleTwineParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(LittleTwineParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LittleTwineParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(LittleTwineParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LittleTwineParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(LittleTwineParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LittleTwineParser#id_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_reference(LittleTwineParser.Id_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link LittleTwineParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(LittleTwineParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link LittleTwineParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(LittleTwineParser.ContentContext ctx);
}