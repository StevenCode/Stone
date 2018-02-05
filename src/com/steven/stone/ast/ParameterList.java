package com.steven.stone.ast;

import java.util.List;

/**
 * Created by steven on 2018/2/5.
 */
public class ParameterList extends ASTList{
    public ParameterList(List<ASTree> children) {
        super(children);
    }

    public String name(int i) {
        return ((ASTLeaf) child(i)).token().getText();
    }

    public int size() {
        return numChildren();
    }
}
