package com.elechen.ssm.service.impl;

import com.elechen.ssm.mapper.UserMapper;
import com.elechen.ssm.po.UserCustom;
import com.elechen.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by Incredile on 2016/11/24.
 */
public class UserServceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<UserCustom> findAllUsersList() throws Exception {
        return userMapper.findAllUsersList();
    }

    public UserCustom findUserById(int id) throws Exception {
        return userMapper.findUserById(id);
    }
}
