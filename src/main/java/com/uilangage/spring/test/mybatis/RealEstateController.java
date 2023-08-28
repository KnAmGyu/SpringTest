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
@RequestMapping("/mybatis/real-estate")
public class RealEstateController {

	@Autowired
	private RealEstateService realEstateService;
	
	@RequestMapping("/select/1")
	@ResponseBody
	// localhost:8080/mybatis/real-estate/select/1?id=3
	public RealEstate realEstate(@RequestParam("id") int id) {
		RealEstate realEstate = realEstateService.getRealEstate(id);
		
		return realEstate;
	}
	
	@RequestMapping("/select/2")
	@ResponseBody
	// localhost:8080/mybatis/real-estate/select/2?rentPrice=90
	public List<RealEstate> realEstateRent(@RequestParam("rentPrice") int rentPrice) {
		List<RealEstate> estateRent = realEstateService.getEstateRent(rentPrice);
		
		return estateRent;
	}
	
	@RequestMapping("/select/3")
	@ResponseBody
	// localhost:8080/mybatis/real-estate/select/3?area=90&price=130000
	public List<RealEstate> realEsateAreaPrice(@RequestParam("area") int area, @RequestParam("price") int price) {
		List<RealEstate> estateAreaPrice = realEstateService.getEstateArePrice(area, price);
		return estateAreaPrice;
	}
	
	@RequestMapping("/insert/1")
	@ResponseBody
	public String createRealEstateByObject() {
//		realtorId : 3
//		address : 푸르지용 리버 303동 1104호
//		area : 89
//		type : 매매
//		price : 100000
		RealEstate realEstate = new RealEstate();
		realEstate.setRealtorId(3);
		realEstate.setAddress("푸르지용 리버 303동 1104호");
		realEstate.setArea(89);
		realEstate.setType("매매");
		realEstate.setPrice(100000);
		
		int count = realEstateService.addRealEstateByObject(realEstate);
		
		return "수행결과 : " + count;
	}
	
	@RequestMapping("/insert/2")
	@ResponseBody
	// localhost:8080/mybatis/real-estate/insert/2?realtorId=2
	public String createRealEstate(@RequestParam("realtorId") int realtorId) {
//		address : 썅떼빌리버 오피스텔 814호
//		area : 45
//		type : 월세
//		price : 100000
//		rentPrice : 120
		
		int count = realEstateService.addRealEstate(realtorId, "썅떼빌리버 오피스텔 814호", 45, "월세", 100000, 120);
		
		
		return "수행결과 : " + count;
	}
	
	@RequestMapping("/update/1")
	@ResponseBody
	//localhost:8080/mybatis/real-estate/update/1
	public String updateRealEstate(){
//		id가 24 인 행의 type 을 전세로 바꾸고 price 를 70000으로 변경하세요.
//		수정 성공한 행의 수를 출력하세요.
		int count = realEstateService.updateRealEstate(24 , "전세", 70000);
		
		return "수행결과 : " + count;
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	//localhost:8080/mybatis/real-estate/delete?id=21
	public String deleteRealEstate(@RequestParam("id") int id) {
		
		int count  = realEstateService.deleteRealEstate(id);
		
		return "삭제결과 : " + count;
	}
	
	
}
