package com.elechen.spring.learn;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Incredile on 2016/11/20.
 */
public class UserTest {

    private ApplicationContext context = null;

    @Before
    public void setUp(){

        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testUser(){
       User user = (User) context.getBean("user4");
        System.out.println(user);
    }

}
