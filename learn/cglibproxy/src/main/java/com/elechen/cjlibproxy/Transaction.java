package com.elechen.cjlibproxy;

/**
 * Created by Incredile on 2016/11/1.
 */

public class Transaction {
    public void beginTransaction(){
        System.out.println("begin transaction");
    }

    public void commit(){
        System.out.println("commit");
    }
}
