package com.elechen.aop.annotation.service.impl;

import com.elechen.aop.annotation.dao.PersonDao;
import com.elechen.aop.annotation.service.PersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Incredile on 2016/11/6.
 */

@Service("personService")
public class PersonServiceImpl implements PersonService {

    @Resource(name = "personDao")
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

    public void updatePerson() {
        this.personDao.updatePerson();
    }
}
