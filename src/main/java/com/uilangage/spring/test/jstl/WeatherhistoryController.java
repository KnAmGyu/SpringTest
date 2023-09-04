package com.uilangage.spring.test.jstl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	
	@PostMapping("/create")
	public String createHistory(
			// 2023년09월07일 
			@DateTimeFormat(pattern="yyyy년MM월dd일") @RequestParam("date") Date date
			, @RequestParam("weather") String weather
			, @RequestParam("temperatures") double temperatures
			, @RequestParam("precipitation") double precipitation
			, @RequestParam("microDust") String microDust
			, @RequestParam("windSpeed") double windSpeed
			, RedirectAttributes redirect) {
		
		Weatherhistory weatherInfo = new Weatherhistory();
		weatherInfo.setDate(date);
		weatherInfo.setWeather(weather);
		weatherInfo.setTemperatures(temperatures);
		weatherInfo.setPrecipitation(precipitation);
		weatherInfo.setMicroDust(microDust);
		weatherInfo.setWindSpeed(windSpeed);
		
		int count = weatherhistoryService.addWeatherhistory(weatherInfo);
		
		
		return  "redirect:/weather/history";
	}
	
	
	
	@GetMapping("/insert")
	public String insertWeather() {
		
		return "jstl/weather/test05-Input";
		
	}
	
}
