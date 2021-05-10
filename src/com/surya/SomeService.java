package com.surya;

import org.aspectj.lang.JoinPoint; 

//import org.springframework.aop.AfterReturningAdvice;
//import org.springframework.aop.MethodBeforeAdvice;
//import org.springframework.aop.ThrowsAdvice;-->

//import java.lang.reflect.Method;

//public class Someservice implements MethodBeforeAdvice, AfterReturningAdvice, ThrowsAdvice {
	
	//@Override
//	public void before(Method arg0,Object[] arg1, Object arg2) throws Throwable {
		
		//System.out.println(arg0.getName());
		//System.out.println(arg1.length);
		//System.out.println(arg2.getClass().getName());
		//System.out.println(arg0.getName());
		//System.out.println("Aspect called");
		
		
	//}

	//@Override
	//public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		//System.out.println(arg0.getClass());
		//System.out.println(arg2.getClass().getName());
		//System.out.println("After Executed");
		
	//}	
//}

	
	public class SomeService{
		
		public void myadvice(JoinPoint jp)//it is advice  
	    {  
	        System.out.println("additional concern");  
	        //System.out.println("Method Signature: "  + jp.getSignature());  
	    }  
	
	
	}
	
	
	
	
	
	
	