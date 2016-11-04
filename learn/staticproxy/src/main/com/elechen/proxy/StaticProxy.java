
package com.elechen.proxy;
/**
 * Created by Incredile on 2016/10/31.
 */
public class StaticProxy implements Person {

    private PersonImpl personImpl;
    private Transaction transaction;

    public StaticProxy(PersonImpl personImpl,Transaction transaction) {
        this.personImpl = personImpl;
        this.transaction = transaction;
    }

    @Override
    public void savePerson() {
        this.transaction.beginTransaction();
        this.personImpl.savePerson();
        this.transaction.commit();
    }
}
