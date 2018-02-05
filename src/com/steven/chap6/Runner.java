package com.steven.chap6;

import javassist.gluonj.util.Loader;

/**
 * Created by steven on 2018/2/2.
 */
public class Runner {
    public static void main(String[] args) throws Throwable {
        Loader.run(BasicInterpreter.class, args,BasicEvaluator.class);
    }
}
