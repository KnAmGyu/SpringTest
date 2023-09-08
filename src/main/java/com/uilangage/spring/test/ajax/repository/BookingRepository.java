package com.uilangage.spring.test.ajax.repository;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.uilangage.spring.test.ajax.domain.Booking;

@Repository
public interface BookingRepository {
	
	public List<Booking> selectBookingList();
	
	public int deleteBooking(@Param("id") int id);
	
	public int insertBookingList(
			@Param("name") String name
			, @Param("date") Date date
			, @Param("day") int day
			, @Param("headCount") int headCount
			, @Param("phoneNumber") String phoneNumber
			, @Param("state") String state);
	
	public Booking findBookingList(
			@Param("name") String name
			, @Param("phoneNumber") String phoneNumber);
	
}
