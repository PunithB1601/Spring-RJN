package com.dcl.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	private Engine engine;
	
	
	
	public Car() {
		System.out.println("0-param-CON");
	}



	public Car(Engine engine) {
		System.out.println("param-Car-CON");
		this.engine = engine;
	}



	public void move() {
		engine.start();
		System.out.println("Car started moving");
	}
}
