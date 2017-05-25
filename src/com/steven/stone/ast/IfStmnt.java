package com.steven.stone.ast;
import java.util.List;
/**
 * Created by steven on 2017/5/26.
 */
public class IfStmnt extends ASTList {
    public IfStmnt(List<ASTree> c) { super(c); }
    public ASTree condition() { return child(0); }
    public ASTree thenBlock() { return child(1); }
    public ASTree elseBlock() {
        return numChildren() > 2 ? child(2) : null;
    }
    public String toString() {
        return "(if " + condition() + " " + thenBlock()
                + " else " + elseBlock() + ")";
    }
}

