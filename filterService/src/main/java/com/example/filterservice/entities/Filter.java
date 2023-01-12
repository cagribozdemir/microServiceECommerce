package com.example.filterservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Filter {

    @Id
    @Field(name = "id")
    private String id;

    //PRODUCT
    @Field(name = "product_id")
    private String productId;

    @Field(name = "product_name")
    private String productName;

    @Field(name = "product_color")
    private String productColor;

    @Field(name = "product_unitPrice")
    private double productUnitPrice;

    @Field(name = "product_rank")
    private double productRank;


    //BRAND
    @Field(name = "brand_id")
    private String brandId;

    @Field(name = "brand_name")
    private String brandName;

    //MAIN-CATEGORY
    @Field(name = "mainCategory_id")
    private String mainCategoryId;

    @Field(name = "mainCategory_name")
    private String mainCategoryName;

    //SECOND-CATEGORY
    @Field(name = "secondCategory_id")
    private String secondCategoryId;

    @Field(name = "secondCategory_name")
    private String secondCategoryName;





}
