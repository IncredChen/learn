package com.elechen.ssm.test;

        import java.io.StringWriter;
        import java.util.*;
        import org.apache.velocity.app.VelocityEngine;
        import org.apache.velocity.Template;
        import org.apache.velocity.VelocityContext;

public class HelloVelocity {
    public static void main(String[] args) throws Exception {
//初始化并取得Velocity引擎
        VelocityEngine ve = new VelocityEngine();
        ve.init();
//取得velocity的模版
        Template t = ve.getTemplate("hellovelocity.vm");
//取得velocity的上下文context
        VelocityContext context = new VelocityContext();
//把数据填入上下文
        context.put("name", "Liang");
        context.put("date", (new Date()).toString());
//为后面的展示，提前输入List数值
        List temp = new ArrayList();
        temp.add("1");
        temp.add("2");
        context.put("list", temp);
//输出流
        StringWriter writer = new StringWriter();
//转换输出
        t.merge(context, writer);
        System.out.println(writer.toString());
    }
}
