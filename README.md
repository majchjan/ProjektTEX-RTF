# ProjektTEX-RTF
Projekt zakłada skonstruowanie konwertera języka Latex na język Rich Text Format. (file.tex -> file.rtf) w języku JAVA\
W założeniu konweter obsłuży jedynie niecały dokument klasy article:
```tex
\documentclass{article}
```
### Wymagania i użycie:
Do poprawnego działania programu wymagane jest posiadanie środowiska uruchomieniowego Java najlepiej w wersji 8 lub nowszej.
Aby skonwertować plik ```.tex``` na ```.rtf``` należy uruchomić program z podaniem ścieżki do pliku ```.tex``` jako argumentu.

```bash
java -jar TEXtoRTF.jar -o output.rtf input.tex
```
aby wyświetlić pomoc należy uruchomić program bez argumentów:
```bash
java -jar TEXtoRTF.jar
````
lub z argumentem ```-h``` lub ```--help```:
```bash
java -jar TEXtoRTF.jar -h
```

### Przykładowy plik ```.tex```:

```tex
\documentclass{article}

\title{Compilers}
\author{MJ}

\begin{document}
\maketitle

\section{Introduction}
Compilers and translators are essential tools in the process of converting source code from one programming language to another or to a lower level of abstraction, such as machine code. The basic components of a compiler include a scanner, parser, and code generator.

\section{Compiler Elements}
\subsection{Scaner}

The scanner, also known as a lexer, is the first step in lexical analysis. Its task is to divide the stream of characters into tokens. Tokens are the smallest semantic units in a programming language, such as identifiers, numbers, special characters, etc. The scanner also removes whitespace and comments that do not have semantic significance for the compiler.

\subsubsection{Tokens}
Tokens are the basic lexical units that represent fragments of the source code. They can be identifiers, keywords, operators, numbers, special characters, etc. Each token has a semantic value and type.

\subsection{Parser}

The parser is responsible for syntactic analysis of the source code. Its job is to check whether the sequence of tokens generated by the scanner conforms to the correct structure of the programming language. The parser creates a parse tree or an abstract syntax tree (AST), which represents the hierarchical structure of the source code grammar.

\subsection{Compiler (List)}

\begin{enumerate}
    \item Scaner
    \item Tokens
    \item Parser
\end{enumerate}

\subsection{Code Generator}

The code generator is often the final step in the compilation process. Based on the syntactic analysis of the source code, the code generator produces equivalent code in the target language. This means it converts the AST into the resulting code that can be executed on the target platform.

