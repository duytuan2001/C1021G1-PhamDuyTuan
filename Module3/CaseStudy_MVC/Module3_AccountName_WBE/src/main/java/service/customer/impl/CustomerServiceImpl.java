package service.customer.impl;

import model.Customer;
import repository.customer.ICustomerRepository;
import repository.customer.impl.CustomerRepositoryImpl;
import service.customer.ICustomerService;

import java.util.List;

public class CustomerServiceImpl implements ICustomerService {

    private static ICustomerRepository iCustomerRepository = new CustomerRepositoryImpl();

    @Override
    public List<Customer> getAllCustomer() {
        List<Customer> customerList = iCustomerRepository.getAllCustomer();
        if (customerList.size() == 0) {
            return null;
        }
        return iCustomerRepository.getAllCustomer();
    }

    @Override
    public void createCustomer(Customer customer) {
        iCustomerRepository.createCustomer(customer);
    }

    @Override
    public Customer findById(int id) {
        return iCustomerRepository.findById(id);
    }

    @Override
    public void updateCustomer(int id, Customer customer ) {
        iCustomerRepository.updateCustomer(id, customer);
    }

    @Override
    public void deleteCustomer(int id) {
        iCustomerRepository.deleteCustomer(id);
    }


    @Override
    public List<Customer> searchCustomer(String name) {
        return iCustomerRepository.searchCustomer(name);
    }


}
