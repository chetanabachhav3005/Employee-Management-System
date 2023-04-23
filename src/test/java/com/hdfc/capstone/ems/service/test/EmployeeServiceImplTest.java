package com.hdfc.capstone.ems.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hdfc.capstone.ems.config.AesEncryptor;
import com.hdfc.capstone.ems.entity.Employee;
import com.hdfc.capstone.ems.exception.EmployeeNotFoundException;
import com.hdfc.capstone.ems.repository.EmployeeRepository;
import com.hdfc.capstone.ems.service.IEmployeeService;


@SpringBootTest
class EmployeeServiceImplTest {

	@Autowired
	EmployeeRepository repo;
	
	@Autowired
	IEmployeeService service;
	  
	@Autowired
	private AesEncryptor aesEncryptor;
	
	@Test
  void insertData() {
      Employee e=new Employee();
      e.setEmployeeID(102);
      e.setEmployeeName("Vedika Deshmukh");
      e.setDateOfBirth(LocalDate.of(2000, 10, 29));
      repo.save(e);
  }
	
	@Test
	void testGetEmployeeById() throws EmployeeNotFoundException {
		Employee e=service.getEmployeeById(112);
		assertEquals(e.getEmployeeID(),112);
		System.out.println(e);
		
	}

	

}
