package com.love2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		Coach thecoach = context.getBean("myCoach",Coach.class);
		
		System.out.println(thecoach.getDailyWorkout());
		
		context.close();
	}

}
