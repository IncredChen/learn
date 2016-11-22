package com.elechen.spring.springmvc.ssm.controller;

import com.elechen.spring.springmvc.ssm.po.ItemsCustom;
import com.elechen.spring.springmvc.ssm.po.ItemsQueryVo;
import com.elechen.spring.springmvc.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


/**
 * Created by Incredile on 2016/11/22.
 */
@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/quertItems")
    public ModelAndView findItemsList() throws Exception{

        List<ItemsCustom> itemList = itemsService.findItemsList(null);
        ModelAndView mv = new ModelAndView();
        mv.addObject("itemList",itemList);
        mv.setViewName("itemList");
        return mv;
    }
}
