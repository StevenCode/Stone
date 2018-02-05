package com.steven.chap7;

import com.steven.chap6.Environment;
import com.steven.stone.ast.BlockStmnt;
import com.steven.stone.ast.ParameterList;

/**
 * Created by steven on 2018/2/5.
 */
public class Function {
    protected ParameterList parameters;
    protected BlockStmnt body;
    protected Environment env;
    public Function(ParameterList parameters, BlockStmnt body, Environment env) {
        this.parameters = parameters;
        this.body = body;
        this.env = env;
    }
    public ParameterList parameters() { return parameters; }
    public BlockStmnt body() { return body; }
    public Environment makeEnv() { return new NestedEnv(env); }
    @Override public String toString() { return "<fun:" + hashCode() + ">"; }
}
