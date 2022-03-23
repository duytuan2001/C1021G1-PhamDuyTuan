package com.codegym.casestudy.controller;

import com.codegym.casestudy.model.employee.Employee;

import com.codegym.casestudy.service.employee.IDivisionService;
import com.codegym.casestudy.service.employee.IEducationDegreeService;
import com.codegym.casestudy.service.employee.IPositionService;
import com.codegym.casestudy.service.employee.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    private boolean isSort = false;

    @Autowired
    private IEmployeeService employeeService;

    @Autowired
    private IPositionService positionService;

    @Autowired
    private IEducationDegreeService educationDegreeService;

    @Autowired
    private IDivisionService divisionService;

    @RequestMapping(value = "",
            method = RequestMethod.GET)
    public ModelAndView showEmployeeList(@RequestParam(defaultValue = "",required = false) String sort, @RequestParam(defaultValue = "0",required = false) String page, @PageableDefault(value = 5,
            sort = "id", direction = Sort.Direction.ASC) Pageable pageable, Model model) {

        int pageNum = Integer.parseInt(page);

        Pageable sortAsc = PageRequest.of(pageNum,5,Sort.by("employeeId").ascending());

        Pageable sortDesc = PageRequest.of(pageNum,5,Sort.by("employeeId").descending());


        if(!"".equals(sort)){
            isSort = !isSort;
        }
        if(isSort) {
            Page<Employee> employeePage = employeeService.fillAll(sortDesc);
            model.addAttribute("sort","false");
            ModelAndView modelAndView = new ModelAndView("employee/employeeList");
            modelAndView.addObject("employeeList", employeePage);
            return modelAndView;
        }else {
            Page<Employee> employeePage = employeeService.fillAll(sortAsc);
            model.addAttribute("sort","true");
            ModelAndView modelAndView = new ModelAndView("employee/employeeList");
            modelAndView.addObject("employeeList", employeePage);
            return modelAndView;

        }
    }

    @GetMapping("/create")
    public ModelAndView showCreatePage() {
        ModelAndView modelAndView = new ModelAndView("employee/employeeCreate");
        modelAndView.addObject("employee", new Employee());
        modelAndView.addObject("position", positionService.fillAll());
        modelAndView.addObject("education", educationDegreeService.fillAll());
        modelAndView.addObject("division", divisionService.fillAll());
        return modelAndView;
    }

    @PostMapping("/save")
    public String createEmployee(@ModelAttribute Employee employee,
                             RedirectAttributes redirectAttributes) {
        employeeService.save(employee);
        redirectAttributes.addFlashAttribute("message",
                "Edit Employee: " + employee.getEmployeeName() + " Congratulations!");
        return "redirect:/employee/list";
    }

    @GetMapping("/{id}/edit")
    public ModelAndView showEditEmployee(@PathVariable int id) {
        Employee employee = employeeService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/employee/employeeEdit");
        modelAndView.addObject("employee", employee);
        modelAndView.addObject("position", positionService.fillAll());
        modelAndView.addObject("education", educationDegreeService.fillAll());
        modelAndView.addObject("division", divisionService.fillAll());
        return modelAndView;
    }

    @PostMapping("/edit")
    public String updateEmployee(Employee employee, RedirectAttributes redirectAttributes) {
        employeeService.save(employee);
        redirectAttributes.addFlashAttribute("message", "Edit Employee: " + employee.getEmployeeName() + " Congratulations!");
        return "redirect:/employee/list";
    }

    @PostMapping(value = "/delete")
    public String deleteEmployee(@RequestParam("id") Integer id, RedirectAttributes redirectAttributes) {
        employeeService.deleteById(id);
        redirectAttributes.addFlashAttribute("message", "Delete Employee Congratulations!");
        return "redirect:/employee/list";
    }

    @RequestMapping(value = "search",
            method = RequestMethod.GET)
    public ModelAndView seach2(@RequestParam String search, @RequestParam(defaultValue = "",required = false) String sort, @RequestParam(defaultValue = "0",required = false) String page, @PageableDefault(value = 5,
            sort = "id", direction = Sort.Direction.ASC) Pageable pageable, Model model) {

        model.addAttribute("currentValue", search);

        int pageNum = Integer.parseInt(page);

        Pageable sortAsc = PageRequest.of(pageNum,5,Sort.by("employeeId").ascending());

        Pageable sortDesc = PageRequest.of(pageNum,5,Sort.by("employeeId").descending());


        if(!"".equals(sort)){
            isSort = !isSort;
        }
        if(isSort) {
            Page<Employee> employeePage = employeeService.employeeSearch(search,sortDesc);
            model.addAttribute("sort","false");
            ModelAndView modelAndView = new ModelAndView("employee/employeeList");
            modelAndView.addObject("employeeList", employeePage);
            return modelAndView;
        }else {
            Page<Employee> employeePage = employeeService.employeeSearch(search, sortAsc);
            model.addAttribute("sort","true");
            ModelAndView modelAndView = new ModelAndView("employee/employeeList");
            modelAndView.addObject("employeeList", employeePage);
            return modelAndView;

        }
    }
}
