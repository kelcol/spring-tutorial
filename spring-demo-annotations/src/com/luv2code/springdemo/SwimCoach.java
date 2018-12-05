package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
	
	@Value("${hey.email}")
	private String email;
	
	@Value("${hey.team}")
	private String team;

	private FortuneService fortuneService;
	
	public SwimCoach() {
		
	}
	
	
	

	@Override
	public String getDailyWorkout() {
		System.out.println(team + "\n" + email);
		return "Swim a kajillion laps";
	}

	@Override
	public String getDailyFortune() {		
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	
	

}
