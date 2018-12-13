package com.springcoredemo.config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcoredemo.core.Coach;
import com.springcoredemo.core.CricketCoach;

public class SetterDemoApp {

public static void main(String[] args) {
		
		// load configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		// retrieve bean from container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());

		// let's call our new method for fortune service
		System.out.println(theCoach.getFortune());
		
		// call new methods to get the literal values
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		
		// close the context
		context.close();

	}
	
}
