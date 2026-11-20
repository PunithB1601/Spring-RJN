package com.dcl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("cng")
@Primary
public class CNG implements Engine {

	public CNG() {
		System.out.println("CNG CON");
	}

	@Override
	public void start() {
		System.out.println("CNG started");
	}

}
