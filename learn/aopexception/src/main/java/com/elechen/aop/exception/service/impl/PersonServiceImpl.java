package com.elechen.aop.exception.service.impl;

import com.elechen.aop.exception.service.PersonService;
import com.elechen.aop.exception.dao.PersonDao;

/**
 * Created by Incredile on 2016/11/1.
 */

public class PersonServiceImpl implements PersonService {

    private PersonDao personDao;

    public PersonDao getPersonDao() {
        return personDao;
    }

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    public void savePerson() {
        this.personDao.savePerson();
    }

    public void deletePerson() {
        this.personDao.deletePerson();
    }
}
