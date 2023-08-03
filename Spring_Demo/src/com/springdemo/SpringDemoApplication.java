package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoApplication {
	
	public static void main(String[] args) {
		//load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//get bean from Spring contnr
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach theCoach2=context.getBean("customCoach",Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println("Testing Constructor injection: "+theCoach.getDailyFortune());
		System.out.println(theCoach2.getDailyWorkout());
		
		Coach cricketCoach = context.getBean("myCricketCoach",Coach.class);
		System.out.println("Setter Injection Example: "+cricketCoach.getDailyFortune());
		//close cont
		context.close();
	}

}
