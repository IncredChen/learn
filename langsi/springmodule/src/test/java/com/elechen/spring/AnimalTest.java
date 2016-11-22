package com.elechen.spring;

import org.junit.Test;

/**
 * Created by Incredile on 2016/11/19.
 */
public class AnimalTest {
    @Test
    public void testAnimal(){
        BeanFactory3 beanFactory = new BeanFactory3();
        People people = (People)beanFactory.getBean("people");
        people.play();
    }
}
