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
		
		public int addRealEstateByObject(RealEstate realEstate) {
			int count = realEstateRepository.insertRealEstateByObject(realEstate);
			return count;
		}
		
		public int addRealEstate(int realtorId, String address, int area, String type, int price, int rentPrice) {
			int count = realEstateRepository.insertRealEstate(realtorId, address, area, type, price, rentPrice);
			return count;
		}
		
		public int updateRealEstate(int id, String type, int price) {
			int count = realEstateRepository.changeRealEstate(id, type, price);
			return count;
		}
		public int deleteRealEstate(int id){
			int count = realEstateRepository.deleteRealEstate(id);
			return count;
		}
		
		
}
