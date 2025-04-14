package com.pavan.advice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.pavan.error.ErrorDetails;

@RestControllerAdvice
public class TouristErrorControllerAdvice {

	
	public ResponseEntity<ErrorDetails> handleTouristNotFoundException()
	{
		
	}
	
	
}
