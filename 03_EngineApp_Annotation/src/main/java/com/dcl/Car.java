package com.dcl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

	
	private Engine engine;
	
	
	@Autowired
	
	public Car(Engine engine) {
		this.engine = engine;
		System.out.println("PARAM Car CON");
	}



	public Car() {
		System.out.println("0-param-Car-Con");
	}

	
	public void setEngine(Engine engine) {
		this.engine=engine;
		System.out.println("setter() called");
	}


	void move() {
		engine.start();
		System.out.println("Car is moving");
	}
}
