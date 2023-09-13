package com.boot.aatral.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.aatral.entity.Skill;

public interface SkillRepository extends JpaRepository<Skill, Long>{
	
	public List<Skill> findByDivisionId(Long divisonId);

}
