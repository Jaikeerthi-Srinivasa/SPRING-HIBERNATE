package com.love2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach thecoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach" , Coach.class);
		boolean result = (thecoach == alphaCoach);
		
		System.out.println("\nBoth coach objects are refering to same object : " + result);
		
		System.out.println("\nThe memeory address of the coach : " + thecoach);
		
		System.out.println("\nThe memeory address of the alphacoach : " + alphaCoach);
	}

}
