package com.elechen.aop.salary.service.impl;

import com.elechen.aop.salary.dao.PersonDao;
import com.elechen.aop.salary.service.PersonService;

/**
 * Created by Incredile on 2016/11/3.
 */
public class PersonServiceImpl  implements PersonService {

    private PersonDao personDao;

    public PersonDao getPersonDao() {
        return personDao;
    }

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Override
    public void savePerson() {
        this.personDao.savePerson();
    }

    @Override
    public void updatePerson() {
        this.personDao.updatePerson();
    }
}
