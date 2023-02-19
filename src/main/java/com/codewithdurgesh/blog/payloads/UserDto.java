package com.codewithdurgesh.blog.payloads;

import java.util.HashSet;

import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor

@Setter
@Getter
public class UserDto {

	private int id;

	@NotEmpty
	@Size(min = 4, message = "username must be min of 4 characters")
	private String name;

	@Email(message = "your email is not valid")
	private String email;

	@NotEmpty
	@Size(min = 3, max = 10, message = "password must be min of 3 chars and max of 10 char")

	private String password;

	@NotEmpty
	private String about;

	private Set<RoleDto> roles = new HashSet<>();

}
