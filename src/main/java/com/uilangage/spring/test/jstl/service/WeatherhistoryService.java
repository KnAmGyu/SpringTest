package com.uilangage.spring.test.jstl.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uilangage.spring.test.jstl.domain.Weatherhistory;
import com.uilangage.spring.test.jstl.repository.WeatherhistoryRepository;

@Service
public class WeatherhistoryService {
	@Autowired
	private WeatherhistoryRepository weatherhistoryRepository;
	
	public List<Weatherhistory> getWeatherhistory(){
		List<Weatherhistory> weather = weatherhistoryRepository.getWeatherhistory();
		return weather;
	}
	
	public int addWeatherhistory(Weatherhistory weatherhistory) {
		int count = weatherhistoryRepository.insertWeatherhistory(weatherhistory);
		return count;
	}
}
