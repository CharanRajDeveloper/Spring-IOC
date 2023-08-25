package com.firstIOC;

public class Vodafone implements Sim {
	
	Vodafone(){
		System.out.println("Vodafone Constructor");
	}

	@Override
	public void data() {
		System.out.println("Browsing Internet using Vodafone Sim");
		
	}

	@Override
	public void calling() {
		System.out.println("Calling using Vodafone Sim");
		
	}

}
