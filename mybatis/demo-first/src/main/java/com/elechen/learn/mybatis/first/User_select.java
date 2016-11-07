package com.elechen.learn.mybatis.first;

import com.elechen.learn.mybatis.first.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


/**
 * Created by Incredile on 2016/11/7.
 */
public class User_select {
    public static void main(String[] args) throws IOException {
        //配置文件名
        String resource = "SqlMapConfig.xml";
        //获取配置文件资源
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //创建sessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //创建sqlSession
        SqlSession sqlSession =sqlSessionFactory.openSession();
        //通过sql 操纵数据库
        User user = sqlSession.selectOne("test.selectById",10); //查询单条记录

        System.out.println(user);
        List<User> list = sqlSession.selectList("test.selectToList","%张%");
        System.out.println(list);
        List<User> list2= sqlSession.selectList("test.selectToList","张");
        System.out.println(list2);
        //关闭session
        sqlSession.close();
    }
}
