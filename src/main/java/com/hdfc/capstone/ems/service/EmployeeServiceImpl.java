package com.hdfc.capstone.ems.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.capstone.ems.entity.Employee;
import com.hdfc.capstone.ems.exception.EmployeeNotFoundException;
import com.hdfc.capstone.ems.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

	
	@Autowired
	EmployeeRepository employeeRepo;

	@Override
	public Employee getEmployeeById(int employeeId) throws EmployeeNotFoundException {
			Optional<Employee> employee=employeeRepo.findById(employeeId);
			if(employee.isPresent()) {
				Employee emp=employee.get();
				return emp;
			}else {
				throw new EmployeeNotFoundException();
			}
		
	}

}