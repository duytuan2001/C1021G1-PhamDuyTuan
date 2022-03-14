package com.codegym.applicationborrowbooks.controller;

import com.codegym.applicationborrowbooks.model.Book;
import com.codegym.applicationborrowbooks.service.IBookService;
import com.codegym.applicationborrowbooks.service.ICodeBorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/book")
public class BookController {

    private boolean isSort = false;

    @Autowired
    private IBookService bookService;

//    @Autowired
//    private ICodeBorrowService codeBorrowService;

    @RequestMapping(value = "/list",
            method = RequestMethod.GET)
    public ModelAndView showBookList(@RequestParam(defaultValue = "", required = false) String sort, @RequestParam(defaultValue = "0", required = false) String page, @PageableDefault(value = 5,
            sort = "id", direction = Sort.Direction.ASC) Pageable pageable, Model model) {

        int pageNum = Integer.parseInt(page);
        Pageable sortDesc = PageRequest.of(pageNum, 5, Sort.by("starDate").descending());

        Pageable sortAsc = PageRequest.of(pageNum, 5, Sort.by("starDate").ascending());

        if (!"".equals(sort)) {
            isSort = !isSort;
        }
        if (isSort) {
            Page<Book> blogPage = bookService.fillAll(sortAsc);
            model.addAttribute("sort", "true");
            ModelAndView modelAndView = new ModelAndView("/book/list");
            modelAndView.addObject("blogList", blogPage);
            return modelAndView;
        } else {
            Page<Book> blogPage = bookService.fillAll(sortDesc);
            model.addAttribute("sort", "false");
            ModelAndView modelAndView = new ModelAndView("/book/list");
            modelAndView.addObject("blogList", blogPage);
            return modelAndView;

        }

    }
}
