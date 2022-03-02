package service.service;

import model.Customer;

import java.util.List;

public interface IServiceService {
    List<Customer> getAllEmployee();

    void saveCustomer(Customer customer);

    Customer findByEmployee(int codeCustomer);


}
