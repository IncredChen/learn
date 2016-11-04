package com.elechen.aop.privilege;

import com.elechen.aop.privilege.Aspect.PrivilegeAspect;
import com.elechen.aop.privilege.bean.Privilege;
import com.elechen.aop.privilege.service.PersonService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Incredile on 2016/11/2.
 */
public class PrivilegeTest {
    @Test
    public void testPrivilege(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        PrivilegeAspect privilegeAspect =(PrivilegeAspect)context.getBean("privilegeAspect");

        Privilege privilege1 = new Privilege();
        privilege1.setName("updatePerson");


        Privilege privilege2 = new Privilege();
        privilege2.setName("savePerson");

        privilegeAspect.getPrivilegeList().add(privilege1);
        privilegeAspect.getPrivilegeList().add(privilege2);

        PersonService personService =(PersonService) context.getBean("personService");

        personService.savePerson();
        personService.updatePerson();

    }
}
