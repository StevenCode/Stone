package com.steven.stone.ast;

import java.util.List;

/**
 * Created by steven on 2018/2/5.
 */
public class Fun extends ASTList{
    public Fun(List<ASTree> c) {
        super(c);
    }
    public ParameterList parameters() {
        return (ParameterList) child(0);
    }
    public BlockStmnt body() { return (BlockStmnt)child(1); }
    public String toString() {
        return "(fun " + parameters() + " " + body() + ")";
    }
}
