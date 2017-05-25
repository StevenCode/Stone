package com.steven.stone.ast;

import com.steven.stone.Token;

/**
 * Created by steven on 2017/5/26.
 */
public class StringLiteral extends ASTLeaf {
    public StringLiteral(Token t) { super(t); }
    public String value() { return token().getText(); }
}
