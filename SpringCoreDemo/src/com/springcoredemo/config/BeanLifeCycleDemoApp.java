package com.springcoredemo.config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcoredemo.core.Coach;

public class BeanLifeCycleDemoApp {
	
	public static void main(String[] args) {
	
		// load configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		// retrieve bean from container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortune());
		
		// close the context
		context.close();
		
	}
	
	

	
	
}
