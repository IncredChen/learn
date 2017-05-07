package com.elechen.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created  with Intellij IDEA.
 * User: EleChen
 * Date: 17/5/7
 * Time: 21:11
 * Description: AOP.
 */
@Aspect
@Component
public class HttpAspect {

    //使用logger打印日志
    private static final Logger LOGGER = LoggerFactory.getLogger(HttpAspect.class);

    //提取公共切入
    @Pointcut("execution(public * com.elechen.controller.*.*(..))")
    public void log() {

    }


    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //url
        LOGGER.info("URL = {}", request.getRequestURI());

        //method
        LOGGER.info("method = {}", request.getMethod());

        //ip
        LOGGER.info("ip = {}", request.getRemoteAddr());

        //类方法
        LOGGER.info("class_method = {}", joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName() );

        //参数
        LOGGER.info("args = {}", joinPoint.getArgs());
    }

    @After("log()")
    public void doAfter() {
        LOGGER.info("2222222222");
    }

    //获取返回值
    @AfterReturning(returning = "object", pointcut = "log()")
    public void doAfterReturn(Object object){
        LOGGER.info("response = {}" ,object.toString());
    }
}
