package com.elechen.aop.salary.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by Incredile on 2016/11/3.
 */
public class Privilege {
    private String Access;

    public String getAccess() {
        return Access;
    }

    public void setAccess(String access) {
        Access = access;
    }


    public void privilege(ProceedingJoinPoint joinPoint) throws Throwable {
        if("admin".equals(this.Access)){
            System.out.println("欢迎登陆");
            joinPoint.proceed();
        }else {
            System.out.println("对不起，没有权限！");
        }
    }


}
