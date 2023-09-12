package com.uilangage.spring.test.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uilangage.spring.test.jpa.domain.Recruit;

@Repository
public interface RecruitRepository extends JpaRepository<Recruit, Integer> {

	public List<Recruit> findById(int id);
	
	public List<Recruit> findAllBycompanyId(int companyId);
	
	public List<Recruit> findAllByPositionAndType(String position, String type);
	
}
