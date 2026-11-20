package com.dcl;

public class Diesel implements Engine {

	public Diesel() {
		System.out.println("Diesel CON");
	}
	
	@Override
	public void start() {
		System.out.println("Diesel Engine started");
	}

}
