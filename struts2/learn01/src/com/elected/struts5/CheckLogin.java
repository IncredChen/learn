package com.elected.struts5;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

import java.util.Map;

/**
 * Created by Incredile on 2016/11/5.
 */
public class CheckLogin extends MethodFilterInterceptor{
    @Override
    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("check login");
        ActionContext context = actionInvocation.getInvocationContext();
        Map<String, Object> session = context.getSession();
        if(session.get("user")==null){
            return "login";
        }

        actionInvocation.invoke();
        return null;
    }
}
