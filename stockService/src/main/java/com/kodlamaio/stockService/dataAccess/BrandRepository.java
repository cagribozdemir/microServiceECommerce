package com.kodlamaio.stockService.dataAccess;

import com.kodlamaio.stockService.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository <Brand, String> {
}
