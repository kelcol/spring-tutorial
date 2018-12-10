package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	
	// define my init method
		@PostConstruct
		public void doMyStartUpStuff() {
			System.out.println(">> HappyFortuneService: doing my startup stuff");
		}
		
		// define my destroy method
		@PreDestroy
		public void doMyCleanUpStuff() {
			System.out.println(">> HappyFortuneService: doing my cleanup stuff");
		}

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
