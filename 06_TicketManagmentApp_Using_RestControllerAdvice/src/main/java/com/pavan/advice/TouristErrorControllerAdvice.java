package com.pavan.advice;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.pavan.error.ErrorDetails;
import com.pavan.exception.TouristNotFoundException;

@RestControllerAdvice
public class TouristErrorControllerAdvice {

	@ExceptionHandler(TouristNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleTouristNotFoundException(TouristNotFoundException te) {
		System.out.println("TouristErrorControllerAdvice.handleTouristNotFoundException()");

		return new ResponseEntity<ErrorDetails>(new ErrorDetails(LocalDateTime.now(), te.getMessage(), "404-NotFound"),
				HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> handleAllProblems(TouristNotFoundException te)
	{
		System.out.println("TouristErrorControllerAdvice.handleAllProblems()");
		return new ResponseEntity<ErrorDetails>(new ErrorDetails(LocalDateTime.now(), te.getMessage(), "Some Problem In Execution"),
				HttpStatus.NOT_FOUND);
	}

}
