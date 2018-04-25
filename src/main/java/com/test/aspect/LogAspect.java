package com.test.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by admin on 2018/4/12.
 */
@Aspect
@Component
public class LogAspect {

    @Around("execution(* com.test.service.*.*(..))")
    public void executionService(ProceedingJoinPoint joinPoint){
         //获取目标方法的参数信息
        Object[] args = joinPoint.getArgs();
        //AOP代理类信息
        Object athis = joinPoint.getThis();
        //代理的目标对象
        Object target = joinPoint.getTarget();
        //用的最多，通知的签名
        Signature signature = joinPoint.getSignature();
        //代理的是哪个方法
        System.out.println("代理的方法"+signature.getName());
        //AOP代理类的名字
        System.out.println("代理类名字" + signature);
        //AOP代理类的类信息
        Object proxyClass = signature.getDeclaringType();
        try {
            //执行目标方法
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
