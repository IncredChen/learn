package com.elechen.spring;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Incredile on 2016/11/19.
 */

public class BeanFactory3 {
    private static Map map = new HashMap();
    static {
        Object obj = null;
        try {
            SAXReader saxReader = new SAXReader();
            Document dom = saxReader.read(new File("src/main/spring.xml"));
            Element rootElement = dom.getRootElement();
            List<Element> list = rootElement.elements();
            for (Element e1 : list) {
                String id = e1.attributeValue("id");
                String s_class = e1.attributeValue("class");
                Class clazz = Class.forName(s_class);
                obj = clazz.newInstance();
                List<Element> es = e1.elements();
                for (Element e2 : es) {
                    String f_name = e2.attributeValue("name");
                    String f_value = e2.attributeValue("value");

                    String m_name = "set" + f_name.substring(0, 1).toUpperCase() + f_name.substring(1);
                    Field field = clazz.getDeclaredField(f_name);
                    Method method = clazz.getDeclaredMethod(m_name, field.getType());

                    if (f_value==null){
                        String f_ref = e2.attributeValue("ref");
                        Object obj2 = map.get(f_ref);
                        method.invoke(obj,obj2);
                    }else{
                        if (field.getType() == String.class) {
                            method.invoke(obj, f_value);
                        } else {
                            method.invoke(obj, Integer.parseInt(f_value));
                        }
                    }
                }
                map.put(id,obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Object getBean(String name) {
        return map.get(name);
    }
}
