package com.pavan.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/param")
public class RequestParamImpl {

	@GetMapping(value = "/user")
	public ResponseEntity<String> customer(@RequestParam(defaultValue = "10", required = false) Integer id,
			@RequestParam(defaultValue = "Pavan", required = false) String name) {
		String body = "The Given Id : " + id + " And Name Is : " + name;
		return new ResponseEntity<String>(body, HttpStatus.OK);
	}

}
