package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	
	 public static void main(String[] args) {
		 
		 // read spring config file
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		 
		 // get bean from spring container
//		 Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
//		 Coach theCoach = context.getBean("tennisCoach", Coach.class);
		 Coach theCoach = context.getBean("pingPongCoach", Coach.class);
		 
		 // call method on the container
		 System.out.println(theCoach.getDailyWorkout());
		 
		 // close the context
		 context.close();
		 
	 }
	

}
