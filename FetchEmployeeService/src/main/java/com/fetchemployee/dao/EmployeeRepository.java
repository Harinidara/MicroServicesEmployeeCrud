package com.fetchemployee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fetchemployee.beans.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
