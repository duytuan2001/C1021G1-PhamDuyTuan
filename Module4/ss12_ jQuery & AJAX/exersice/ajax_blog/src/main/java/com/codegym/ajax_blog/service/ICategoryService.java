package com.codegym.ajax_blog.service;

import com.codegym.ajax_blog.model.Category;

import java.util.List;

public interface ICategoryService {

    List<Category> fillAll();

    Category findById(int id);

    void save(Category category);

    void remove(int id);
}
