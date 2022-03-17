package com.codegym.casestudy.service.employee;

import model.Employee;

import java.util.List;

public interface IEmployeeService {

    List<Employee> getAllEmployee();

    void createEmployee(Employee employee);

    Employee findById(int id);

    void deleteEmployee(Employee employee);
}
