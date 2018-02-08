package com.steven.chap11;

import com.steven.chap6.Environment;
import com.steven.chap7.Function;
import com.steven.stone.ast.BlockStmnt;
import com.steven.stone.ast.ParameterList;

/**
 * Created by steven on 2018/2/8.
 */
public class OptFunction extends Function{
    protected int size;
    public OptFunction(ParameterList parameters, BlockStmnt body, Environment env, int memorySize) {
        super(parameters, body, env);
        size = memorySize;
    }
    public Environment makeEnv() {
        return new ArrayEnv(size, env);
    }
}
