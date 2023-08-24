package com.uilangage.spring.test.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uilangage.spring.test.mybatis.domain.RealEstate;
import com.uilangage.spring.test.mybatis.repository.RealEstateRepository;

@Service
public class RealEstateService {
		@Autowired
		private RealEstateRepository realEstateRepository;
	
		public RealEstate getRealEstate(int id) {
			RealEstate realEstate = realEstateRepository.selectRealEstate(id);
			return realEstate;
		}
		
		public List<RealEstate> getEstateRent(int rentPrice) {
			List<RealEstate> estateRent = realEstateRepository.rentPriceEstate(rentPrice);
			return estateRent;
		}
		
		public List<RealEstate> getEstateArePrice(int area, int price){
			List<RealEstate> estateAreaPrice = realEstateRepository.selectEstateAreaPrice(area,price);
			return estateAreaPrice;
		}
		
}
