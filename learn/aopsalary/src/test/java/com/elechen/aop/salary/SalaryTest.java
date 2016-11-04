package com.elechen.aop.salary;

import com.elechen.aop.salary.action.PersonAction;
import com.elechen.aop.salary.aspect.Privilege;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Incredile on 2016/11/3.
 */
public class SalaryTest {
    @Test
    public void testSalary(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Privilege privilege = (Privilege) context.getBean("privilege");
        privilege.setAccess("admn");
        PersonAction personAction =(PersonAction) context.getBean("personAction");
        personAction.savePerson();
    }
}
