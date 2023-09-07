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
			, @Param("headCount") int headCount
			, @Param("day") int day
			, @Param("date") Date date
			, @Param("phoneNumber") String phoneNumber);
}
