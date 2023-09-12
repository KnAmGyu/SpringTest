package com.uilangage.spring.test.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.uilangage.spring.test.jpa.domain.Recruit;

@Repository
public interface RecruitRepository extends JpaRepository<Recruit, Integer> {

	public List<Recruit> findById(int id);
	
	public List<Recruit> findAllBycompanyId(int companyId);
	
	public List<Recruit> findAllByPositionAndType(String position, String type);
	
	public List<Recruit> findAllByTypeOrSalaryGreaterThanEqual(String type, int salary);

	public List<Recruit> findAllTop3ByTypeOrderBySalaryDesc(String type);
	
	public List<Recruit> findAllByRegionAndSalaryBetween(String region, int start, int end);
	
//	마감일이 2026-04-10 이후이고 연봉이 8100 이상인 정규직 공고를 연봉 내림차순으로 조회하세요
	@Query(value="SELECT * FROM `recruit` WHERE `deadline` >= 2026-04-10 AND salary >= 8100 AND `type` = :type " , nativeQuery=true)
	public List<Recruit> findByTypeQuery(@Param("type") String type);
	
	
}
