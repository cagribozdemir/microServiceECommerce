package com.example.filterservice.business.responses.get;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetMainCategoryResponse {

    private String mainCategoryId;
    private String mainCategoryName;
}
