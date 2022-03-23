package com.codegym.casestudy.repository.customer;

import com.codegym.casestudy.model.customer.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
}
