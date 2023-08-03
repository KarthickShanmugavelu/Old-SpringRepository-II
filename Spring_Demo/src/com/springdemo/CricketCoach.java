package com.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("Inside Cricket Coach Constructor");
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside Cricket Coach setter");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Start with practising fast bowling";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
