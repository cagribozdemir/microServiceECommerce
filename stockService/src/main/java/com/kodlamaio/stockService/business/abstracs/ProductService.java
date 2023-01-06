package com.kodlamaio.stockService.business.abstracs;

import com.kodlamaio.stockService.business.requests.CreateProductRequest;
import com.kodlamaio.stockService.business.requests.UpdateProductRequest;
import com.kodlamaio.stockService.business.responses.CreateProductResponse;
import com.kodlamaio.stockService.business.responses.GetAllProductResponse;
import com.kodlamaio.stockService.business.responses.GetProductResponse;
import com.kodlamaio.stockService.business.responses.UpdateProductResponse;

import java.util.List;

public interface ProductService {
    CreateProductResponse add (CreateProductRequest createProductRequest);
    void delete(String id);
    UpdateProductResponse update(UpdateProductRequest updateProductRequest);
    List<GetAllProductResponse> getAll();
    GetProductResponse getById (String id);
    GetProductResponse getByName (String name);
}
