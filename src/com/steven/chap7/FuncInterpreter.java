package com.steven.chap7;

import com.steven.chap6.BasicEvaluator;
import com.steven.stone.FuncParser;
import com.steven.stone.ParseException;

import static com.steven.chap6.BasicInterpreter.run;

/**
 * Created by steven on 2018/2/5.
 */
public class FuncInterpreter extends BasicEvaluator{
    public static void main(String[] args) throws ParseException {
        run(new FuncParser(), new NestedEnv());
    }
}
