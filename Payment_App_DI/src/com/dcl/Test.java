package com.dcl;

public class Test {

	public static void main(String[] args) {
	
		/**
		//CONSTRUCTOR-INJECTION
		Payment p1=new CreditCard();
		BillGenerator bg=new BillGenerator(p1);
		bg.generateBill();
		**/
		
		/**
		//SETTER INJECTION
		BillGenerator bg=new BillGenerator();
		Payment p2=new DebitCard();
		bg.setPayment(p2);
		bg.generateBill();
		**/
		
		//FIELD INJECTION
		BillGenerator bg=new BillGenerator();
		Payment p3=new UPI();
		bg.payment=p3;
		bg.generateBill();
		
	}

}
