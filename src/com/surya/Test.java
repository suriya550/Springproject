package com.surya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args){  
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
        FilterMethods e = (FilterMethods) context.getBean("opBean");
        System.out.println("calling Deposit Method...");  
        e.deposit(1000);
        System.out.println("calling WithDrawn Method..."); 
        e.withdrawn(1002);
        e.withdrawn(550);
        System.out.println("calling End Method...");
    }  
}
