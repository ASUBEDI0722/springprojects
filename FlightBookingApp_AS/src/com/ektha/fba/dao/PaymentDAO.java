package com.ektha.fba.dao;

import com.ektha.fba.entity.CreditCard;
import com.ektha.fba.entity.PaymentDBTable;

public class PaymentDAO {

	public void savePayment(CreditCard creditCard) {

		PaymentDBTable paymentTable = new PaymentDBTable();

		paymentTable.setNameOnAccount(creditCard.getNameOnCard());
		paymentTable.setCreditCardNumber(creditCard.getCreditCardNumber());
		paymentTable.setCvv(creditCard.getCvv());

	}

}
