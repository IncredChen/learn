package com.elechen.ssm.mapper;

import java.util.List;

import com.elechen.ssm.po.ItemsCustom;
import com.elechen.ssm.po.ItemsQueryVo;
import org.apache.ibatis.annotations.Param;

public interface ItemsMapperCustom {
    //商品查询列表
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)throws Exception;
}