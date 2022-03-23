package com.codegym.casestudy.controller;

import com.codegym.casestudy.model.customer.Customer;
import com.codegym.casestudy.service.customer.ICustomerService;
import com.codegym.casestudy.service.customer.ICustomerTypeService;
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
@RequestMapping("/customer")
public class CustomerController {

    private boolean isSort = false;

    @Autowired
    private ICustomerService customerService;

    @Autowired
    private ICustomerTypeService customerTypeService;


    @RequestMapping(value = "",
            method = RequestMethod.GET)
    public ModelAndView showEmployeeList(@RequestParam(defaultValue = "",required = false) String sort, @RequestParam(defaultValue = "0",required = false) String page, @PageableDefault(value = 5,
            sort = "id", direction = Sort.Direction.ASC) Pageable pageable, Model model) {

        int pageNum = Integer.parseInt(page);

        Pageable sortAsc = PageRequest.of(pageNum,5,Sort.by("customerId").ascending());

        Pageable sortDesc = PageRequest.of(pageNum,5,Sort.by("customerId").descending());


        if(!"".equals(sort)){
            isSort = !isSort;
        }
        if(isSort) {
            Page<Customer> customerPage = customerService.fillAll(sortDesc);
            model.addAttribute("sort","false");
            ModelAndView modelAndView = new ModelAndView("customer/customerList");
            modelAndView.addObject("customerList", customerPage);
            return modelAndView;
        }else {
            Page<Customer> customerPage = customerService.fillAll(sortAsc);
            model.addAttribute("sort","true");
            ModelAndView modelAndView = new ModelAndView("customer/customerList");
            modelAndView.addObject("customerList", customerPage);
            return modelAndView;

        }
    }

    @GetMapping("/create")
    public ModelAndView showCreatePage() {
        ModelAndView modelAndView = new ModelAndView("customer/customerCreate");
        modelAndView.addObject("customer", new Customer());
        modelAndView.addObject("customerType", customerTypeService.fillAll());
        return modelAndView;
    }

    @PostMapping("/save")
    public String createBlog(@ModelAttribute Customer customer,
                             RedirectAttributes redirectAttributes) {
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("message",
                "Edit Employee: " + customer.getCustomerName() + " Congratulations!");
        return "redirect:/customer/list";
           }

    @GetMapping("/{id}/edit")
    public ModelAndView showEditCustomer(@PathVariable int id) {
        Customer customer = customerService.findById(id);
        ModelAndView modelAndView = new ModelAndView("customer/customerEdit");
        modelAndView.addObject("employee", customer);
        modelAndView.addObject("position", customerTypeService.fillAll());
        return modelAndView;
    }

    @PostMapping("/edit")
    public String updateCustomer(Customer customer, RedirectAttributes redirectAttributes) {
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("message", "Edit Employee: " + customer.getCustomerName() + " Congratulations!");
        return "redirect:/customer/list";
    }

    @PostMapping(value = "/delete")
    public String deleteCustomer(@RequestParam("id") Integer id, RedirectAttributes redirectAttributes) {
        customerService.deleteById(id);
        redirectAttributes.addFlashAttribute("message", "Delete Employee Congratulations!");
        return "redirect:/customer/list";
    }
}
