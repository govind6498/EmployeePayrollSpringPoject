package com.bridgelabz.employeepayrollapp.dto;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.ToString;

public @ToString class EmployeePayrollDTO {
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message = "Employee Name Invalid")
	public String name;
	@Min(value = 500,message = "Minimum wage should be more than 500")
	public long salary;
	
	public String gender;
	@JsonFormat(pattern="dd MMM yyyy")
	public LocalDate startDate;
	public String note;
	public String profilePic;
	public List<String>department;
}
