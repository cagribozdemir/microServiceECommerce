package com.kodlamaio.stockService.business.abstracs;

import com.kodlamaio.stockService.business.requests.create.CreateMainCategoryRequest;
import com.kodlamaio.stockService.business.requests.create.CreateSecondCategoryRequest;
import com.kodlamaio.stockService.business.requests.update.UpdateMainCategoryRequest;
import com.kodlamaio.stockService.business.requests.update.UpdateSecondCategoryRequest;
import com.kodlamaio.stockService.business.responses.create.CreateMainCategoryResponse;
import com.kodlamaio.stockService.business.responses.create.CreateSecondCategoryResponse;
import com.kodlamaio.stockService.business.responses.get.GetMainCategoryResponse;
import com.kodlamaio.stockService.business.responses.get.GetSecondCategoryResponse;
import com.kodlamaio.stockService.business.responses.getAll.GetAllMainCategoryResponse;
import com.kodlamaio.stockService.business.responses.getAll.GetAllSecondCategoryResponse;
import com.kodlamaio.stockService.business.responses.update.UpdateMainCategoryResponse;
import com.kodlamaio.stockService.business.responses.update.UpdateSecondCategoryResponse;

import java.util.List;

public interface SecondCategoryService {
    CreateSecondCategoryResponse add (CreateSecondCategoryRequest createSecondCategoryRequest);
    void delete(String id);
    UpdateSecondCategoryResponse update(UpdateSecondCategoryRequest updateSecondCategoryRequest);
    List<GetAllSecondCategoryResponse> getAll();
    GetSecondCategoryResponse getById (String id);
}
