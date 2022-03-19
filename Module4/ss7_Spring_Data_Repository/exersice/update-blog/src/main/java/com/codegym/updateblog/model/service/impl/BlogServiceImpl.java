package com.codegym.updateblog.model.service.impl;

import com.codegym.updateblog.model.model.Blog;
import com.codegym.updateblog.model.repository.IBlogRepository;
import com.codegym.updateblog.model.service.IBlogService;
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

    @Override
    public Page<Blog> blogSearch(String name, Pageable pageable) {
        return repository.findByNameBlogContaining(name, pageable);
    }
}
