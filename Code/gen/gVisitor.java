// Generated from D:/Programs/IntelliJ/saves/testANTLR/g.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(gParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#hdr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHdr(gParser.HdrContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#cont}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCont(gParser.ContContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#sect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSect(gParser.SectContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#tkt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTkt(gParser.TktContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#lst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLst(gParser.LstContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#brc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrc(gParser.BrcContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#tm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTm(gParser.TmContext ctx);
}