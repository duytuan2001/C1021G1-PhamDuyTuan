package com.codegym.controller;

import com.codegym.model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmailController {

    @GetMapping("/list")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("list", "email", new Email());
        return modelAndView;
    }

    @PostMapping("/display")
    public String Emails(@ModelAttribute("email") Email email, Model model) {
        model.addAttribute("language", email.getLanguage());
        model.addAttribute("pageSize", email.getPageSize());
        model.addAttribute("spamsFilter", email.getSpamsFilter());
        model.addAttribute("signature", email.getSignature());
        return "result";


    }
}
