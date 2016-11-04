package com.elechen.proxy;

/**
 * Created by Incredile on 2016/10/31.
 */


import org.junit.Test;

public class StaticProxyTest {
    @Test
    public void testStaticProxy(){
        PersonImpl person = new PersonImpl();
        Transaction transaction = new Transaction();
        StaticProxy staticProxy = new StaticProxy(person,transaction);
        staticProxy.savePerson();
    }
}
