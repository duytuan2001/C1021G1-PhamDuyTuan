package com.codegym.casestudy.repository.customer;

import com.codegym.casestudy.model.customer.Customer;
import com.codegym.casestudy.model.customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerTypeRepository extends JpaRepository<CustomerType, Integer> {
}
