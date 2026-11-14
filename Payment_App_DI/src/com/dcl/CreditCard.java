package com.dcl;

public class CreditCard implements Payment {

	@Override
	public void doPayment() {
		System.out.println("Credit Card payment done!");
	}

}
