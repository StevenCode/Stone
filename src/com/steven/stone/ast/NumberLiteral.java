package com.steven.stone.ast;

import com.steven.stone.Token;

/**
 * Created by steven on 2017/5/24.
 */
public class NumberLiteral extends ASTLeaf{
    public NumberLiteral(Token t) {
        super(t);
    }
    public int value() {
        return token.getNumber();
    }
}
