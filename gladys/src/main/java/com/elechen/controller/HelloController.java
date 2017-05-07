package com.elechen.controller;

import com.elechen.properties.PeopleProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created  with Intellij IDEA.
 * User: EleChen
 * Date: 17/5/6
 * Time: 22:42
 * Description: 描述.
 */
@RestController
public class HelloController {

    //属性注入
    /*
    @Value("${name}")
    private String name;

    @Value("${age}")
    private Integer age;*/
    @Resource
    private PeopleProperties peopleProperties;


    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String hello(){
        return peopleProperties.getName()+ " " + peopleProperties.getAge();
    }
}
