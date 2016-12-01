package com.elechen.ssm.service.impl;

import com.elechen.ssm.mapper.ItemsMapper;
import com.elechen.ssm.mapper.ItemsMapperCustom;
import com.elechen.ssm.po.Items;
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

    @Autowired
    private ItemsMapper itemsMapper;

    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception {
        return itemsMapperCustom.findItemsList(itemsQueryVo);
    }

    public ItemsCustom findItemById(Integer id) throws Exception {
        return itemsMapperCustom.findItemById(id);
    }

    @Override
    public void updateItem(int id, ItemsCustom itemsCustom) throws Exception {
        //参数转换：
        Items items = new Items();


        //大文本全部更新
        //必须传递id 主键 进行更新
        itemsCustom.setId(id);
        itemsMapper.updateByPrimaryKeyWithBLOBs(itemsCustom);
    }

}
