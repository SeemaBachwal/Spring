package com.springannotationsdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// load configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		// retrieve bean from container
		Coach coach = context.getBean("tennisCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getDailyFortune());

		
		/*SwimCoachPropertiesFile swim = context.getBean("swimCoachPropertiesFile", SwimCoachPropertiesFile.class);
		System.out.println(swim.getDailyWorkout());
		System.out.println(swim.getDailyFortune());
		System.out.println("Email : "+swim.getEmail());
		System.out.println("Team  : "+swim.getTeam());*/
		
		// close the context
		context.close();

		
	}
}
