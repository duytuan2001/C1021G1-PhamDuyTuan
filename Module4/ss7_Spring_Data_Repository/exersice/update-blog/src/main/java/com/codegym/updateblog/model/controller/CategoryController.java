package com.codegym.updateblog.model.controller;

import com.codegym.updateblog.model.model.Category;
import com.codegym.updateblog.model.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/list")
    public ModelAndView showCategoryList() {
        return new ModelAndView("/category/list",
                "categoryList", categoryService.fillAll());
    }

    @GetMapping("/create")
    public String showCreateCategory(Model model) {
        model.addAttribute("category", new Category());
        return "/category/create";
    }

    @PostMapping("/save")
    public String createCategory(@ModelAttribute Category category,
                             RedirectAttributes redirectAttributes) {
        categoryService.save(category);
        redirectAttributes.addFlashAttribute("message",
                "Tạo Category: " + category.getNameCategory() + "Thành Công!");
        return "redirect:/category/list";
    }

    @GetMapping("/{id}/edit")
    public ModelAndView showEditCategory(@PathVariable int id) {
        Category category = categoryService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/category/edit");
        modelAndView.addObject("category", category);
        return modelAndView;
    }

    @PostMapping("edit")
    public String updateCategory(Category category, RedirectAttributes redirectAttributes){
        categoryService.save(category);
        redirectAttributes.addFlashAttribute("message", "Chỉnh Sửa Blog: "+ category.getNameCategory()  +" Thành Công!");
        return "redirect:/category/list";
    }

    @GetMapping("/{id}/delete")
    public ModelAndView showDeleteCategory(@PathVariable int id) {
        Category category = categoryService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/category/delete");
        modelAndView.addObject("category", category);
        return modelAndView;
    }

    @PostMapping("delete")
    public String deleteCategory(Category category, RedirectAttributes redirectAttributes) {
        categoryService.remove(category.getIdCategory());
        redirectAttributes.addFlashAttribute("message", "Xóa thành công!");
        return "redirect:/category/list";
    }

    @GetMapping("/{id}/view")
    public String viewCategory(@PathVariable int id, Model model) {
        model.addAttribute("category", categoryService.findById(id));
        return "/category/view";
    }
}
