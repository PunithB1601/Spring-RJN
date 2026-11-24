package com.dcl.demo;

import org.springframework.stereotype.Component;

@Component
public class Petrol implements Engine {

	public Petrol() {
		System.out.println("Petrol CON");
	}
	
	@Override
	public void start() {
		System.out.println("Engine started");
	}

}
