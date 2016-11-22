package com.elechen.spring.learn;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Incredile on 2016/11/20.
 */
public class UserListTest {
    private ApplicationContext context = null;

    @Before
    public void setUp(){

        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testUserList(){
        UserList userList = (UserList)context.getBean("userList");
        List<User> users = userList.getUserList();
        for (User u : users){
            System.out.println(u);
        }

    }
}
