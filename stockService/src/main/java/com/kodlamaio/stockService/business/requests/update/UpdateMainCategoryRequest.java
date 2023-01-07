package com.kodlamaio.stockService.business.requests.update;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateMainCategoryRequest {
    private String id;
    private String name;
}
