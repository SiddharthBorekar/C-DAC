package com.app;

public class Vodafone implements Sim {
	public Vodafone() {
		System.out.println("Difault Constructor of vodafone is Called ");
	}
	
	@Override
	public void Calling() {
		System.out.println("Calling Using Vodafone :");
	}
	
	@Override
	public void Data() {
		System.out.println("Browsing Data using Voda sim");
	}
}
