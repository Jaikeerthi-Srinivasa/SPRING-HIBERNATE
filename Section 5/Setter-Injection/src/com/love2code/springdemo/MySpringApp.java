package com.love2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {
		 
		// create a spring container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach" , Coach.class);
		
		//call methods n bean
		System.out.println(theCoach.getDailyWorkout());
		
		//Adding the new methods
		System.out.println(theCoach.getFortuneService());
		
		//close the context
		context.close();

	}

}
