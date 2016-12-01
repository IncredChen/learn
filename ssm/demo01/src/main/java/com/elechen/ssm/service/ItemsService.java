package com.elechen.ssm.service;

import com.elechen.ssm.po.Items;
import com.elechen.ssm.po.ItemsCustom;
import com.elechen.ssm.po.ItemsQueryVo;
import com.sun.xml.internal.bind.v2.TODO;

import java.util.List;

/**
 * Created by Incredile on 2016/11/23.
 */
public interface ItemsService {
    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
    public ItemsCustom findItemById(Integer id) throws Exception;
    public void updateItem(int id , ItemsCustom itemsCustom) throws Exception;
    // TODO 商品的修改
}
