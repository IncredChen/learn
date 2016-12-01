package com.elechen.ssm;

import com.elechen.ssm.controller.ItemsController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Incredile on 2016/11/30.
 */

@RunWith(SpringJUnit4ClassRunner.class) // 整合
@ContextConfiguration(locations={"classpath:spring/springmvc.xml",}) // 加载配置
public class ItemsTest {
    @Autowired
    private ItemsController itemsController;

    @Test
    public void testItemsQuery(){

    }



}
