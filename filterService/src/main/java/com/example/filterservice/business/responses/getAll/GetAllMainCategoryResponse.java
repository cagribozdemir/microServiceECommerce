package com.example.filterservice.business.responses.getAll;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllMainCategoryResponse {

    private String mainCategoryId;
    private String mainCategoryName;

}
