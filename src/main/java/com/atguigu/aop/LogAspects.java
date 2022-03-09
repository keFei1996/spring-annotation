package com.atguigu.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * @author by zxk
 * @date 2022/3/9.
 */
@Aspect
public class LogAspects {

    // 抽取公共的切入点表达式
    // 本类引用
    @Pointcut("execution(public int com.atguigu.aop.MathCalculator.*(..))")
    public void pointCut() {

    }

    // 切入时机
    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println("" + joinPoint.getSignature().getName() +"运行。。。参数列表是：{}" + Arrays.asList(args));
    }

    @After("pointCut()")
    public void logEnd(JoinPoint joinPoint) {
        System.out.println("" + joinPoint.getSignature().getName() +"结束。。。");
    }

    @AfterReturning(value = "pointCut()", returning = "result")
    public void logReturn(Object result) {
        System.out.println("除法正常返回。。。运行结果：{}" + result);
    }

    @AfterThrowing(value = "pointCut()", throwing = "exception")
    public void logException(Exception exception) {
        System.out.println("除法异常。。。异常信息：{}" + exception);
    }
}
