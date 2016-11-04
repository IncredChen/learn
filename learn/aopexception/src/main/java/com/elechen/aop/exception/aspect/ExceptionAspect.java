package com.elechen.aop.exception.aspect;

import org.aspectj.lang.JoinPoint;

/**
 * Created by Incredile on 2016/11/1.
 */
public class ExceptionAspect {
    public void throwingException(JoinPoint joinPoint, Throwable ex){
        System.out.println(ex.getMessage());
    }

    public  void before(){
        System.out.println("beafore");
    }

    public void finalm(){
        System.out.println("last finall");
    }

}