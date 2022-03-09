package com.example.extendblogapplication.controller;

import com.example.extendblogapplication.model.Blog;
import com.example.extendblogapplication.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Date;

@Controller
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private IBlogService blogService;

    @RequestMapping(value = "/list",
            method = RequestMethod.GET)
    public ModelAndView showBlogList(@PageableDefault(value = 2,
            sort = "id", direction = Sort.Direction.DESC) Pageable pageable) {
        return new ModelAndView("/list", "blogList", blogService.fillAll(pageable));
    }

    @GetMapping("/create")
    public String showCreatePage(Model model) {
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("/save")
    public String createBlog(@ModelAttribute Blog blog,
                             RedirectAttributes redirectAttributes) {
        blog.setStarDate(new Date(System.currentTimeMillis()));
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("message",
                "Tạo Blog: " + blog.getNameBlog() + "Thành Công!");
        return "redirect:/blog/list";
    }

    @GetMapping("/{id}/edit")
    public ModelAndView showEditBlog(@PathVariable int id) {
        Blog blog = blogService.findById(id);
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("blog", blog);
        return modelAndView;
    }

    @PostMapping("edit")
    public String updateBlog(Blog blog, RedirectAttributes redirectAttributes){
        blog.setStarDate(new Date(System.currentTimeMillis()));
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("message", "Chỉnh Sửa Blog: "+ blog.getNameBlog()  +" Thành Công!");
        return "redirect:/blog/list";
    }

    @GetMapping("/{id}/delete")
    public ModelAndView showDeleteBlog(@PathVariable int id) {
        Blog blog = blogService.findById(id);
        ModelAndView modelAndView = new ModelAndView("delete");
        modelAndView.addObject("blog", blog);
        return modelAndView;
    }

    @PostMapping("delete")
    public String deleteBlog(Blog blog, RedirectAttributes redirectAttributes) {
        blogService.remove(blog.getId());
        redirectAttributes.addFlashAttribute("message", "Xóa thành công!");
        return "redirect:/blog/list";
    }

    @GetMapping("/{id}/view")
    public String viewBlog(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "/view";
    }
}
