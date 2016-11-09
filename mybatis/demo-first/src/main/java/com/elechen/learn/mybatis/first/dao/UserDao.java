package com.elechen.learn.mybatis.first.dao;

import com.elechen.learn.mybatis.first.po.User;

/**
 * Created by Incredile on 2016/11/8.
 */
public interface UserDao {
    public User findUserById(int id);
    public void addUser();
    public void deteleUserById(int id);
    public void updateUserById(int id);
}
