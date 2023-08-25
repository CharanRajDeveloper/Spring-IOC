package com.firstIOC;

public class Airtel implements Sim {
	
	Airtel(){
		System.out.println("Airtel Constructor");
	}

	@Override
	public void data() {
		System.out.println("Browsing Internet using Airtel Sim");

	}

	@Override
	public void calling() {
		System.out.println("Calling using Airtel Sim");

	}

}
