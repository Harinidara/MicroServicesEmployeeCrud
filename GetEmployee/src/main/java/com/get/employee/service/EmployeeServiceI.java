package com.get.employee.service;

import java.util.Optional;

import com.get.employee.entity.Employee;
import com.get.employee.exceptions.IdNotFoundException;

public interface EmployeeServiceI {

	Optional<Employee> getEmployee(Integer empId) throws IdNotFoundException;

	

}
