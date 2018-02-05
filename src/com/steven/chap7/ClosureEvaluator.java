package com.steven.chap7;

import com.steven.chap6.Environment;
import com.steven.stone.ast.ASTree;
import com.steven.stone.ast.Fun;
import javassist.gluonj.Require;
import javassist.gluonj.Reviser;

import java.util.List;

/**
 * Created by steven on 2018/2/5.
 */
@Require(FuncEvaluator.class)
@Reviser public class ClosureEvaluator {
    @Reviser public static class FunEx extends Fun {
        public FunEx(List<ASTree> c) { super(c); }
        public Object eval(Environment env) {
            return new Function(parameters(), body(), env);
        }
    }
}
