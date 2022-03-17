package com.codegym.casestudy.repository.employee.impl;

import model.Employee;
import repository.BaseRepository;
import repository.employee.IEmployeeRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements IEmployeeRepository {

    private static String SELECT_INNER_JOIN_EMPLOYEE = "select e.employee_id,\n" +
            "e.employee_name,\n" +
            "e.employee_birthday,\n" +
            "e.employee_id_card,\n" +
            "e.employee_salary,\n" +
            "e.employee_phone,\n" +
            "e.employee_email,\n" +
            "e.employee_address,\n" +
            "p.position_name,\n" +
            "ed.education_degree_name,\n" +
            "d.division_name,\n" +
            "e.username\n" +
            "from employee e\n" +
            "join position p on e.position_id = p.position_id\n" +
            "join education_degree ed on e.education_degree_id = ed.education_degree_id\n" +
            "join division d on e.division_id = d.division_id";

    private static String INSERT_EMPLOYEE = "INSERT INTO `employeee` ( `employee_id`,\n" +
            "`employee_name`,\n" +
            "`employee_birthday`" +
            "`employee_id_card`,\n" +
            "`employee_salary`,\n" +
            "`employee_phone`,\n" +
            "`employee_email`,\n" +
            "`employee_address`,\n" +
            "`position_name`,\n" +
            "`education_degree_name`,\n" +
            "`division_name`,\n" +
            "`username`) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    private static String DELETE_EMPLOYEE = "delete from employee where id_customer = ?";

    private BaseRepository baseRepository = new BaseRepository();



    @Override
    public List<Employee> getAllEmployee() {
        Connection connection = BaseRepository.getConnection();
        List<Employee> list = new ArrayList<>();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_INNER_JOIN_EMPLOYEE);
                resultSet = preparedStatement.executeQuery();
                Employee employee;
                while (resultSet.next()) {

                    employee = new Employee();

                    employee.setEmployeeId(resultSet.getInt("employee_id"));
                    employee.setEmployeeName(resultSet.getString("employee_name"));
                    employee.setEmployeeBirthday(resultSet.getString("employee_birthday"));
                    employee.setEmployeeIdCard(resultSet.getString("employee_id_card"));
                    employee.setEmployeeSalary(resultSet.getDouble("employee_salary"));
                    employee.setEmployeePhone(resultSet.getString("employee_phone"));
                    employee.setEmployeeEmail(resultSet.getString("employee_email"));
                    employee.setEmployeeAddress(resultSet.getString("employee_address"));

                    employee.setPositionName(resultSet.getString("position_name"));
                    employee.setEducationDegreeName(resultSet.getString("education_degree_name"));
                    employee.setDivisionName(resultSet.getString("division_name"));
                    employee.setUser(resultSet.getString("username"));

                    list.add(employee);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return list;
    }

    @Override
    public void createEmployee(Employee employee) {
        Connection connection = BaseRepository.getConnection();
        PreparedStatement preparedStatement = null;
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(INSERT_EMPLOYEE);
                preparedStatement.setString(1,employee.getEmployeeName());
                preparedStatement.setString(2,employee.getEmployeeBirthday());
                preparedStatement.setString(3,employee.getEmployeeIdCard());
                preparedStatement.setDouble(4,employee.getEmployeeSalary());
                preparedStatement.setString(5,employee.getEmployeePhone());
                preparedStatement.setString(6,employee.getEmployeeEmail());
                preparedStatement.setString(7,employee.getEmployeeAddress());
                preparedStatement.setInt(8,employee.getPositionId());
                preparedStatement.setInt(9,employee.getEducationDegreeId());
                preparedStatement.setInt(10,employee.getDivisionId());
                preparedStatement.executeUpdate();
            }catch (SQLException e){
                e.printStackTrace();
            }finally {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }

    @Override
    public Employee findById(int codeEmployee) {
//        Employee employee = null;
//        Connection connection = BaseRepository.getConnection();
//        ResultSet resultSet;
//        PreparedStatement preparedStatement = null;
//        if (connection != null) {
//            try {
//                preparedStatement = connection.prepareStatement("");
//                preparedStatement.setInt(1, id);
//                resultSet = preparedStatement.executeQuery();
//                while (resultSet.next()) {
//                    String code = resultSet.getString("customer_code");
//                    String name = resultSet.getString("customer_name");
//                    String birthday = resultSet.getString("customer_birthday");
//                    boolean gender = resultSet.getBoolean("customer_gender");
//                    String idCard = resultSet.getString("customer_id_card");
//                    String phone = resultSet.getString("customer_phone");
//                    String email = resultSet.getString("customer_email");
//                    String address = resultSet.getString("customer_address");
//                    int cusTypeId = resultSet.getInt("customer_type_id");
//                    employee = new Customer(code, cusTypeId, name, birthday, gender, idCard, phone, email, address);
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            } finally {
//                try {
//                    connection.close();
//                } catch (SQLException throwables) {
//                    throwables.printStackTrace();
//                }
//            }
//        }
        return null;
    }

    @Override
    public void deleteEmployee(Employee employee) {

    }

    @Override
    public void updateEmployee(int id) {

    }


}
