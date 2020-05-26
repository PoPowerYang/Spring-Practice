package com.yang.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private Random rand = new Random();
	private String[] data = {
		"Beware of dog",
		"do the tax",
		"death is coming"
	};
	@Override
	public String getFortune() {
		return data[rand.nextInt(data.length)];
	}

}
