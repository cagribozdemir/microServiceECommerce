package com.example.filterservice.webApi;

import java.util.List;

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
	public Result addBrand(CreateBrandRequest createBrandRequest) {
		return filterService.addBrand(createBrandRequest);
	}

	@PostMapping("/addproduct")
	public Result addProduct(CreateProductRequest createProductRequest) {
		return filterService.addProduct(createProductRequest);
	}

	@PostMapping("/addmaincategory")
	public Result addMainCategory(CreateMainCategoryRequest createMainCategoryRequest) {
		return filterService.addMainCategory(createMainCategoryRequest);
	}

	@PostMapping("/addsecondcategory")
	public Result addSecondCategory(CreateSecondCategoryRequest createSecondCategoryRequest) {
		return filterService.addSecondCategory(createSecondCategoryRequest);
	}

	@PutMapping("/updatebrand")
	public Result updateBrand(UpdateBrandRequest updateBrandRequest) {
		return filterService.updateBrand(updateBrandRequest);
	}

	@PutMapping("/updateproduct")
	public Result updateProduct(UpdateProductRequest updateProductRequest) {
		return filterService.updateProduct(updateProductRequest);
	}

	@PutMapping("/updatemaincategory")
	public Result updateMainCategory(UpdateMainCategoryRequest updateMainCategoryRequest) {
		return filterService.updateMainCategory(updateMainCategoryRequest);
	}

	@PutMapping("/updatesecondcategory")
	public Result updateSecondCategory(UpdateSecondCategoryRequest updateSecondCategoryRequest) {
		return filterService.updateSecondCategory(updateSecondCategoryRequest);
	}

	@GetMapping("/getallproduct")
	public DataResult<List<GetAllProductResponse>> getAllProduct() {
		return filterService.getAllProduct();
	}

	@GetMapping("/productname")
	public DataResult<List<GetAllFilterResponse>> getByProductName(String productName) {
		return filterService.getByProductName(productName);
	}

	@GetMapping("/productcolor")
	public DataResult<List<GetAllFilterResponse>> getByProductColor(String productColor) {
		return filterService.getByProductColor(productColor);
	}

	@GetMapping("/productunitprice")
	public DataResult<List<GetAllFilterResponse>> getByProductUnitPrice(double productUnitPrice) {
		return filterService.getByProductUnitPrice(productUnitPrice);
	}

	@GetMapping("/productrank")
	public DataResult<List<GetAllFilterResponse>> getByProductRank(double productRank) {
		return filterService.getByProductRank(productRank);
	}

	@GetMapping("/getallbrand")
	public DataResult<List<GetAllBrandResponse>> getAllBrand() {
		return filterService.getAllBrand();
	}

	@GetMapping("/brandname")
	public DataResult<List<GetAllFilterResponse>> getByBrandName(String brandName) {
		return filterService.getByBrandName(brandName);
	}

	@GetMapping("/getallmaincategory")
	public DataResult<List<GetAllMainCategoryResponse>> getAllMainCategoryName() {
		return filterService.getAllMainCategoryName();
	}

	@GetMapping("/getallproduct")
	public DataResult<List<GetAllSecondCategoryResponse>> getAllSecondCategoryName() {
		return filterService.getAllSecondCategoryName();
	}
}
