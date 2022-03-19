package com.codegym.blogrestful.repository;

import com.codegym.blogrestful.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    Page<Blog> findByNameBlogContaining(String name,Pageable pageable);
}
