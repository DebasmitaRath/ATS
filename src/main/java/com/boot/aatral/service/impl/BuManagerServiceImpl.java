package com.boot.aatral.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.aatral.dto.BuManagerDto;
import com.boot.aatral.entity.BuManager;
import com.boot.aatral.exception.ResourceNotFoundException;
import com.boot.aatral.repository.BuManagerRepository;
import com.boot.aatral.service.BuManagerService;

@Service
public class BuManagerServiceImpl implements BuManagerService {

	@Autowired
	private BuManagerRepository buManagerRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public BuManagerDto createBuManager(BuManagerDto buManagerDto) {
		BuManager buManager = this.dtoToBuManager(buManagerDto);
		BuManager savedBuManger = this.buManagerRepository.save(buManager);
		return this.BuManagerToDto(savedBuManger);
	}

	@Override
	public BuManagerDto updateUser(BuManagerDto buManagerDto, Integer requestResourceId) {
		BuManager buManager2 = this.buManagerRepository.findById(requestResourceId)
				.orElseThrow(() -> new ResourceNotFoundException("BuManager", "ID", requestResourceId));
		buManager2.setContactNumber(buManagerDto.getContactNumber());
		buManager2.setCtcOfferDetails(buManagerDto.getCtcOfferDetails());
		buManager2.setDesignation(buManagerDto.getDesignation());
		buManager2.setDivision(buManagerDto.getDivision());
		buManager2.setEmail(buManagerDto.getEmail());
		buManager2.setEmpid(buManagerDto.getEmpid());
		buManager2.setExperienceLevel(buManagerDto.getExperienceLevel());
		buManager2.setJobDescription(buManagerDto.getJobDescription());
		buManager2.setProjectName(buManagerDto.getProjectName());
		buManager2.setRequestorName(buManagerDto.getRequestorName());
		buManager2.setRequestResourceDate(buManagerDto.getRequestResourceDate());
		buManager2.setResourceStartDate(buManagerDto.getResourceStartDate());
		buManager2.setSkills(buManagerDto.getSkills());
		buManager2.setModeOfWork(buManagerDto.getModeOfWork());
		buManager2.setNumberOfPositions(buManagerDto.getNumberOfPositions());
		buManager2.setCtcOfferDetails(buManagerDto.getCtcOfferDetails());

		BuManager updatedBuManager = this.buManagerRepository.save(buManager2);
		BuManagerDto buManagerDto2 = this.BuManagerToDto(updatedBuManager);

		return buManagerDto2;
	}

	@Override
	public BuManagerDto getBuManagerById(Integer requestResourceId) {
		BuManager buManager = this.buManagerRepository.findById(requestResourceId)
				.orElseThrow(() -> new ResourceNotFoundException("BuManager", "id", requestResourceId));

		return this.BuManagerToDto(buManager);
	}

	@Override
	public List<BuManagerDto> getAllBuManagers() {
		List<BuManager> buManagers = this.buManagerRepository.findAll();
		List<BuManagerDto> buManagerDtos = buManagers.stream().map(buManager -> this.BuManagerToDto(buManager))
				.collect(Collectors.toList());
		return buManagerDtos;
	}

	@Override
	public void deleteUser(Integer requestResourceId) {
		BuManager buManager = this.buManagerRepository.findById(requestResourceId)
				.orElseThrow(() -> new ResourceNotFoundException("BuManager", "id", requestResourceId));
		this.buManagerRepository.delete(buManager);
	}

	private BuManager dtoToBuManager(BuManagerDto buManagerDto) {
		BuManager buManager = this.modelMapper.map(buManagerDto, BuManager.class);
		return buManager;
	}

	private BuManagerDto BuManagerToDto(BuManager buManager) {
		BuManagerDto buManagerDto = this.modelMapper.map(buManager, BuManagerDto.class);
		return buManagerDto;

	}
}
