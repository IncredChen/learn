package com.elechen.cjlibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Incredile on 2016/11/1.
 */
public class MyInterceptor implements MethodInterceptor {


    private Object target;
    private Transaction transaction;

    public MyInterceptor(Object target, Transaction transaction) {
        this.target = target;
        this.transaction = transaction;
    }

    public Object createProxy(){
        //代码增强类
        Enhancer enhancer = new Enhancer();
        //回调
        enhancer.setCallback(this);
        //生成的代理类是被代理的之类
        enhancer.setSuperclass(target.getClass());
        //返回代理对象
        return enhancer.create();
    }


    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        transaction.beginTransaction();
        method.invoke(target);
        transaction.commit();


        return null;
    }
}
