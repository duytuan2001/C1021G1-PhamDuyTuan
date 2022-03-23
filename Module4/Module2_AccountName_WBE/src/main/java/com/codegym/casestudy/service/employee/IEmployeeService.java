package com.codegym.casestudy.service.employee;

import com.codegym.casestudy.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IEmployeeService {

    Page<Employee> fillAll(Pageable pageable);

    Employee findById(int id);

    void save(Employee employee);


    Page<Employee> employeeSearch(String name, Pageable pageable);

    List<Employee> fillAll();

    void deleteById(Integer id);
}
