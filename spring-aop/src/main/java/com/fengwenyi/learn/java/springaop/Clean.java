package com.fengwenyi.learn.java.springaop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Wenyi Feng
 */
@Component
@Aspect
public class Clean {

    // @Pointcut("execution(* com.fengwenyi.learn.java.springaop.service..*.*(..))")
    @Pointcut("execution(* com.fengwenyi.learn.java.springaop.service.EatService.eat())")
    public void eat() {
    }

    /**
     * 方法执行之前
     */
    @Before("eat()")
    public void doBefore() {
        System.out.println("吃饭之前，吃手");
    }

    /**
     * 方法执行之后
     */
    @After("eat()")
    public void doAfter() {
        System.out.println("吃饭之后，擦嘴");
    }

}
