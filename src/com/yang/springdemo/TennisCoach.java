package com.yang.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	//define init method
	@PostConstruct
	public void initMethod() {
		
		System.out.println(">> TennisCoach: inside of initMethod." + fortuneService.getFortune());
	}
	
	//define  destory method
	@PreDestroy
	public void destroyMethod() {
		System.out.println(">> TennisCoach: inside of desotryMethod.");
	}
	
	//define a setter method
//	@Autowired
//	public void thisAppIsTheBestApp(FortuneService theFortuneService) {
//		System.out.println(">> TennisCoach: inside setter method");
//		fortuneService = theFortuneService;
//	}
	
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
