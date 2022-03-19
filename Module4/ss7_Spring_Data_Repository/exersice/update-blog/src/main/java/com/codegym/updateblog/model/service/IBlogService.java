package com.codegym.updateblog.model.service;

import com.codegym.updateblog.model.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBlogService {

    Page<Blog> fillAll(Pageable pageable);

    Blog findById(int id);

    void save(Blog blog);

    void remove(int id);

    Page<Blog> blogSearch(String name, Pageable pageable);
}
