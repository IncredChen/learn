package com.elected.struts4;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * Created by Incredile on 2016/11/5.
 */
public class MyIntercepter implements Interceptor {


    @Override
    public void destroy() {

    }

    @Override
    public void init() {

    }

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        actionInvocation.invoke();
        System.out.println("intercepter1");
        return null;
    }
}
