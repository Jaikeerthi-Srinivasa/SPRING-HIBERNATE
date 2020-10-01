package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigDemo {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
//		Coach thatCoach = context.getBean("thatSillyCoach" , Coach.class);
		
		//Default without the bean id mentioned
		
		Coach thatCoach = context.getBean("tennisCoach" , Coach.class);
		
		
		System.out.println(thatCoach.getDailyWorkout());
		
		System.out.println(thatCoach.getDailyFortune());
		
		context.close();
	}

}
