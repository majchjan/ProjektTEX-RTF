// Generated from D:/Programs/IntelliJ/saves/GitHub_majchjan/ProjektTEX-RTF/Code/src/main/java/io/github/majchjan/TEXtoRTF.g4 by ANTLR 4.13.1
package io.github.majchjan;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TEXtoRTFParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TEXtoRTFVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TEXtoRTFParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(TEXtoRTFParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEXtoRTFParser#hdr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHdr(TEXtoRTFParser.HdrContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEXtoRTFParser#cont}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCont(TEXtoRTFParser.ContContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEXtoRTFParser#sect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSect(TEXtoRTFParser.SectContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEXtoRTFParser#tkt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTkt(TEXtoRTFParser.TktContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEXtoRTFParser#lst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLst(TEXtoRTFParser.LstContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEXtoRTFParser#numbered_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumbered_list(TEXtoRTFParser.Numbered_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEXtoRTFParser#bulleted_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBulleted_list(TEXtoRTFParser.Bulleted_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEXtoRTFParser#brc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrc(TEXtoRTFParser.BrcContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEXtoRTFParser#tmn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmn(TEXtoRTFParser.TmnContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEXtoRTFParser#tmb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmb(TEXtoRTFParser.TmbContext ctx);
}