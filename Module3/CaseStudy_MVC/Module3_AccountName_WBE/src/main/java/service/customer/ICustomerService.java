package service.customer;

import model.Customer;

import java.util.List;

public interface ICustomerService {

    List<Customer> getAllCustomer();

    void createCustomer(Customer customer);

    Customer findById(int id);

    void updateCustomer(int id, Customer customer);

    void deleteCustomer(int id);

    List<Customer> searchCustomer(String name);
}
