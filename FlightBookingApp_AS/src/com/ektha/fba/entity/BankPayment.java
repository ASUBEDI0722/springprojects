package com.ektha.fba.entity;

public class BankPayment {

	private String nameOnCard = "Anamika";
	private String creditCardNumber = "1234567";
	private int cvv = 123;
	private int availableCredit = 4000;

	public BankPayment() {

	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
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

	public int getAvailableCredit() {
		return availableCredit;
	}

	public void setAvailableCredit(int availableCredit) {
		this.availableCredit = availableCredit;
	}

}
