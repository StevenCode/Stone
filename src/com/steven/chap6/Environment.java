package com.steven.chap6;

/**
 * Created by steven on 2018/2/2.
 */
public interface Environment {
    void put(String name, Object value);

    Object get(String name);
}
