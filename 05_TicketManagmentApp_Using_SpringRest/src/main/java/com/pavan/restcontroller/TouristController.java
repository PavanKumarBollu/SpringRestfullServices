package com.pavan.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.model.Tourist;
import com.pavan.service.ITouristMgmtService;

@RestController
@RequestMapping(value = "/api/tourist")
public class TouristController {

	@Autowired
	private ITouristMgmtService service;

	@PostMapping(value = "/register")
	public ResponseEntity<String> enrollTourist(@RequestBody Tourist tourist) {
		try {
			String result = service.RegisterTourist(tourist);
			return new ResponseEntity<String>(result, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Problem in tourist enrollment", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping(value = "/findAll")
	public ResponseEntity<?> displayAllTourists() {
		try {
			List<Tourist> list = service.findAllTourist();
			return new ResponseEntity<List<Tourist>>(list, HttpStatus.OK);
		} catch (Exception e) {

			return new ResponseEntity<String>("Problem in fetching tourist", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping(value = "/find/{tId}")
	public ResponseEntity<?> findTouristById(@PathVariable(name = "tId") Integer id) {
		try {
			Tourist tourist = service.fetchTouristById(id);
			return new ResponseEntity<Tourist>(tourist, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping(value="/modify")
	public ResponseEntity<String> modifyTourist( @RequestBody Tourist tourist) {
		try {
			String touristByDetails = service.updateTouristByDetails(tourist);
			return new ResponseEntity<String>(touristByDetails, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
	@PatchMapping(value="/modifyBudget/{tId}/{hike}")
	public ResponseEntity<String> modifyTouristBudgetById(@PathVariable(name = "tId") Integer id, @PathVariable(name="hike") Float hikeAmt)
	{
		try
		{
			String result = service.updateTouristById(id, hikeAmt);
			return new ResponseEntity<String>(result, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	 
	
	

}
