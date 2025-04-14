package com.pavan.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.model.Tourist;
import com.pavan.service.ITouristMgmtService;

@RestController
@RequestMapping(value="/api/tourist")
public class TouristController {

	@Autowired
	private ITouristMgmtService service;
	
	
	@PostMapping(value="/register")
	public ResponseEntity<String> enrollTourist( @RequestBody Tourist tourist)
	{
		service.RegisterTourist(tourist);
		return null;
	}
	
	
	
	
	
}
