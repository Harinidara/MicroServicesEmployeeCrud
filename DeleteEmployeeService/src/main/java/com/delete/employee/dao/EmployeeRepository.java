package com.delete.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.delete.employee.beans.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
