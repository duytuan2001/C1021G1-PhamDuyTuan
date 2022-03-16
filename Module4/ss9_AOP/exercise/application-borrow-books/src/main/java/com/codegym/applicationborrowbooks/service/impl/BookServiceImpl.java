package com.codegym.applicationborrowbooks.service.impl;

import com.codegym.applicationborrowbooks.model.Book;
import com.codegym.applicationborrowbooks.repository.IBookRepository;
import com.codegym.applicationborrowbooks.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements IBookService {

    @Autowired
    private IBookRepository repository;

    @Override
    public Page<Book> fillAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Book findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void save(Book book) {
        repository.save(book);
    }

    @Override
    public void remove(int id) {

    }

    @Override
    public Page<Book> blogSearch(String name, Pageable pageable) {
        return repository.findByNameBookContaining(name, pageable);
    }
}
