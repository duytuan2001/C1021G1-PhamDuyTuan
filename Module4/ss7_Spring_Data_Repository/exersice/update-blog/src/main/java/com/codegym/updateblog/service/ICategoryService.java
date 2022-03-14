package com.codegym.updateblog.service;

import com.codegym.updateblog.model.Category;
import java.util.List;

public interface ICategoryService {

    List<Category> fillAll();

    Category findById(int id);

    void save(Category category);

    void remove(int id);
}
