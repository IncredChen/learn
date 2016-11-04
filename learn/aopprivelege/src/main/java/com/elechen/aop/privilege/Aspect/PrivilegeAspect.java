package com.elechen.aop.privilege.Aspect;

import com.elechen.aop.privilege.annotation.AnnotationParse;
import com.elechen.aop.privilege.bean.Privilege;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Incredile on 2016/11/2.
 */
public class PrivilegeAspect {

    private List<Privilege> privilegeList = new ArrayList<Privilege>();

    public List<Privilege> getPrivilegeList() {
        return privilegeList;
    }

    public void setPrivilegeList(List<Privilege> privilegeList) {
        this.privilegeList = privilegeList;
    }


    public void isAccessMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        Class targetClass = joinPoint.getTarget().getClass();
        String methodName =  joinPoint.getSignature().getName();

        String methodAccess = AnnotationParse.Parse(targetClass,methodName);
        boolean flag = false;

        for(Privilege privilege : privilegeList){
            if(methodAccess.equals(privilege.getName())){
                //have accsee
                flag = true;
            }
        }
        if(flag){
            joinPoint.proceed();
        }else {
            System.out.println("没有权限！");
        }

    }

}
