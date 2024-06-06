package io.github.majchjan;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

public class TEXtoRTFErrorListener extends BaseErrorListener {

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {

        System.err.printf("Error at line %d:%d - %s%n", line, charPositionInLine, msg);

        if (offendingSymbol != null) {
            System.err.printf("Offending symbol: %s%n", offendingSymbol.toString());
        }

        String input = recognizer.getInputStream().toString();
        int start = Math.max(charPositionInLine - 10, 0);
        int stop = Math.min(charPositionInLine + 10, input.length() - 1);
        String context = input.substring(start, stop);
        System.err.printf("Context: %s%n", context);

        if (offendingSymbol instanceof Token) {
            Token token = (Token) offendingSymbol;
            String tokenText = token.getText();
            System.err.printf("Current token text: %s%n", tokenText);
            System.err.printf("Token type: %s%n", token.getType());
        }

        if (e != null) {
            System.err.println("Detailed error: " + e.getMessage());
        }
    }
}
