package com.codegym.validationform.controller;

import com.codegym.validationform.model.User;
import com.codegym.validationform.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.data.domain.Pageable;


@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/user",
            method = RequestMethod.GET)
    public ModelAndView showUserList(@PageableDefault(value = 2,
            sort = "id", direction = Sort.Direction.DESC) Pageable pageable) {
        Page<User> users = userService.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("userList", users);
        return modelAndView;
    }

}
