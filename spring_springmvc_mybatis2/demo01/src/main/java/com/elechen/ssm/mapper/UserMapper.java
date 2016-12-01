package com.elechen.ssm.mapper;

import com.elechen.ssm.po.UserCustom;

import java.util.List;

/**
 * Created by Incredile on 2016/11/24.
 */
public interface UserMapper {
    public List<UserCustom> findAllUsersList() throws Exception;
    public UserCustom findUserById(int id) throws Exception;
}
