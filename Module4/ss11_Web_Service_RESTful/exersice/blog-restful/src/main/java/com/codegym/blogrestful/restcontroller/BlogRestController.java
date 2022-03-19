package com.codegym.blogrestful.restcontroller;

import com.codegym.blogrestful.model.Blog;
import com.codegym.blogrestful.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blog/v1")
public class BlogRestController {

    @Autowired
    private IBlogService blogService;

    /* Lấy danh sách tài nguyên */
    @GetMapping
    public ResponseEntity<List<Blog>> getBlogList(){
     List<Blog> blogList = blogService.fillAll();
     if(blogList.isEmpty()){
         return new ResponseEntity<>(HttpStatus.NO_CONTENT);
     }
     return new ResponseEntity<>(blogList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity addBlog(@RequestBody Blog blog){
        blogService.save(blog);
        return new ResponseEntity(HttpStatus.OK);
    }

}
