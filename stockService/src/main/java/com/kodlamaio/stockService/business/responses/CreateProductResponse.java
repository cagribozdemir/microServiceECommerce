package com.kodlamaio.stockService.business.responses;

import com.kodlamaio.stockService.entities.Brand;
import com.kodlamaio.stockService.entities.SecondCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductResponse {
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
