package com.ektha.fba.entity;

public class CreditCard extends Payment {

	private String creditCardNumber;
	private int cvv;

	public CreditCard() {

	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
	

}
