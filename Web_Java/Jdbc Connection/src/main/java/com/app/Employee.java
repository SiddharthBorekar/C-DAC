package com.app;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	private String firstname;
	private String lastname;
	private String email;
	private int age ;
	private boolean gender;

	
	
}
