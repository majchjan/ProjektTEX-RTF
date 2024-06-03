// Generated from D:/Programs/IntelliJ/saves/GitHub_majchjan/ProjektTEX-RTF/Code/g.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gParser}.
 */
public interface gListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(gParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(gParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#hdr}.
	 * @param ctx the parse tree
	 */
	void enterHdr(gParser.HdrContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#hdr}.
	 * @param ctx the parse tree
	 */
	void exitHdr(gParser.HdrContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#cont}.
	 * @param ctx the parse tree
	 */
	void enterCont(gParser.ContContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#cont}.
	 * @param ctx the parse tree
	 */
	void exitCont(gParser.ContContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#sect}.
	 * @param ctx the parse tree
	 */
	void enterSect(gParser.SectContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#sect}.
	 * @param ctx the parse tree
	 */
	void exitSect(gParser.SectContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#tkt}.
	 * @param ctx the parse tree
	 */
	void enterTkt(gParser.TktContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#tkt}.
	 * @param ctx the parse tree
	 */
	void exitTkt(gParser.TktContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#lst}.
	 * @param ctx the parse tree
	 */
	void enterLst(gParser.LstContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#lst}.
	 * @param ctx the parse tree
	 */
	void exitLst(gParser.LstContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#brc}.
	 * @param ctx the parse tree
	 */
	void enterBrc(gParser.BrcContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#brc}.
	 * @param ctx the parse tree
	 */
	void exitBrc(gParser.BrcContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#tm}.
	 * @param ctx the parse tree
	 */
	void enterTm(gParser.TmContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#tm}.
	 * @param ctx the parse tree
	 */
	void exitTm(gParser.TmContext ctx);
}