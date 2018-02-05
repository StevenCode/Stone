package com.steven.stone;

import com.steven.stone.ast.Fun;

import static com.steven.stone.Parser.rule;

/**
 * Created by steven on 2018/2/5.
 */
public class ClosureParser extends FuncParser {
    public ClosureParser() {
        primary.insertChoice(rule(Fun.class).sep("fun").ast(paramList).ast(block));
    }
}
