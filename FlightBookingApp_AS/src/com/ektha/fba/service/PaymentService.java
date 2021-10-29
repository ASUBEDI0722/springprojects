package com.ektha.fba.service;

import com.ektha.fba.dao.PaymentDAO;
import com.ektha.fba.entity.BankPayment;
import com.ektha.fba.entity.CreditCard;

public class PaymentService {

	BankPayment bankPayment = new BankPayment();

	PaymentDAO paymentDAO = new PaymentDAO();

	public boolean processPayment(CreditCard creditCard, float ticketFare) {

		boolean isPaymentProcessed = false;

		if (bankPayment.getAvailableCredit() >= ticketFare
				&& bankPayment.getCreditCardNumber().equals(creditCard.getCreditCardNumber())
				&& bankPayment.getCvv() == creditCard.getCvv()
				&& bankPayment.getNameOnCard().equals(creditCard.getNameOnCard())) {

			isPaymentProcessed = true;

		}
		return isPaymentProcessed;

	}

}
