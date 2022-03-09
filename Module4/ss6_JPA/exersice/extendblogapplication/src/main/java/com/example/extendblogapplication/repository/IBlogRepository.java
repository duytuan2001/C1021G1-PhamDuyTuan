package com.example.extendblogapplication.repository;

import com.example.extendblogapplication.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {
}
