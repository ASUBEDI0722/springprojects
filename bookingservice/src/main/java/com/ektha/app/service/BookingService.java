package com.ektha.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ektha.app.client.ICustomerService;
import com.ektha.app.dto.BookingDTO;
import com.ektha.app.dto.CustomerDTO;
import com.ektha.app.entity.Booking;
import com.ektha.app.model.BookingDetails;
import com.ektha.app.repository.IBookingRepository;

@Service
public class BookingService implements IBookingService {
	
	@Autowired
	private IBookingRepository bookingRepository;
	
	@Autowired
	private ICustomerService customerServiceClient;

	@Override
	public BookingDetails findBookings(int id) {

		Booking booking = bookingRepository.findById(id).get();
		
		CustomerDTO customerDTO = customerServiceClient.findCustomer(booking.getCustomer_id());
		
		BookingDTO bookingDTO = new BookingDTO();
		
		BookingDetails bookingDetails = new BookingDetails();
		bookingDetails.setCustomer(customerDTO);
		bookingDetails.setBooking(bookingDTO);
		return bookingDetails;
	}
	
	

}
