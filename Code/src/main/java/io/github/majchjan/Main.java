package io.github.majchjan;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length == 0 || argsContains(args, "--help", "-h")) {
            printHelp();
            return;
        }

        String inputFile = "";
        String outputFile = "";

        if (argsContains(args, "--output", "-o")) {
            inputFile = getInputFile(args);
            outputFile = getOutputFile(args);

            if (inputFile == null) {
                System.err.println("Error: No input file specified.");
                printHelp();
                return;
            }

            if (outputFile == null) {
                System.err.println("Error: No output file specified.");
                printHelp();
                return;
            }

            // Przetwórz plik wejściowy
            processFile(inputFile, outputFile);
        } else {
            printHelp();
            return;
        }
    }

    private static boolean argsContains(String[] args, String longOption, String shortOption) {
        for (String arg : args) {
            if (arg.equals(longOption) || arg.equals(shortOption)) {
                return true;
            }
        }
        return false;
    }

    private static String getOutputFile(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("--output") || args[i].equals("-o")) {
                if (i + 1 < args.length) {
                    return args[i + 1];
                }
            }
        }
        return null;
    }

    private static String getInputFile(String[] args) {
        for (int i = 0; i < args.length - 1; i++) {
            if ((args[i].equals("--output") || args[i].equals("-o")) && (i + 2 < args.length)) {
                return args[i + 2];
            }
        }
        return null;
    }

    private static void printHelp() {
        System.out.println("Usage:");
        System.out.println("\tjava -jar TEXtoRTF.jar [options] <input-file>");
        System.out.println();
        System.out.println("\tOptions:");
        System.out.println("\t\t-h, --help    (Display this help message)");
        System.out.println("\t\t-o <file>, --output <file> (Specify the output file)");
        System.out.println();
        System.out.println("\tExample:");
        System.out.println("\t\tjava -jar TEXtoRTF.jar --output output.rtf input.tex");
    }


    private static void processFile(String inputFile, String outputFile) {
        try {
            CharStream input = CharStreams.fromFileName(inputFile);

            TEXtoRTFLexer lexer = new TEXtoRTFLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            TEXtoRTFParser parser = new TEXtoRTFParser(tokens);

            parser.removeErrorListeners();
            parser.addErrorListener(new TEXtoRTFErrorListener());

            ParseTree tree = parser.start();

            TEXtoRTFConverter converter = new TEXtoRTFConverter();
            String rtfContent = converter.visit(tree);

            try (PrintWriter out = new PrintWriter(outputFile)) {
                out.println(rtfContent);
            }

            System.out.println("Converted " + inputFile + " to " + outputFile);

        } catch (IOException e) {
            System.err.println("Error processing file: " + e.getMessage());
        } catch (RecognitionException e) {
            System.err.println("Syntax error in input file: " + e.getMessage());
        }
    }
}
