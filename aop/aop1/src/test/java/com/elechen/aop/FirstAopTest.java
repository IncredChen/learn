package com.elechen.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Incredile on 2016/10/31.
 */
public class FirstAopTest {
    @Test
    public void testFirstAop(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonDao person = (PersonDao)context.getBean("personImpl");
        person.savePerson();

    }
}
