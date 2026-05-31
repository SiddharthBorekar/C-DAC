package com.app;

public class Human {
	public Heart heart;
	public Human() {
		System.out.println("Constructor of human :");
	}
	
	public Human (Heart heart) {
		super();
		System.out.println("In parameter of Human :");
		this.heart = heart;
	}
}
