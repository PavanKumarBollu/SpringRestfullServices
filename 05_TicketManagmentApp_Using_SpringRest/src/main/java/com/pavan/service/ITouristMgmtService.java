package com.pavan.service;

import java.util.List;

import com.pavan.model.Tourist;

public interface ITouristMgmtService {
	public String RegisterTourist(Tourist tourist);
	public List<Tourist> findAllTourist();
	public Tourist fetchTouristById(Integer id);
	public String updateTouristByDetails(Tourist t);
	public String updateTouristById(Integer id,float hikePercent);
	public String DeleteTouristById(Integer id);
}
