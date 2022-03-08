package com.codegym.repository;

import com.codegym.model.Customer;

import java.util.List;

public interface IGeneralRepository {
    List<Customer> findAll();

    Customer findOne(Long id);

    void save(Customer customer);

    void remove(Long id);

}
