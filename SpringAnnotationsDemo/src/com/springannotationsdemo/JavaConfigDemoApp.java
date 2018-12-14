package com.springannotationsdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring configuration java class
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// retrieve bean from container
		Coach coach = context.getBean("tennisCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getDailyFortune());

		// close the context
		context.close();

		
	}
}
