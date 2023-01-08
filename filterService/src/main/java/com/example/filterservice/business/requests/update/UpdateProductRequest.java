package com.example.filterservice.business.requests.update;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProductRequest {

    private String productId;
    private String productName;
    private String productColor;
    private double productUnitPrice;
    private double productRank;
}
