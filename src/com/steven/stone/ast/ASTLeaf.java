package com.steven.stone.ast;

import com.steven.stone.Token;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by steven on 2017/5/24.
 */
public class ASTLeaf extends ASTree {

    private static ArrayList<ASTree> empty = new ArrayList<ASTree>();
    protected Token token;
    public ASTLeaf(Token t){
        token = t;
    }
    @Override
    public ASTree child(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public int numChildren() {
        return 0;
    }

    @Override
    public Iterator<ASTree> children() {
        return empty.iterator();
    }

    @Override
    public String location() {
        return "at line" + token.getLineNumber();
    }


    @Override
    public Iterator<ASTree> iterator() {
        return children();
    }

    public Token token() {
        return token;
    }

    public String toString() {
        return token.getText();
    }
}
