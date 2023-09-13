package com.boot.aatral.service;

import java.util.List;
import java.util.Map;

import com.boot.aatral.dto.BuManagerDto;
import com.boot.aatral.entity.Division;
import com.boot.aatral.entity.Skill;

public interface BuManagerService {

	BuManagerDto createBuManager(BuManagerDto buManager);

	BuManagerDto updateUser(BuManagerDto buManager, Integer requestResourceId);

	BuManagerDto getBuManagerById(Integer requestResourceId);

	List<BuManagerDto> getAllBuManagers();

	void deleteUser(Integer requestResourceId);

	// getting another class data

	List<Skill> getAllSkills();

	Skill getSkillById(Long skillId);

	Map<Long, String> getAllDivisions();

	Division getDivisionById(Long divId);
	
	Map<Long,String> loadSkills(Long divId);
}
