package com.dcl;

public class Petrol implements Engine {

	public Petrol() {
		System.out.println("Petrol CON");
	}
	
	@Override
	public void start() {
		System.out.println("Petrol engine started");
	}

}
