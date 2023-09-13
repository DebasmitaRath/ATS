package com.boot.aatral.service;

import java.util.List;

import com.boot.aatral.dto.BuManagerDto;


public interface BuManagerService {
	
    BuManagerDto createBuManager(BuManagerDto buManager);
	
	BuManagerDto updateUser(BuManagerDto buManager,Integer requestResourceId);
	
    BuManagerDto getBuManagerById(Integer requestResourceId);
	
	List<BuManagerDto>  getAllBuManagers();
	
	void deleteUser(Integer requestResourceId);
	
}
