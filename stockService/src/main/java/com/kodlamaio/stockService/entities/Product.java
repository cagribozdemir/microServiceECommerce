package com.kodlamaio.stockService.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@Id
	@Column(name = "id")
	private String id;
	@Column(name = "name")
	private String name;
	@Column(name = "description")
	private String description;
	@Column(name = "color")
	private String color;
	@Column(name = "images")
	private List<String> images;
	@Column(name = "commentsId")
	private List<String> commentsId;
	@Column(name = "campaignId")
	private String campaignId;
	@Column(name = "supplierId")
	private String supplierId;
	@Column(name = "unitPrice")
	private double unitPrice;
	@Column(name = "rank")
	private double rank;
	@Column(name = "stock")
	private int stock;
	@Column(name = "size")
	private int size;
	@Column(name = "discount")
	private int discount;
	@Column(name = "quantityLimitPerOrder")
	private int quantityLimitPerOrder;
	@ManyToOne
	@JoinColumn(name = "secondCategory_id")
	private SecondCategory secondCategory;
	@ManyToOne
	@JoinColumn(name = "brand_id")
	private Brand brand;
}