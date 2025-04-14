package com.pavan.restController;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.model.Company;
import com.pavan.model.Customer;

@RestController
@RequestMapping(value="/api/customer")
public class CustomerController {
	
	@GetMapping(value="/report/${id}")
	public ResponseEntity<Customer> showAllCustomer(@PathVariable Integer id)
	{
		// get from database
		System.out.println("Customer data for the id :: " + id);
		Customer customer = new Customer();
		customer.setCno(id);
		customer.setCname("sachin");
		customer.setBillAmount(54.5f);
		customer.setTeamNames(new String[] { "IND", "MI", "AsiaXI", "Mumbai" });
		customer.setStudies(List.of("10th", "12th", "Engineering"));
		customer.setPhoneNumbers(Set.of(9994445556L, 994349845L, 98765678L));
		customer.setIdDetails(Map.of("adhar", 99453123432L, "panNo", "DOOPQRCL12"));
		customer.setCompany(new Company("MI", "IPL", "Mumbai", 45));
		ResponseEntity<Customer> entity = new ResponseEntity<Customer>(customer, HttpStatus.OK);
		return entity;
	}
	
	public ResponseEntity<String> saveEmployee(@RequestBody Customer customer)
	{
		String body = "Customer Registerd with id:"+10;
		return new ResponseEntity<String>(body, HttpStatus.OK);
	}
	
	

}
 