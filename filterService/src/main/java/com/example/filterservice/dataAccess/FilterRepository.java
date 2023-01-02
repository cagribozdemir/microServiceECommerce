package com.example.filterservice.dataAccess;

import com.example.filterservice.entities.Filter;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FilterRepository  extends MongoRepository<Filter,String> {

}
