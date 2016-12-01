package com.elechen.ssm.controller;

import com.elechen.ssm.po.ItemsCustom;
import com.elechen.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Incredile on 2016/11/30.
 */
@Controller("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    public ModelAndView findItemsList() throws Exception{
        List<ItemsCustom> itemsList = itemsService.findItemsList(null);
        ModelAndView mv = new ModelAndView("items/itemsQuery");
        mv.addObject("itemsList",itemsList);
        return  mv;
    }

}
