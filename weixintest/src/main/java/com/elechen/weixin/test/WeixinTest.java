package com.elechen.weixin.test;

import com.elechen.weixin.po.TextMessage;
import com.elechen.weixin.util.CheckUtil;
import com.elechen.weixin.util.MessageUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Map;

/**
 * Created  with Intellij IDEA.
 * User: Ele_Chen
 * Date: 2017/1/12
 * Time: 10:03
 * Description: 目的... .
 */
public class WeixinTest extends HttpServlet{
    public static final String token = "winxin_Ele_Chen";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        String signature = req.getParameter("signature");
        String timestamp = req.getParameter("timestamp");
        String nonce = req.getParameter("nonce");
        String echostr = req.getParameter("echostr");
        if(CheckUtil.weixinCheck(timestamp,nonce,signature)){
            pw.print(echostr);
        }
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");
        String remsg = null;
        Map<String,String> map = MessageUtil.xmlToMap(req);
        PrintWriter pw = resp.getWriter();
        String toUserName = map.get("ToUserName");
        String fromUserName = map.get("FromUserName");
        String msgType = map.get("MsgType");
        String content = map.get("Content");

        System.out.println("msgtype: "+msgType);
        if (MessageUtil.MESSAGE_TEXT.equals(msgType)){
            if("1".equals(content)){
                remsg = MessageUtil.initText(fromUserName,toUserName,MessageUtil.firstMenu());
            }else if("2".equals(content)){
                remsg = MessageUtil.initText(fromUserName,toUserName,MessageUtil.secondMenu());
            }else if("?".equals(content)||"？".equals(content)){
                remsg = MessageUtil.initText(fromUserName,toUserName,MessageUtil.menuText());
            }else {
                remsg = MessageUtil.initText(fromUserName,toUserName,"你发的是这："+content);
            }
        }else if(MessageUtil.MESSAGE_EVENT.equals(msgType)){
            String eventType = map.get("event");
            System.out.println("eventType: "+eventType);
            if (MessageUtil.EVENT_SUBSCRIBE.equals(eventType)){
                remsg = MessageUtil.initText(fromUserName,toUserName,MessageUtil.menuText());
            }else if (MessageUtil.EVENT_UNSUBSCRIBE.equals(eventType)){
                remsg = MessageUtil.initText(fromUserName,toUserName,"拜拜");
            }
        }
        System.out.println(remsg);
        pw.print(remsg);
        pw.close();
    }
}
