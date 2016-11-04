package com.elechen.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Incredile on 2016/10/31.
 */


/**
 * 1、自定义拦截器  implement invocationHandler 接口 实现 invok（）方法
 *
 * 2、添加目标类->执行目标方法（反射）
 *
 *
 */
public class MyIntercept implements InvocationHandler {

    private Object  target; //目标类
    private Transaction transaction;  //事务

    //构造器
    public MyIntercept(Object target, Transaction transaction) {
        this.target = target;
        this.transaction = transaction;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        if("savePerson".equals(methodName)||"deletePerson".equals(methodName)||"updatePerson".equals(methodName)){
            this.transaction.beginTransaction(); //开启事务
            method.invoke(target); // 动态执行
            this.transaction.commit();  //提交事务
        }else {
            method.invoke(target);
        }
        return null;
    }
}
