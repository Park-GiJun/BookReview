package com.example.bookreview.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CommentEntity {

	@Id
	private Long Id;
	private String postIdx;
	private String commentUser;
	private String content;
}
