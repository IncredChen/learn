package com.elechen.ssm.mapper;


import com.elechen.ssm.po.ItemsCustom;
import com.elechen.ssm.po.ItemsQueryVo;

import java.util.List;

/**
 * Created by Incredile on 2016/11/21.
 */

public interface ItemsMapperCustom {
    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
    public ItemsCustom findItemById(int id) throws Exception;
}
