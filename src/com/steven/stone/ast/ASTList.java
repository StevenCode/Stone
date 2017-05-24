package com.steven.stone.ast;

import java.util.Iterator;
import java.util.List;

/**
 * Created by steven on 2017/5/24.
 */
public class ASTList extends ASTree{

    protected List<ASTree> children;

    public ASTList(List<ASTree> children) {
        this.children = children;
    }
    @Override
    public ASTree child(int i) {
        return children.get(i);
    }

    @Override
    public int numChildren() {
        return children.size();
    }

    @Override
    public Iterator<ASTree> children() {
        return children.iterator();
    }

    @Override
    public String location() {
        for (ASTree t : children) {
            String location = t.location();
            if (location != null) {
                return location;
            }
        }
        return null;
    }

    @Override
    public Iterator<ASTree> iterator() {
        return children();
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append('(');
        String sep = "";
        for (ASTree t : children) {
            builder.append(sep);
            sep = " ";
            builder.append(t.toString());
        }

        return builder.append(")").toString();
    }


}
