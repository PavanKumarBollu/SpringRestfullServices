package com.pavan.restController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.model.Customer;

@RestController
@RequestMapping(value="/api/customer")
public class CustomerController {
	
	public ResponseEntity<Customer> showAllCustomer()
	{
		return entity;
	}

}
