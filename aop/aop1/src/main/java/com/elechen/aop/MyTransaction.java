package com.elechen.aop;

import org.springframework.stereotype.Component;

/**
 * Created by Incredile on 2016/10/31.
 */

@Component
public class MyTransaction {

    public void beginTransaction(){
        System.out.println("begin transaction");
    }

    public void commit(){
        System.out.println("commit");
    }
}
