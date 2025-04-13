package com.pavan.model;

import lombok.Data;

@Data
public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private boolean active;
	
	
	// HAS-A property
		private Address address;

		// Array property
		private String[] languages;
}
