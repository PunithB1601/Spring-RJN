package com.dcl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("petrol")
public class Petrol implements Engine {

	public Petrol() {
		System.out.println("Petrol CON");
	}
	
	@Override
	public void start() {
		System.out.println("Petrol engine started");
	}

}
