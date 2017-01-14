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
        Map<String,String> map = MessageUtil.xmlToMap(req);
        PrintWriter pw = resp.getWriter();
        String toUserName = map.get("ToUserName");
        String fromUserName = map.get("FromUserName");
        String msgType = map.get("MsgType");
        String content = map.get("Content");

        String remsg = null;
        if ("text".equals(msgType)){
            TextMessage msg = new TextMessage();
            msg.setToUserName(fromUserName);
            msg.setFromUserName(toUserName);
            msg.setMsgType("text");
            msg.setCreateTime(new Date().getTime());
            msg.setContent("你发的是这："+content);
            remsg = MessageUtil.textToxml(msg);
        }
        System.out.println(remsg);
        pw.print(remsg);
        pw.close();
    }
}
