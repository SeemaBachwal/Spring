package com.springannotationsdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring configuration java class
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// retrieve bean from container
		// here "swimCoach" is the method name returning SwimCoach bean in SportConfig file
		// Coach coach = context.getBean("swimCoach", Coach.class);
		
		
		// here we changed Coach reference to Swim Coach so that we can access Swim specific methods
		// getEmail and getTeam which aren't available in Coach interface
		SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);
		
		// call methods on the bean
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getDailyFortune());
		
		// call our new swim coach methods.. has the props value injected
		System.out.println("Email  :  "+coach.getEmail());
		System.out.println("Team   :  "+coach.getTeam());
	
		// close the context
		context.close();

		
	}
}
