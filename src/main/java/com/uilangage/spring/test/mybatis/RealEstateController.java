package com.uilangage.spring.test.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.uilangage.spring.test.mybatis.domain.RealEstate;
import com.uilangage.spring.test.mybatis.service.RealEstateService;

@Controller
public class RealEstateController {

	@Autowired
	private RealEstateService realEstateService;
	
	@RequestMapping("/mybatis/real-estate/1")
	@ResponseBody
	// localhost:8080/mybatis/real-estate/1?id=3
	public RealEstate realEstate(@RequestParam("id") int id) {
		RealEstate realEstate = realEstateService.getRealEstate(id);
		
		return realEstate;
	}
	
	@RequestMapping("/mybatis/real-estate/2")
	@ResponseBody
	// localhost:8080/mybatis/real-estate/2?rentPrice=90
	public List<RealEstate> realEstateRent(@RequestParam("rentPrice") int rentPrice) {
		List<RealEstate> estateRent = realEstateService.getEstateRent(rentPrice);
		
		return estateRent;
	}
	
	@RequestMapping("/mybatis/real-estate/3")
	@ResponseBody
	// localhost:8080/mybatis/real-estate/3?area=90&price=130000
	public List<RealEstate> realEsateAreaPrice(@RequestParam("area") int area, @RequestParam("price") int price) {
		List<RealEstate> estateAreaPrice = realEstateService.getEstateArePrice(area, price);
		return estateAreaPrice;
	}
	
	
	
}
