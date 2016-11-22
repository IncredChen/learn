package com.elechen.spring;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

/**
 * Created by Incredile on 2016/11/19.
 */
//bean解析类
public class BeanFactory {

    public Object getBean(String name){
        //获取的bean
        Object obj =null;
        //解析xml配置文件sax方法
        try {
            SAXReader saxReader = new SAXReader();
            Document dom = saxReader.read(new File("src/main/spring.xml"));
            Element rootElement = dom.getRootElement();
            List<Element> list = rootElement.elements();
            for(Element e1 : list) {
                //获取节点的id属性，（唯一标识一个bean）
                String id = e1.attributeValue("id");
                //判断id是否等于目标
                if (id.equals(name)) {
                    //获取bean的全访问路径
                    String s_class = e1.attributeValue("class");
                    //反射获取目标类字节码
                    Class clazz = Class.forName(s_class);
                    //反射创建新对象
                    obj=clazz.newInstance();
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //返回目标对象
        return obj;
    }
}
