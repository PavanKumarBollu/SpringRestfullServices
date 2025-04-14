package com.pavan.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/path")
public class PathVariableImpl {

	@GetMapping(value = "/emp/{eId}/{eName}")
	public ResponseEntity<String> employee( @PathVariable(value="eId") Integer id, @PathVariable(value="eName") String name) {
		String body = "Id Of the Employee : " + id + " and Name Of the Employee : " + name;
		// Logic with the collected values
		return new ResponseEntity<String>(body, HttpStatus.OK);
	}
}
