package com.boot.aatral.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
	@Id
	private String id;
	private String name;
	private String email;
	private String password;
	private String contactno;
	private String address;
	@Enumerated(EnumType.STRING)
	private Roles role;
	private Set<String> client;
	private boolean isactive;
}
