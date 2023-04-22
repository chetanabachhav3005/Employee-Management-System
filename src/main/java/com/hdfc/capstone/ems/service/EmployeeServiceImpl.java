package com.hdfc.capstone.ems.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.capstone.ems.entity.Employee;
import com.hdfc.capstone.ems.exception.EmployeeNotFoundException;
import com.hdfc.capstone.ems.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService{
	private static final Logger logger=LoggerFactory.getLogger(EmployeeServiceImpl.class);
	
	@Autowired
	EmployeeRepository employeeRepo;

	@Override
	public Employee getEmployeeById(int employeeId) throws EmployeeNotFoundException {
		
		
			Optional<Employee> employee=employeeRepo.findById(employeeId);
			if(employee.isPresent()) {
				Employee emp=employee.get();
				logger.info("employee found successfully :"+employeeId);
				return emp;
			}else {
				logger.error("Employee with ID "+employeeId+" Not found ");
				throw new EmployeeNotFoundException();
			}
		
	}

}