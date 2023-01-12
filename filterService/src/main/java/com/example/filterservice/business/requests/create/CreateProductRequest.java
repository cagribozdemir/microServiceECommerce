package com.example.filterservice.business.requests.create;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CreateProductRequest {

    private String productName;
    private String productColor;
    private String productUnitPrice;
    private String productRank;
}
