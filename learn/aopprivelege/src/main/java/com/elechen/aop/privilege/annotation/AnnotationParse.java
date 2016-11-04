package com.elechen.aop.privilege.annotation;

import java.lang.reflect.Method;

/**
 * Created by Incredile on 2016/11/2.
 */
public class AnnotationParse {
    public static String methodAccess = "";

    public static String Parse(Class targetClass, String methodName ) throws NoSuchMethodException {

        Method method = targetClass.getMethod(methodName);
        if (method.isAnnotationPresent(PrivilegeInfo.class)) {
            PrivilegeInfo privilegeInfo = (PrivilegeInfo) method.getAnnotation(PrivilegeInfo.class);
            methodAccess = privilegeInfo.name();
        }
        return methodAccess;
    }
}
