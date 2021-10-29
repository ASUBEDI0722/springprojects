package com.ektha.fba.service;

import java.util.Random;

import com.ektha.fba.dao.BookingDAO;
import com.ektha.fba.dao.PaymentDAO;
import com.ektha.fba.entity.CreditCard;
import com.ektha.fba.entity.Ticket;

public class BookingService {

	PaymentService paymentService = new PaymentService();

	BookingDAO bookingDAO = new BookingDAO();

	PaymentDAO paymentDAO = new PaymentDAO();

	public String bookTicket(CreditCard creditCard, float ticketFare) {

		String bookingConfirmation = null;
		
		if(creditCard == null) {
			return null;
		}

		boolean paymentProcessed = paymentService.processPayment(creditCard, ticketFare);

		
		if (paymentProcessed) {

			bookingConfirmation = generateCode();

			Ticket ticket = new Ticket();
			ticket.setTicketFare(ticketFare);
			ticket.setTicketNumber(bookingConfirmation);

			bookingDAO.saveTicket(ticket);

			paymentDAO.savePayment(creditCard);

		}

		return bookingConfirmation;
	}

	public String generateCode() {

		String alphaCharacter = "XWY";
		Random random = new Random();
		int randomNumber = random.nextInt(783567);
		return alphaCharacter + randomNumber;

	}

}
