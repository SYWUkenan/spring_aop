package cn.yswu.aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author yswu
 * @date 2021-04-28 11:23
 */

@Aspect //标记为切面
@Component //标记为组件，才能切入到ios当中的bean
public class LogAspect {

    //前置通知

    @Before("execution(* cn.yswu.service.impl.UserServiceImpl.add(cn.yswu.entity.User))")
    public void before(){
        System.out.println("前置通知");
    }

    //后置通知
    @After("execution(* cn.yswu.service.impl.*.*(..))")
    public void after(){
        System.out.println("后置通知");
    }
    //后置异常通知
    @AfterThrowing("execution(* cn.yswu.service.impl.*.*(..))")
    public void afterThrowing(){
        System.out.println("后置异常通知");
    }
    //后置返回通知
    @AfterReturning("execution(* cn.yswu.service.impl.*.*(..))")
    public void afterReturning(){
        System.out.println("后置返回通知");
    }

}
