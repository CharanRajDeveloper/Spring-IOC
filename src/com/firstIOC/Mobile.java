package com.firstIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		/*
		 * Airtel a=context.getBean("airtel",Airtel.class); a.calling(); a.data();
		 * Vodafone v=context.getBean("vodafone",Vodafone.class); v.calling(); v.data();
		 */
		//To make it Configurable
		Sim s=context.getBean("sim",Sim.class);
		s.calling();
		s.data();
		
	}

}