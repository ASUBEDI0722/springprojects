package com.ektha.app.model;

import com.ektha.app.dto.BookingDTO;
import com.ektha.app.dto.CustomerDTO;

import lombok.Data;

@Data
public class BookingDetails {

	private BookingDTO booking;
	private CustomerDTO customer;

	public BookingDetails() {
		// TODO Auto-generated constructor stub
	}

	public BookingDTO getBooking() {
		return booking;
	}

	public void setBooking(BookingDTO booking) {
		this.booking = booking;
	}

	public CustomerDTO getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}

}
