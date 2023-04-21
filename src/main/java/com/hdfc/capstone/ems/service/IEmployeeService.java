package com.hdfc.capstone.ems.service;

import com.hdfc.capstone.ems.entity.Employee;
import com.hdfc.capstone.ems.exception.EmployeeNotFoundException;

public interface IEmployeeService {
	
	public Employee getEmployeeById(int employeeId) throws EmployeeNotFoundException;
	
}
