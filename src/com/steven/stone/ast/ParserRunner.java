package com.steven.stone.ast;

import com.steven.stone.*;

/**
 * Created by steven on 2017/5/26.
 */
public class ParserRunner {
    public static void main(String[] args) throws ParseException {
        Lexer lexer = new Lexer(new CodeDialog());
        BasicParser basicParser = new BasicParser();
        while (lexer.peek(0) != Token.EOF) {
            ASTree ast = basicParser.parse(lexer);
            System.out.println("=> " + ast.toString());
        }
    }
}
