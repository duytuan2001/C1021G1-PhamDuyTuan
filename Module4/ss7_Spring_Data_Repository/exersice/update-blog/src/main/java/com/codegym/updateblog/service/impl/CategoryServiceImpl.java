package com.codegym.updateblog.service.impl;

import com.codegym.updateblog.model.Category;
import com.codegym.updateblog.repository.ICategoryRepository;
import com.codegym.updateblog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    ICategoryRepository repository;


    @Override
    public List<Category> fillAll() {
        
        return repository.findAll();
    }

    @Override
    public Category findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void save(Category category) {
        repository.save(category);
    }

    @Override
    public void remove(int id) {
        repository.deleteById(id);
    }
}
