package com.pavan.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.model.Tourist;
import com.pavan.service.ITouristMgmtService;

@RestController
@RequestMapping(value="/api/tourist")
public class TouristController {

	@Autowired
	private ITouristMgmtService service;
	
	
	@PostMapping(value="/register")
	public ResponseEntity<String> enrollTourist( @RequestBody Tourist tourist)
	{
		try {
			String result = service.RegisterTourist(tourist);
			return new ResponseEntity<String>(result, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Problem in tourist enrollment", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping(value="/findAll")
	public ResponseEntity<?> displayAllTourists()
	{
		try {
			List<Tourist> list = service.findAllTourist();
			return new ResponseEntity<List<Tourist>>(list, HttpStatus.OK);
		} catch (Exception e) {
			
			return new ResponseEntity<String>("Problem in fetching tourist", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
	
	
}
