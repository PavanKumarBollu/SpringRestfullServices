package com.pavan.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/param")
public class RequestParamImpl {
	
	
	public ResponseEntity<String> customer(Integer id, String name)
	{
		String body = "The Given Id : " +id+ " And Name Is : " + name;
		return new ResponseEntity<String>(body, HttpStatus.OK);
	}
	
	
}
