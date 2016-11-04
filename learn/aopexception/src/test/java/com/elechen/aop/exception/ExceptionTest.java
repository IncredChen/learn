package com.elechen.aop.exception;

import com.elechen.aop.exception.dao.PersonDao;
import com.elechen.aop.exception.service.PersonService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Incredile on 2016/11/1.
 */
public class ExceptionTest {

    @Test
    public void testException(){

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonService personService = (PersonService)context.getBean("personService");
        personService.savePerson();
        personService.deletePerson();
    }
}
