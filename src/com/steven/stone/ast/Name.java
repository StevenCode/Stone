package com.steven.stone.ast;

import com.steven.stone.Token;

/**
 * Created by steven on 2017/5/25.
 */
public class Name extends ASTLeaf{
    public Name(Token t) {
        super(t);
    }

    public String name() {
        return token.getText();
    }
}
