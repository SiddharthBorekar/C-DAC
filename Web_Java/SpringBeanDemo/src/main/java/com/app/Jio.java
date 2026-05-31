package com.app;

public class Jio implements Sim{
	public Jio() {
		System.out.println("Difault Constructor of Jio is Called ");
	}
	
	@Override
	public void Calling() {
		System.out.println("Calling Using Jio :");
	}
	
	@Override
	public void Data() {
		System.out.println("Browsing Data using Jio sim");
	}
}
