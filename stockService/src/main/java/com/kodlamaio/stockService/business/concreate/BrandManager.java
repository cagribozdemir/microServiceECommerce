package com.kodlamaio.stockService.business.concreate;

import com.example.common.utilities.mapping.ModelMapperService;
import com.kodlamaio.stockService.business.abstracs.BrandService;
import com.kodlamaio.stockService.business.requests.create.CreateBrandRequest;
import com.kodlamaio.stockService.business.requests.update.UpdateBrandRequest;
import com.kodlamaio.stockService.business.responses.create.CreateBrandResponse;
import com.kodlamaio.stockService.business.responses.get.GetBrandResponse;
import com.kodlamaio.stockService.business.responses.getAll.GetAllBrandResponse;
import com.kodlamaio.stockService.business.responses.update.UpdateBrandResponse;
import com.kodlamaio.stockService.dataAccess.BrandRepository;
import com.kodlamaio.stockService.entities.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {
    ModelMapperService modelMapperService;
    BrandRepository brandRepository;

    @Override
    public CreateBrandResponse add(CreateBrandRequest createBrandRequest) {
        Brand brand = modelMapperService.forRequest().map(createBrandRequest, Brand.class);
        brand.setId(UUID.randomUUID().toString());
        brandRepository.save(brand);
        CreateBrandResponse createBrandResponse = modelMapperService.forResponse().map(brand, CreateBrandResponse.class);
        return createBrandResponse;
    }

    @Override
    public void delete(String id) {
        brandRepository.deleteById(id);
    }

    @Override
    public UpdateBrandResponse update(UpdateBrandRequest updateBrandRequest) {
        Brand brand = modelMapperService.forRequest().map(updateBrandRequest, Brand.class);
        brandRepository.save(brand);
        UpdateBrandResponse updateBrandResponse = modelMapperService.forResponse().map(brand, UpdateBrandResponse.class);
        return updateBrandResponse;
    }

    @Override
    public List<GetAllBrandResponse> getAll() {
        List<Brand> brands = brandRepository.findAll();
        return brands.stream().map(brand -> modelMapperService.forResponse()
                .map(brand, GetAllBrandResponse.class))
                .collect(Collectors.toList());
    }

    @Override
    public GetBrandResponse getById(String id) {
        Brand brand = brandRepository.findById(id).get();
        GetBrandResponse getBrandResponse = modelMapperService.forResponse().map(brand, GetBrandResponse.class);
        return getBrandResponse;
    }
}
