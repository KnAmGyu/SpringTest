package com.uilangage.spring.test.jstl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/weather")
@Controller
public class WeatherhistoryController {

	
	@GetMapping("/test05")
	public String test05(Model model){
		
		return "jstl/test05";
	}
}
