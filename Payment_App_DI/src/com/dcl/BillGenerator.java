package com.dcl;

//Target class
public class BillGenerator {

	Payment payment;
	
	public BillGenerator() {
		System.out.println("0-param-BG-con");
	}
	
	public BillGenerator(Payment payment) {
		this.payment=payment;
		System.out.println("param-BG-CON");
	}
	
	public void setPayment(Payment payment) {
		this.payment=payment;
		System.out.println("setter() called");
	}
	
	void generateBill() {
		payment.doPayment();
		System.out.println("Bill Gen");
	}
}
