package cn.edu.seig.aop;

public class AuthAspect {

	public void validateUser(){
		System.out.println("验证用户！");
	}

	//before()方法，输出"业务处理之前!"
	public void before(){
		System.out.println("before前置通知：业务处理前");
	}


	//after()方法，输出"业务处理之后!"
	public void after(){
		System.out.println("after后置通知业务处理之后");
	}




}
