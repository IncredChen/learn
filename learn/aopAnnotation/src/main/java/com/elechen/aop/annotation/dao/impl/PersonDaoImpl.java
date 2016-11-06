package com.elechen.aop.annotation.dao.impl;

import com.elechen.aop.annotation.dao.PersonDao;
import org.springframework.stereotype.Repository;

/**
 * Created by Incredile on 2016/11/6.
 */

@Repository("personDao")
public class PersonDaoImpl implements PersonDao {

    public void savePerson() {
        System.out.println("save person");
    }

    public void updatePerson() {
        System.out.println("update person");
    }
}
