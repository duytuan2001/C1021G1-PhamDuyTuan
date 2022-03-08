package com.codegym.service;

import com.codegym.model.Customer;

import java.util.List;

public interface IGeneralService {
    List<Customer> findAll();

    Customer findOne(Long id);

    void save(Customer customer);

    void remove(Long id);
}
