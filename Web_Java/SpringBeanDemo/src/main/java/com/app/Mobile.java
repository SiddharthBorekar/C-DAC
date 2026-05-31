package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		/*
		 * Vodafone voda = new Vodafone(); voda.Calling(); voda.Data();
		 * 
		 * Jio j = new Jio(); j.Calling(); j.Data(); ye wala use nahi krna hai
		 */

//		ApplicationContext Context = new ClassPathXmlApplicationContext("beans.xml");
//		Vodafone v = Context.getBean("voda",Vodafone.class);
//		v.Calling();
//		v.Data();

//		ApplicationContext Context = new ClassPathXmlApplicationContext("beans.xml");
//		Jio j = Context.getBean(Jio.class,"jio");
//		j.Calling();
//		j.Data();
//		
		ApplicationContext Context = new ClassPathXmlApplicationContext("beans.xml");
		Sim sim =  Context.getBean(Sim.class,"sim");
		sim.Calling();
		sim.Data();
		
	}
}
