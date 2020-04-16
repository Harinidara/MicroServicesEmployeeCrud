package com.createemployee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.createemployee.beans.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
