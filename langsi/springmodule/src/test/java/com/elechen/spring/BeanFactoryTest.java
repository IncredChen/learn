package com.elechen.spring;

import org.junit.Test;

/**
 * Created by Incredile on 2016/11/19.
 */
public class BeanFactoryTest {
    @Test
    public void testBeanFactory() {
        BeanFactory beanFactory = new BeanFactory();
        User user = (User) beanFactory.getBean("user");
        user.eat();
    }

    @Test
    public void testBeanFactory2() {
        BeanFactory2 beanFactory = new BeanFactory2();
        User user = (User) beanFactory.getBean("user");
        System.out.println(user);
        user.eat();
    }

    @Test
    public void testBeanFactory3() {
        BeanFactory3 beanFactory = new BeanFactory3();
        User user = (User) beanFactory.getBean("user");
        System.out.println(user);
        user.eat();
        user.getDog().sound();
    }

}
