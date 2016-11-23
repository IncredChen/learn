package com.elechen.ssm.service.impl;

import com.elechen.ssm.mapper.ItemsMapperCustom;
import com.elechen.ssm.po.ItemsCustom;
import com.elechen.ssm.po.ItemsQueryVo;
import com.elechen.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Incredile on 2016/11/23.
 */
public class ItemServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapperCustom itemsMapperCustom;

    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception {
        return itemsMapperCustom.findItemsList(itemsQueryVo);
    }

    public ItemsCustom findItemById(int id) throws Exception {
        return itemsMapperCustom.findItemById(id);
    }
}
