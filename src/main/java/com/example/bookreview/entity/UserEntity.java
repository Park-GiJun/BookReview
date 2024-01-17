package com.example.bookreview.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserEntity {
	@Id
	private Long id;
	private String username;
	private String password;
	private String fullname;
	private String phone;
	private String nickname;
	private String email;
	private String role;

}
