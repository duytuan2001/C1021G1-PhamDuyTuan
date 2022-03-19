package com.codegym.blogrestful.service;

import com.codegym.blogrestful.model.Category;

import java.util.List;

public interface ICategoryService {

    List<Category> fillAll();

    Category findById(int id);

    void save(Category category);

    void remove(int id);
}
