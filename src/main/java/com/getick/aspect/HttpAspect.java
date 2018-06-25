package com.getick.aspect;

import com.getick.utils.Util;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 统一日志切面
 *
 * @author ikuacc
 * Created on 2017/10/17.
 */
@Aspect
@Component
public class HttpAspect {

    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    /**
     * 定义日志切面规则
     */
    @Pointcut("execution(public * com.getick.controller.*.*(..))")
    public void controllerLog() {

    }

    /**
     * 输出访问日志
     *
     * @param joinPoint 操作信息
     */
    @Before("controllerLog()")
    public void doBeforeLog(JoinPoint joinPoint) {

    }

    /**
     * 输出返回结果日志
     *
     * @param object 操作信息
     */
    @AfterReturning(returning = "object", pointcut = "controllerLog()")
    public void doAfterLog(Object object) {
        logger.info("response={}", object);
    }

}
