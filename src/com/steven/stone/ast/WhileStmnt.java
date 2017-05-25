package com.steven.stone.ast;
import java.util.List;
/**
 * Created by steven on 2017/5/26.
 */
public class WhileStmnt extends ASTList {
    public WhileStmnt(List<ASTree> c) { super(c); }
    public ASTree condition() { return child(0); }
    public ASTree body() { return child(1); }
    public String toString() {
        return "(while " + condition() + " " + body() + ")";
    }
}
