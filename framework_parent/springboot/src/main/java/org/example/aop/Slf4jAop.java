package org.example.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author 16339
 */
@Slf4j
//@Aspect
//@Component
public class Slf4jAop {
    // 同时切入controller加service中所有方法
    @Around(value = "execution(* org.example.controller.*.*(..)) || execution(* org.example.service.*.*(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        // 前置打印进入某方法执行
        String name = proceedingJoinPoint.getSignature().getName();
        log.debug("进入" + name + "执行");
        Object[] args = proceedingJoinPoint.getArgs();
        for (int i = 0; i < args.length; i++) {
            log.debug("方法形参["+i+1+"]:" + args[i]);
        }
        try {
            Object result = proceedingJoinPoint.proceed();
            // 正常返回时，打印方法执行成功
            log.debug(name + "方法执行成功");
            return result;
        } catch (Throwable e) {
            log.debug(name + "方法执行失败，发送异常");
            // catch后再次抛出异常给全局异常处理器
            throw e;
        } finally {
            log.debug(name + "方法结束执行");
        }
    }
}
