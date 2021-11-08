package com.bridgelabz.employeepayrollapp.model;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import javax.persistence.JoinColumn;

import lombok.Data;
@Entity
@Table(name="employee_payroll")
public @Data class EmployeePayrollData {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="employee_id")
	private int employeeId;
	private String name;
	private long salary;
	private String gender;
	private LocalDate startDate;
	private String note;
	private String profilePic;
	
	@ElementCollection
	@CollectionTable(name = "employee_department", joinColumns = @JoinColumn(name = "id"))
	@Column(name="department")
	private List<String>department;
	public EmployeePayrollData() {}
	
	public EmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
		this.updateEmployePayrollData(empPayrollDTO);
	}
	private void updateEmployePayrollData(EmployeePayrollDTO empPayrollDTO) {
		this.name= empPayrollDTO.name;
		this.salary = empPayrollDTO.salary;
		this.gender = empPayrollDTO.gender;
		this.note = empPayrollDTO.note;
		this.startDate = empPayrollDTO.startDate;
		this.profilePic = empPayrollDTO.profilePic;
		this.department = empPayrollDTO.department;
		
	}
}
