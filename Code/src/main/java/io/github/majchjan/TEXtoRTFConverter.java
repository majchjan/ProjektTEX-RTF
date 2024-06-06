package io.github.majchjan;
public class TEXtoRTFConverter extends TEXtoRTFBaseVisitor<String> {
    private String title = "";
    private String author = "";
    public StringBuilder tekst = new StringBuilder();

    public int listItemNumber = 1;
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public String visitStart(TEXtoRTFParser.StartContext ctx) {
        StringBuilder builder = new StringBuilder();
        String preambula = "{\\rtf1\\ansi\\deff4\\adeflang1025\n" +
                "\n" +
                "{\\fonttbl\n" +
                "{\\f0\\froman\\fprq2\\fcharset0 Times New Roman;}\n" +
                "{\\f1\\froman\\fprq2\\fcharset2 Symbol;}\n" +
                "{\\f2\\fswiss\\fprq2\\fcharset0 Arial;}\n" +
                "{\\f3\\froman\\fprq2\\fcharset0 Liberation Serif{\\*\\falt Times New Roman};}\n" +
                "{\\f4\\froman\\fprq2\\fcharset0 Cambria;}\n" +
                "{\\f5\\fswiss\\fprq2\\fcharset0 Liberation Sans{\\*\\falt Arial};}\n" +
                "{\\f6\\froman\\fprq2\\fcharset0 Calibri;}\n" +
                "{\\f7\\froman\\fprq2\\fcharset0 Consolas;}\n" +
                "{\\f8\\fnil\\fprq2\\fcharset0 DejaVu Sans;}\n" +
                "{\\f9\\fnil\\fprq2\\fcharset0 ;}\n" +
                "{\\f10\\fnil\\fprq2\\fcharset0 Droid Sans Devanagari;}\n" +
                "{\\f11\\fswiss\\fprq0\\fcharset128 Droid Sans Devanagari;}\n" +
                "}\n" +
                "\n" +
                "{\\colortbl;\\red0\\green0\\blue0;\\red0\\green0\\blue255;\\red0\\green255\\blue255;\\red0\\green255\\blue0;\\red255\\green0\\blue255;\\red255\\green0\\blue0;\\red255\\green255\\blue0;\\red255\\green255\\blue255;\\red0\\green0\\blue128;\\red0\\green128\\blue128;\\red0\\green128\\blue0;\\red128\\green0\\blue128;\\red128\\green0\\blue0;\\red128\\green128\\blue0;\\red128\\green128\\blue128;\\red192\\green192\\blue192;\\red52\\green90\\blue138;\\red79\\green129\\blue189;\\red54\\green95\\blue145;\\red0\\green112\\blue32;\\red136\\green0\\blue0;\\red64\\green160\\blue112;\\red144\\green32\\blue0;\\red64\\green112\\blue160;\\red187\\green102\\blue136;\\red25\\green23\\blue124;\\red96\\green160\\blue176;\\red186\\green33\\blue33;\\red6\\green40\\blue126;\\red102\\green102\\blue102;\\red188\\green122\\blue0;\\red125\\green144\\blue41;}\n" +
                "\n" +
                "{\\stylesheet{\\s0\\snext0\\rtlch\\af9\\afs24\\alang1025 \\ltrch\\lang1033\\langfe1033\\hich\\af4\\loch\\ql\\widctlpar\\sb0\\sa200\\ltrpar\\hyphpar0\\cf0\\f4\\fs24\\lang1033\\kerning0\\dbch\\af12\\langfe1033 Normal;}}\n" +
                "\n" +
                "{\\*\\listtable\n" +
                "{\\list\\listtemplateid1\n" +
                "{\\listlevel\\levelnfc0\\leveljc0\\levelstartat1\\levelfollow0{\\leveltext \\'02\\'00.;}{\\levelnumbers\\'01;}\\fi-480\\li720}\n" +
                "{\\listlevel\\levelnfc4\\leveljc0\\levelstartat1\\levelfollow0{\\leveltext \\'02\\'01.;}{\\levelnumbers\\'01;}\\fi-480\\li1440}\n" +
                "{\\listlevel\\levelnfc2\\leveljc0\\levelstartat1\\levelfollow0{\\leveltext \\'02\\'02.;}{\\levelnumbers\\'01;}\\fi-480\\li2160}\n" +
                "{\\listlevel\\levelnfc0\\leveljc0\\levelstartat1\\levelfollow0{\\leveltext \\'02\\'03.;}{\\levelnumbers\\'01;}\\fi-480\\li2880}\n" +
                "{\\listlevel\\levelnfc4\\leveljc0\\levelstartat1\\levelfollow0{\\leveltext \\'02\\'04.;}{\\levelnumbers\\'01;}\\fi-480\\li3600}\n" +
                "{\\listlevel\\levelnfc2\\leveljc0\\levelstartat1\\levelfollow0{\\leveltext \\'02\\'05.;}{\\levelnumbers\\'01;}\\fi-480\\li4320}\n" +
                "{\\listlevel\\levelnfc0\\leveljc0\\levelstartat1\\levelfollow0{\\leveltext \\'02\\'06.;}{\\levelnumbers\\'01;}\\fi-480\\li5040}\n" +
                "{\\listlevel\\levelnfc4\\leveljc0\\levelstartat1\\levelfollow0{\\leveltext \\'02\\'07.;}{\\levelnumbers\\'01;}\\fi-480\\li5760}\n" +
                "{\\listlevel\\levelnfc2\\leveljc0\\levelstartat1\\levelfollow0{\\leveltext \\'02\\'08.;}{\\levelnumbers\\'01;}\\fi-480\\li6480}\n" +
                "\\listid1}\n" +
                "\n" +
                "{\\list\\listtemplateid2\n" +
                "{\\listlevel\\levelnfc23\\leveljc0\\levelstartat0\\levelfollow0{\\leveltext \\'01\\u8226 ?;}{\\levelnumbers;}\\f13\\fi-480\\li720}\n" +
                "{\\listlevel\\levelnfc23\\leveljc0\\levelstartat0\\levelfollow0{\\leveltext \\'01\\u8211 ?;}{\\levelnumbers;}\\f13\\fi-480\\li1440}\n" +
                "{\\listlevel\\levelnfc23\\leveljc0\\levelstartat0\\levelfollow0{\\leveltext \\'01\\u8226 ?;}{\\levelnumbers;}\\f13\\fi-480\\li2160}\n" +
                "{\\listlevel\\levelnfc23\\leveljc0\\levelstartat0\\levelfollow0{\\leveltext \\'01\\u8211 ?;}{\\levelnumbers;}\\f13\\fi-480\\li2880}\n" +
                "{\\listlevel\\levelnfc23\\leveljc0\\levelstartat0\\levelfollow0{\\leveltext \\'01\\u8226 ?;}{\\levelnumbers;}\\f13\\fi-480\\li3600}\n" +
                "{\\listlevel\\levelnfc23\\leveljc0\\levelstartat0\\levelfollow0{\\leveltext \\'01\\u8211 ?;}{\\levelnumbers;}\\f13\\fi-480\\li4320}\n" +
                "{\\listlevel\\levelnfc23\\leveljc0\\levelstartat0\\levelfollow0{\\leveltext \\'01\\u8226 ?;}{\\levelnumbers;}\\f13\\fi-480\\li5040}\n" +
                "{\\listlevel\\levelnfc23\\leveljc0\\levelstartat0\\levelfollow0{\\leveltext \\'01\\u8211 ?;}{\\levelnumbers;}\\f13\\fi-480\\li5760}\n" +
                "{\\listlevel\\levelnfc23\\leveljc0\\levelstartat0\\levelfollow0{\\leveltext \\'01\\u8226 ?;}{\\levelnumbers;}\\f13\\fi-480\\li6480}\n" +
                "\\listid2}\n" +
                "\n" +
                "{\\list\\listtemplateid3\n" +
                "{\\listlevel\\levelnfc255\\leveljc0\\levelstartat1\\levelfollow2{\\leveltext \\'00;}{\\levelnumbers;}\\fi0\\li0}\n" +
                "{\\listlevel\\levelnfc255\\leveljc0\\levelstartat1\\levelfollow2{\\leveltext \\'00;}{\\levelnumbers;}\\fi0\\li0}\n" +
                "{\\listlevel\\levelnfc255\\leveljc0\\levelstartat1\\levelfollow2{\\leveltext \\'00;}{\\levelnumbers;}\\fi0\\li0}\n" +
                "{\\listlevel\\levelnfc255\\leveljc0\\levelstartat1\\levelfollow2{\\leveltext \\'00;}{\\levelnumbers;}\\fi0\\li0}\n" +
                "{\\listlevel\\levelnfc255\\leveljc0\\levelstartat1\\levelfollow2{\\leveltext \\'00;}{\\levelnumbers;}\\fi0\\li0}\n" +
                "{\\listlevel\\levelnfc255\\leveljc0\\levelstartat1\\levelfollow2{\\leveltext \\'00;}{\\levelnumbers;}\\fi0\\li0}\n" +
                "{\\listlevel\\levelnfc255\\leveljc0\\levelstartat1\\levelfollow2{\\leveltext \\'00;}{\\levelnumbers;}\\fi0\\li0}\n" +
                "{\\listlevel\\levelnfc255\\leveljc0\\levelstartat1\\levelfollow2{\\leveltext \\'00;}{\\levelnumbers;}\\fi0\\li0}\n" +
                "{\\listlevel\\levelnfc255\\leveljc0\\levelstartat1\\levelfollow2{\\leveltext \\'00;}{\\levelnumbers;}\\fi0\\li0}\n" +
                "\\listid3}\n" +
                "}\n" +
                "\n" +
                "\n" +
                "{\\listoverridetable\n" +
                "{\\listoverride\\listid1\\listoverridecount0\\ls1}\n" +
                "{\\listoverride\\listid2\\listoverridecount0\\ls2}\n" +
                "{\\listoverride\\listid3\\listoverridecount0\\ls3}\n" +
                "}\n" +
                "\n" +
                "\\deftab720\\deftab720\\deftab720\n" +
                "\\hyphauto1\\viewscale100\\formshade\\nobrkwrptbl\\paperh15840\\paperw12240\\margl1440\\margr1440\\margt1440\\margb1440\\sectd\\sbknone\\sftnnar\\saftnnrlc\\sectunlocked1\\pgwsxn12240\\pghsxn15840\\marglsxn1440\\margrsxn1440\\margtsxn1440\\margbsxn1440\\ftnbj\\ftnstart1\\ftnrstcont\\ftnnar\\aenddoc\\aftnrstcont\\aftnstart1\\aftnnrlc\\htmautsp\n";

        builder.append(preambula);
        tekst.append(preambula);
        builder.append(visit(ctx.hdr()));

        builder.append(visit(ctx.cont()));

        builder.append("}\n");
        tekst.append("}\n");
        return builder.toString();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public String visitHdr(TEXtoRTFParser.HdrContext ctx) {
        StringBuilder rtfContent = new StringBuilder();
        if (ctx.TITLE() != null) {
            rtfContent.append("\\pgndec\\pard\\plain \\s87\\rtlch\\af9\\afs36\\ab \\ltrch\\hich\\af6\\loch\\qc\\keep\\widctlpar\\sb480\\sa240\\keepn\\ltrpar\\cf0\\f6\\fs36\\b\\dbch\\af9\\qc\\keep\\sb480\\sa240\\keepn\n{\\loch ");
            rtfContent.append(ctx.TEXT().getText());
            rtfContent.append("}\n");
            title = rtfContent.toString();
        } else if (ctx.AUTHOR() != null) {
            rtfContent.append("\\par \\pard\\plain \\s89\\rtlch\\af9\\afs24\\alang1025 \\ltrch\\lang1033\\langfe1033\\hich\\af4\\loch\\qc\\keep\\widctlpar\\sb0\\sa200\\keepn\\ltrpar\\hyphpar0\\cf0\\f4\\fs24\\lang1033\\kerning0\\dbch\\af12\\langfe1033\n{\\loch ");
            rtfContent.append(ctx.TEXT().getText());
            rtfContent.append("}\n");
            author = rtfContent.toString();
        }
        tekst.append(rtfContent.toString());

        if(visitChildren(ctx) == null){
            return "";
        } else {
            return visitChildren(ctx);
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public String visitCont(TEXtoRTFParser.ContContext ctx) {
        StringBuilder builder = new StringBuilder();

        // Sprawdzamy, czy ctx zawiera MAKE_TITLE
        if (ctx.MAKE_TITLE() != null) {
            builder.append(title);
            builder.append(author);
        }

        // Sprawdzamy, czy ctx zawiera sekcje (sect)
        if (ctx.sect() != null) {

            builder.append(visit(ctx.sect()));
        }

        // Sprawdzamy, czy ctx zawiera tkt (tkt)
        if (ctx.tkt() != null) {
            builder.append(visit(ctx.tkt()));
        }

        // Sprawdzamy, czy ctx zawiera listy (lst)
        if (ctx.lst() != null) {
            builder.append(visit(ctx.lst()));
        }

        if(ctx.cont() != null){
            builder.append(visit(ctx.cont()));
        }
        // Dołączamy tekst do głównego StringBuildera
        tekst.append(builder.toString());

        // Odwiedzamy dzieci i dołączamy ich wynik

        return builder.toString();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public String visitSect(TEXtoRTFParser.SectContext ctx) {
        StringBuilder rtfContent = new StringBuilder();
        if (ctx.SECTION() != null) {
            rtfContent.append("\\par \\pard\\plain \\s1\\rtlch\\af9\\afs32\\ab \\ltrch\\hich\\af6\\loch\\ql\\keep\\widctlpar\\sb480\\sa0\\keepn\\ltrpar\\cf0\\f6\\fs32\\b\\dbch\\af9\n" +
                    "{\\loch ");
            rtfContent.append(visit(ctx.brc()));
            rtfContent.append("}\n");
        } else if (ctx.SUBSECTION() != null) {
            rtfContent.append("\\par \\pard\\plain \\s2\\rtlch\\af9\\afs28\\ab \\ltrch\\hich\\af6\\loch\\ql\\keep\\widctlpar\\sb200\\sa0\\keepn\\ltrpar\\cf0\\f6\\fs28\\b\\dbch\\af9\n" +
                    "{\\loch ");
            rtfContent.append(visit(ctx.brc()));
            rtfContent.append("}\n");
        } else if (ctx.SUBSUBSECTION() != null) {
            rtfContent.append("\\par \\pard\\plain \\s3\\rtlch\\af9\\afs24\\ab \\ltrch\\hich\\af6\\loch\\ql\\keep\\widctlpar\\sb200\\sa0\\keepn\\ltrpar\\cf0\\f6\\fs24\\b\\dbch\\af9\n" +
                    "{\\loch ");
            rtfContent.append(visit(ctx.brc()));
            rtfContent.append("}\n");
        }
        tekst.append(rtfContent.toString());
        return rtfContent.toString();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public String visitTkt(TEXtoRTFParser.TktContext ctx) {
        StringBuilder builder = new StringBuilder();
        builder.append("\\par \\pard\\plain \\s85\\loch\\ql\\widctlpar\\sb180\\sa180\n{\\loch ");
        builder.append(ctx.TEXT().getText());
        builder.append("}\n");
        tekst.append(builder.toString());
        if(ctx.tkt() != null){
            builder.append(visit(ctx.tkt()));
        }
        return builder.toString();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public String visitLst(TEXtoRTFParser.LstContext ctx) {
        StringBuilder builder = new StringBuilder();

        if(ctx.bulleted_list() != null){
            builder.append(visit(ctx.bulleted_list()));
        } else if(ctx.numbered_list() != null){
            builder.append(visit(ctx.numbered_list()));
        }
        return builder.toString();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public String visitNumbered_list(TEXtoRTFParser.Numbered_listContext ctx) {
        StringBuilder builder = new StringBuilder();

        builder.append(visit(ctx.tmn()));

        tekst.append(builder.toString());
        return builder.toString();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public String visitBulleted_list(TEXtoRTFParser.Bulleted_listContext ctx) {
        StringBuilder builder = new StringBuilder();

        builder.append(visit(ctx.tmb()));

        tekst.append(builder.toString());
        return builder.toString();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public String visitTmn(TEXtoRTFParser.TmnContext ctx) {
        StringBuilder builder = new StringBuilder();
        builder.append("\\par \\pard\\plain \\s0\\rtlch\\af9\\afs24\\alang1025 \\ltrch\\lang1033\\langfe1033\\hich\\af4\\loch\\ql\\widctlpar\\sb0\\sa200\\ltrpar\\hyphpar0\\cf0\\f4\\fs24\\lang1033\\kerning0\\dbch\\af12\\langfe1033\n" +
                "{\\listtext\\pard\\plain  " + listItemNumber + ". " + "\\tab}\n" +
                "\\ilvl0\\ls1 \\fi-480\\li720\\lin720\n" +
                "{\\loch ");
        builder.append(ctx.tkt().TEXT().getText());
        builder.append("}\n");
        if(ctx.tmn() != null){
            listItemNumber++;
            builder.append(visit(ctx.tmn()));
            listItemNumber--;
        }
        tekst.append(builder.toString());
        return builder.toString();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public String visitTmb(TEXtoRTFParser.TmbContext ctx) {
        StringBuilder builder = new StringBuilder();
        builder.append("\\par \\pard\\plain \\s0\\rtlch\\af9\\afs24\\alang1025 \\ltrch\\lang1033\\langfe1033\\hich\\af4\\loch\\ql\\widctlpar\\sb0\\sa200\\ltrpar\\hyphpar0\\cf0\\f4\\fs24\\lang1033\\kerning0\\dbch\\af12\\langfe1033\n" +
                "{\\listtext\\pard\\plain  \\u8211\\'96\\tab}\n" +
                "\\ilvl0\\ls1 \\fi-480\\li720\\lin720\n" +
                "{\\loch ");
        builder.append(ctx.tkt().TEXT().getText());
        builder.append("}\n");

        if(ctx.tmb() != null){
            builder.append(visit(ctx.tmb()));
        }

        tekst.append(builder.toString());
        return builder.toString();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public String visitBrc(TEXtoRTFParser.BrcContext ctx) {
        StringBuilder builder = new StringBuilder();
        builder.append(ctx.TEXT().getText());
        tekst.append(builder.toString());
        return builder.toString();
    }
}