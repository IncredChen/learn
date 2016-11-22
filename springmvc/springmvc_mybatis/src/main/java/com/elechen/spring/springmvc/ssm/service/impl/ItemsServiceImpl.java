package com.elechen.spring.springmvc.ssm.service.impl;

import com.elechen.spring.springmvc.ssm.mapper.ItemsMapperCustom;
import com.elechen.spring.springmvc.ssm.po.Items;
import com.elechen.spring.springmvc.ssm.po.ItemsCustom;
import com.elechen.spring.springmvc.ssm.po.ItemsQueryVo;
import com.elechen.spring.springmvc.ssm.service.ItemsService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Incredile on 2016/11/21.
 */
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapperCustom itemsMapperCustom;

    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception {

        //通过itemsMapperCustom查询数据库
        return itemsMapperCustom.findItemList(itemsQueryVo);
    }

    public ItemsCustom findItemById( int id) throws Exception {

        Items items = itemsMapperCustom .findItemById(id);

        ItemsCustom itemsCustom = new ItemsCustom();
        BeanUtils.copyProperties(items,itemsCustom);
        return itemsCustom;
    }

    public void updateItem(Items items) throws Exception {
        //添加业务校验，通常在service接口对关键参数进行校验
        //校验
    }


}
