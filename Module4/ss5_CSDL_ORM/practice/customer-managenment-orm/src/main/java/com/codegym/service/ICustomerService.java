package com.codegym.service;

import com.codegym.model.Customer;

import java.util.List;

public interface ICustomerService extends IGeneralService {

    List<Customer> findAll();

    void save(Customer customer);

    Customer findOne(Long id);

    void update(Long id, Customer customer);

    void remove(Long id);
}
