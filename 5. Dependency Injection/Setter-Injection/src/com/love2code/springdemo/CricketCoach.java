package com.love2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	private String emailAddress;
	
	private String  team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("CricketCoach");
	}	

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("setFortuneService");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		return "Practise fast bowling everyday";
	}

	@Override
	public String getFortuneService() {
		return fortuneService.getFortuneService();
	}

}
