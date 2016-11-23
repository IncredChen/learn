package com.elechen.ssm.controller;

import com.elechen.ssm.po.Items;
import com.elechen.ssm.po.ItemsCustom;
import com.elechen.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Incredile on 2016/11/23.
 */
@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/quertList")
    public ModelAndView findItemsList() throws Exception {
        List<ItemsCustom> itemList = itemsService.findItemsList(null);
        ModelAndView mv = new ModelAndView();
        mv.addObject("itemList",itemList);
        mv.setViewName("itemList");
        return mv;
    }
    @RequestMapping("/itemInfo")
    public ModelAndView findItemById() throws Exception {
        ItemsCustom itemsCustom = itemsService.findItemById(2);

        List<ItemsCustom> itemList = new ArrayList<ItemsCustom>();
        itemList.add(itemsCustom);
        ModelAndView mv = new ModelAndView();
        mv.addObject("itemList",itemList);
        mv.setViewName("itemList");
        return mv;
    }

}
