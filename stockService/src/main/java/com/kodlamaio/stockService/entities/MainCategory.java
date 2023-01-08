package com.kodlamaio.stockService.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "mainCategories")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MainCategory {
	@Id
	@Column(name = "id")
	private String id;
	@Column(name = "name")
	private String name;
	@OneToMany(mappedBy = "mainCategory")
	private List<SecondCategory> secondCategories;
}
