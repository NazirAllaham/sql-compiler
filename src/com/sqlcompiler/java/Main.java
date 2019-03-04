package com.sqlcompiler.java;

import com.sqlcompiler.Environment;
import org.jetbrains.annotations.NotNull;

/**
 * 1- Parenthesis.
 * 2- Expected 'from' found 'form'
 * 3- Invalid variable name
 * 4- Begin end
 * 5- Semi colon separate between each two statements in function
 * 6- For syntax
 * 7- Min max ...
 * 8- If syntax
 * 9- Aliases one word or one string
 **/

public class Main {

    public static void main(@NotNull String[] args) {
        start();
    }

    private static void start() {
        Compiler compiler = new Compiler(Compiler.COMPILE + Compiler.RETRIEVE_TYPES);

        // Lexical analysis
        compiler.lexical_analyzer();

        // Parsing
        compiler.parse();

        // Semantic analysis
        compiler.semantic_analyzer();

        // Storing our data types
        DataTypes.save(Environment.DATA_TYPES_PATH);

        // Print the results
        compiler.print();
    }
}
