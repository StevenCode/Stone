package com.steven.stone.ast;
import java.util.List;
/**
 * Created by steven on 2017/5/26.
 */
public class NegativeExpr extends ASTList {
    public NegativeExpr(List<ASTree> c) { super(c); }
    public ASTree operand() { return child(0); }
    public String toString() {
        return "-" + operand();
    }
}
