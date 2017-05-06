package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created  with Intellij IDEA.
 * User: EleChen
 * Date: 17/5/6
 * Time: 16:04
 * Description: 第一个spring boot Demo.
 */
@RestController
public class HelloWorld {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return "hello world";
    }
}
