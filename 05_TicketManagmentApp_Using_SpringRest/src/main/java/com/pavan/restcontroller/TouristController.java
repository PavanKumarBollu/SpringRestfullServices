package com.pavan.restcontroller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/tourist")
public class TouristController {

	
	@PostMapping(value="/register")
	public ResponseEntity<String> enrollTourist()
	{
		return null;
	}
	
	
	
	
	
}
