package com.pavan.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/res")
public class RestControllerImpl {
	
	@GetMapping("/show")
	public ResponseEntity<String> showCustomer()
	{
		return new ResponseEntity<String>("Get-Method of the Customer", HttpStatus.OK);
	}
	
	@PostMapping("/register")
	public ResponseEntity<String> registerCustomer()
	{
		return new ResponseEntity<String>("POST-method of the Customer", HttpStatus.OK);
	}

}
