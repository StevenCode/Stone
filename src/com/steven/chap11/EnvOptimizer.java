package com.steven.chap11;

import com.steven.chap6.Environment;
import com.steven.chap7.ClosureEvaluator;
import javassist.gluonj.Require;
import javassist.gluonj.Reviser;

/**
 * Created by steven on 2018/2/6.
 */
@Require(ClosureEvaluator.class)
@Reviser
public class EnvOptimizer {
    @Reviser public static interface EnvEx2 extends Environment{
        Symbols symbols();

        void put(int nest, int index, Object value);

        Object get(int nest, int index);

        void putNew(String name, Object value);

        Environment where(String name);
    }
}
