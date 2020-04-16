package com.delete.employee.service;

import com.delete.employee.exception.IdNotFoundException;

public interface EmployeeServiceI  {

	String deleteEmployee(Integer empId) throws IdNotFoundException;

}
