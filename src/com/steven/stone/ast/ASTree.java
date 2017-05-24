package com.steven.stone.ast;

import java.util.Iterator;
/**
 * Created by steven on 2017/5/24.
 */
public abstract class ASTree implements Iterable<ASTree> {
    public abstract ASTree child(int i);

    public abstract int numChildren();

    public abstract Iterator<ASTree> children();

    public abstract String location();

    public Iterator<ASTree> iterable() {
        return children();
    }
}
