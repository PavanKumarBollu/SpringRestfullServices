package com.pavan.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/path")
public class PathVariableImpl {

	
	public ResponseEntity<String> employee()
	{
		return new ResponseEntity<String>(body, HttpStatus.OK);
	}
}
