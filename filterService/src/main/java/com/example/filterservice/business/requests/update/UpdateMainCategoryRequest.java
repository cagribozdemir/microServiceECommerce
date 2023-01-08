package com.example.filterservice.business.requests.update;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateMainCategoryRequest {

    private String mainCategoryId;
    private String mainCategoryName;
}
