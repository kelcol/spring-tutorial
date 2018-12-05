package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach {

	private FortuneService fortuneService;

	@Autowired
	public PingPongCoach(@Qualifier("fortuneFromFileService") FortuneService theFortuneService) {
		System.out.println(">> PingPongCoach: inside constructor using @autowired and @qualifier");
		fortuneService = theFortuneService;
	}

		
	@Override
	public String getDailyWorkout() {
		return "PP: " + "Practice your pingpong drop shot";
	}

	@Override
	public String getDailyFortune() {
		return "PP: " + fortuneService.getFortune();
	}
	
	
	
}