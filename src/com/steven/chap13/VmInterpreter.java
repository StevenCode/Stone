package com.steven.chap13;

import com.steven.chap11.EnvOptInterpreter;
import com.steven.chap8.Natives;
import com.steven.stone.FuncParser;
import com.steven.stone.ParseException;

/**
 * Created by steven on 2018/2/8.
 */
public class VmInterpreter extends EnvOptInterpreter{
    public static void main(String[] args) throws ParseException {
        run(new FuncParser(),
                new Natives().environment(new StoneVMEnv(100000, 100000, 1000)));
    }
}
