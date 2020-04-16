package com.get.employee.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.get.employee.entity.Employee;
import com.get.employee.exceptions.IdNotFoundException;
import com.get.employee.service.EmployeeServiceI;

public class EmployeeController {
	@Autowired
	private EmployeeServiceI service;

	@GetMapping("/findById/{empId}")
	public Optional<Employee> getEmployeeDetails(@PathVariable Integer empId) throws IdNotFoundException {
		Optional<Employee> result=service.getEmployee(empId);
		if(result== null)
		{
			throw new IdNotFoundException("Employee with "+empId+" doesn't exist....!");
		}
		else
		{
			return result;
		}
	}

}
