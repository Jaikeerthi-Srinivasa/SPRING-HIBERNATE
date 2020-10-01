package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach thecoach = context.getBean("tennisCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach" , Coach.class);
		
		boolean result = (thecoach == alphaCoach);
		
		System.out.println("\nBoth coach objects are refering to same object : " + result);
		
		System.out.println("\nThe memeory address of the coach : " + thecoach);
		
		System.out.println("\nThe memeory address of the alphacoach : " + alphaCoach);

	}

}
