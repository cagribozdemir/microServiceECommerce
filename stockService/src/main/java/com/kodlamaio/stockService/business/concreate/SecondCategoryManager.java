package com.kodlamaio.stockService.business.concreate;

import com.example.common.utilities.mapping.ModelMapperService;
import com.kodlamaio.stockService.business.abstracs.SecondCategoryService;
import com.kodlamaio.stockService.business.requests.create.CreateSecondCategoryRequest;
import com.kodlamaio.stockService.business.requests.update.UpdateSecondCategoryRequest;
import com.kodlamaio.stockService.business.responses.create.CreateSecondCategoryResponse;
import com.kodlamaio.stockService.business.responses.get.GetSecondCategoryResponse;
import com.kodlamaio.stockService.business.responses.getAll.GetAllSecondCategoryResponse;
import com.kodlamaio.stockService.business.responses.update.UpdateSecondCategoryResponse;
import com.kodlamaio.stockService.dataAccess.SecondCategoryRepository;
import com.kodlamaio.stockService.entities.SecondCategory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class SecondCategoryManager implements SecondCategoryService {

    ModelMapperService modelMapperService;
    SecondCategoryRepository secondCategoryRepository;

    @Override
    public CreateSecondCategoryResponse add(CreateSecondCategoryRequest createSecondCategoryRequest) {
        SecondCategory secondCategory =modelMapperService.forRequest().map(createSecondCategoryRequest, SecondCategory.class);
        secondCategory.setId(UUID.randomUUID().toString());
        secondCategoryRepository.save(secondCategory);
        CreateSecondCategoryResponse createSecondCategoryResponse =modelMapperService.forResponse().map(secondCategory, CreateSecondCategoryResponse.class);
        return createSecondCategoryResponse;
    }

    @Override
    public void delete(String id) {
        secondCategoryRepository.deleteById(id);
    }

    @Override
    public UpdateSecondCategoryResponse update(UpdateSecondCategoryRequest updateSecondCategoryRequest) {
        SecondCategory secondCategory =modelMapperService.forRequest().map(updateSecondCategoryRequest, SecondCategory.class);
        secondCategoryRepository.save(secondCategory);
        UpdateSecondCategoryResponse updateSecondCategoryResponse =modelMapperService.forResponse().map(secondCategory, UpdateSecondCategoryResponse.class);
        return updateSecondCategoryResponse;
    }

    @Override
    public List<GetAllSecondCategoryResponse> getAll() {
        List<SecondCategory> categories = secondCategoryRepository.findAll();
        return categories.stream().map(category -> modelMapperService.forResponse()
                .map(category, GetAllSecondCategoryResponse.class))
                .collect(Collectors.toList());
    }

    @Override
    public GetSecondCategoryResponse getById(String id) {
        SecondCategory secondCategory =secondCategoryRepository.findById(id).get();
        GetSecondCategoryResponse getSecondCategoryResponse =modelMapperService.forResponse().map(secondCategory, GetSecondCategoryResponse.class);
        return getSecondCategoryResponse;
    }
}
