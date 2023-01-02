package com.kodlamaio.stockService.entities;

import javax.persistence.Entity;
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
	
	String id;
	double unitPrice;
	int stock;
	String description;
	int size;
	String color;
	//image;
	double rank;
	int discount;
	String comment;
	int quantityLimitPerOrder;
	//category;
	//supplier;
	//brand;
	//order;
	//campaign;
}