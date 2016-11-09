package com.elechen.learn.mybatis.first.dao.impl;

import com.elechen.learn.mybatis.first.dao.UserDao;
import com.elechen.learn.mybatis.first.po.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


/**
 * Created by Incredile on 2016/11/8.
 */
public class UserDaoImpl implements UserDao {

    private SqlSessionFactory sqlSessionFactory;

    public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public User findUserById(int id) {
        SqlSession sqlSession =sqlSessionFactory.openSession();
        //通过sql 操纵数据库
        User user = sqlSession.selectOne("test.selectById",id); //查询单条记录
        sqlSession.close();

        return user;
    }


    public void addUser() {

    }

    public void deteleUserById(int id) {

    }

    public void updateUserById(int id) {

    }
}
