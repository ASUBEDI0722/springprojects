package com.ektha.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ektha.app.entity.Booking;

public interface IBookingRepository extends JpaRepository<Booking, Integer> {
	

}
