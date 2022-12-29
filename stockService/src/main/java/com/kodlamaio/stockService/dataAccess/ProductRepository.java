package com.kodlamaio.stockService.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.stockService.entities.Product;

public interface ProductRepository extends JpaRepository<Product, String>{

}
