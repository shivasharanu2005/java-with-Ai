package com.abstaction;

class UPI implements Paymentmethod {

	@Override
	public void PaymentType() {
		System.out.println("payment type is upi");
	}
}

class CreditCard implements Paymentmethod {
	@Override
	public void PaymentType() {
		System.out.println("payment type is CreditCard ");
	}

}

public class Abstractionusinginterface {

}
