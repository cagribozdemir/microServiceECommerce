package com.kodlamaio.stockService.business.responses.create;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateMainCategoryResponse {
    private String id;
    private String name;
}
