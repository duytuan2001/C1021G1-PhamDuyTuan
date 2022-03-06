package com.codegym.controller;

import com.codegym.service.ICalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @Autowired
    ICalculateService iCalculateService;

    @GetMapping("/")
    public String calculate() {
        return "index";
    }

    @PostMapping("/calculate")
    public String results(@RequestParam String number,
                          @RequestParam double number1,
                          @RequestParam double number2, Model model) {
        double ketQua = iCalculateService.calculation(number, number1, number2);
        model.addAttribute("result", ketQua);
        return "index";
    }
}
