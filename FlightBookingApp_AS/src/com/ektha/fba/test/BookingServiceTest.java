package com.ektha.fba.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ektha.fba.entity.BankPayment;
import com.ektha.fba.entity.CreditCard;
import com.ektha.fba.service.BookingService;

import junit.framework.Assert;

class BookingServiceTest {

	BookingService bookingService = new BookingService();

	@Test
	void testBookTicketWhenNameNull() {

		CreditCard creditCard = new CreditCard();
		creditCard.setCreditCardNumber(null);
		creditCard.setCvv(123);
		creditCard.setCreditCardNumber("1234567");
		int ticketFare = 1000;

		BookingService bookingService = new BookingService();
		String actual = bookingService.bookTicket(creditCard, ticketFare);

		String expected = null;
		assertEquals(expected, actual);

	}

	@Test
	void testBookTicketWhenCVVNull() {

		CreditCard creditCard = new CreditCard();
		creditCard.setCreditCardNumber("Anamika");
		int cvv = 0;
		creditCard.setCvv(cvv);
		creditCard.setCreditCardNumber("1234567");
		int ticketFare = 1000;

		BookingService bookingService = new BookingService();
		String actual = bookingService.bookTicket(creditCard, ticketFare);

		String expected = null;
		assertEquals(expected, actual);

	}

	@Test
	public void testBookTicket() {

		CreditCard creditCard = new CreditCard();
		creditCard.setNameOnCard("Anamika");
		creditCard.setCvv(123);
		creditCard.setCreditCardNumber("1234567");
		int ticketFare = 400;

		BookingService bookingService = new BookingService();
		String output = bookingService.bookTicket(creditCard, ticketFare);

		assertNotNull(output);
	}

	@Test
	public void testBookTicketWithWrongInfo() {

		CreditCard creditCard = new CreditCard();
		creditCard.setNameOnCard("Alisha");
		creditCard.setCvv(321);
		creditCard.setCreditCardNumber("12345908");
		int ticketFare = 500;

		String output = bookingService.bookTicket(creditCard, ticketFare);
		assertNotNull(output);

	}

	@Test
	public void testBookTicketWithNullTicketFare() {

		CreditCard creditCard = new CreditCard();
		creditCard.setNameOnCard("Anamika");
		creditCard.setCvv(123);
		creditCard.setCreditCardNumber("1234567");
		int ticketFare = 0;

		String actual = bookingService.bookTicket(creditCard, ticketFare);
		String expected = null;

		assertEquals(expected, null);

	}

	@Test
	public void testBookTicketWithNullCardDetails() {

		CreditCard creditCard = new CreditCard();
		creditCard.setNameOnCard(null);
		int cvv = 0;
		creditCard.setCvv(cvv);
		creditCard.setCreditCardNumber(null);
		int ticketFare = 5000;
		String expected = null;

		String actual = bookingService.bookTicket(creditCard, ticketFare);
		assertEquals(expected, actual);

	}

}
