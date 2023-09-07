package com.uilangage.spring.test.ajax.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uilangage.spring.test.ajax.domain.Booking;
import com.uilangage.spring.test.ajax.repository.BookingRepository;

@Service
public class BookingService {
	
	@Autowired
	private BookingRepository bookingRepository;
	
	public List<Booking> getBookingList(){
		
		List<Booking> bookingList = bookingRepository.selectBookingList();
		
		return bookingList;
		
	}
}
