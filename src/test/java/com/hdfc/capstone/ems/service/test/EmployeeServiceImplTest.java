package com.hdfc.capstone.ems.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hdfc.capstone.ems.entity.Employee;
import com.hdfc.capstone.ems.exception.EmployeeNotFoundException;
import com.hdfc.capstone.ems.service.IEmployeeService;

@SpringBootTest
class EmployeeServiceImplTest {

	
	
	@Autowired
	IEmployeeService service;
	
	
	@Test
	void testGetEmployeeById() throws EmployeeNotFoundException {
		Employee e=service.getEmployeeById(101);
		assertEquals(e.getEmployeeID(),101);
		assertNotNull(e);
	}


	

}
