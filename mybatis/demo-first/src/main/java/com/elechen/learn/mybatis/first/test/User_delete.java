package com.elechen.learn.mybatis.first.test;

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
public class User_delete {
    public static void main(String[] args) throws IOException {
        //配置文件名
        String resource = "SqlMapConfig.xml";
        //获取配置文件资源
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //创建sessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //创建sqlSession
        SqlSession sqlSession =sqlSessionFactory.openSession();

        sqlSession.delete("test.deleteUserById",20);

        sqlSession.commit();

        sqlSession.close();
    }
}
