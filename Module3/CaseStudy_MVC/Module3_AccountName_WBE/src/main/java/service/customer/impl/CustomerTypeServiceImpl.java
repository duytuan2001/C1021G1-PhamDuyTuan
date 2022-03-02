package service.customer.impl;

import model.CustomerType;
import repository.customer.ICustomerTypeRepository;
import repository.customer.impl.CustomerTypeRepositoryImpl;
import service.customer.ICustomerTypeService;

import java.util.List;

public class CustomerTypeServiceImpl implements ICustomerTypeService {

    private ICustomerTypeRepository icustomerTypeRepository = new CustomerTypeRepositoryImpl();

    @Override
    public List<CustomerType> getAllCustomerType() {
        return icustomerTypeRepository.getAllCustomerType();
    }
}
