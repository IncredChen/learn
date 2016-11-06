package com.elected.struts4;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * Created by Incredile on 2016/11/5.
 */
public class MyIntercepter2 implements Interceptor {

    @Override
    public void destroy() {

    }

    @Override
    public void init() {

    }

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {

        System.out.println("my intercepter 2");

        actionInvocation.invoke();

        return null;
    }
}
