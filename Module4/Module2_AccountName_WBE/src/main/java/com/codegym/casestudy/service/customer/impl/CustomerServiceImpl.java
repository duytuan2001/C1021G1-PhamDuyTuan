package com.codegym.casestudy.service.customer.impl;

import com.codegym.casestudy.model.customer.Customer;
import com.codegym.casestudy.repository.customer.ICustomerRepository;
import com.codegym.casestudy.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    ICustomerRepository repository;

    @Override
    public Page<Customer> fillAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Customer findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) {
        repository.save(customer);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Page<Customer> searchCustomer(String name, Pageable pageable) {
        return null;
    }

    @Override
    public List<Customer> fillAll() {
        return null;
    }
}
