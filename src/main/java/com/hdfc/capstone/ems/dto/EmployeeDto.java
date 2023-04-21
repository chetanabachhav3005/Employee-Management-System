package com.hdfc.capstone.ems.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class EmployeeDto {
	
	private int employeeID;
	

	private String employeeName;

	
	private LocalDate dateOfBirth;
}
