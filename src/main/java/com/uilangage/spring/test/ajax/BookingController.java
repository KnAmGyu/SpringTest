package com.uilangage.spring.test.ajax;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@GetMapping("/input")
	public String bookingInput() {
		return "ajax/booking/input";
	}
	
	@GetMapping("/list")
	public String getBookingList(Model model){
		
		List<Booking> bookingList = bookingService.getBookingList();
		
		model.addAttribute("booking", bookingList);
		
		return "ajax/booking/list";
	}
	
	@GetMapping("/delete")
	@ResponseBody
	public Map<String, String> deleteList(@RequestParam("id") int id) {
		int count = bookingService.deleteList(id);
		
			Map<String, String> resultMap = new HashMap<>();
			
			if(count == 1) {
				resultMap.put("result", "success");
			} else {
				resultMap.put("result", "fail");
			}
		
			return resultMap;	
	}
	
	
	@GetMapping("/create")
	@ResponseBody
	public Map<String, String> createBookingList(
			@RequestParam("name") String name
			,@DateTimeFormat(pattern="yyyy년MM월dd일")  @RequestParam("date") Date date
			,@RequestParam("day") int day
			,@RequestParam("headCount") int headCount
			,@RequestParam("phoneNumber") String phoneNumber) {
		
		int count = bookingService.addBooking(name, date, day, headCount, phoneNumber);
		
		
		Map<String, String> resultMap = new HashMap<>();
		
		if(count == 1) {
			resultMap.put("result", "success");
		}else {
			resultMap.put("result", "fail");
		}
		return resultMap;
	}
	
	// 이름과 전화번호를 전달 받고,
	// 일치하는 예약정보를 response에 json으로 담아주는 API
	@GetMapping("/find")
	@ResponseBody
	public Booking findBooking(
			@RequestParam("name") String name
			, @RequestParam("phoneNumber") String phoneNumber){
		
		Booking booking = bookingService.findBookingList(name, phoneNumber);
		
		// 응답 json에 조회된 데이터가 있는지 없는지 정보를 명확하게 정의 한다.
		
		
		// {"name": "", "date": "", "day": }
		
		
		
		return booking;
	
		
	}
	
}
