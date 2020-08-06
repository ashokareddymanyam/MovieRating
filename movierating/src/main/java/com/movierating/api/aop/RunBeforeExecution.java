package com.movierating.api.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class RunBeforeExecution {

	@Before("execution(* com.java2novice.bean.MyBusinessService.runMyBusinessLogic(..))")
    public void before(JoinPoint joinPoint) throws Throwable {
        System.out.println("Inside RunBeforeExecution.before() method...");
        System.out.println("inserted before : " + joinPoint.getSignature().getName());
    }
}
