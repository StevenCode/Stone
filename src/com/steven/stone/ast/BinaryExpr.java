package com.steven.stone.ast;

import java.util.List;

/**
 * Created by steven on 2017/5/25.
 */
public class BinaryExpr extends ASTList{
    public BinaryExpr(List<ASTree> children) {
        super(children);
    }

    public ASTree left() {
        return child(0);
    }

    public String operator() {
        return ((ASTLeaf)child(1)).token().getText();
    }

    public ASTree right() {
        return child(2);
    }
}
