package com.steven.chap7;

import com.steven.chap6.BasicInterpreter;
import com.steven.stone.ClosureParser;
import com.steven.stone.ParseException;


/**
 * Created by steven on 2018/2/5.
 */
public class ClosureInterpreter extends BasicInterpreter {
    public static void main(String[] args) throws ParseException {
        run(new ClosureParser(), new NestedEnv());
    }
}
