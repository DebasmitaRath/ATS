package com.boot.aatral.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BuManager {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "buManager")
	private List<Division> division = new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Skill> skills = new ArrayList<>();
}
