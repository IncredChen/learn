package com.elechen.aop.annotation.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Incredile on 2016/11/6.
 */

@Component("transaction")
@Aspect
public class Transaction {

    @Pointcut("execution(* com.elechen.aop.annotation.dao.impl.PersonDaoImpl.*(..))")
    private void any(){}

    @Before("any()")
    public void beginTransaction(){
        System.out.println("begin");
    }

    @After("any()")
    public void commit(){
        System.out.println("commit");
    }

}
