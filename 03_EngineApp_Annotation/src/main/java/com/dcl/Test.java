package com.dcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		//Start the IoC container
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		context.getBean(Car.class).move();
	//	System.out.println("IoC container started");
	}

}
