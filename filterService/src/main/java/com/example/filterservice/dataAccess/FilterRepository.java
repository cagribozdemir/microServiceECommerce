package com.example.filterservice.dataAccess;

import com.example.filterservice.entities.Filter;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FilterRepository extends MongoRepository<Filter, String> {

    //PRODUCT
    List<Filter> getFilterByProductName(String productName);

    List<Filter> getFilterByProductColor(String productColor);
    List<Filter> getFilterByProductUnitPrice(double productUnitPrice);
    List<Filter> getFilterByProductRank(double productRank);

    //BRAND
    List<Filter> getFilterByBrandName(String brandName);

    //MAIN-CATEGORY
    List<Filter> getFilterByMainCategoryName(String mainCategoryName);

    //SECOND-CATEGORY
    List<Filter> getFilterBySecondCategoryName(String secondCategoryName);



}
