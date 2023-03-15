package cn.edu.seig.spring.aspectJ;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @Author leiHua
 * @Date 2023/3/15 18:20
 */
@Aspect
public class MyInterceptor {
    // 切入点别名
    @Pointcut(value = "execution(* cn.edu.seig.spring.service.impl.*.*(..))")
    public void pointCut(){}


    @Before("pointCut()")
    public void myBefore(){
        System.out.println("前置通知");
    }
    @Around("pointCut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕通知：开始执行"+pjp.getSignature().getName()+"方法");
        Object o = pjp.proceed();
        System.out.println("环绕通知：结束执行"+pjp.getSignature().getName()+"方法");
        System.out.println("---------------------");
        return o;
    }
}
