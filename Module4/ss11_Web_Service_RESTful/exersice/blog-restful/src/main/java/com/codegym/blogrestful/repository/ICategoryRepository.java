package com.codegym.blogrestful.repository;

import com.codegym.blogrestful.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category, Integer> {
}
