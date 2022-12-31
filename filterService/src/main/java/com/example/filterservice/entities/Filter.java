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
    @Field(name = "product_name")
    private String productName;





}
