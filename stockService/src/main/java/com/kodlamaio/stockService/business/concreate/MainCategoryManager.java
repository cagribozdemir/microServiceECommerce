package com.kodlamaio.stockService.business.concreate;

import com.example.common.utilities.mapping.ModelMapperService;
import com.kodlamaio.stockService.business.abstracs.MainCategoryService;
import com.kodlamaio.stockService.business.requests.create.CreateMainCategoryRequest;
import com.kodlamaio.stockService.business.requests.update.UpdateMainCategoryRequest;
import com.kodlamaio.stockService.business.responses.create.CreateMainCategoryResponse;
import com.kodlamaio.stockService.business.responses.get.GetMainCategoryResponse;
import com.kodlamaio.stockService.business.responses.getAll.GetAllMainCategoryResponse;
import com.kodlamaio.stockService.business.responses.update.UpdateMainCategoryResponse;
import com.kodlamaio.stockService.dataAccess.MainCategoryRepository;
import com.kodlamaio.stockService.entities.MainCategory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MainCategoryManager implements MainCategoryService {
    ModelMapperService modelMapperService;
    MainCategoryRepository mainCategoryRepository;

    @Override
    public CreateMainCategoryResponse add(CreateMainCategoryRequest createMainCategoryRequest) {
        MainCategory mainCategory = modelMapperService.forRequest().map(createMainCategoryRequest, MainCategory.class);
        mainCategory.setId(UUID.randomUUID().toString());
        mainCategoryRepository.save(mainCategory);
        CreateMainCategoryResponse createMainCategoryResponse = modelMapperService.forResponse().map(mainCategory, CreateMainCategoryResponse.class);
        return createMainCategoryResponse;
    }

    @Override
    public void delete(String id) {
        mainCategoryRepository.deleteById(id);
    }

    @Override
    public UpdateMainCategoryResponse update(UpdateMainCategoryRequest updateMainCategoryRequest) {
        MainCategory mainCategory = modelMapperService.forRequest().map(updateMainCategoryRequest, MainCategory.class);
        mainCategoryRepository.save(mainCategory);
        UpdateMainCategoryResponse updateMainCategoryResponse = modelMapperService.forResponse().map(mainCategory, UpdateMainCategoryResponse.class);
        return updateMainCategoryResponse;
    }

    @Override
    public List<GetAllMainCategoryResponse> getAll() {
        List<MainCategory> categories = mainCategoryRepository.findAll();
        return categories.stream().map(category -> modelMapperService.forResponse()
                .map(category, GetAllMainCategoryResponse.class))
                .collect(Collectors.toList());
    }

    @Override
    public GetMainCategoryResponse getById(String id) {
        MainCategory mainCategory = mainCategoryRepository.findById(id).get();
        GetMainCategoryResponse getMainCategoryResponse = modelMapperService.forResponse().map(mainCategory,GetMainCategoryResponse.class);
        return getMainCategoryResponse;
    }
}
