package com.love2code.springdemo;

public class Baseball implements Coach{
	
	public FortuneService fortuneService;
	
	public Baseball() {
		
	}
	
	public Baseball(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 min on batting practice";
	}

	@Override
	public String getFortuneService() {
		return fortuneService.getFortuneService();
	}

}
