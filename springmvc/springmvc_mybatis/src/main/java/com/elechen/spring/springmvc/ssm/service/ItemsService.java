package com.elechen.spring.springmvc.ssm.service;

import com.elechen.spring.springmvc.ssm.po.Items;
import com.elechen.spring.springmvc.ssm.po.ItemsCustom;
import com.elechen.spring.springmvc.ssm.po.ItemsQueryVo;

import java.util.List;

/**
 * Created by Incredile on 2016/11/21.
 */
public interface ItemsService {

    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;

    public ItemsCustom findItemById(int id) throws Exception;

    public void updateItem(Items items ) throws Exception;
}
