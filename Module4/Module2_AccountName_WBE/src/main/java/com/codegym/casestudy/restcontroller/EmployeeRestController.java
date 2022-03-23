package com.codegym.casestudy.restcontroller;


import com.codegym.casestudy.model.employee.Employee;
import com.codegym.casestudy.service.employee.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee/api/v1")
@CrossOrigin(origins = "*")
public class EmployeeRestController {

    @Autowired
    private IEmployeeService employeeService;

    /* Lấy danh sách tài nguyên */
    @GetMapping
    public ResponseEntity<List<Employee>> getEmployeeList() {
        List<Employee> employeeList = employeeService.fillAll();
        if (employeeList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(employeeList, HttpStatus.OK);
    }

//    @PostMapping
//    public ResponseEntity addEmployee(@RequestBody Employee employee) {
//        employeeService.save(employee);
//        return new ResponseEntity(HttpStatus.OK);
//    }


//    @GetMapping("/search")
//    public ResponseEntity<Page<Employee>> searchByName(
//            @RequestParam String search
//    ) {
//        Page<Employee> blogList = employeeService.blogSearch(search, Pageable.unpaged());
//        if (blogList.isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<>(blogList, HttpStatus.OK);
//    }

}






