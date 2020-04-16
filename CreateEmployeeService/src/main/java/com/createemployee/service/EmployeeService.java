package com.createemployee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.createemployee.beans.Employee;
import com.createemployee.dao.EmployeeRepository;

@Service
@Transactional
public class EmployeeService implements EmployeeServiceI {
	
	@Autowired
	private EmployeeRepository dao;
	@Override
	public Employee createEmployee(Employee employee) {
  return dao.save(employee) ;
	}

}
