package com.ektha.fba.controller;

import com.ektha.fba.entity.CreditCard;
import com.ektha.fba.service.BookingService;

public class BookingController {

	public String bookTicket(CreditCard creditCard, float ticketFare) {

		BookingService bookingService = new BookingService();

		return bookingService.bookTicket(creditCard, ticketFare);

	}

}
