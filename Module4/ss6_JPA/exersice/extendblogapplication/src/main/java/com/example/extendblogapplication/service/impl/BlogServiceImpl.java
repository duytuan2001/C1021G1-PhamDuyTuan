package com.example.extendblogapplication.service.impl;

import com.example.extendblogapplication.model.Blog;
import com.example.extendblogapplication.repository.IBlogRepository;
import com.example.extendblogapplication.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements IBlogService {

    @Autowired
    private IBlogRepository repository;

    @Override
    public Page<Blog> fillAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Blog findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void save(Blog blog) {
        repository.save(blog);
    }

    @Override
    public void remove(int id) {
        repository.deleteById(id);
    }
}
