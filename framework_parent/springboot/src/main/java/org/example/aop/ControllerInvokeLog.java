package org.example.aop;

import net.sf.jsqlparser.statement.select.Join;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.example.entity.InterfaceCallRecord;
import org.example.mapper.InterfaceCallRecordMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Map;

/**
 * @Aspect 声明该类为切面类
 * @Component 让IOC注册此类
 * @author 16339
 */
//@Aspect
//@Component
public class ControllerInvokeLog {

    @Resource
    InterfaceCallRecordMapper interfaceCallRecordMapper;

    /**
     * 环绕增强
     * @param proceedingJoinPoint
     * @return
     */
    @Around(value = "execution(* org.example.controller.*.*(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        // 创建接口调用记录对象
        InterfaceCallRecord record = new InterfaceCallRecord();
        // 设置开始时间
        record.setStartCallTime(System.currentTimeMillis());
        // 这里就是目标方法的前置，拿到目标方法名字和参数列表
        String name = proceedingJoinPoint.getSignature().getName();
        record.setInterfaceName(name);
        // 拿到方法的形参列表
        Object[] args = proceedingJoinPoint.getArgs();
        // 拿到request对象
        HttpServletRequest request = (HttpServletRequest) args[0];
        record.setRequestIp(request.getRemoteAddr());
        record.setUrl(request.getRequestURL().toString());
        record.setMethod(request.getMethod());
        try {
            // 执行目标方法，拿到目标方法的返回值
            Object result = proceedingJoinPoint.proceed();
            record.setHasError(0);
            // 如果这里不返回，则目标方法也不返回
            return result;
        } catch (Throwable e) {
            // 捕捉的就是目标方法执行时抛出的异常
            // 问题：AOP的环绕增强，捕捉了全接口的异常，此时，当接口发送异常后不走全局异常处理器
            // 解决：再次抛出这个异常就可以被全局异常处理器捕捉到
            e.printStackTrace();
            record.setHasError(1);
            record.setErrorMessage(e.getMessage());
            throw new RuntimeException(e);
        } finally {
            record.setEndCallTime(System.currentTimeMillis());
            record.setDuration(record.getEndCallTime() - record.getStartCallTime());
            interfaceCallRecordMapper.insert(record);
        }
    }

//    /**
//     * @Before 前置通知注解
//     * 公共非业务代码建议用aop去写
//     * execution是设计执行路径的关键字
//     * 切入了这些方法的前面去执行
//     */
//    @Before("execution(* org.example.controller.HelloController.*(..))")
//    public void before(JoinPoint joinPoint) {
//        InterfaceCallRecord interfaceCallRecord = new InterfaceCallRecord();
//        interfaceCallRecord.setInterfaceName(joinPoint.getSignature().getName());
//        // 拿到方法的形参列表
//        Object[] args = joinPoint.getArgs();
//        HttpServletRequest request = (HttpServletRequest) args[0];
//        interfaceCallRecord.setRequestIp(request.getRemoteAddr());
//        interfaceCallRecord.setUrl(request.getRequestURL().toString());
//        interfaceCallRecord.setMethod(request.getMethod());
//        interfaceCallRecordMapper.insert(interfaceCallRecord);
//    }
//
    @AfterReturning(value = "execution(* org.example.controller.HelloController.*(..))", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        Map<String, Object> map = (Map<String, Object>) result;
        map.put("dateTime", new Date());
    }

    @AfterThrowing()
    public void afterThrowing(JoinPoint joinPoint, Object result) {

    }

}
