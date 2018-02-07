package com.steven.chap13;

/**
 * Created by steven on 2018/2/6.
 */
public interface HeapMemory {
    Object read(int index);

    void write(int index, Object v);
}
