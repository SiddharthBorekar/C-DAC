package com.app.utility;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component

public class CricketCoach implements coach {
	public CricketCoach() {
		System.out.println(getClass().getSimpleName());
	}

	@PostConstruct
	public void init() {
		System.out.println("Init methofd Called");
	}

	@PreDestroy
	public void distroy() {
		System.out.println("Destroy Method Called");
	}

	@Override
	public String GetDailyWorkout() {
		return "practice Bolling";
	}

}
