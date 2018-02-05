package com.steven.chap8;

import com.steven.chap7.ClosureEvaluator;
import javassist.gluonj.util.Loader;

/**
 * Created by steven on 2018/2/5.
 */
public class NativeRunner {
    public static void main(String[] args) throws Throwable {
        Loader.run(NativeInterpreter.class, args, NativeEvaluator.class,
                ClosureEvaluator.class);
    }
}
