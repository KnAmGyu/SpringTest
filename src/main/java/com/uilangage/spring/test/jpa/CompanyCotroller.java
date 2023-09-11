package com.uilangage.spring.test.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.uilangage.spring.test.jpa.domain.Company;
import com.uilangage.spring.test.jpa.service.CompanyService;

@RequestMapping("/jpa/company")
@Controller
public class CompanyCotroller {
	
	
	@Autowired
	private CompanyService companyService;

	@GetMapping("/create/1")
	@ResponseBody
	public Company createCompany() {
		
//		회사명 : 넥손
//		사업내용 : 컨텐츠 게임
//		규모 : 대기업
//		사원수 : 3585명
		String name = "넥손";
		String business = "컨텐츠 게임";
		String scale = "대기업";
		int headcount = 3585;
		

		
		Company company = companyService.addCompany(name, business, scale, headcount);
		
		return company;
	}
	
	@GetMapping("/create/2")
	@ResponseBody
	public Company createCompany2() {
		
//		회사명 : 버블팡
//		사업내용 : 여신 금융업
//		규모 : 대기업
//		사원수 : 6834명
		
		String name = "버블팡";
		String business = "여신 금융업";
		String scale = "대기업";
		int headcount = 6834;
		

		
		Company company = companyService.addCompany(name, business, scale, headcount);
		
		return company;
		
	}
	
	@GetMapping("/update")
	@ResponseBody
	public Company updateCompany(){
		Company company = companyService.updateCompany(8, "중소기업", 34);
		
		return company;
	}
	
	
	@GetMapping("/delete")
	@ResponseBody
	public String deleteCompany() {
		
		
		companyService.deleteCompany(8);
		
		return "수행 완료";
	}
	
	
	
}
