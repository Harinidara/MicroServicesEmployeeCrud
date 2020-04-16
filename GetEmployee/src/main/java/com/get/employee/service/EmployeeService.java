package com.get.employee.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.get.employee.dao.EmployeeRepository;
import com.get.employee.entity.Employee;
import com.get.employee.exceptions.IdNotFoundException;


@Service
@Transactional
public class EmployeeService implements EmployeeServiceI {
	
	
	@Autowired
	private EmployeeRepository dao;
	

	@Override
	public Optional<Employee> getEmployee(Integer empId) throws IdNotFoundException {
		return dao.findById(empId);


}
}
