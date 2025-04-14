package com.pavan.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pavan.model.Tourist;

public interface ITouristRepo extends CrudRepository<Tourist, Integer> {
	
	public String RegisterTourist(Tourist tourist);
	public List<Tourist> findAllTourist();
	public Tourist fetchTouristById(Integer id);
	public String updateTouristByDetails(Tourist t);
	public String updateTouristById(Integer id);
	public String DeleteTouristById(Integer id);
}
