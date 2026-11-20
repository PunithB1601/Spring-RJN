package com.dcl;

public class CNG implements Engine {

	public CNG() {
		System.out.println("CNG CON");
	}
	
	@Override
	public void start() {
		System.out.println("CNG started");
	}

}
