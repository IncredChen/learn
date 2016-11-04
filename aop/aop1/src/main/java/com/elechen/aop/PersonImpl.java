package com.elechen.aop;

import org.springframework.stereotype.Component;

/**
 * Created by Incredile on 2016/10/31.
 */

@Component
public class PersonImpl implements PersonDao {
    public void savePerson() {
        System.out.println("save person");
    }
}
