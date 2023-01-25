package com.kodlamaio.stockService.dataAccess;

import com.kodlamaio.stockService.entities.SecondCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecondCategoryRepository extends JpaRepository<SecondCategory, String> {
}
