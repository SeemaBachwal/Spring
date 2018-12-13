package com.springcoredemo.config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcoredemo.core.Coach;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		// retrieve bean from container
		Coach coach = context.getBean("myCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(coach.getDailyWorkout());

		// let's call our new method for fortune service
		System.out.println(coach.getFortune());
		
		// close the context
		context.close();

	}

}
