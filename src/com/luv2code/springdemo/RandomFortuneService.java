package com.luv2code.springdemo;

import java.io.File;
import java.util.List;
import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	private String fortuneFile = "/spring-demo-one/src/com/luv2code/springdemo/randoFortunes.txt";
	private List<String> theFortunes;
	
	// create rando num generator
	private Random rando = new Random();
	
	public RandomFortuneService() {
		
		File theFile = new File(fortuneFile);
		
		System.out.println("The fortune file is " + theFile);
		System.out.println("File exists: " + theFile.exists());
		
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
