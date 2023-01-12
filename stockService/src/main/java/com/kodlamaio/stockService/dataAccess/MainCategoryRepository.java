package com.kodlamaio.stockService.dataAccess;

import com.kodlamaio.stockService.entities.MainCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MainCategoryRepository extends JpaRepository<MainCategory, String> {

}