package com.pavan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/wish")
public class WishController {
	
	@GetMapping(value="/msg")
	public String wishUser()
	{
		return "Welcome to the Spring Restfull Services";
	}
}
