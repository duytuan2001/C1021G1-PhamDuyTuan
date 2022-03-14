package com.codegym.updateblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.codegym.updateblog.model.Category;

public interface ICategoryRepository extends JpaRepository<Category, Integer> {
}
