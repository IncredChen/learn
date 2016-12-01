package com.elechen.ssm.controller;

import com.elechen.ssm.po.UserCustom;
import com.elechen.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


/**
 * Created by Incredile on 2016/11/24.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userList")
    public ModelAndView userList() throws Exception {
        List<UserCustom> userList = userService.findAllUsersList();
        ModelAndView mv = new ModelAndView("user/userList");
        mv.addObject("userList",userList);
        return mv;
    }

    @RequestMapping("/userInfo")
    public ModelAndView userInfo() throws Exception {
        UserCustom user = userService.findUserById(2);
        ModelAndView mv = new ModelAndView("user/userInfo");
        mv.addObject("user",user);
        return mv;
    }
}
