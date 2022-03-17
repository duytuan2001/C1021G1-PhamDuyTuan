package com.codegym.casestudy.repository.employee;

import model.Employee;

import java.util.List;

public interface IEmployeeRepository {

    List<Employee> getAllEmployee();

    void createEmployee(Employee employee);

    Employee findById(int id);

    void deleteEmployee(Employee employee);

    void updateEmployee(int id);
}