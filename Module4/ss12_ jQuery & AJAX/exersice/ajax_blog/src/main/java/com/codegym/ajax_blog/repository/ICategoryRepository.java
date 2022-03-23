package com.codegym.ajax_blog.repository;

import com.codegym.ajax_blog.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category, Integer> {
}
