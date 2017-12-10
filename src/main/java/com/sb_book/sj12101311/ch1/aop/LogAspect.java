package com.sb_book.sj12101311.ch1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect//声明切面
@Component//让切面成为spring容器管理的bean
public class LogAspect {
    /*声明切点*/
    @Pointcut("@annotation(com.sb_book.sj12101311.ch1.aop.Action)")
    public void annotationPointCut(){};


    @Before("annotationPointCut()")
    public void PointCutBefore(JoinPoint joinPoint){
        MethodSignature signature= (MethodSignature) joinPoint.getSignature();
        /*反射获得属性*/
        Method method=signature.getMethod();
        Action action=method.getAnnotation(Action.class);
        System.out.println("注解式拦截before--action.name："+action.name());
    }

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature= (MethodSignature) joinPoint.getSignature();
        /*反射获得属性*/
        Method method=signature.getMethod();
        Action action=method.getAnnotation(Action.class);
        System.out.println("注解式拦截after--action.name："+action.name());
    }

    @Before("execution(* com.sb_book.sj12101311.ch1.aop.DemoMethodService.*(..))")
    public void methodBefore(JoinPoint joinPoint){

        MethodSignature signature= (MethodSignature) joinPoint.getSignature();
        Method method=signature.getMethod();
        System.out.println("方法规则式拦截before"+method.getName());
    }
    @After("execution(* com.sb_book.sj12101311.ch1.aop.DemoMethodService.*(..))")
    public void methodAfter(JoinPoint joinPoint){

        MethodSignature signature= (MethodSignature) joinPoint.getSignature();
        Method method=signature.getMethod();
        System.out.println("方法规则式拦截after"+method.getName());
    }

}
