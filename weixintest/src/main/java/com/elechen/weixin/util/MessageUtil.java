package com.elechen.weixin.util;

import com.elechen.weixin.po.TextMessage;
import com.sun.org.glassfish.external.statistics.Statistic;
import com.thoughtworks.xstream.XStream;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;
import java.util.Date;
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

    public static final String MESSAGE_TEXT = "text";  //文本
    public static final String MESSAGE_IMAGE = "image";  //图片
    public static final String MESSAGE_VOICE = "voice";  //语音
    public static final String MESSAGE_VIDEO = "video";//视频
    public static final String MESSAGE_SHORTVIDEO = "shortvideo";//小视频
    public static final String MESSAGE_LOCATION = "location";//位置信息
    public static final String MESSAGE_LINK = "link";//连接
    public static final String MESSAGE_EVENT = "event";//事件推送
    public static final String EVENT_SUBSCRIBE= "subscribe"; //关注
    public static final String EVENT_UNSUBSCRIBE = "unsubscribe";//取消关注
    public static final String EVENT_LOCATION = "LOCATION";//上报地理位置信息
    public static final String EVENT_CLICK = "CLICK";//点击菜单拉取消息时的事件推送
    public static final String EVENT_VIEW = "VIEW";//点击菜单跳转链接时的事件推送

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


    public static String menuText(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("欢迎关注我的微信平台，请按照菜单提示进行操作：\n\n");
        stringBuffer.append("1.平台介绍 \n");
        stringBuffer.append("2.我的介绍 \n");
        stringBuffer.append("回复？调出此菜单\n");
        return stringBuffer.toString();
    }

    /**
     *
     * @param msg
     * @return
     */
    public static String textToxml(TextMessage msg) {
        XStream xstream = new XStream();
        xstream.alias("xml",TextMessage.class);
        return xstream.toXML(msg);
    }


    public static String initText(String fu,String tu,String content){
        TextMessage msg = new TextMessage();
        msg.setToUserName(fu);
        msg.setFromUserName(tu);
        msg.setMsgType(MessageUtil.MESSAGE_TEXT);
        msg.setCreateTime(new Date().getTime());
        msg.setContent(content);
        return MessageUtil.textToxml(msg);
    }

    public static String firstMenu() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("这是一个测试平台");
        return stringBuffer.toString();
    }

    public static String secondMenu() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("这是一个EleChen的测试平台");
        return stringBuffer.toString();
    }
}