package com.pavan.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@PatchMapping("/modify")
	public ResponseEntity<String> updateCustomerByNo()
	{
		return new ResponseEntity<String>("Patch-method of the Customer", HttpStatus.OK);
	}
	
	
	@PutMapping(value="/update")
	public ResponseEntity<String> updateCustomer()
	{
		return new ResponseEntity<String>("Put-Method of the customer", HttpStatus.OK);
	}

}
