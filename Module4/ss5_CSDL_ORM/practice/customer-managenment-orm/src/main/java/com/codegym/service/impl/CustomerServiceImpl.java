package com.codegym.service.impl;

import com.codegym.model.Customer;
import com.codegym.repository.IGeneralRepository;
import com.codegym.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private IGeneralRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findOne(Long id) {
        return customerRepository.findOne(id);
    }

    @Override
    public void update(Long id, Customer customer) {
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }


    @Override
    public void remove(Long id) {
        customerRepository.remove(id);
    }
}
