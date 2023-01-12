package com.example.filterservice.business.concretes;

import com.example.common.utilities.mapping.ModelMapperService;
import com.example.common.utilities.messages.BusinessMessage;
import com.example.common.utilities.result.DataResult;
import com.example.common.utilities.result.Result;
import com.example.common.utilities.result.SuccessDataResult;
import com.example.common.utilities.result.SuccessResult;
import com.example.filterservice.business.abstracts.FilterService;
import com.example.filterservice.business.requests.create.CreateBrandRequest;
import com.example.filterservice.business.requests.create.CreateMainCategoryRequest;
import com.example.filterservice.business.requests.create.CreateProductRequest;
import com.example.filterservice.business.requests.create.CreateSecondCategoryRequest;
import com.example.filterservice.business.requests.update.UpdateBrandRequest;
import com.example.filterservice.business.requests.update.UpdateMainCategoryRequest;
import com.example.filterservice.business.requests.update.UpdateProductRequest;
import com.example.filterservice.business.requests.update.UpdateSecondCategoryRequest;
import com.example.filterservice.business.responses.getAll.*;
import com.example.filterservice.dataAccess.FilterRepository;
import com.example.filterservice.entities.Filter;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class FilterManager implements FilterService {

    private FilterRepository filterRepository;
    private ModelMapperService modelMapperService;


    //Add Methods
    @Override
    public Result addBrand(CreateBrandRequest createBrandRequest) {
        Filter filter = this.modelMapperService.forRequest().map(createBrandRequest, Filter.class);
        this.filterRepository.save(filter);
        return new SuccessDataResult(BusinessMessage.GlobalMessage.DATA_ADDED_SUCCESSFULLY);

    }

    @Override
    public Result addProduct(CreateProductRequest createProductRequest) {
        Filter filter = this.modelMapperService.forRequest().map(createProductRequest, Filter.class);
        this.filterRepository.save(filter);
        return new SuccessResult(BusinessMessage.GlobalMessage.DATA_ADDED_SUCCESSFULLY);
    }

    @Override
    public Result addMainCategory(CreateMainCategoryRequest createMainCategoryRequest) {
        Filter filter = this.modelMapperService.forRequest().map(createMainCategoryRequest, Filter.class);
        this.filterRepository.save(filter);
        return new SuccessResult(BusinessMessage.GlobalMessage.DATA_ADDED_SUCCESSFULLY);
    }

    @Override
    public Result addSecondCategory(CreateSecondCategoryRequest createSecondCategoryRequest) {
        Filter filter = this.modelMapperService.forRequest().map(createSecondCategoryRequest, Filter.class);
        this.filterRepository.save(filter);
        return new SuccessResult(BusinessMessage.GlobalMessage.DATA_ADDED_SUCCESSFULLY);
    }


    //Update Methods

    @Override
    public Result updateBrand(UpdateBrandRequest updateBrandRequest) {
        Filter filter = this.modelMapperService.forRequest().map(updateBrandRequest, Filter.class);
        this.filterRepository.save(filter);
        return new SuccessResult(BusinessMessage.GlobalMessage.DATA_UPDATED_SUCCESSFULLY);
    }

    @Override
    public Result updateProduct(UpdateProductRequest updateProductRequest) {
        Filter filter = this.modelMapperService.forRequest().map(updateProductRequest, Filter.class);
        this.filterRepository.save(filter);
        return new SuccessResult(BusinessMessage.GlobalMessage.DATA_UPDATED_SUCCESSFULLY);
    }

    @Override
    public Result updateMainCategory(UpdateMainCategoryRequest updateMainCategoryRequest) {
        Filter filter = this.modelMapperService.forRequest().map(updateMainCategoryRequest, Filter.class);
        this.filterRepository.save(filter);
        return new SuccessResult(BusinessMessage.GlobalMessage.DATA_UPDATED_SUCCESSFULLY);
    }

    @Override
    public Result updateSecondCategory(UpdateSecondCategoryRequest updateSecondCategoryRequest) {
        Filter filter = this.modelMapperService.forRequest().map(updateSecondCategoryRequest, Filter.class);
        this.filterRepository.save(filter);
        return new SuccessResult(BusinessMessage.GlobalMessage.DATA_UPDATED_SUCCESSFULLY);
    }


    //Read Methods For Product
    @Override
    public DataResult<List<GetAllProductResponse>> getAllProduct() {
        List<Filter> filters = this.filterRepository.findAll();
        List<GetAllProductResponse> getAllProductResponses = filters.stream().map(filter -> this.modelMapperService.forResponse().map(filter, GetAllProductResponse.class)).collect(Collectors.toList());
        return new SuccessDataResult<>(getAllProductResponses, BusinessMessage.GlobalMessage.DATA_LISTED_SUCCESSFULY);
    }

    @Override
    public DataResult<List<GetAllFilterResponse>> getByProductName(String productName) {
        List<Filter> filters = this.filterRepository.getFilterByProductName(productName);
        List<GetAllFilterResponse> getAllFilterResponses = filters.stream().map(filter -> this.modelMapperService.forResponse().map(filter, GetAllFilterResponse.class)).collect(Collectors.toList());
        return new SuccessDataResult<>(getAllFilterResponses, BusinessMessage.GlobalMessage.DATA_LISTED_SUCCESSFULY);

    }

    @Override
    public DataResult<List<GetAllFilterResponse>> getByProductColor(String productColor) {
        List<Filter> filters = this.filterRepository.getFilterByProductColor(productColor);
        List<GetAllFilterResponse> getAllFilterResponses = filters.stream().map(filter -> this.modelMapperService.forResponse().map(filters, GetAllFilterResponse.class)).collect(Collectors.toList());
        return new SuccessDataResult<>(getAllFilterResponses, BusinessMessage.GlobalMessage.DATA_LISTED_SUCCESSFULY);

    }

    @Override
    public DataResult<List<GetAllFilterResponse>> getByProductUnitPrice(double productUnitPrice) {
        List<Filter> filters = this.filterRepository.getFilterByProductUnitPrice(productUnitPrice);
        List<GetAllFilterResponse> getAllFilterResponses = filters.stream().map(filter -> this.modelMapperService.forResponse().map(filters, GetAllFilterResponse.class)).collect(Collectors.toList());
        return new SuccessDataResult<>(getAllFilterResponses, BusinessMessage.GlobalMessage.DATA_LISTED_SUCCESSFULY);
    }

    @Override
    public DataResult<List<GetAllFilterResponse>> getByProductRank(double productRank) {
        List<Filter> filters = this.filterRepository.getFilterByProductRank(productRank);
        List<GetAllFilterResponse> getAllFilterResponses = filters.stream().map(filter -> this.modelMapperService.forResponse().map(filters, GetAllFilterResponse.class)).collect(Collectors.toList());
        return new SuccessDataResult<>(getAllFilterResponses, BusinessMessage.GlobalMessage.DATA_LISTED_SUCCESSFULY);
    }


    //Read Methods For Brand
    @Override
    public DataResult<List<GetAllBrandResponse>> getAllBrand() {
        List<Filter> filters = this.filterRepository.findAll();
        List<GetAllBrandResponse> getAllBrandResponses = filters.stream().map(filter -> this.modelMapperService.forResponse().map(filters, GetAllBrandResponse.class)).collect(Collectors.toList());
        return new SuccessDataResult<>(getAllBrandResponses, BusinessMessage.GlobalMessage.DATA_LISTED_SUCCESSFULY);
    }

    @Override
    public DataResult<List<GetAllFilterResponse>> getByBrandName(String brandName) {
        List<Filter> filters = this.filterRepository.getFilterByBrandName(brandName);
        List<GetAllFilterResponse> getAllFilterResponses = filters.stream().map(filter -> this.modelMapperService.forResponse().map(filters, GetAllFilterResponse.class)).collect(Collectors.toList());
        return new SuccessDataResult<>(getAllFilterResponses, BusinessMessage.GlobalMessage.DATA_LISTED_SUCCESSFULY);
    }

    //Read Method For Main Category
    @Override
    public DataResult<List<GetAllMainCategoryResponse>> getAllMainCategoryName() {
        List<Filter> filters = this.filterRepository.findAll();
        List<GetAllMainCategoryResponse> getAllMainCategoryResponses = filters.stream().map(filter -> this.modelMapperService.forResponse().map(filters, GetAllMainCategoryResponse.class)).collect(Collectors.toList());
        return new SuccessDataResult<>(getAllMainCategoryResponses, BusinessMessage.GlobalMessage.DATA_LISTED_SUCCESSFULY);
    }

    //Read Method For Second Category
    @Override
    public DataResult<List<GetAllSecondCategoryResponse>> getAllSecondCategoryName() {
        List<Filter> filters = this.filterRepository.findAll();
        List<GetAllSecondCategoryResponse> getAllSecondCategoryResponses = filters.stream().map(filter -> this.modelMapperService.forResponse().map(filters, GetAllSecondCategoryResponse.class)).collect(Collectors.toList());
        return new SuccessDataResult<>(getAllSecondCategoryResponses, BusinessMessage.GlobalMessage.DATA_LISTED_SUCCESSFULY);
    }
}

