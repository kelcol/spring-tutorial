package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">>TT:  inside default constructor");
	}
	
	// define my init method
	@PostConstruct
	public void doMyStartUpStuff() {
		System.out.println(">> TennisCoach: doing my startup stuff");
	}
	
	// define my destroy method
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println(">> TennisCoach: doing my cleanup stuff");
	}
	

	@Override
	public String getDailyWorkout() {
		return "T: " + "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {		
		return "T:" + fortuneService.getFortune();
	}

}
