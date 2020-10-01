package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimConfigDemo {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		SwimCoach thatCoach = context.getBean("swimCoach" , SwimCoach.class);
		
		System.out.println(thatCoach.getDailyWorkout());
		
		System.out.println(thatCoach.getDailyFortune());
		
		System.out.println(thatCoach.getEmail());
		
		System.out.println(thatCoach.getTeam());
		

		context.close();
	}

}
