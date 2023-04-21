package com.hdfc.capstone.ems.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.hdfc.capstone.ems.exception.EmployeeNotFoundException;

@RestControllerAdvice
public class GlobalExceptionController {

	
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<String>  handleExp(){
		
		return  new ResponseEntity<String>("Invalid Employee ID",HttpStatus.EXPECTATION_FAILED);
		
	}
	
	
}
