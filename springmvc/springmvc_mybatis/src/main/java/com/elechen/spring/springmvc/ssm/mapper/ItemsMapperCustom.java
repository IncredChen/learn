package com.elechen.spring.springmvc.ssm.mapper;

import com.elechen.spring.springmvc.ssm.po.ItemsCustom;
import com.elechen.spring.springmvc.ssm.po.ItemsQueryVo;

import java.util.List;

/**
 * Created by Incredile on 2016/11/21.
 */

public interface ItemsMapperCustom {
    public List<ItemsCustom> findItemList(ItemsQueryVo itemsQueryVo) throws Exception;
    public ItemsCustom findItemById(int id) throws Exception;
}
