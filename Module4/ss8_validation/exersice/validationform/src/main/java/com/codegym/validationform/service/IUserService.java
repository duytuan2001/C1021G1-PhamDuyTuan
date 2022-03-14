package com.codegym.validationform.service;


import com.codegym.validationform.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IUserService {

    Page<User> findAll(Pageable pageable);

    User findById(int id);

    void save(User user);

    void remove(int id);
}
