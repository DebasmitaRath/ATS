package com.boot.aatral.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.aatral.dto.BuManagerDto;
import com.boot.aatral.response.ApiResponse;
import com.boot.aatral.service.BuManagerService;


@RestController
@RequestMapping("/api/buManager")
public class BuManagerController {

	
	@Autowired
	private BuManagerService buManagerService;
	
	@PostMapping("/createbu")
	public ResponseEntity<BuManagerDto> createBuManager(@RequestBody BuManagerDto buManagerDto) {
	BuManagerDto createdBuManagerDto=this.buManagerService.createBuManager(buManagerDto);
	return new ResponseEntity<BuManagerDto> (createdBuManagerDto,HttpStatus.OK);
	}
	
	
	@PutMapping("/update/{requestResourceId}")
	public ResponseEntity<BuManagerDto>  updateUser(@RequestBody BuManagerDto buManagerDto, @PathVariable Integer requestResourceId) {
		 
		BuManagerDto updatedBuManager=this.buManagerService.updateUser(buManagerDto, requestResourceId);
	    return ResponseEntity.ok(updatedBuManager);
	}
	@DeleteMapping("/delete/{requestResourceId}")
	public ResponseEntity<ApiResponse> deleteUser(@PathVariable Integer requestResourceId) {
		this.buManagerService.deleteUser(requestResourceId);
		return new ResponseEntity<ApiResponse> (new ApiResponse("BuManger deleted successfully", true),HttpStatus.OK);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<BuManagerDto>>  getAllBuManagers(){
		return ResponseEntity.ok(this.buManagerService.getAllBuManagers());
	}
	
	@GetMapping("/{requestResourceId}")
	public ResponseEntity<BuManagerDto> getBuManagerById( @PathVariable Integer requestResourceId) {
		return ResponseEntity.ok(this.buManagerService.getBuManagerById(requestResourceId));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
