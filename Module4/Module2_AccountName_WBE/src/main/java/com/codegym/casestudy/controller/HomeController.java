package com.codegym.casestudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("")
    public String showHomePage(){
        return "index";
    }

    @GetMapping("/page")
    public String getLoginPage(){
        return "login/login";
    }
}
