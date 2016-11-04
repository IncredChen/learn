package com.elechen.aop.dao.impl;

import com.elechen.aop.dao.PersonDao;

/**
 * Created by Incredile on 2016/11/3.
 */
public class PersonDaoImpl implements PersonDao{
    @Override
    public void savePerson() {
        System.out.println("save person");
    }

    @Override
    public void updatePerson() {
        System.out.println("update person");
    }
}
