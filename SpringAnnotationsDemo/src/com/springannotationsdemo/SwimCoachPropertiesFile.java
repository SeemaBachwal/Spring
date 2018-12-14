package com.springannotationsdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/* This class is used in Auto wiring Demo */

@Component
public class SwimCoachPropertiesFile implements Coach{
	
	@Value("${foo.email}")
	private String email;
	
	
	@Value("${foo.team}")
	private String team;

	
	private FortuneService fortuneService;

	@Autowired
	public SwimCoachPropertiesFile(@Qualifier("databaseFortuneService") FortuneService theFortuneService) {
		System.out.println(">> SwimCoach : inside default constructor");
		this.fortuneService = theFortuneService;
	}
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}


	@Override
	public String getDailyWorkout() {
		return "Practice swimming daily one hour";
	}


	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	

}
