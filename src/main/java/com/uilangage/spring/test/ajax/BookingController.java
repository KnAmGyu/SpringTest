package com.uilangage.spring.test.ajax;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uilangage.spring.test.ajax.domain.Booking;
import com.uilangage.spring.test.ajax.service.BookingService;

@Controller
@RequestMapping("/ajax/booking")
public class BookingController {

	@Autowired
	private BookingService bookingService;
	
	@GetMapping("/main")
	public String getMain() {
		return "ajax/booking/main";
	}
	
	@GetMapping("/list")
	public String getBookingList(Model model){
		
		List<Booking> bookingList = bookingService.getBookingList();
		
		model.addAttribute("booking", bookingList);
		
		return "ajax/booking/list";
	}
	
	
}
