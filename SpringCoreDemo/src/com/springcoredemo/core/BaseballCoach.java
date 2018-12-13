package com.springcoredemo.core;

public class BaseballCoach implements Coach{
	
	// define private field for dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneservice) {
		this.fortuneService = theFortuneservice;
	}
	
	@Override
	public String getDailyWorkout(){
		
		return "Spend 30 mins on batting practice";
	}

	@Override
	public String getFortune() {

		return fortuneService.getFortune();
	}

}
