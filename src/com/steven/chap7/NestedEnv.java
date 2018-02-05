package com.steven.chap7;

import com.steven.chap6.Environment;
import com.steven.chap7.FuncEvaluator.EnvEx;

import java.util.HashMap;

/**
 * Created by steven on 2018/2/5.
 */
public class NestedEnv implements Environment {
    protected HashMap<String, Object> values;
    protected Environment outer;

    public NestedEnv() {
        this(null);
    }

    public NestedEnv(Environment e) {
        values = new HashMap<String, Object>();
        outer = e;
    }

    public void setOuter(Environment e) {
        outer = e;
    }
    public void putNew(String name, Object value) { values.put(name, value); }
    @Override
    public void put(String name, Object value) {

        Environment e = where(name);
        if (e == null)
            e = this;
        ((EnvEx)e).putNew(name, value);
    }

    public Object get(String name) {
        Object v = values.get(name);
        if (v == null && outer != null)
            return outer.get(name);
        else
            return v;
    }

    public Environment where(String name) {
        if (values.get(name) != null)
            return this;
        else if (outer == null)
            return null;
        else
            return ((EnvEx)outer).where(name);
    }
}
