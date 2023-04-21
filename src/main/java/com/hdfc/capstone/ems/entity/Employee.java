package com.hdfc.capstone.ems.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

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

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@Column(name="Employee_ID")
	private int employeeID;
	
	
	@Column(name="Employee_Name")
	private String employeeName;
	
	@Column(name="Date of Birth")
	private LocalDate dateOfBirth;
}
