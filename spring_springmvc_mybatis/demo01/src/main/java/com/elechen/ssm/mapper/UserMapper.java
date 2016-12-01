package com.elechen.ssm.mapper;

import com.elechen.ssm.po.User;
import com.elechen.ssm.po.UsersQueryVo;

import java.util.List;

/**
 * Created by Incredile on 2016/11/24.
 */
public interface UserMapper {
    public List<User> findUsersList(UsersQueryVo usersQueryVo) throws Exception;
    public User findUserById(int id) throws Exception;
}
