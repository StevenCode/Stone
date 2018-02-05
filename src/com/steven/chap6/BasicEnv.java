package com.steven.chap6;

import java.util.HashMap;

/**
 * Created by steven on 2018/2/2.
 */
public class BasicEnv implements Environment{
    protected HashMap<String, Object> values;
    public BasicEnv() {
        values = new HashMap<String, Object>();
    }
    @Override
    public void put(String name, Object value) {
        values.put(name, value);
    }

    @Override
    public Object get(String name) {
        return values.get(name);
    }

}
