package com.uilangage.spring.test.jstl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uilangage.spring.test.jstl.domain.Weatherhistory;
import com.uilangage.spring.test.jstl.service.WeatherhistoryService;

@RequestMapping("/weather")
@Controller
public class WeatherhistoryController {

	@Autowired
	private WeatherhistoryService weatherhistoryService;
	
	@GetMapping("/history")
	public String test05(Model model){
		
		List<Weatherhistory> weather = weatherhistoryService.getWeatherhistory();
		
		model.addAttribute("history", weather);	
		
		return "jstl/weather/test05";
	}
	
	@GetMapping("/insert")
	public String insertWeather() {
		
		return "jstl/weather/test05-Input";
		
	}
	
}
