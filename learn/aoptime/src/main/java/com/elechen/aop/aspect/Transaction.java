package com.elechen.aop.aspect;

/**
 * Created by Incredile on 2016/11/3.
 */
public class Transaction {
    public void beginTransaction(){
        System.out.println("begin transaction");
    }

    public void commit(){
        System.out.println("commit");
    }
}
