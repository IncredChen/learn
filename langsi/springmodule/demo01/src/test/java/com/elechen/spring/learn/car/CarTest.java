package com.elechen.spring.learn.car;

import com.elechen.spring.learn.car.child.Audi;
import com.elechen.spring.learn.car.child.BMW;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Incredile on 2016/11/20.
 */
public class CarTest {
    private ApplicationContext context = null;

    @Before
    public void setUp(){

        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testCar(){
        Audi audi = (Audi)context.getBean("audi");
        BMW bmw = (BMW)context.getBean("bmw");
        System.out.println(audi);
        System.out.println(bmw);
    }
}
