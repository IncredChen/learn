package com.elechen.aop.service.impl;

import com.elechen.aop.dao.PersonDao;
import com.elechen.aop.service.PersonService;

/**
 * Created by Incredile on 2016/11/3.
 */
public class PersonserviceImpl  implements PersonService{

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
