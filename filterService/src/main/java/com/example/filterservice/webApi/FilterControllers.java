package com.example.filterservice.webApi;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.common.utilities.result.DataResult;
import com.example.common.utilities.result.Result;
import com.example.filterservice.business.abstracts.FilterService;
import com.example.filterservice.business.requests.create.CreateBrandRequest;
import com.example.filterservice.business.requests.create.CreateMainCategoryRequest;
import com.example.filterservice.business.requests.create.CreateProductRequest;
import com.example.filterservice.business.requests.create.CreateSecondCategoryRequest;
import com.example.filterservice.business.requests.update.UpdateBrandRequest;
import com.example.filterservice.business.requests.update.UpdateMainCategoryRequest;
import com.example.filterservice.business.requests.update.UpdateProductRequest;
import com.example.filterservice.business.requests.update.UpdateSecondCategoryRequest;
import com.example.filterservice.business.responses.getAll.GetAllBrandResponse;
import com.example.filterservice.business.responses.getAll.GetAllFilterResponse;
import com.example.filterservice.business.responses.getAll.GetAllMainCategoryResponse;
import com.example.filterservice.business.responses.getAll.GetAllProductResponse;
import com.example.filterservice.business.responses.getAll.GetAllSecondCategoryResponse;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("api/filter")
public class FilterControllers {
	private FilterService filterService;

	
	Result addBrand(CreateBrandRequest createBrandRequest) {
		return filterService.addBrand(createBrandRequest);
	}

	Result addProduct(CreateProductRequest createProductRequest) {
		return filterService.addProduct(createProductRequest);
	}

	Result addMainCategory(CreateMainCategoryRequest createMainCategoryRequest) {
		return filterService.addMainCategory(createMainCategoryRequest);
	}

	Result addSecondCategory(CreateSecondCategoryRequest createSecondCategoryRequest) {
		return filterService.addSecondCategory(createSecondCategoryRequest);
	}
	

	Result updateBrand(UpdateBrandRequest updateBrandRequest) {
		return filterService.updateBrand(updateBrandRequest);
	}

	Result updateProduct(UpdateProductRequest updateProductRequest) {
		return filterService.updateProduct(updateProductRequest);
	}

	Result updateMainCategory(UpdateMainCategoryRequest updateMainCategoryRequest) {
		return filterService.updateMainCategory(updateMainCategoryRequest);
	}

	Result updateSecondCategory(UpdateSecondCategoryRequest updateSecondCategoryRequest) {
		return filterService.updateSecondCategory(updateSecondCategoryRequest);
	}

	
	DataResult<List<GetAllProductResponse>> getAllProduct() {
		return filterService.getAllProduct();
	}

	DataResult<List<GetAllFilterResponse>> getByProductName(String productName) {
		return filterService.getByProductName(productName);
	}

	DataResult<List<GetAllFilterResponse>> getByProductColor(String productColor) {
		return filterService.getByProductColor(productColor);
	}

	DataResult<List<GetAllFilterResponse>> getByProductUnitPrice(double productUnitPrice) {
		return filterService.getByProductUnitPrice(productUnitPrice);
	}

	DataResult<List<GetAllFilterResponse>> getByProductRank(double productRank) {
		return filterService.getByProductRank(productRank);
	}

	

	DataResult<List<GetAllBrandResponse>> getAllBrand() {
		return filterService.getAllBrand();
	}

	DataResult<List<GetAllFilterResponse>> getByBrandName(String brandName) {
		return filterService.getByBrandName(brandName);
	}

	
	DataResult<List<GetAllMainCategoryResponse>> getAllMainCategoryName() {
		return filterService.getAllMainCategoryName();
	}

	
	DataResult<List<GetAllSecondCategoryResponse>> getAllSecondCategoryName() {
		return filterService.getAllSecondCategoryName();
	}
}
