package com.steven.stone;

/**
 * Created by steven on 2017/5/22.
 */
public class LexerRunner {
    public static void main(String[] args) throws ParseException{
        Lexer l = new Lexer(new CodeDialog());
        for (Token t; (t = l.read()) != Token.EOF; ) {
            System.out.print("=> " + t.getText()+"\n");
        }
    }
}
