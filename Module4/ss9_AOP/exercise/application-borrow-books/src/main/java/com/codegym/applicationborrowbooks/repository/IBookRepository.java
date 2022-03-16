package com.codegym.applicationborrowbooks.repository;

import com.codegym.applicationborrowbooks.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Integer> {

    Page<Book> findByNameBookContaining(String name, Pageable pageable);

}
