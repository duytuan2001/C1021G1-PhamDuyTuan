package com.codegym.updateblog.model.repository;

import com.codegym.updateblog.model.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category, Integer> {
}
