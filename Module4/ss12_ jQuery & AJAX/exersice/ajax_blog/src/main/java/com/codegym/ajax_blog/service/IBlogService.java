package com.codegym.ajax_blog.service;

import com.codegym.ajax_blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {

    Page<Blog> fillAll(Pageable pageable);

    List<Blog> fillAll();

    Blog findById(int id);

    void save(Blog blog);

    void remove(int id);

    Page<Blog> blogSearch(String name, Pageable pageable);

}
