package com.steven.stone.ast;

import java.util.List;

/**
 * Created by steven on 2018/2/5.
 */
public class DefStmnt extends ASTList{
    public DefStmnt(List<ASTree> c) {
        super(c);
    }

    public String name() {
        return ((ASTLeaf) child(0)).token.getText();
    }
    public ParameterList parameters() {
        return (ParameterList) child(1);
    }
    public BlockStmnt body() { return (BlockStmnt)child(2); }

    public String toString() {
        return "(def " + name() + " " + parameters() + " " + body() + ")";
    }
}
