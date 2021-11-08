package com.bridgelabz.employeepayrollapp.model;

import java.time.LocalDate;
import java.util.List;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;


import lombok.Data;

public @Data class EmployeePayrollData {
	private int employeeId;
	private String name;
	private long salary;
	private String gender;
	private LocalDate startDate;
	private String note;
	private String profilePic;
	private List<String>department;
	

	public EmployeePayrollData() {}

	public EmployeePayrollData(int empId,EmployeePayrollDTO empPayrollDTO) {
		this.employeeId = empId;
		this.name= empPayrollDTO.name;
		this.salary = empPayrollDTO.salary;
		this.gender = empPayrollDTO.gender;
		this.note = empPayrollDTO.note;
		this.startDate = empPayrollDTO.startDate;
		this.profilePic = empPayrollDTO.profilePic;
		this.department = empPayrollDTO.department;
	}
}
