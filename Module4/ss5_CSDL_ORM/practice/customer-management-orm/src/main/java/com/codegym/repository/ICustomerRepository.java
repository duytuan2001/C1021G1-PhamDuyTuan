package com.codegym.repository;

import com.codegym.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    public List<Customer> findAll();
    public Customer findById(Long id);
    public void save(Customer customer);
    public void remove(Long id);
}
