package io.github.majchjan;

public class Main {

    // Enum definiujący różne rodzaje tokenów
    enum TokenType {
        DOCUMENT_CLASS_ARTICLE,
        BEGIN_DOCUMENT,
        END_DOCUMENT,
        BEGIN_ITEMIZE,
        END_ITEMIZE,
        BEGIN_ENUMERATE,
        END_ENUMERATE,
        TITLE,
        AUTHOR,
        SECTION,
        SUBSECTION,
        SUBSUBSECTION,
        HREF,
        VERB,
        URL,
        DOTS,
        ITEM,
        MAKE_TITLE,
        LEFT_BRACE,
        RIGHT_BRACE,
        TEXT

    }
}
