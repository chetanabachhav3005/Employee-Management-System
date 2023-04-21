package com.hdfc.capstone.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hdfc.capstone.ems.entity.Employee;
import com.hdfc.capstone.ems.exception.EmployeeNotFoundException;
import com.hdfc.capstone.ems.service.IEmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	@Autowired
	IEmployeeService service;
	
	//Get by emp_id
	@GetMapping("/employee/{employeeID}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("employeeID") int employeeId) throws EmployeeNotFoundException{
		Employee emp=service.getEmployeeById(employeeId);
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
		
	}
	
	
}
