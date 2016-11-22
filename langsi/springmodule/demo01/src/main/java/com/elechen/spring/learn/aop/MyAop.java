package com.elechen.spring.learn.aop;

/**
 * Created by Incredile on 2016/11/20.
 */
public class MyAop {

    public void before(){
        System.out.println("前置通知");
    }

    public void after(){
        System.out.println("后置通知");
    }

    public void exeception(){
        System.out.println("异常通知");
    }

    public void afterRunning(){
        System.out.println("最终通知");
    }

    public void around(){
        System.out.println("环绕");
    }


}
