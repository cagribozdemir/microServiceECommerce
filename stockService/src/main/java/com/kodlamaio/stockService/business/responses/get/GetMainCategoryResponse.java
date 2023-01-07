package com.kodlamaio.stockService.business.responses.get;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetMainCategoryResponse {
    private String id;
    private String name;
}