\end{document}
```
Oraz wynikowy plik ```.rtf```:
```rtf
{\rtf1\ansi\deff4\adeflang1025

{\fonttbl
{\f0\froman\fprq2\fcharset0 Times New Roman;}
{\f1\froman\fprq2\fcharset2 Symbol;}
{\f2\fswiss\fprq2\fcharset0 Arial;}
{\f3\froman\fprq2\fcharset0 Liberation Serif{\*\falt Times New Roman};}
{\f4\froman\fprq2\fcharset0 Cambria;}
{\f5\fswiss\fprq2\fcharset0 Liberation Sans{\*\falt Arial};}
{\f6\froman\fprq2\fcharset0 Calibri;}
{\f7\froman\fprq2\fcharset0 Consolas;}
{\f8\fnil\fprq2\fcharset0 DejaVu Sans;}
{\f9\fnil\fprq2\fcharset0 ;}
{\f10\fnil\fprq2\fcharset0 Droid Sans Devanagari;}
{\f11\fswiss\fprq0\fcharset128 Droid Sans Devanagari;}
}

{\colortbl;\red0\green0\blue0;\red0\green0\blue255;\red0\green255\blue255;\red0\green255\blue0;\red255\green0\blue255;\red255\green0\blue0;\red255\green255\blue0;\red255\green255\blue255;\red0\green0\blue128;\red0\green128\blue128;\red0\green128\blue0;\red128\green0\blue128;\red128\green0\blue0;\red128\green128\blue0;\red128\green128\blue128;\red192\green192\blue192;\red52\green90\blue138;\red79\green129\blue189;\red54\green95\blue145;\red0\green112\blue32;\red136\green0\blue0;\red64\green160\blue112;\red144\green32\blue0;\red64\green112\blue160;\red187\green102\blue136;\red25\green23\blue124;\red96\green160\blue176;\red186\green33\blue33;\red6\green40\blue126;\red102\green102\blue102;\red188\green122\blue0;\red125\green144\blue41;}

{\stylesheet{\s0\snext0\rtlch\af9\afs24\alang1025 \ltrch\lang1033\langfe1033\hich\af4\loch\ql\widctlpar\sb0\sa200\ltrpar\hyphpar0\cf0\f4\fs24\lang1033\kerning0\dbch\af12\langfe1033 Normal;}}

{\*\listtable
{\list\listtemplateid1
{\listlevel\levelnfc0\leveljc0\levelstartat1\levelfollow0{\leveltext \'02\'00.;}{\levelnumbers\'01;}\fi-480\li720}
{\listlevel\levelnfc4\leveljc0\levelstartat1\levelfollow0{\leveltext \'02\'01.;}{\levelnumbers\'01;}\fi-480\li1440}
{\listlevel\levelnfc2\leveljc0\levelstartat1\levelfollow0{\leveltext \'02\'02.;}{\levelnumbers\'01;}\fi-480\li2160}
{\listlevel\levelnfc0\leveljc0\levelstartat1\levelfollow0{\leveltext \'02\'03.;}{\levelnumbers\'01;}\fi-480\li2880}
{\listlevel\levelnfc4\leveljc0\levelstartat1\levelfollow0{\leveltext \'02\'04.;}{\levelnumbers\'01;}\fi-480\li3600}
{\listlevel\levelnfc2\leveljc0\levelstartat1\levelfollow0{\leveltext \'02\'05.;}{\levelnumbers\'01;}\fi-480\li4320}
{\listlevel\levelnfc0\leveljc0\levelstartat1\levelfollow0{\leveltext \'02\'06.;}{\levelnumbers\'01;}\fi-480\li5040}
{\listlevel\levelnfc4\leveljc0\levelstartat1\levelfollow0{\leveltext \'02\'07.;}{\levelnumbers\'01;}\fi-480\li5760}
{\listlevel\levelnfc2\leveljc0\levelstartat1\levelfollow0{\leveltext \'02\'08.;}{\levelnumbers\'01;}\fi-480\li6480}
\listid1}

{\list\listtemplateid2
{\listlevel\levelnfc23\leveljc0\levelstartat0\levelfollow0{\leveltext \'01\u8226 ?;}{\levelnumbers;}\f13\fi-480\li720}
{\listlevel\levelnfc23\leveljc0\levelstartat0\levelfollow0{\leveltext \'01\u8211 ?;}{\levelnumbers;}\f13\fi-480\li1440}
{\listlevel\levelnfc23\leveljc0\levelstartat0\levelfollow0{\leveltext \'01\u8226 ?;}{\levelnumbers;}\f13\fi-480\li2160}
{\listlevel\levelnfc23\leveljc0\levelstartat0\levelfollow0{\leveltext \'01\u8211 ?;}{\levelnumbers;}\f13\fi-480\li2880}
{\listlevel\levelnfc23\leveljc0\levelstartat0\levelfollow0{\leveltext \'01\u8226 ?;}{\levelnumbers;}\f13\fi-480\li3600}
{\listlevel\levelnfc23\leveljc0\levelstartat0\levelfollow0{\leveltext \'01\u8211 ?;}{\levelnumbers;}\f13\fi-480\li4320}
{\listlevel\levelnfc23\leveljc0\levelstartat0\levelfollow0{\leveltext \'01\u8226 ?;}{\levelnumbers;}\f13\fi-480\li5040}
{\listlevel\levelnfc23\leveljc0\levelstartat0\levelfollow0{\leveltext \'01\u8211 ?;}{\levelnumbers;}\f13\fi-480\li5760}
{\listlevel\levelnfc23\leveljc0\levelstartat0\levelfollow0{\leveltext \'01\u8226 ?;}{\levelnumbers;}\f13\fi-480\li6480}
\listid2}

{\list\listtemplateid3
{\listlevel\levelnfc255\leveljc0\levelstartat1\levelfollow2{\leveltext \'00;}{\levelnumbers;}\fi0\li0}
{\listlevel\levelnfc255\leveljc0\levelstartat1\levelfollow2{\leveltext \'00;}{\levelnumbers;}\fi0\li0}
{\listlevel\levelnfc255\leveljc0\levelstartat1\levelfollow2{\leveltext \'00;}{\levelnumbers;}\fi0\li0}
{\listlevel\levelnfc255\leveljc0\levelstartat1\levelfollow2{\leveltext \'00;}{\levelnumbers;}\fi0\li0}
{\listlevel\levelnfc255\leveljc0\levelstartat1\levelfollow2{\leveltext \'00;}{\levelnumbers;}\fi0\li0}
{\listlevel\levelnfc255\leveljc0\levelstartat1\levelfollow2{\leveltext \'00;}{\levelnumbers;}\fi0\li0}
{\listlevel\levelnfc255\leveljc0\levelstartat1\levelfollow2{\leveltext \'00;}{\levelnumbers;}\fi0\li0}
{\listlevel\levelnfc255\leveljc0\levelstartat1\levelfollow2{\leveltext \'00;}{\levelnumbers;}\fi0\li0}
{\listlevel\levelnfc255\leveljc0\levelstartat1\levelfollow2{\leveltext \'00;}{\levelnumbers;}\fi0\li0}
\listid3}
}


{\listoverridetable
{\listoverride\listid1\listoverridecount0\ls1}
{\listoverride\listid2\listoverridecount0\ls2}
{\listoverride\listid3\listoverridecount0\ls3}
}

\deftab720\deftab720\deftab720
\hyphauto1\viewscale100\formshade\nobrkwrptbl\paperh15840\paperw12240\margl1440\margr1440\margt1440\margb1440\sectd\sbknone\sftnnar\saftnnrlc\sectunlocked1\pgwsxn12240\pghsxn15840\marglsxn1440\margrsxn1440\margtsxn1440\margbsxn1440\ftnbj\ftnstart1\ftnrstcont\ftnnar\aenddoc\aftnrstcont\aftnstart1\aftnnrlc\htmautsp
\pgndec\pard\plain \s87\rtlch\af9\afs36\ab \ltrch\hich\af6\loch\qc\keep\widctlpar\sb480\sa240\keepn\ltrpar\cf0\f6\fs36\b\dbch\af9\qc\keep\sb480\sa240\keepn
{\loch Compilers}
\par \pard\plain \s89\rtlch\af9\afs24\alang1025 \ltrch\lang1033\langfe1033\hich\af4\loch\qc\keep\widctlpar\sb0\sa200\keepn\ltrpar\hyphpar0\cf0\f4\fs24\lang1033\kerning0\dbch\af12\langfe1033
{\loch MJ}
\par \pard\plain \s1\rtlch\af9\afs32\ab \ltrch\hich\af6\loch\ql\keep\widctlpar\sb480\sa0\keepn\ltrpar\cf0\f6\fs32\b\dbch\af9
{\loch Introduction}
\par \pard\plain \s85\loch\ql\widctlpar\sb180\sa180
{\loch Compilers and translators are essential tools in the process of converting source code from one programming language to another or to a lower level of abstraction, such as machine code. The basic components of a compiler include a scanner, parser, and code generator.}
\par \pard\plain \s1\rtlch\af9\afs32\ab \ltrch\hich\af6\loch\ql\keep\widctlpar\sb480\sa0\keepn\ltrpar\cf0\f6\fs32\b\dbch\af9
{\loch Compiler Elements}
\par \pard\plain \s2\rtlch\af9\afs28\ab \ltrch\hich\af6\loch\ql\keep\widctlpar\sb200\sa0\keepn\ltrpar\cf0\f6\fs28\b\dbch\af9
{\loch Scaner}
\par \pard\plain \s85\loch\ql\widctlpar\sb180\sa180
{\loch The scanner, also known as a lexer, is the first step in lexical analysis. Its task is to divide the stream of characters into tokens. Tokens are the smallest semantic units in a programming language, such as identifiers, numbers, special characters, etc. The scanner also removes whitespace and comments that do not have semantic significance for the compiler.}
\par \pard\plain \s3\rtlch\af9\afs24\ab \ltrch\hich\af6\loch\ql\keep\widctlpar\sb200\sa0\keepn\ltrpar\cf0\f6\fs24\b\dbch\af9
{\loch Tokens}
\par \pard\plain \s85\loch\ql\widctlpar\sb180\sa180
{\loch Tokens are the basic lexical units that represent fragments of the source code. They can be identifiers, keywords, operators, numbers, special characters, etc. Each token has a semantic value and type.}
\par \pard\plain \s2\rtlch\af9\afs28\ab \ltrch\hich\af6\loch\ql\keep\widctlpar\sb200\sa0\keepn\ltrpar\cf0\f6\fs28\b\dbch\af9
{\loch Parser}
\par \pard\plain \s85\loch\ql\widctlpar\sb180\sa180
{\loch The parser is responsible for syntactic analysis of the source code. Its job is to check whether the sequence of tokens generated by the scanner conforms to the correct structure of the programming language. The parser creates a parse tree or an abstract syntax tree (AST), which represents the hierarchical structure of the source code grammar.}
\par \pard\plain \s2\rtlch\af9\afs28\ab \ltrch\hich\af6\loch\ql\keep\widctlpar\sb200\sa0\keepn\ltrpar\cf0\f6\fs28\b\dbch\af9
{\loch Compiler (List)}
\par \pard\plain \s0\rtlch\af9\afs24\alang1025 \ltrch\lang1033\langfe1033\hich\af4\loch\ql\widctlpar\sb0\sa200\ltrpar\hyphpar0\cf0\f4\fs24\lang1033\kerning0\dbch\af12\langfe1033
{\listtext\pard\plain  1. \tab}
\ilvl0\ls1 \fi-480\li720\lin720
{\loch  Scaner}
\par \pard\plain \s0\rtlch\af9\afs24\alang1025 \ltrch\lang1033\langfe1033\hich\af4\loch\ql\widctlpar\sb0\sa200\ltrpar\hyphpar0\cf0\f4\fs24\lang1033\kerning0\dbch\af12\langfe1033
{\listtext\pard\plain  2. \tab}
\ilvl0\ls1 \fi-480\li720\lin720
{\loch  Tokens}
\par \pard\plain \s0\rtlch\af9\afs24\alang1025 \ltrch\lang1033\langfe1033\hich\af4\loch\ql\widctlpar\sb0\sa200\ltrpar\hyphpar0\cf0\f4\fs24\lang1033\kerning0\dbch\af12\langfe1033
{\listtext\pard\plain  3. \tab}
\ilvl0\ls1 \fi-480\li720\lin720
{\loch  Parser}
\par \pard\plain \s2\rtlch\af9\afs28\ab \ltrch\hich\af6\loch\ql\keep\widctlpar\sb200\sa0\keepn\ltrpar\cf0\f6\fs28\b\dbch\af9
{\loch Code Generator}
\par \pard\plain \s85\loch\ql\widctlpar\sb180\sa180
{\loch The code generator is often the final step in the compilation process. Based on the syntactic analysis of the source code, the code generator produces equivalent code in the target language. This means it converts the AST into the resulting code that can be executed on the target platform.}
}
```


## Zbiór Tokenów
+ __DOCUMENT_CLASS_ARTICLE__:'\documentclass{article}'
+ __BEGIN_DOCUMENT__:'\begin{document}'
+ __END_DOCUMENT__:'\end{document}
---
+ __TITLE__:'\title'
+ __AUTHOR__:'\author'
+ __MAKE_TITLE__:'\maketitle'
---
+ __BEGIN_ENUMERATE__:'\begin{enumerate}'
+ __END_ENUMERATE__:'\end{enumerate}'
+ __BEGIN_ITEMIZE__:'\begin{itemize}'
+ __END_ITEMIZE__:'\end{itemize}'
+ __ITEM__:'\item'
---
+ __SECTION__:'\section'
+ __SUBSECTION__:'\subsection'
+ __SUBSUBSECTION__:'\subsubsection'
---
+ __DOTS__:'\dots'
+ __TEXT__:'[a-zA-Z_0-9!? .:,()\t\n;]++'
+ __LEFT_BRACE__:'{'
+ __RIGHT_BRACE__:'}'

---
## Gramatyka

+ S -> DOCUMENT_CLASS_ARTICLE HDR BEGIN_DOCUMENT CONT END_DOCUMENT
+ HDR -> TITLE LEFT_BRACE TEXT RIGHT_BRACE HDR | TITLE LEFT_BRACE TEXT RIGHT_BRACE |
          AUTHOR LEFT_BRACE TEXT RIGHT_BRACE HDR | AUTHOR LEFT_BRACE TEXT RIGHT_BRACE
+ CONT -> SECT CONT | SECT | TKT CONT | TKT | LST CONT | LST | MAKE_TITLE CONT | MAKE_TITLE
+ SECT -> SECTION BRC | SUBSECTION BRC | SUBSUBSECTION BRC
+ LST -> NUMBERED_LIST | BULLETED_LIST
+ NUMBERED-LIST -> BEGIN_ENUMERATE TMN END_ENUMERATE;
+ BULLETED_LIST -> BEGIN_ITEMIZE TMB END_ITEMIZE
+ TKT -> TEXT TKT | TEXT | DOTS TKT | DOTS
+ BRC -> LEFT_BRACE TKT RIGHT_BRACE
+ TMN: ITEM TKT | ITEM TKT TMN;
+ TMB: ITEM TKT | ITEM TKT TMB;

---
Do wygenerowania leksera, parsera itp. wykorzystany został ```ANTLR```

## Gramatyka ANTLR

```g4
grammar TEXtoRTF;

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

lst: numbered_list | bulleted_list;

numbered_list: BEGIN_ENUMERATE tmn END_ENUMERATE;

bulleted_list: BEGIN_ITEMIZE tmb END_ITEMIZE;

brc: LEFT_BRACE TEXT RIGHT_BRACE;

tmn: ITEM tkt | ITEM tkt tmn;
tmb: ITEM tkt | ITEM tkt tmb;

WS: [ \t\r\n]+ -> skip;

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
TEXT: [a-zA-Z_0-9!? .:,()\t\n;]+;
LEFT_BRACE: '{';
RIGHT_BRACE: '}';
```






