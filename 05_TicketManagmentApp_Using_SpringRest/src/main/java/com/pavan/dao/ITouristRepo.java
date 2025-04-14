package com.pavan.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pavan.model.Tourist;

public interface ITouristRepo extends CrudRepository<Tourist, Integer> {
	
	public String RegisterTourist(Tourist tourist);
	public List<Tourist> findAllTourist();
	
}
