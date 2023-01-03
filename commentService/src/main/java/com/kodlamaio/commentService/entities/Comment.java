package com.kodlamaio.commentService.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "comments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
	@Id
	@Column(name = "id")
	private String id;
	@Column(name = "description")
	private String description;
	@Column(name = "productId")
	private String productId;
	@Column(name = "customerId")
	private String customerId;
	@Column(name = "rate")
	private double rate;
	@Column(name = "date")
	private LocalDate date;
	@Column(name = "images")
	private List<String> images;
}
