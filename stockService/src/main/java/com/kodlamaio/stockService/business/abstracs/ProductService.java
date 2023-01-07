package com.kodlamaio.stockService.business.abstracs;

import com.kodlamaio.stockService.business.requests.create.CreateProductRequest;
import com.kodlamaio.stockService.business.requests.update.UpdateProductRequest;
import com.kodlamaio.stockService.business.responses.create.CreateProductResponse;
import com.kodlamaio.stockService.business.responses.getAll.GetAllProductResponse;
import com.kodlamaio.stockService.business.responses.get.GetProductResponse;
import com.kodlamaio.stockService.business.responses.update.UpdateProductResponse;

import java.util.List;

public interface ProductService {
    CreateProductResponse add (CreateProductRequest createProductRequest);
    void delete(String id);
    UpdateProductResponse update(UpdateProductRequest updateProductRequest);
    List<GetAllProductResponse> getAll();
    GetProductResponse getById (String id);
}
