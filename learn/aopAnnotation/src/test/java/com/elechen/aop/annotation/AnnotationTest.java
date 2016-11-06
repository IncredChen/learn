package com.elechen.aop.annotation;

import com.elechen.aop.annotation.action.PersonAction;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Incredile on 2016/11/6.
 */
public class AnnotationTest {

    @Test
    public void testAopAnnotation(){

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonAction person = (PersonAction) context.getBean("personAction");
        person.savePerson();
    }
}
