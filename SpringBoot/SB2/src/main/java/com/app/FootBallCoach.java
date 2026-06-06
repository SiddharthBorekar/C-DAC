package com.app;

import com.app.utility.coach;

public class FootBallCoach implements coach {
	public FootBallCoach() {
		System.out.println(getClass().getSimpleName());
	}
	
	public String GetDailyWorkout() {
		return "Streaching";
	}
}
