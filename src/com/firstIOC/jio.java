package com.firstIOC;

public class jio implements Sim {
	
	jio(){
		System.out.println("jio Constructor");
	}

	@Override
	public void data() {
		System.out.println("Browsing Internet using jio Sim");

	}

	@Override
	public void calling() {
		System.out.println("Calling using jio Sim");

	}

}
