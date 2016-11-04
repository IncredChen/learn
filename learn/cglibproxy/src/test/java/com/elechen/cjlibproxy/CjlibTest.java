package com.elechen.cjlibproxy;

import org.junit.Test;

/**
 * Created by Incredile on 2016/11/1.
 */

/**
 * 通过cjlib生成的代理类是目标类的子类
 */
public class CjlibTest {

    @Test
    public void testCjliProxy(){
        PeosonImpl target = new PeosonImpl();
        Transaction transaction = new Transaction();
        MyInterceptor myInterceptor = new MyInterceptor(target,transaction);
        // 目标类是代理类的父类，而JDK代理两者是兄弟类实现共同的接口。
        PeosonImpl peosonProxy = (PeosonImpl) myInterceptor.createProxy();

        peosonProxy.savePerson();


    }


}
