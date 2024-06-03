grammar gramatyka;

start: DOCUMENT_CLASS_ARTICLE hdr BEGIN_DOCUMENT cont END_DOCUMENT;

hdr: TITLE LEFT_BRACE TEXT RIGHT_BRACE hdr | TITLE LEFT_BRACE TEXT RIGHT_BRACE |
    AUTHOR LEFT_BRACE TEXT RIGHT_BRACE hdr | AUTHOR LEFT_BRACE TEXT RIGHT_BRACE;

cont: sect cont | sect |
    tkt cont | tkt |
    lst cont | lst |
    MAKE_TITLE cont |
    MAKE_TITLE;

sect: SECTION brc |
      SUBSECTION brc |
      SUBSUBSECTION brc ;

tkt: TEXT tkt | TEXT |
    DOTS tkt | DOTS;

lst: BEGIN_ENUMERATE tm lst END_ENUMERATE | BEGIN_ENUMERATE tm lst tm END_ENUMERATE | BEGIN_ENUMERATE tm END_ENUMERATE |
    BEGIN_ITEMIZE tm lst END_ITEMIZE | BEGIN_ITEMIZE tm lst tm END_ITEMIZE | BEGIN_ITEMIZE tm END_ITEMIZE;

brc: LEFT_BRACE TEXT RIGHT_BRACE;

tm: ITEM tkt | ITEM tkt tm;

DOCUMENT_CLASS_ARTICLE: '\\documentclass{article}';
BEGIN_DOCUMENT: '\\begin{document}';
END_DOCUMENT: '\\end{document}';
TITLE: '\\title';
AUTHOR: '\\author';
MAKE_TITLE: '\\maketitle';
BEGIN_ENUMERATE: '\\begin{enumerate}';
END_ENUMERATE: '\\end{enumerate}';
BEGIN_ITEMIZE: '\\begin{itemize}';
END_ITEMIZE: '\\end{itemize}';
ITEM: '\\item';
SECTION: '\\section';
SUBSECTION: '\\subsection';
SUBSUBSECTION: '\\subsubsection';
DOTS: '\\dots';
TEXT: [a-zA-Z_0-9!? .,()\t\n;]+;
LEFT_BRACE: '{';
RIGHT_BRACE: '}';
