package com.elechen.proxy;

/**
 * Created by Incredile on 2016/10/31.
 */
public class Transaction {
    public void beginTransaction(){
        System.out.println("begin transaction");
    }

    public void commit(){
        System.out.println("commit");
    }
}
