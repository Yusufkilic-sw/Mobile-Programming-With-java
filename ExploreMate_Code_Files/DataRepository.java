package com.sabanciuniv.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.sabanciuniv.model.AllData;


public interface DataRepository extends MongoRepository<AllData, String>{


	
	
}
