package com.uilangage.spring.test.jsp.repository;

import org.springframework.stereotype.Repository;

import com.uilangage.spring.test.jsp.domain.Realtor;

@Repository
public interface RealtorRepository {

	public int insertRealtorByObject(Realtor realtor);
	
}
