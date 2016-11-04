package com.elechen.proxy.dynamic;

/**
 * Created by Incredile on 2016/10/31.
 */

public class PersonImpl implements PersonDao {

    public void savePerson() {
        System.out.println("save person!");
    }
}
