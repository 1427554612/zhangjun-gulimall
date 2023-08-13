package com.zhangjun.guli.gulimallproduct.utils;

import org.codehaus.commons.compiler.IScriptEvaluator;
import org.codehaus.janino.ScriptEvaluator;

public class RunJavaStr {
    public static void main(String[] args) throws Exception{
        String str = "hahaha";
        String content="import com.zhangjun.guli.gulimallproduct.utils.Provader;" +
                "System.out.println(Provader.get2("+str+"));";
        IScriptEvaluator evaluator = new ScriptEvaluator();
        evaluator.cook(content);
        evaluator.evaluate(null);
    }
}
