package com.pavan.dao;

import org.springframework.data.repository.CrudRepository;

import com.pavan.model.Tourist;

public interface ITouristRepo extends CrudRepository<Tourist, Integer> {
	
	
}
