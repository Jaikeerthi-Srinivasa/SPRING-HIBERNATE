package com.love2code.springdemo;

public class TrackCoach implements Coach {
	
public FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getFortuneService() {
		return "Do it " + fortuneService.getFortuneService();
	}
	
	public void intalizationMethod() {
		System.out.println("Inside Intialization Method");
	}
	
	public void destroyingMethod(){
		System.out.println("Inside the Destroying method");
	}

}
