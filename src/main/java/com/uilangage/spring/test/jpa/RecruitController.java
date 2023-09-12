package com.uilangage.spring.test.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.uilangage.spring.test.jpa.domain.Recruit;
import com.uilangage.spring.test.jpa.repository.RecruitRepository;

@RequestMapping("/jpa/recruit")
@Controller
public class RecruitController {
	
	@Autowired
	private RecruitRepository recruitRepository;
	
	
	
	// 1. id 로 조회
	@GetMapping("/find/id")
	@ResponseBody
	public List<Recruit> selectRecruitById(){
		List<Recruit> recruitList = recruitRepository.findById(8);
		
		return recruitList;
		
	}
	
	// 2. Parameter 조건 조회
	@GetMapping("/find/company")
	@ResponseBody
	public List<Recruit> selectCompanyId(@RequestParam("companyId") int companyId){
		List<Recruit> recruitList = recruitRepository.findAllBycompanyId(companyId);
		return recruitList;
	}
	
	
	// 3. 복합 조건 조회
	//	웹 back-end 개발자 이고 정규직인 공고를 조회하고 아래와 같이 출력하세요.
	@GetMapping("/find/complex")
	@ResponseBody
	public List<Recruit> selectPositionType(){
		List<Recruit> recruitList = recruitRepository.findAllByPositionAndType("웹 back-end 개발자", "정규직");
				
		
		return recruitList;
	}
	
	
}
