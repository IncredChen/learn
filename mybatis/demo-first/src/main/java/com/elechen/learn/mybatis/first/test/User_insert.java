package com.elechen.learn.mybatis.first.test;

import com.elechen.learn.mybatis.first.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;


/**
 * Created by Incredile on 2016/11/7.
 */
public class User_insert {
    public static void main(String[] args) throws IOException {
        //配置文件名
        String resource = "SqlMapConfig.xml";
        //获取配置文件资源
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //创建sessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //创建sqlSession
        SqlSession sqlSession =sqlSessionFactory.openSession();

        //未添加用户输入参数
        User u = new User();
        u.setAddress("西安");
        u.setBirthday(new Date());
        u.setDetail("学生");
        u.setScore(88.88f);
        u.setSex("男");
        u.setUsername("陈象");


        //通过sql 操纵数据库
        sqlSession.insert("test.insertUser",u);
        //提交事务
        sqlSession.commit();

        int id = u.getId();

        System.out.println(u);

        //关闭session
        sqlSession.close();

    }
}
