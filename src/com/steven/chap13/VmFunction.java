package com.steven.chap13;

import com.steven.chap6.Environment;
import com.steven.chap7.Function;
import com.steven.stone.ast.BlockStmnt;
import com.steven.stone.ast.ParameterList;

/**
 * Created by steven on 2018/2/7.
 */
public class VmFunction extends Function {
    protected int entry;
    public VmFunction(ParameterList parameters, BlockStmnt body, Environment env, int entry) {
        super(parameters, body, env);
        this.entry = entry;
    }
    public int entry(){
        return entry;
    }
}
