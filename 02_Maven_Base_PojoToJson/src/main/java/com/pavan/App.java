package com.pavan;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pavan.model.Product;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	try {
    		// Create Object Mapper
    		ObjectMapper mapper = new ObjectMapper();
    		Product product = new Product();
    		product = getObjectData(product);
    		System.out.println("In java format :: " + product);
    		
    		// Converting java object into JsonString
			String asString = mapper.writeValueAsString(product);
			System.out.println("In json format :: " + asString);
			
			// Writing the data to json file
						mapper.writeValue(new File("product-list.json"), product);
						System.out.println("Wrote the data to json file");
			
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    public static Product getObjectData(Product product) {

		product.setPid(10);
		product.setPname("fossil");
		product.setPrice(24556.0);
		product.setTypes(new String[] { "chronography", "simpledial", "automatic" });

		return product;
	}
    
}
