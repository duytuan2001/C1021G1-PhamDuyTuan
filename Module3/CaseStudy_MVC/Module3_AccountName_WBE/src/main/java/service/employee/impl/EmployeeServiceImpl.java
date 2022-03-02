package service.employee.impl;

import model.Employee;
import repository.employee.IEmployeeRepository;
import repository.employee.impl.EmployeeRepositoryImpl;

import service.employee.IEmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {

    private static IEmployeeRepository IEmployeeRepository = new EmployeeRepositoryImpl();

    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> employeeList = IEmployeeRepository.getAllEmployee();
        if(employeeList.size()==0){
            return null;
        }
        return IEmployeeRepository.getAllEmployee();
    }

    @Override
    public void createEmployee(Employee employee) {
        IEmployeeRepository.createEmployee(employee);
    }

    @Override
    public Employee findById(int id) {
        return null;
    }

    @Override
    public void deleteEmployee(Employee employee) {
        IEmployeeRepository.deleteEmployee(employee);
    }


}
