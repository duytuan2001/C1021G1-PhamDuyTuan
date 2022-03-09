package com.example.extendblogapplication.service;

import com.example.extendblogapplication.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBlogService {

    Page<Blog> fillAll(Pageable pageable);

    Blog findById(int id);

    void save(Blog blog);

    void remove(int id);
}
