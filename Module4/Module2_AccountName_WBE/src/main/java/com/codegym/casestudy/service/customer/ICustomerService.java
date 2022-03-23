package com.codegym.casestudy.service.customer;

import com.codegym.casestudy.model.customer.Customer;
import com.codegym.casestudy.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICustomerService {
    Page<Customer> fillAll(Pageable pageable);

    Customer findById(int id);

    void save(Customer customer);

    void deleteById(Integer id);

    Page<Customer> searchCustomer(String name, Pageable pageable);

    List<Customer> fillAll();



}
