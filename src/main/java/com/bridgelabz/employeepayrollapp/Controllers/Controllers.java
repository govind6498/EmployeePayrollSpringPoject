package com.bridgelabz.employeepayrollapp.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;

@RestController
@RequestMapping("/employeePayrollservice")
public class Controllers {
	@RequestMapping(value= {"","/","/get"})
	public ResponseEntity<String> getEmployeePayrollData(){
		return new ResponseEntity<String>("Get Call Success",HttpStatus.OK);
	}
	@GetMapping("/get/{empId}")
	public ResponseEntity<String> getEmployeePayrollData(@PathVariable("empId") int empId){
		return new ResponseEntity<String>("Get Call Success for id:"+empId,HttpStatus.OK);
	} 
	@PostMapping("/create")
	public ResponseEntity<String>addEmployeePayrollData(@RequestBody EmployeePayrollDTO empPayrollDTO){
		return new ResponseEntity<String>("Create Employee Payroll Data for:"+empPayrollDTO,HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<String>updateEmployeePayrollData(@RequestBody EmployeePayrollDTO empPayrollDTO){
		return new ResponseEntity<String>("Update Employee Payroll data for:"+empPayrollDTO,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete{empid}")
	public ResponseEntity<String>updateEmployeePayrollData(@PathVariable("empId") int empId){
		return new ResponseEntity<String>("Delete Call Success for Id:"+empId,HttpStatus.OK);
	}
}
