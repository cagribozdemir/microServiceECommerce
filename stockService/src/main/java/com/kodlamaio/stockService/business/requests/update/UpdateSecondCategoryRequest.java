package com.kodlamaio.stockService.business.requests.update;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateSecondCategoryRequest {
    private String id;
    private String name;
}
