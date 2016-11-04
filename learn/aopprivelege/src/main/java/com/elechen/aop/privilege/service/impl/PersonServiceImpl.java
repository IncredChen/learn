package com.elechen.aop.privilege.service.impl;

import com.elechen.aop.privilege.annotation.PrivilegeInfo;
import com.elechen.aop.privilege.service.PersonService;

/**
 * Created by Incredile on 2016/11/2.
 */
public class PersonServiceImpl implements PersonService {

    @PrivilegeInfo(name = "savePerson")
    public void savePerson() {
        System.out.println("save person");
    }

    @PrivilegeInfo(name = "updatePerson")
    public void updatePerson() {
        System.out.println("update person");
    }

}
