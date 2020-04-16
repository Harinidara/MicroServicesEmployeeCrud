package com.updateemployee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.updateemployee.beans.Employee;
import com.updateemployee.exceptions.IdNotFoundException;
import com.updateemployee.service.EmployeeServiceI;

public class EmployeeController {
	@Autowired
	private EmployeeServiceI service;
	@PutMapping("/update")
	public ResponseEntity<String> updateEmployee(@RequestBody Employee employee) throws IdNotFoundException {
		
		String Url="http://localhost:9876/GetEmployee/findById/"+employee.getEmployeeID();
		 RestTemplate restTemplate = new RestTemplate();
	     Employee result = restTemplate.getForObject(Url, Employee.class);
		if(result== null)
		{
			throw new IdNotFoundException("Employee with "+employee.getEmployeeID()+" already exists....!");
		}
		else
		{
			ResponseEntity< String> details = new ResponseEntity<String>(service.updateEmployee(employee),HttpStatus.OK);
			return details;
		}
		
	}
	
	
	
}
