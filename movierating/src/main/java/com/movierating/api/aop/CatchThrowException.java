package com.movierating.api.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CatchThrowException {

	@AfterThrowing(
    pointcut="execution(* com.java2novice.bean.MyBusinessService.testThrowException(..))", 
    throwing="excep")
    public void afterThrowing(JoinPoint joinPoint, Throwable excep) throws Throwable {
        System.out.println("Inside CatchThrowException.afterThrowing() method...");
        System.out.println("Running after throwing exception...");
        System.out.println("Exception : " + excep);
    }
}
