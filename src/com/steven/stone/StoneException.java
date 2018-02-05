package com.steven.stone;

import com.steven.stone.ast.ASTree;

/**
 * Created by steven on 2017/5/22.
 */
public class StoneException extends RuntimeException {
    public StoneException(String m) {
        super(m);
    }

    public StoneException(String m, ASTree t) {
        super(m + " " + t.location());
    }
}
