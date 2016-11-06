package com.elechen.aop.annotation.action;

import com.elechen.aop.annotation.service.PersonService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by Incredile on 2016/11/6.
 */

@Controller("personAction")
public class PersonAction {

    @Resource(name = "personService")
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

    public void uodatePerson(){
        this.personService.updatePerson();
    }

}
