package io.github.majchjan;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String outputFile = "";

        if (args.length == 0 || argsContains(args, "--help", "-h")) {
            printHelp();
            return;
        } else if (argsContains(args, "--output", "-o")) {
            outputFile = getOutputFile(args);
            if (outputFile != null) {
                processFile(outputFile);
            } else {
                System.err.println("Error: No output file specified.");
                printHelp();
                return;
            }
        } else {
            printHelp();
            return;
        }

        CharStream input = CharStreams.fromFileName(outputFile);

        TEXtoRTFLexer lexer = new TEXtoRTFLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        TEXtoRTFParser parser = new TEXtoRTFParser(tokens);
        ParseTree tree = parser.start();

        TEXtoRTFConverter converter = new TEXtoRTFConverter();
        String pythonCode = converter.visit(tree);

        PrintWriter out = new PrintWriter(outputFile.replace(".tex", ".rtf"));
        out.println(pythonCode);
        out.close();
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

    private static void printHelp() {
        System.out.println("Usage:");
        System.out.println("\tTEXtoRTF [options] [input-file]");
        System.out.println();
        System.out.println("\tOptions:");
        System.out.println("\t\t-h        (Display this help message)");
        System.out.println("\t\t--help    (Display this help message)");
        System.out.println("\t\t-o <file> (Process the specified input file)");
        System.out.println("\t\t--output <file> (Process the specified input file)");
    }

    private static void processFile(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
//            System.out.println("Processing file: " + fileName);
        } else {
            System.err.println("TEXtoRTX: Error: File not found - " + fileName);
        }
    }
}