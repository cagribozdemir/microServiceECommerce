package com.example.filterservice.webApi;

import java.util.List;

import javax.ws.rs.GET;

import org.springframework.data.mongodb.repository.Update;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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


	@PostMapping("/addbrand")
	Result addBrand(CreateBrandRequest createBrandRequest) {
		return filterService.addBrand(createBrandRequest);
	}

	@PostMapping("/addproduct")
	Result addProduct(CreateProductRequest createProductRequest) {
		return filterService.addProduct(createProductRequest);
	}

	@PostMapping("/addmaincategory")
	Result addMainCategory(CreateMainCategoryRequest createMainCategoryRequest) {
		return filterService.addMainCategory(createMainCategoryRequest);
	}

	@PostMapping("/addsecondcategory")
	Result addSecondCategory(CreateSecondCategoryRequest createSecondCategoryRequest) {
		return filterService.addSecondCategory(createSecondCategoryRequest);
	}

	@PutMapping("/updatebrand")
	Result updateBrand(UpdateBrandRequest updateBrandRequest) {
		return filterService.updateBrand(updateBrandRequest);
	}

	@PutMapping("/updateproduct")
	Result updateProduct(UpdateProductRequest updateProductRequest) {
		return filterService.updateProduct(updateProductRequest);
	}

	@PutMapping("/updatemaincategory")
	Result updateMainCategory(UpdateMainCategoryRequest updateMainCategoryRequest) {
		return filterService.updateMainCategory(updateMainCategoryRequest);
	}

	@PutMapping("/updatesecondcategory")
	Result updateSecondCategory(UpdateSecondCategoryRequest updateSecondCategoryRequest) {
		return filterService.updateSecondCategory(updateSecondCategoryRequest);
	}

	@GetMapping("/getallproduct")
	DataResult<List<GetAllProductResponse>> getAllProduct() {
		return filterService.getAllProduct();
	}

	@GetMapping("/productname")
	DataResult<List<GetAllFilterResponse>> getByProductName(String productName) {
		return filterService.getByProductName(productName);
	}

	@GetMapping("/productcolor")
	DataResult<List<GetAllFilterResponse>> getByProductColor(String productColor) {
		return filterService.getByProductColor(productColor);
	}

	@GetMapping("/productunitprice")
	DataResult<List<GetAllFilterResponse>> getByProductUnitPrice(double productUnitPrice) {
		return filterService.getByProductUnitPrice(productUnitPrice);
	}

	@GetMapping("/productrank")
	DataResult<List<GetAllFilterResponse>> getByProductRank(double productRank) {
		return filterService.getByProductRank(productRank);
	}

	@GetMapping("/getallbrand")
	DataResult<List<GetAllBrandResponse>> getAllBrand() {
		return filterService.getAllBrand();
	}

	@GetMapping("/brandname")
	DataResult<List<GetAllFilterResponse>> getByBrandName(String brandName) {
		return filterService.getByBrandName(brandName);
	}

	@GetMapping("/getallmaincategory")
	DataResult<List<GetAllMainCategoryResponse>> getAllMainCategoryName() {
		return filterService.getAllMainCategoryName();
	}

	@GetMapping("/getallproduct")
	DataResult<List<GetAllSecondCategoryResponse>> getAllSecondCategoryName() {
		return filterService.getAllSecondCategoryName();
	}
}
