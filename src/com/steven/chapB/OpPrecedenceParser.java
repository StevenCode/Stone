package com.steven.chapB;

import java.util.Arrays;
import java.util.HashMap;
import com.steven.stone.*;
import com.steven.stone.ast.*;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.HashMap;

/**
 * Created by steven on 2018/1/28.
 */
public class OpPrecedenceParser {
    private Lexer lexer;
    protected HashMap<String, Precedence> operators;

    public static class Precedence {
        int value;
        boolean leftAssoce;

        public Precedence(int v, boolean a) {
            value =v;
            leftAssoce = a;
        }

    }

    public OpPrecedenceParser(Lexer p) {
        lexer = p;
        operators = new HashMap<>();
        operators.put("<", new Precedence(1, true));
        operators.put(">", new Precedence(1, true));
        operators.put("+", new Precedence(2, true));
        operators.put("-", new Precedence(2, true));
        operators.put("*", new Precedence(3, true));
        operators.put("/", new Precedence(3, true));
        operators.put("^", new Precedence(4, false));
    }
    public ASTree expression() throws ParseException {
        ASTree right = factor();
        Precedence next;
        while ((next = nextOperator()) != null)
            right = doShift(right, next.value);

        return right;
    }

    private ASTree doShift(ASTree left, int prec) throws ParseException {
        ASTLeaf op = new ASTLeaf(lexer.read());
        ASTree right = factor();
        Precedence next;
        while ((next = nextOperator()) != null && rightIsExpr(prec, next)) {
            right = doShift(right, next.value);
        }
        return new BinaryExpr(Arrays.asList(left, op, right));
    }

    public ASTree factor() throws ParseException {
        if (isToken("(")) {
            token("(");
            ASTree e = expression();
            token(")");
            return e;
        }
        else {
            Token t = lexer.read();
            if (t.isNumber()) {
                NumberLiteral n = new NumberLiteral(t);
                return n;
            }
            else
                throw new ParseException(t);
        }
    }
    void token(String name) throws ParseException {
        Token t = lexer.read();
        if (!(t.isIdentifier() && name.equals(t.getText())))
            throw new ParseException(t);
    }
    boolean isToken(String name) throws ParseException {
        Token t = lexer.peek(0);
        return t.isIdentifier() && name.equals(t.getText());
    }

    private Precedence nextOperator() throws ParseException {
        Token t = lexer.peek(0);
        if (t.isIdentifier()) {
            return operators.get(t.getText());
        }else
            return null;
    }

    private static boolean rightIsExpr(int prec, Precedence nextPrec) {
        if (nextPrec.leftAssoce)
            return prec < nextPrec.value;
        else
            return prec <= nextPrec.value;
    }
    public static void main(String[] args) throws ParseException {
        Lexer lexer = new Lexer(new CodeDialog());
        OpPrecedenceParser p = new OpPrecedenceParser(lexer);
        ASTree t = p.expression();
        System.out.println("=> " + t);
    }
}
