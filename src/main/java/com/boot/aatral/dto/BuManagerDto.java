package com.boot.aatral.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.boot.aatral.entity.Division;
import com.boot.aatral.entity.Skill;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class BuManagerDto {

	private int requestResourceId;
	private String requestResourceDate;
	private String projectName;
	private String resourceStartDate;
	private String requestorName;
	private String designation;
	private String contactNumber;
	private String email;
	private Integer numberOfPositions;
	// JOIN WITH USERS
	private int empid;
	private String experienceLevel;
	private Set<String> modeOfWork;
	private String jobDescription;
	private String ctcOfferDetails;
	private String workLocation;
	private List<Division> division = new ArrayList<>();
	private List<Skill> skills = new ArrayList<>();
}
