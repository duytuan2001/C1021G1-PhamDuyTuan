package com.codegym.applicationborrowbooks.service;

import com.codegym.applicationborrowbooks.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBookService {

    Page<Book> fillAll(Pageable pageable);

    Book findById(int id);

    void save(Book book);

    void remove(int id);

    Page<Book> blogSearch(String name, Pageable pageable);
}
