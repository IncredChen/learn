package com.elechen.ssm.service;

import com.elechen.ssm.po.User;
import com.elechen.ssm.po.UsersQueryVo;

import java.util.List;

/**
 * Created by Incredile on 2016/11/24.
 */
public interface UserService {
    public List<User> findUsersList(UsersQueryVo usersQueryVo) throws Exception;
    public User findUserById(int id) throws Exception;
}
