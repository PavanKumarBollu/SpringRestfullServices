package com.pavan.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
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
