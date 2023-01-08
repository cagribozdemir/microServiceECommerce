package com.example.filterservice.webApi;

import com.example.common.utilities.result.DataResult;
import com.example.filterservice.business.abstracts.FilterService;
import com.example.filterservice.business.responses.getAll.*;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/filters/")
public class FilterControllers {

    private FilterService filterService;


    @GetMapping("getAllProduct")
    public DataResult<List<GetAllProductResponse>> getAllProduct() {
        return this.filterService.getAllProduct();
    }

    @GetMapping("{productName}")
    public DataResult<List<GetAllFilterResponse>> getByProductName(@PathVariable String productName) {
        return this.filterService.getByProductName(productName);
    }

    @GetMapping("{productColor}")
    public DataResult<List<GetAllFilterResponse>> getByProductColor(@PathVariable String productColor) {
        return this.filterService.getByProductColor(productColor);
    }

    @GetMapping("productUnitPrice/{minProductUnitPrice}-{maxProductUnitPrice}")
    public DataResult<List<GetAllFilterResponse>> getByProductUnitPrice(@PathVariable double minProductUnitPrice, @PathVariable double maxProductUnitPrice) {
        return this.filterService.getByProductUnitPrice(minProductUnitPrice, maxProductUnitPrice);
    }

    @GetMapping("productRank/{minProductRank}-{maxProductRank}")
    public DataResult<List<GetAllFilterResponse>> getByProductRank(@PathVariable double minProductRank, @PathVariable double maxProductRank) {
        return this.filterService.getByProductRank(minProductRank, maxProductRank);
    }

    @GetMapping("getAllBrand")
    public  DataResult<List<GetAllBrandResponse>> getAllBrand() {
        return this.filterService.getAllBrand();
    }

    @GetMapping("{brandName}")
    public  DataResult<List<GetAllFilterResponse>> getByBrandName(@PathVariable String brandName){
        return this.filterService.getByBrandName(brandName);
    }

    @GetMapping("getAllMainCategoryName")
    public DataResult<List<GetAllMainCategoryResponse>> getAllMainCategoryName(){
        return this.filterService.getAllMainCategoryName();
    }

    @GetMapping("getAllSecondCategoryName")
    public  DataResult<List<GetAllSecondCategoryResponse>> getAllSecondCategoryName(){
        return this.filterService.getAllSecondCategoryName();
    }








}
