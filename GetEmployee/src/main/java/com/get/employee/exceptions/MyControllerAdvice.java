package com.get.employee.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class MyControllerAdvice {
	@ExceptionHandler(IdNotFoundException.class) 
	public ResponseEntity<String> employeeNotFound(IdNotFoundException e){ 
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.NOT_FOUND); 
	}
	
	
}
