package com.kodlamaio.stockService.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "brands")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Brand {
	@Id
	@Column(name = "id")
	private String id;
	@Column(name = "name")
	private String name;
	@OneToMany(mappedBy = "brand")
	private List<Product> products;
}
