package com.steven.chap8;

import com.steven.stone.StoneException;
import com.steven.stone.ast.ASTree;

import java.lang.reflect.Method;

/**
 * Created by steven on 2018/2/5.
 */
public class NativeFunction {
    protected Method method;
    protected String name;
    protected int numParams;
    public NativeFunction(String n, Method m) {
        name = n;
        method = m;
        numParams = m.getParameterTypes().length;
    }
    @Override public String toString() { return "<native:" + hashCode() + ">"; }
    public int numOfParameters() { return numParams; }
    public Object invoke(Object[] args, ASTree tree) {
        try {
            return method.invoke(null, args);
        } catch (Exception e) {
            throw new StoneException("bad native function call: " + name, tree);
        }
    }
}
