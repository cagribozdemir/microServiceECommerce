package com.kodlamaio.stockService.business.abstracs;

import com.kodlamaio.stockService.business.requests.create.CreateMainCategoryRequest;
import com.kodlamaio.stockService.business.requests.update.UpdateMainCategoryRequest;
import com.kodlamaio.stockService.business.responses.create.CreateMainCategoryResponse;
import com.kodlamaio.stockService.business.responses.get.GetMainCategoryResponse;
import com.kodlamaio.stockService.business.responses.getAll.GetAllMainCategoryResponse;
import com.kodlamaio.stockService.business.responses.update.UpdateMainCategoryResponse;

import java.util.List;

public interface MainCategoryService {
    CreateMainCategoryResponse add (CreateMainCategoryRequest createMainCategoryRequest);
    void delete(String id);
    UpdateMainCategoryResponse update(UpdateMainCategoryRequest updateMainCategoryRequest);
    List<GetAllMainCategoryResponse> getAll();
    GetMainCategoryResponse getById (String id);
}
