package com.uilangage.spring.test.mybatis.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.uilangage.spring.test.mybatis.domain.RealEstate;

@Repository
public interface RealEstateRepository {
	
	public RealEstate selectRealEstate(@Param("id") int id); 
	
	public List<RealEstate> rentPriceEstate(@Param("rentPrice") int rentPrice);
	
	public List<RealEstate> selectEstateAreaPrice(@Param("area") int area, @Param("price") int price);
	
	public int insertRealEstateByObject(RealEstate realEstate);
	
	public int insertRealEstate(
			@Param("realtorId") int realtorId
			, @Param("address") String address
			, @Param("area") int area
			, @Param("type") String type
			, @Param("price") int price
			, @Param("rentPrice")int rentPrice);
	public int changeRealEstate(@Param("id") int id,@Param("type") String type,@Param("price") int price);
	
}
