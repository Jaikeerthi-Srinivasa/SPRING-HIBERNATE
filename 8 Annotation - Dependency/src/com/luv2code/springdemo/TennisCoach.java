package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
/*	
	public TennisCoach() {
		System.out.println("No argument constructor");
	}
	
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		System.out.println("Inside the constructor");
		this.fortuneService = fortuneService;
	}
	
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside set fortune service");
		this.fortuneService = fortuneService;
	}
*/
	/*
	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println("Inside the doSomne");
		this.fortuneService = fortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice throwing the racket";
	}
	

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortuneService();
	}

}
