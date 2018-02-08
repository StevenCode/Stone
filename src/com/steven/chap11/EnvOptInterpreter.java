package com.steven.chap11;

import com.steven.chap6.BasicEvaluator;
import com.steven.chap6.Environment;
import com.steven.chap8.Natives;
import com.steven.stone.*;
import com.steven.stone.ast.ASTree;
import com.steven.stone.ast.NullStmnt;

/**
 * Created by steven on 2018/2/8.
 */
public class EnvOptInterpreter {
    public static void main(String[] args) throws ParseException {
        run(new ClosureParser(),
                new Natives().environment(new ResizableArrayEnv()));
    }
    public static void run(BasicParser bp, Environment env)
            throws ParseException
    {
        Lexer lexer = new Lexer(new CodeDialog());
        while (lexer.peek(0) != Token.EOF) {
            ASTree t = bp.parse(lexer);
            if (!(t instanceof NullStmnt)) {
                ((EnvOptimizer.ASTreeOptEx)t).lookup(
                        ((EnvOptimizer.EnvEx2)env).symbols());
                Object r = ((BasicEvaluator.ASTreeEx)t).eval(env);
                System.out.println("=> " + r);
            }
        }
    }
}
