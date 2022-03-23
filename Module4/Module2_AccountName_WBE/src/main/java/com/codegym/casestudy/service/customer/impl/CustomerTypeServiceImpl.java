package com.codegym.casestudy.service.customer.impl;

import com.codegym.casestudy.model.customer.Customer;
import com.codegym.casestudy.model.customer.CustomerType;
import com.codegym.casestudy.repository.customer.ICustomerTypeRepository;
import com.codegym.casestudy.service.customer.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerTypeServiceImpl implements ICustomerTypeService {

    @Autowired
    private ICustomerTypeRepository repository;

    @Override
    public List<CustomerType> fillAll() {
        return repository.findAll();
    }
}
