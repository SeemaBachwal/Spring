package com.springcoredemo.core;

public class TrackCoach implements Coach{

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService theFortuneservice) {
		
		this.fortuneService = theFortuneservice;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5K";
	}

	@Override
	public String getFortune() {
		
		return fortuneService.getFortune();
	}

	// add an init method
	public void doMyStartStuff() {
		System.out.println("TrackCoach : inside init method");
	}
	
	
	// add an destroy method
	public void doMyCleanUpStuff() {
		System.out.println("TrackCoach : inside destroy method");
	}
	
}


