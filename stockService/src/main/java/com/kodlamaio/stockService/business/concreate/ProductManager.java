package com.kodlamaio.stockService.business.concreate;

import com.example.common.utilities.mapping.ModelMapperService;
import com.kodlamaio.stockService.business.abstracs.ProductService;
import com.kodlamaio.stockService.business.requests.create.CreateProductRequest;
import com.kodlamaio.stockService.business.requests.update.UpdateProductRequest;
import com.kodlamaio.stockService.business.responses.create.CreateProductResponse;
import com.kodlamaio.stockService.business.responses.getAll.GetAllProductResponse;
import com.kodlamaio.stockService.business.responses.get.GetProductResponse;
import com.kodlamaio.stockService.business.responses.update.UpdateProductResponse;
import com.kodlamaio.stockService.dataAccess.ProductRepository;
import com.kodlamaio.stockService.entities.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductManager implements ProductService {
    ProductRepository productRepository ;
    ModelMapperService modelMapperService;

    @Override
    public CreateProductResponse add(CreateProductRequest createProductRequest) {
        Product product= modelMapperService.forRequest().map(createProductRequest,Product.class);
        product.setId(UUID.randomUUID().toString());
        productRepository.save(product);
        CreateProductResponse createProductResponse = modelMapperService.forResponse().map(product,CreateProductResponse.class);
        return createProductResponse;
    }

    @Override
    public void delete(String id) {
        productRepository.deleteById(id);
    }

    @Override
    public UpdateProductResponse update(UpdateProductRequest updateProductRequest) {
        Product product = modelMapperService.forRequest().map(updateProductRequest, Product.class);
        productRepository.save(product);
        UpdateProductResponse updateProductResponse = modelMapperService.forResponse().map(product,UpdateProductResponse.class);
        return updateProductResponse;
    }

    @Override
    public List<GetAllProductResponse> getAll() {
        List<Product> responses = productRepository.findAll();
        return responses.stream().map(response -> modelMapperService.forResponse()
                .map(response, GetAllProductResponse.class))
                .collect(Collectors.toList());
    }

    @Override
    public GetProductResponse getById(String id) {
        Product product = productRepository.findById(id).get();
        GetProductResponse getProductResponse = modelMapperService.forResponse().map(product, GetProductResponse.class);
        return getProductResponse;
    }
}
