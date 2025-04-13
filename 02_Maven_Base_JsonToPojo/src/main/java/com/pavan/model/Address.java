package com.pavan.model;

import lombok.Data;

@Data
public class Address {
	private String street;
	private String city;
	private String state;
	private String zip;
	private String country;
}
