package com.steven.chap13;

import com.steven.chap11.ResizableArrayEnv;

/**
 * Created by steven on 2018/2/6.
 */
public class StoneVMEnv extends ResizableArrayEnv implements HeapMemory{
    protected StoneVM svm;
    protected Code code;
    public StoneVMEnv(int codeSize, int stackSize, int stringsSize) {
        svm = new StoneVM(codeSize, stackSize, stringsSize, this);
        code = new Code(svm);
    }
        @Override
    public Object read(int index) {
        return null;
    }

    @Override
    public void write(int index, Object v) {

    }
}
