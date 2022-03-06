package com.codegym.controller;

import com.codegym.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {

    @Autowired
    IDictionaryService iDictionaryService;

    @GetMapping("/dictionary")
    public String dictionary(){
        return "index";
    }

    @PostMapping("/dictionary")
    public String result(@RequestParam String search, Model model){
        String result = iDictionaryService.searchDictionary(search);
        model.addAttribute("result",result);
        return "index";

    }
}

