package cn.yswu.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author yswu
 * @date 2021-04-28 11:23
 */

@Aspect //标记为切面
@Component //标记为组件，才能切入到ios当中的bean
public class LogAspect {




    //前置通知

    @Before("execution(* cn.yswu.service.impl.UserServiceImpl.*(..))")
    public void before(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("前置通知"+ name+"方法运行了，参数是:" + Arrays.asList(args));
    }

//    @Before("execution(* cn.yswu.service.impl.UserServiceImpl.add(cn.yswu.entity.User)) && @annotation(jdk.nashorn.internal.runtime.logging.Logger)")
//    public void before(){
//        System.out.println("前置通知");
//    }


    //后置通知
    @After("execution(* cn.yswu.service.impl.*.*(..))")
    public void after(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("后置通知"+ name+"方法运行了，参数是:" + Arrays.asList(args));
    }
    //后置异常通知
    @AfterThrowing(value = "execution(* cn.yswu.service.impl.*.*(..))",throwing = "ex")
    public void afterThrowing(Exception ex){
        //异常栈
        StringWriter stringWriter = new StringWriter();
        ex.printStackTrace(new PrintWriter(stringWriter,true));

        System.out.println("后置异常通知,异常为："+stringWriter.getBuffer());
    }
    //后置返回通知
    @AfterReturning(value = "execution(* cn.yswu.service.impl.*.*(..))",
    returning = "returnValue")
    public void afterReturning(Object returnValue){
        System.out.println("后置返回通知,返回值为"+returnValue);
    }

}
