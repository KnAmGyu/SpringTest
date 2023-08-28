package com.uilangage.spring.test.jsp.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.uilangage.spring.test.jsp.domain.Seller;

@Repository
public interface SellerRepository {

	public int insertSeller(
			@Param("nickName")String nickName
			,@Param("profileImage") String profileImage
			,@Param("temperature") double temperature);
	
	public Seller selectLastSeller();
}
