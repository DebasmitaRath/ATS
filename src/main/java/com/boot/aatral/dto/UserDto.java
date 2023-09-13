package com.boot.aatral.dto;

import java.util.Set;

import com.boot.aatral.entity.Roles;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
	private String id;
	@NotEmpty
	@Size(min = 4, message = "Username must be minimum of 4 characters")
	private String name;

	@Email(message = "Email address is not valid !!")
	@NotEmpty(message = "Email is required !!")
	@Column(unique = true)
	private String email;
	@NotEmpty
	@Size(min = 5, message = "Password should have at least 5 chsracters !!!")
	private String password;

	private String contactno;

	@NotEmpty
	@Size(min = 5, message = "Address should have at least 5 chsracters !!!")
	private String address;
	private Roles roles;
	private Boolean isactive;
//	private Set<String> client;
}
