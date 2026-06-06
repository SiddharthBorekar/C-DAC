package com.app.utility;

public class TennisCoach implements coach {
	
	public TennisCoach() {
		System.out.println(getClass().getSimpleName());
	}
	
	@Override
	public String GetDailyWorkout() {
		return "5 km running";
	}
}
