package com.pavan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.dao.ITouristRepo;
import com.pavan.model.Tourist;

@Service
public class TouristServiceMgmtImpl implements ITouristMgmtService {

	@Autowired
	private ITouristRepo repo;
	
	
	@Override
	public String RegisterTourist(Tourist tourist) {
		return null;
	}

	@Override
	public List<Tourist> findAllTourist() {
		return null;
	}

	@Override
	public Tourist fetchTouristById(Integer id) {
		return null;
	}

	@Override
	public String updateTouristByDetails(Tourist t) {
		return null;
	}

	@Override
	public String updateTouristById(Integer id) {
		return null;
	}

	@Override
	public String DeleteTouristById(Integer id) {
		return null;
	}

}
