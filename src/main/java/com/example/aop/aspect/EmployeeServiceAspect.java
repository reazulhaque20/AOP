package com.example.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeServiceAspect {

    @Before(value = "execution(* com.example.aop.service.EmployeeService.*(..)))")
    public void beforeExecution(JoinPoint joinPoint){
        System.out.println("Before Method: " + joinPoint.getSignature());
    }
}
