package cn.edu.seig.spring;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @Author leiHua
 * @Date 2023/3/15 19:53
 */
public class LogAround  implements MethodInterceptor {

    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("开始执行"+invocation.getMethod().getName()+"方法");
        Object o = invocation.proceed();
        System.out.println("结束执行"+invocation.getMethod()+"方法");
        return o;
    }
}
