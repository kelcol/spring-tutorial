package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">>TT:  inside default constructor");
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
