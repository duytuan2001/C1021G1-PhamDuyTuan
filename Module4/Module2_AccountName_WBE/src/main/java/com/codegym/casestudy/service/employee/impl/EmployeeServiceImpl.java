package com.codegym.casestudy.service.employee.impl;

import com.codegym.casestudy.model.employee.Employee;
import com.codegym.casestudy.repository.employee.IEmployeeRepository;
import com.codegym.casestudy.service.employee.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private IEmployeeRepository repository;

    @Override
    public Page<Employee> fillAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Employee findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void save(Employee employee) {
        repository.save(employee);
    }

    @Override
    public Page<Employee> employeeSearch(String name, Pageable pageable) {
        return repository.findByEmployeeNameContaining(name,pageable);
    }

    @Override
    public List<Employee> fillAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
