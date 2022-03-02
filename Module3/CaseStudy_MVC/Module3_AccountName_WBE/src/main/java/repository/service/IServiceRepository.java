package repository.service;

import model.Customer;

import java.util.List;

public interface IServiceRepository {
    List<Customer> getAllEmployee();

    void saveCustomer(Customer customer);

    Customer findByEmployee(int codeCustomer);

    void updateCustomer(Customer customer);
}
