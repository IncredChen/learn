package com.elechen.weixin.util;

import com.elechen.weixin.po.TextMessage;
import com.thoughtworks.xstream.XStream;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created  with Intellij IDEA.
 * User: Ele_Chen
 * Date: 2017/1/12
 * Time: 14:36
 * Description: 目的... .
 */
public class MessageUtil {
    public static Map<String, String> xmlToMap(HttpServletRequest req) {
        InputStream in = null;
        Map<String, String> map = null;
        try {
            map = new HashMap<String, String>();

            in = req.getInputStream();
            SAXReader reader = new SAXReader();
            Document doc = reader.read(in);
            Element root = doc.getRootElement();
            List<Element> elements = root.elements();
            for(Element e : elements){
                map.put(e.getName(),e.getText());
            }
            in.close();
            return map;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }


    public static String textToxml(TextMessage msg) {
        XStream xstream = new XStream();
        xstream.alias("xml",TextMessage.class);
        return xstream.toXML(msg);
    }
}