package com.steven.chap8;

import com.steven.chap6.BasicEvaluator;
import com.steven.chap6.BasicEvaluator.ASTreeEx;
import com.steven.chap6.Environment;
import com.steven.chap7.FuncEvaluator;
import com.steven.stone.StoneException;
import com.steven.stone.ast.ASTree;
import javassist.gluonj.Require;
import javassist.gluonj.Reviser;

import java.util.List;

/**
 * Created by steven on 2018/2/5.
 */
@Require(FuncEvaluator.class)
@Reviser
public class NativeEvaluator {
    @Reviser public static class NativeArgEx extends FuncEvaluator.ArgumentsEx {
        public NativeArgEx(List<ASTree> c) { super(c); }
        @Override public Object eval(Environment callerEnv, Object value) {
            if (!(value instanceof NativeFunction))
                return super.eval(callerEnv, value);

            NativeFunction func = (NativeFunction)value;
            int nparams = func.numOfParameters();
            if (size() != nparams)
                throw new StoneException("bad number of arguments", this);
            Object[] args = new Object[nparams];
            int num = 0;
            for (ASTree a: this) {
                ASTreeEx ae = (ASTreeEx)a;
                args[num++] = ae.eval(callerEnv);
            }
            return func.invoke(args, this);
        }
    }
}
