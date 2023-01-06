package com.kodlamaio.stockService.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllProductResponse {
    private String id;
    private String name;
    private String description;
    private String color;
    private List<String> images;
    private List<String> commentsId;
    private String campaignId;
    private String supplierId;
    private double unitPrice;
    private double rank;
    private int stock;
    private int size;
    private int discount;
    private int quantityLimitPerOrder;
    private String secondCategoryName;
    private String brandName;
}
