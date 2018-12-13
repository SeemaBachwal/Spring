package com.springcoredemo.config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcoredemo.core.Coach;

public class BeanScopeDemoApp {
	
	public static void main(String[] args) {
	
		// load configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from container
		Coach firstCoach = context.getBean("myCoach", Coach.class);
		
		Coach secondCoach = context.getBean("myCoach", Coach.class);
		
		// check whether they are same
		boolean result = (firstCoach == secondCoach);
		
		// printing out results
		System.out.println("\nAre they both pointing to same object : "+ result);
		
		System.out.println("\nMemory location for first coach  :  "+firstCoach);
		
		System.out.println("\nMemory location for second coach :  "+secondCoach+"\n");
		
		// close the context
		context.close();
		
	}
	
	

	
	
}
