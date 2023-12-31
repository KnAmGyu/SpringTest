package com.uilangage.spring.test.ajax.service;

import java.util.Date;
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
	
	public int deleteList(int id) {
		int count = bookingRepository.deleteBooking(id);
		
		return count;
		
	}
	
	public int addBooking(
			String name
			, Date date
			, int day
			, int headCount
			, String phoneNumber) {
		int count = bookingRepository.insertBookingList(name, date, day, headCount, phoneNumber,"대기중");
		return count;
	}
	
	public Booking findBookingList(String name, String phoneNumber) {
		Booking booking = bookingRepository.findBookingList(name, phoneNumber);
		return booking;
	}
	
	
	
}
