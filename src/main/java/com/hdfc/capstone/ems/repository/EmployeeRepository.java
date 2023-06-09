package com.hdfc.capstone.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdfc.capstone.ems.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
