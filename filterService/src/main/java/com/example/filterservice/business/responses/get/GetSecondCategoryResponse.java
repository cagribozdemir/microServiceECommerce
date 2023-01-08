package com.example.filterservice.business.responses.get;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetSecondCategoryResponse {

    private String secondCategoryId;
    private String secondCategoryName;
}
