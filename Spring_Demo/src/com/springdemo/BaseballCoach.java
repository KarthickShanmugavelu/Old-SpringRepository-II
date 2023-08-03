package com.springdemo;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;

	public BaseballCoach() {

	}

	public BaseballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Spend 30 mins in batting";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
