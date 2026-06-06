package com.app;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class Employee {
	private int id;
	private String Firstname;
	private String LastName;
	private String email;
	private int age;
	
}
