package com.dcl;

public class Car {

	private Engine engine;
	
	public Car(Engine engine) {
		this.engine=engine;
		System.out.println("param-CAR-CON");
	}
	
	public Car() {
		System.out.println("0-param-CAR-CON");
	}
	
	public void setEngine(Engine engine) {
		this.engine=engine;
		System.out.println("setter() called");
	}
	
	
	void move() {
		engine.start();
		System.out.println("Car started moving");
	}
}
