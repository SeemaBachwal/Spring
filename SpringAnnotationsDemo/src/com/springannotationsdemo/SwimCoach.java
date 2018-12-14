package com.springannotationsdemo;

import org.springframework.beans.factory.annotation.Value;

/* This class is used in Spring Java Configuration Demo */

public class SwimCoach implements Coach {

	// To Inject values from properties file
	//@Value("${foo.email}")
	@Value("${foo.email}")
	private String email;
	
	//@Value("${foo.team}")
	@Value("${foo.team}")
	private String team;
	
	private FortuneService fortuneService;

	public SwimCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 metres as a warm up";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

}
