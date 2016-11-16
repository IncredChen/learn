package com.elechen.learn.mybatis.first;

import com.elechen.learn.mybatis.first.dao.UserDao;
import com.elechen.learn.mybatis.first.dao.impl.UserDaoImpl;
import com.elechen.learn.mybatis.first.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Incredile on 2016/11/8.
 */
public class FindUserByIdTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws IOException {
        //配置文件名
        String resource = "SqlMapConfig.xml";
        //获取配置文件资源
        InputStream inputStream = Resources.getResourceAsStream(resource);

        //创建sessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }


    @Test
    public void testFindUserById() {

        UserDao userDao = new UserDaoImpl(sqlSessionFactory);
        User user = userDao.findUserById(10);
        System.out.println(user);

    }

}
