package com.springdemo;

public class MyApp {

	public static void main(String[] args) {

		Coach obj = new BaseballCoach();
		System.out.println(obj.getDailyWorkout());
		Coach obj2 = new TrackCoach();
		System.out.println(obj2.getDailyWorkout());

	}

}
