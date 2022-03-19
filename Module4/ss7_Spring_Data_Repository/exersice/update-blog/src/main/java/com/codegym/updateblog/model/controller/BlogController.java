package com.codegym.updateblog.model.controller;

import com.codegym.updateblog.model.model.Blog;
import com.codegym.updateblog.model.service.IBlogService;
import com.codegym.updateblog.model.service.ICategoryService;
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

import java.util.Date;

@Controller
@RequestMapping("/blog")
public class BlogController {

    private boolean isSort = false;

    @Autowired
    private IBlogService blogService;

    @Autowired
    private ICategoryService categoryService;

    @RequestMapping(value = "/list",
            method = RequestMethod.GET)
    public ModelAndView showBlogList(@RequestParam(defaultValue = "",required = false) String sort,@RequestParam(defaultValue = "0",required = false) String page,@PageableDefault(value = 5,
            sort = "id", direction = Sort.Direction.ASC) Pageable pageable, Model model) {

        int pageNum = Integer.parseInt(page);
        Pageable sortDesc = PageRequest.of(pageNum,5,Sort.by("starDate").descending());

        Pageable sortAsc = PageRequest.of(pageNum,5,Sort.by("starDate").ascending());

        if(!"".equals(sort)){
            isSort = !isSort;
        }
        if(isSort) {
            Page<Blog> blogPage = blogService.fillAll(sortAsc);
            model.addAttribute("sort","true");
            ModelAndView modelAndView = new ModelAndView("/blog/list");
            modelAndView.addObject("blogList", blogPage);
            return modelAndView;
        }else {
            Page<Blog> blogPage = blogService.fillAll(sortDesc);
            model.addAttribute("sort","false");
            ModelAndView modelAndView = new ModelAndView("/blog/list");
            modelAndView.addObject("blogList", blogPage);
            return modelAndView;

        }
    }

    @GetMapping("/create")
    public ModelAndView showCreatePage() {
        ModelAndView modelAndView = new ModelAndView("blog/create");
        modelAndView.addObject("blog", new Blog());
        modelAndView.addObject("category", categoryService.fillAll());
        return modelAndView;
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
        ModelAndView modelAndView = new ModelAndView("/blog/edit");
        modelAndView.addObject("blog", blog);
        modelAndView.addObject("category", categoryService.fillAll());
        return modelAndView;
    }

    @PostMapping("edit")
    public String updateBlog(Blog blog, RedirectAttributes redirectAttributes) {
        blog.setStarDate(new Date(System.currentTimeMillis()));
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("message", "Chỉnh Sửa Blog: " + blog.getNameBlog() + " Thành Công!");
        return "redirect:/blog/list";
    }

    @GetMapping("/{id}/delete")
    public ModelAndView showDeleteBlog(@PathVariable int id) {
        Blog blog = blogService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/blog/delete");
        modelAndView.addObject("blog", blog);
        modelAndView.addObject("category", categoryService.fillAll());
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
        return "/blog/view";
    }

    @GetMapping("/search")
    public String search(@RequestParam String search, @PageableDefault(size = 5)Pageable pageable, Model model){
        Page<Blog> blogSearch = blogService.blogSearch(search, pageable);
        model.addAttribute("currentValue", search);
        model.addAttribute("blogSearch", blogSearch);
        return "blog/search";
    }
}
