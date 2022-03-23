package com.codegym.ajax_blog.restcontroller;

import com.codegym.ajax_blog.model.Blog;
import com.codegym.ajax_blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blog/v1")
@CrossOrigin("*")
public class BlogRestController {

    @Autowired
    private IBlogService blogService;

    /* Lấy danh sách tài nguyên */
    @GetMapping
    public ResponseEntity<List<Blog>> getBlogList() {
        List<Blog> blogList = blogService.fillAll();
        if (blogList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity addBlog(@RequestBody Blog blog) {
        blogService.save(blog);
        return new ResponseEntity(HttpStatus.OK);
    }


//    @GetMapping("/search")
//    public ResponseEntity<List<Blog>> searchByName(
//            @RequestParam String search
//    ) {
//        List<Blog> blogList = blogService.searchByName(search);
//        if (blogList.isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<>(blogList, HttpStatus.OK);
//    }
}


















    //    /*Update tài nguyên*/
//    @PutMapping("/{id}")
//    public ResponseEntity<Blog> updateBlog(
//            @PathVariable int id,
//            @RequestBody Blog blog
//    ) {
//        Blog currentBlog = blogService.findById(id);
//        if (currentBlog == null) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        currentBlog.setNameBlog(blog.getNameBlog());
//        currentBlog.setStarDate(blog.getStarDate());
//        currentBlog.setContent(blog.getContent());
//        currentBlog.setCategory(blog.getCategory());
//
//        blogService.save(currentBlog);
//        return new ResponseEntity<>(currentBlog, HttpStatus.NOT_FOUND);
//    }
