package com.elechen.ssm.mapper;


import com.elechen.ssm.po.Items;
import com.elechen.ssm.po.ItemsCustom;
import com.elechen.ssm.po.ItemsQueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Incredile on 2016/11/21.
 */

public interface ItemsMapperCustom {
    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
    public ItemsCustom findItemById(@Param("id") int id) throws Exception;
    public void updateItemById(Items items)throws Exception;
}
