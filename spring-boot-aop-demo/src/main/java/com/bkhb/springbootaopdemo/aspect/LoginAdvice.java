package com.bkhb.springbootaopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * 通知类
 *
 * @author bkhb
 * @version 1.0
 * @date 2023/4/8 16:56
 */
@Component
@Aspect // 定义一个切面
public class LoginAdvice {
    // 定义一个切点：OrderController中的所有方法都增强
    @Pointcut(value = "execution(* com.bkhb.springbootaopdemo.controller.OrderController.* (..))")
    private void loginAdvicePointcut(){}

    // 前置通知
    @Before(value = "loginAdvicePointcut()")
    public void before() {
        System.out.println("before...");
        ServletRequestAttributes sra = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        // 从请求头中获取用户信息
        String user  = sra.getRequest().getHeader("user");
        if (user == null) {
            System.out.println("用户未登录");
            throw new RuntimeException("用户为登录");
        }
        System.out.println(user + "已登录");
    }
    // 后置通知
    @AfterReturning(value = "loginAdvicePointcut()")
    public void afterReturning() {
        System.out.println("afterReturning...");
    }
    // 最终通知
    @After(value = "loginAdvicePointcut()")
    public void after() {
        System.out.println("after...");
    }
    // 异常通知
    @AfterThrowing(value = "loginAdvicePointcut()")
    public void afterThrowing() {
        System.out.println("afterThrowing...");
    }
    // 环绕通知 也可以直接将切入点放在通知的value中
    @Around(value = "execution(* com.bkhb.springbootaopdemo.controller.OrderController.* (..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前.........");
        //被增强的方法执行
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("环绕之后.........");
        return proceed;
    }
}
