package com.fetchemployee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fetchemployee.beans.Employee;
import com.fetchemployee.dao.EmployeeRepository;
@Service
public class EmployeeService implements EmployeeServiceI{

	@Autowired
	EmployeeRepository dao;
	@Override
	public List<Employee> fetchAllEmployees() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
