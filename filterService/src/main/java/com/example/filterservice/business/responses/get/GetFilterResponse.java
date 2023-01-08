package com.example.filterservice.business.responses.get;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetFilterResponse {

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
