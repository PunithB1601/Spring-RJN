package com.dcl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("engine")
public class Diesel implements Engine {

	public Diesel() {
		System.out.println("Diesel CON");
	}

	@Override
	public void start() {
		System.out.println("Diesel Engine started");
	}

}
