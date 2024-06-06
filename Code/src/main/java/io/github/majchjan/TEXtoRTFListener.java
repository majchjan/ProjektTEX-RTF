// Generated from D:/Programs/IntelliJ/saves/GitHub_majchjan/ProjektTEX-RTF/Code/src/main/java/io/github/majchjan/TEXtoRTF.g4 by ANTLR 4.13.1
package io.github.majchjan;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TEXtoRTFParser}.
 */
public interface TEXtoRTFListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TEXtoRTFParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(TEXtoRTFParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEXtoRTFParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(TEXtoRTFParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEXtoRTFParser#hdr}.
	 * @param ctx the parse tree
	 */
	void enterHdr(TEXtoRTFParser.HdrContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEXtoRTFParser#hdr}.
	 * @param ctx the parse tree
	 */
	void exitHdr(TEXtoRTFParser.HdrContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEXtoRTFParser#cont}.
	 * @param ctx the parse tree
	 */
	void enterCont(TEXtoRTFParser.ContContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEXtoRTFParser#cont}.
	 * @param ctx the parse tree
	 */
	void exitCont(TEXtoRTFParser.ContContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEXtoRTFParser#sect}.
	 * @param ctx the parse tree
	 */
	void enterSect(TEXtoRTFParser.SectContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEXtoRTFParser#sect}.
	 * @param ctx the parse tree
	 */
	void exitSect(TEXtoRTFParser.SectContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEXtoRTFParser#tkt}.
	 * @param ctx the parse tree
	 */
	void enterTkt(TEXtoRTFParser.TktContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEXtoRTFParser#tkt}.
	 * @param ctx the parse tree
	 */
	void exitTkt(TEXtoRTFParser.TktContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEXtoRTFParser#lst}.
	 * @param ctx the parse tree
	 */
	void enterLst(TEXtoRTFParser.LstContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEXtoRTFParser#lst}.
	 * @param ctx the parse tree
	 */
	void exitLst(TEXtoRTFParser.LstContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEXtoRTFParser#numbered_list}.
	 * @param ctx the parse tree
	 */
	void enterNumbered_list(TEXtoRTFParser.Numbered_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEXtoRTFParser#numbered_list}.
	 * @param ctx the parse tree
	 */
	void exitNumbered_list(TEXtoRTFParser.Numbered_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEXtoRTFParser#bulleted_list}.
	 * @param ctx the parse tree
	 */
	void enterBulleted_list(TEXtoRTFParser.Bulleted_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEXtoRTFParser#bulleted_list}.
	 * @param ctx the parse tree
	 */
	void exitBulleted_list(TEXtoRTFParser.Bulleted_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEXtoRTFParser#brc}.
	 * @param ctx the parse tree
	 */
	void enterBrc(TEXtoRTFParser.BrcContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEXtoRTFParser#brc}.
	 * @param ctx the parse tree
	 */
	void exitBrc(TEXtoRTFParser.BrcContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEXtoRTFParser#tmn}.
	 * @param ctx the parse tree
	 */
	void enterTmn(TEXtoRTFParser.TmnContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEXtoRTFParser#tmn}.
	 * @param ctx the parse tree
	 */
	void exitTmn(TEXtoRTFParser.TmnContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEXtoRTFParser#tmb}.
	 * @param ctx the parse tree
	 */
	void enterTmb(TEXtoRTFParser.TmbContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEXtoRTFParser#tmb}.
	 * @param ctx the parse tree
	 */
	void exitTmb(TEXtoRTFParser.TmbContext ctx);
}