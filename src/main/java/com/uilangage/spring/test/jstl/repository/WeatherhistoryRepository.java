package com.uilangage.spring.test.jstl.repository;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.uilangage.spring.test.jstl.domain.Weatherhistory;

@Repository
public interface WeatherhistoryRepository {

	public List<Weatherhistory> getWeatherhistory();	
	
	public int insertWeatherhistory(Weatherhistory weatherhistory);
	
}
