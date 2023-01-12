package com.example.filterservice.business.responses.getAll;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllFilterResponse {

    //Brand
    private String brandName;

    //Product
    private String productName;
    private String productColor;
    private double productUnitPrice;
    private double productRank;

    //Main Category
    private String mainCategoryName;

    //Second Category
    private String secondCategoryName;

}
