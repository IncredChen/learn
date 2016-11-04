package com.elechen.proxy.dynamic;

import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * Created by Incredile on 2016/10/31.
 */
public class DynamicProxyTest {

    @Test
    public void testDynamicProxy(){
        Object target  = new PersonImpl();
        Transaction transaction = new Transaction();
        MyIntercept intercept = new MyIntercept(target,transaction);

        PersonDao person = (PersonDao) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),intercept);

        person.savePerson();

    }

}
