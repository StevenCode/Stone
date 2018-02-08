package com.steven.chap13;

import com.steven.chap8.NativeEvaluator;
import com.steven.chap8.NativeFunction;

import static javassist.gluonj.util.Loader.*;

/**
 * Created by steven on 2018/2/8.
 */
public class VmRunner {
    public static void main(String[] args) throws Throwable{
        run(VmInterpreter.class, args, VmEvaluator.class, NativeEvaluator.class);
    }
}
