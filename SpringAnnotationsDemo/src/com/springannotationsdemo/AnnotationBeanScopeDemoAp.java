package com.springannotationsdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoAp {

	public static void main(String[] args) {
		
		// load configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		// retrieve bean from container
		Coach coach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		// check if they are same
		boolean result = (coach == alphaCoach);
		System.out.println("\nAre they same : "+result);
	
		System.out.println("\nMemory location of coach       :\t"+coach);
		System.out.println("\nMemory location of alphsCoach  :\ts"+alphaCoach+"\n");
		
		// close the context
		context.close();

		
	}
	
}
