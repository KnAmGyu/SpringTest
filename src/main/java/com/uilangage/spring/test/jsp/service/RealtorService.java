package com.uilangage.spring.test.jsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uilangage.spring.test.jsp.domain.Realtor;
import com.uilangage.spring.test.jsp.repository.RealtorRepository;

@Service
public class RealtorService {

	@Autowired
	private RealtorRepository realtorRepository;
	
	public int addRealtorByObject(Realtor realtor) {
		int count = realtorRepository.insertRealtorByObject(realtor);
		return count;
	}
	
	
}
