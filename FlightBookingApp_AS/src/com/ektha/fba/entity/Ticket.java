package com.ektha.fba.entity;

public class Ticket {
	
	private String ticketNumber;
	private float ticketFare;
	
	public Ticket() {

	}

	public String getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public float getTicketFare() {
		return ticketFare;
	}

	public void setTicketFare(float ticketFare) {
		this.ticketFare = ticketFare;
	}

	@Override
	public String toString() {
		return "Ticket [ticketNumber=" + ticketNumber + ", ticketFare=" + ticketFare + "]";
	}
	
	

}
