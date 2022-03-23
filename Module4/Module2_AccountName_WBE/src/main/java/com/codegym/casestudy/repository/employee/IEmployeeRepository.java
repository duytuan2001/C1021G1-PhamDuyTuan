package com.codegym.casestudy.repository.employee;

import com.codegym.casestudy.model.employee.Employee;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
    Page<Employee> findByEmployeeNameContaining(String name,Pageable pageable);

}