package com.springdemo;

import java.util.Random;

public class RandonFortuneService implements FortuneService {

	@Override
	public String getFortune() {

		String fortunes[] = new String[] {"This is your luck day","You are awesome","You will get what you wish","You are gonna meet a special person today",
				"Things are gonna take a positive turn today"};
		Random rand = new Random();
		int i = rand.nextInt(4);
		return fortunes[i];
	}

}
