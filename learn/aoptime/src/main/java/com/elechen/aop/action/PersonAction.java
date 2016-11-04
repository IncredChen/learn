package com.elechen.aop.action;

import com.elechen.aop.service.PersonService;

/**
 * Created by Incredile on 2016/11/3.
 */
public class PersonAction {
    private PersonService personService;

    public PersonService getPersonService() {
        return personService;
    }

    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    public void savePerson(){
        this.personService.savePerson();
    }

    public void updatePerson(){
        this.personService.updatePerson();
    }

}
