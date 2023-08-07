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
		
		CricketCoach cricketCoach = context.getBean("myCricketCoach",CricketCoach.class);
		System.out.println("Setter Injection Example: "+cricketCoach.getDailyFortune());
		System.out.println("Values Injecton from application context ex: "+cricketCoach.getEmailAddress()+" : "+cricketCoach.getTeam());
		System.out.println("Values Injecton from application context and Properties file ex: "+cricketCoach.getManager()+" : "+cricketCoach.getPro());
		
		System.out.println("=======Random Fortune============");
		RandomCoach randomCoach=context.getBean("randomCoach",RandomCoach.class);
		System.out.println(randomCoach.getDailyFortune());
		//close cont
		context.close();
	}

}
