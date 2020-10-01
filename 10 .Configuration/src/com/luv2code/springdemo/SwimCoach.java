package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService; 
	
	@Value("${foo.email}")
	private String email;

	@Value("${foo.team}")
	private String team;
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public SwimCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swim 1000 meters as the up";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortuneService();
	}

}
