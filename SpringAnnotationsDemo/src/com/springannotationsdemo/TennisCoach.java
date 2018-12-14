package com.springannotationsdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	// Field type Injection
	/*
	 * @Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;*/
	
	
	
	public TennisCoach() {
		System.out.println(">> TennisCoach : Inside default constructor");
	}
	
	// Constructor type Injection
	/* @Autowired
	public TennisCoach(@Qualifier("restfortune") FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	// Setter type Injection
	@Autowired
	@Qualifier("restfortune")
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("TennisCoach : Inside setFortuneService method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	/* Any methodName type Injection
	 * @Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println("TennisCoach : Inside doSomeCrazyStuff method");
		this.fortuneService = fortuneService;
	}*/
	
	// define my init method
	@PostConstruct
	public void doMyStartUpStuff() {
		System.out.println(">> TennisCoach : Inside doMyStartUpStuff method");
		
	}
	
	
	// define my destroy method
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println(">> TennisCoach : Inside doMyCleanUpStuff method");
	}
	

}
