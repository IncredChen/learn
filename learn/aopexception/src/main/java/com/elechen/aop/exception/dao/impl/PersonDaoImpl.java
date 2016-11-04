package com.elechen.aop.exception.dao.impl;

import com.elechen.aop.exception.dao.PersonDao;

/**
 * Created by Incredile on 2016/11/1.
 */
public class PersonDaoImpl implements PersonDao{
    public void savePerson() {
        int a = 10/0;
        System.out.println("save person");
    }

    public void deletePerson() {
        System.out.println("delete person");
        Long.parseLong("aaa");
    }
}
