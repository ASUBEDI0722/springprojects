package com.ektha.fba.app;

import java.util.Scanner;

import com.ektha.fba.controller.BookingController;
import com.ektha.fba.entity.CreditCard;

public class BookingPortal {

	public static void main(String[] args) {

		String nameOnCard;
		String creditCardNumber;
		int cvv;
		float ticketFare;

		CreditCard creditCard;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter name on your card.");
		nameOnCard = scanner.next();

		System.out.println("Enter your credit card number");
		creditCardNumber = scanner.next();

		System.out.println("Enter CVV");
		cvv = scanner.nextInt();

		System.out.println("Enter ticket fare.");
		ticketFare = scanner.nextFloat();

		creditCard = initializeData(nameOnCard, creditCardNumber, cvv, ticketFare);

		bookTicket(creditCard, ticketFare);

	}

	public static CreditCard initializeData(String nameOnCard, String creditCardNumber, int cvv, float ticketFare) {

		CreditCard creditCard = new CreditCard();
		creditCard.setCreditCardNumber(creditCardNumber);
		creditCard.setNameOnCard(nameOnCard);
		creditCard.setCvv(cvv);

		return creditCard;
	}

	public static void bookTicket(CreditCard creditCard, float ticketFare) {

		BookingController bookingController = new BookingController();

		String ticketNumber = bookingController.bookTicket(creditCard, ticketFare);

		if (ticketNumber != null) {
			System.out.println("Ticket Generated Successfully! Your ticket number is " + ticketNumber);
		}

		else {
			System.out.println("Your available credit does not satisfy to book the ticket.");
		}

	}

}
