package com.cn.myself.entity;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;

/**
 * Created by xiaolin.zhang on 2017/2/23.
 * 定义一个切面
 */

@Aspect
public class Audience {

    @Pointcut("execution(* com.cn.myself.service.IPermanceService.perform(..))")
    public void perform(){

    }
//    @Before("perform()")
//    public void silencePhone(){
//        System.out.println("phone 静音");
//    }
//    @Before("perform()")
//    public void takeSet(){
//        System.out.println("takeset");
//    }
//    @AfterReturning("perform()")
//    public void performanceOver(){
//        System.out.println("papa");
//    }
//    @AfterThrowing("perform()")
//    public void performanceFail(){
//        System.out.printf("demanding fignting");
//    }
    @Around("perform()")
    public  void watchPerformance(ProceedingJoinPoint pj){
        try {
            System.out.println("phone 静音");
            System.out.println("takeset");
            //Ctrl+Alt+T
            pj.proceed();//调用被通知的方法
            System.out.println("papa");
        } catch (Throwable throwable) {
           // throwable.printStackTrace();
            System.out.printf("demanding fignting");
        } finally {

        }


    }

}
