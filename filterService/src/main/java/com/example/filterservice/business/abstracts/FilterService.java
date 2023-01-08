package com.example.filterservice.business.abstracts;

import com.example.common.utilities.result.DataResult;
import com.example.common.utilities.result.Result;
import com.example.filterservice.business.requests.create.CreateBrandRequest;
import com.example.filterservice.business.requests.create.CreateMainCategoryRequest;
import com.example.filterservice.business.requests.create.CreateProductRequest;
import com.example.filterservice.business.requests.create.CreateSecondCategoryRequest;
import com.example.filterservice.business.requests.update.UpdateBrandRequest;
import com.example.filterservice.business.requests.update.UpdateMainCategoryRequest;
import com.example.filterservice.business.requests.update.UpdateProductRequest;
import com.example.filterservice.business.requests.update.UpdateSecondCategoryRequest;
import com.example.filterservice.business.responses.getAll.*;

import java.util.List;

public interface FilterService {


    //Create Operations

    Result addBrand (CreateBrandRequest createBrandRequest);

    Result addProduct (CreateProductRequest createProductRequest);

    Result addMainCategory (CreateMainCategoryRequest createMainCategoryRequest);

    Result addSecondCategory (CreateSecondCategoryRequest createSecondCategoryRequest);

    //Update Operations

    Result updateBrand (UpdateBrandRequest updateBrandRequest);
    Result updateProduct (UpdateProductRequest updateProductRequest);
    Result updateMainCategory (UpdateMainCategoryRequest updateMainCategoryRequest);
    Result updateSecondCategory (UpdateSecondCategoryRequest updateSecondCategoryRequest);


    // Read Product
    DataResult<List<GetAllProductResponse>> getAllProduct();

    DataResult<List<GetAllFilterResponse>> getByProductName(String productName);

    DataResult<List<GetAllFilterResponse>> getByProductColor(String productColor);

    DataResult<List<GetAllFilterResponse>> getByProductUnitPrice(double minProductUnitPrice, double maxProductUnitPrice);

    DataResult<List<GetAllFilterResponse>> getByProductRank(double minProductRank, double maxProductRank);

    //Read Brand

    DataResult<List<GetAllBrandResponse>> getAllBrand();
    DataResult<List<GetAllFilterResponse>> getByBrandName(String brandName);

    //Read Main-Category
    DataResult<List<GetAllMainCategoryResponse>> getAllMainCategoryName();

    //Read Second-Category
    DataResult<List<GetAllSecondCategoryResponse>> getAllSecondCategoryName();

}
