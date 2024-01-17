package com.example.bookreview.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class PostEntity {

	@Id
	private Long id;
	private String writerEmail;
	private String title;
	private String content;
	private String date;
	private int visit;
	private int good;
	private int bad;
	private String bookImg;
	private String bookAuthor;
	private String bookTranslator;
	private String bookPublisher;
	private String bookStatus;
}
