package com.elechen.weixin.util;

import com.elechen.weixin.test.WeixinTest;

import java.util.Arrays;

/**
 * Created  with Intellij IDEA.
 * User: Ele_Chen
 * Date: 2017/1/12
 * Time: 10:24
 * Description: 目的... .
 */
public class CheckUtil {
    public static boolean weixinCheck(String timestamp,String nonce, String signature){

        String[] ss = new String[]{WeixinTest.token,timestamp,nonce};
        Arrays.sort(ss);
        StringBuffer context = new StringBuffer();
        for (String s :ss){
            context.append(s);
        }
        return signature.equals(Sha1.getSha1(context.toString()))?true:false;
    }
}
