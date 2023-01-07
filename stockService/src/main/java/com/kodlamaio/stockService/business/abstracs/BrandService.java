package com.kodlamaio.stockService.business.abstracs;

import com.kodlamaio.stockService.business.requests.create.CreateBrandRequest;
import com.kodlamaio.stockService.business.requests.update.UpdateBrandRequest;
import com.kodlamaio.stockService.business.responses.create.CreateBrandResponse;
import com.kodlamaio.stockService.business.responses.get.GetBrandResponse;
import com.kodlamaio.stockService.business.responses.getAll.GetAllBrandResponse;
import com.kodlamaio.stockService.business.responses.update.UpdateBrandResponse;

import java.util.List;

public interface BrandService {
    CreateBrandResponse add (CreateBrandRequest createBrandRequest);
    void delete(String id);
    UpdateBrandResponse update(UpdateBrandRequest updateBrandRequest);
    List<GetAllBrandResponse> getAll();
    GetBrandResponse getById (String id);
}
