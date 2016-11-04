package com.elechen.aop.time;

import com.elechen.aop.time.action.PersonAction;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Incredile on 2016/11/2.
 */
public class TimeTest {
    @Test
    public void testTime(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonAction personAction = (PersonAction) context.getBean("personAction");
        personAction.savePerson();
        System.out.println("\n" +
                "=================================================================");
        personAction.updatePerson();
    }
}
