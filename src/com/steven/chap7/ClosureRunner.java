package com.steven.chap7;

import javassist.gluonj.util.Loader;

/**
 * Created by steven on 2018/2/5.
 */
public class ClosureRunner {
    public static void main(String[] args) throws Throwable {
        Loader.run(ClosureInterpreter.class, args, ClosureEvaluator.class);
    }
}
