package com.elechen.ssm.service.impl;

import com.elechen.ssm.mapper.UserMapper;
import com.elechen.ssm.po.User;
import com.elechen.ssm.po.UsersQueryVo;
import com.elechen.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * Created by Incredile on 2016/11/24.
 */
public class UserServceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> findUsersList(UsersQueryVo usersQueryVo) throws Exception {
        return userMapper.findUsersList(usersQueryVo);
    }

    public User findUserById(int id) throws Exception {
        return userMapper.findUserById(id);
    }
}
