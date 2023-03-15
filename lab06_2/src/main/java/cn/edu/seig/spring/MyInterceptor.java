package cn.edu.seig.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

public class MyInterceptor {
	public void beforeDo(){
		System.out.println("[前置通知]");
	}

	public void afterDo(){
		System.out.println("[最终通知]");
	}

	public void returnDo(){
		System.out.println("[后置通知]");
	}

	public void exceptionDo(){
		System.out.println("[异常通知]方法抛出异常");
	}

	public void aroundDo(ProceedingJoinPoint pjp) throws Throwable{
		//ProceedingJoinPoint的getSignature()方法用于获取切入点
		System.out.println("环绕通知:开始执行[" + pjp.getSignature().getName() + "]方法！");
		Object res=null;
		res=pjp.proceed();
		System.out.println("环绕通知:结束执行[" + pjp.getSignature().getName() + "]方法！"); 
	}

}
