package com.love2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CricketMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach thecoach = context.getBean("myCricketCoach",CricketCoach.class);
		
		System.out.println(thecoach.getDailyWorkout());
		
		System.out.println(thecoach.getFortuneService());
		
		System.out.println(thecoach.getEmailAddress());
		
		System.out.println(thecoach.getTeam());
		
		context.close();
	}

}
