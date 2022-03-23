package com.codegym.ajax_blog.repository;

import com.codegym.ajax_blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    Page<Blog> findByNameBlogContaining(String name,Pageable pageable);
}
