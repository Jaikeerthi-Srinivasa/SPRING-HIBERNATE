package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
//		Coach thatCoach = context.getBean("thatSillyCoach" , Coach.class);
		
		//Default without the bean id mentioned
		
		Coach thatCoach = context.getBean("tennisCoach" , Coach.class);
		
		
		System.out.println(thatCoach.getDailyWorkout());
		
		System.out.println(thatCoach.getDailyFortune());
		
		context.close();
	}

}
