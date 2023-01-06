package com.kodlamaio.stockService.business.concreate;

import com.kodlamaio.stockService.business.abstracs.ProductService;
import com.kodlamaio.stockService.business.requests.CreateProductRequest;
import com.kodlamaio.stockService.business.requests.UpdateProductRequest;
import com.kodlamaio.stockService.business.responses.CreateProductResponse;
import com.kodlamaio.stockService.business.responses.GetAllProductResponse;
import com.kodlamaio.stockService.business.responses.GetProductResponse;
import com.kodlamaio.stockService.business.responses.UpdateProductResponse;
import com.kodlamaio.stockService.dataAccess.ProductRepository;
import com.kodlamaio.common.utilities.mapping.ModelMapperManager;

import java.util.List;

public class ProductManager implements ProductService {
    ProductRepository productRepository ;
    ModelMapperService modelMapperService;

    @Override
    public CreateProductResponse add(CreateProductRequest createProductRequest) {
        Product product= modelMapperService.forRequest().map(createProductRequest,Product.class);
        product.set
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public UpdateProductResponse update(UpdateProductRequest updateProductRequest) {
        return null;
    }

    @Override
    public List<GetAllProductResponse> getAll() {
        return null;
    }

    @Override
    public GetProductResponse getById(String id) {
        return null;
    }

    @Override
    public GetProductResponse getByName(String name) {
        return null;
    }
}
