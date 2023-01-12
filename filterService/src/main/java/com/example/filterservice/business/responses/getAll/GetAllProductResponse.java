package com.example.filterservice.business.responses.getAll;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllProductResponse {

    private String productId;
    private String productName;
    private String productColor;
    private double productUnitPrice;
    private double productRank;
}
