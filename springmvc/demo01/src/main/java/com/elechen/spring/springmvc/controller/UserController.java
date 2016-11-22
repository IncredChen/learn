package com.elechen.spring.springmvc.controller;


import com.elechen.spring.springmvc.po.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Incredile on 2016/11/17.
 */
public class UserController implements Controller {

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        User user = new User();
        user.setName("陈象");
        user.setSex("男");
        user.setAge(21);
        User user2 = new User();
        user2.setName("张聪聪");
        user2.setSex("男");
        user2.setAge(22);

        List<User> userList = new ArrayList<User>();
        userList.add(user);
        userList.add(user2);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(userList);

        modelAndView.setViewName("index.jsp");


        return modelAndView;
    }
}
