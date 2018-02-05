package com.steven.stone.ast;

import java.util.List;

/**
 * Created by steven on 2018/2/5.
 */
public class Arguments extends Postfix{
    public Arguments(List<ASTree> c) {
        super(c);
    }
    public int size() {
        return numChildren();
    }
}
