package com.delete.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delete.employee.exception.IdNotFoundException;
import com.delete.employee.service.EmployeeServiceI;

@RestController
@RequestMapping("/Delete")
@CrossOrigin("http://localhost:4200")
public class EmployeeController {

	
	@Autowired
	private EmployeeServiceI service;
	
	
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<String> deleteEmployee(@PathVariable Integer empId) throws IdNotFoundException{
		ResponseEntity<String> rs =  new ResponseEntity<String>(service.deleteEmployee(empId),HttpStatus.OK);
		return rs;
	}
}
