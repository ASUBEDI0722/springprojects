package com.ektha.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ektha.app.model.BookingDetails;
import com.ektha.app.service.IBookingService;

@RequestMapping("/bookings")
@RestController
public class BookingRestController {

	@Autowired
	private IBookingService bookingService;

	@GetMapping("{/id}")
	public BookingDetails findBookings(@PathVariable("id") int id) {
		BookingDetails bookingDetails = bookingService.findBookings(id);
		return bookingDetails;
	}

}
