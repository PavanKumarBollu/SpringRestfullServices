package com.pavan;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pavan.model.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	try {
    		// Create Object Mapper
    		ObjectMapper mapper = new ObjectMapper();
    		
    		// using that Object read the data from json file and convert  into pojo object
			Customer customer = mapper.readValue(new File("data/sample-lite.json"), Customer.class);
			System.out.println(customer);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
