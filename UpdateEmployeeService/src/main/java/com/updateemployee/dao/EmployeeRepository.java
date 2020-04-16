package com.updateemployee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.updateemployee.beans.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
