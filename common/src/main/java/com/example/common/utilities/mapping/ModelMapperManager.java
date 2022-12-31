package com.example.common.utilities.mapping;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor

public class ModelMapperManager implements ModelMapperService {

    private ModelMapper modelMapper;

	public ModelMapper forRequest() {
		// TODO Auto-generated method stub
		return null;
	}

	public ModelMapper forResponse() {
		// TODO Auto-generated method stub
		return null;
	}

   
    
}
