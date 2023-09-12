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

@RequestMapping("/jpa/recruit/find")
@Controller
public class RecruitController {
	
	@Autowired
	private RecruitRepository recruitRepository;
	
	
	
	// 1. id 로 조회
	@GetMapping("/id")
	@ResponseBody
	public List<Recruit> selectRecruitById(){
		List<Recruit> recruitList = recruitRepository.findById(8);
		
		return recruitList;
		
	}
	
	// 2. Parameter 조건 조회
	@GetMapping("/company")
	@ResponseBody
	public List<Recruit> selectCompanyId(@RequestParam("companyId") int companyId){
		List<Recruit> recruitList = recruitRepository.findAllBycompanyId(companyId);
		return recruitList;
	}
	
	
	// 3. 복합 조건 조회
	//	웹 back-end 개발자 이고 정규직인 공고를 조회하고 아래와 같이 출력하세요.
	@GetMapping("/complex")
	@ResponseBody
	public List<Recruit> selectPositionType(){
		List<Recruit> recruitList = recruitRepository.findAllByPositionAndType("웹 back-end 개발자", "정규직");
				
		
		return recruitList;
	}
	
	// 4. 복합 조건 조회
	// 정규직이거나 연봉이 9000 이상인 공고를 조회하고 아래와 같이 출력하세요.
	@GetMapping("/complex-2")
	@ResponseBody
	public List<Recruit> selectTypeSalary(){
		List<Recruit> recruitList = recruitRepository.findAllByTypeOrSalaryGreaterThanEqual("정규직", 9000);
		
		return recruitList;
	}
	
	
	//	5. 정렬 제한 조건
	//	계약직 목록을 연봉 기준으로 내림차순 정렬해서 3개만 조회하세요.
	@GetMapping("/sort")
	@ResponseBody
	public List<Recruit> sortTypeBySalary(){
		List<Recruit> recruitList = recruitRepository.findAllTop3ByTypeOrderBySalaryDesc("계약직");
		return recruitList;
	}
	
	//	6. 범위 조회
	//	성남시 분당구가 지역인 연봉 7000 이상 8500 이하인 공고를 조회하고 아래와 같이 출력하세요.
	@GetMapping("/between")
	@ResponseBody
	public List<Recruit> findRegionSalary(){
		List<Recruit> recruitList = recruitRepository.findAllByRegionAndSalaryBetween("성남시 분당구", 7000, 8500);
		return recruitList;
	}
	
	
	//	7. Native query
	//	마감일이 2026-04-10 이후이고 연봉이 8100 이상인 정규직 공고를 연봉 내림차순으로 조회하세요
	@GetMapping("/query")
	@ResponseBody
	public List<Recruit> findTypeQuery(){
		List<Recruit> recruitList = recruitRepository.findByTypeQuery("정규직");
		return recruitList;
	}
	
	
}
