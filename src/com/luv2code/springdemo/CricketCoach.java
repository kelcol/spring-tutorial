package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	// add new fields
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket coach: inside setEmailAddress method");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
//		System.out.println("yo team");
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Cricket coach: inside setTeam method");
		this.team = team;
	}
	

	private FortuneService fortuneService;

	//Create a no-arg constructor
	public CricketCoach() {
		System.out.println("Cricket coach: inside no-arg constructor");
	}	
	
	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("Cricket coach: inside setFortuneService method");
	}


	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 mins";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
