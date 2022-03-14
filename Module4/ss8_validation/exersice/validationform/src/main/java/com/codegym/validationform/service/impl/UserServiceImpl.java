package com.codegym.validationform.service.impl;

import com.codegym.validationform.model.User;
import com.codegym.validationform.repository.IUserRepository;
import com.codegym.validationform.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserRepository repository;

    @Override
    public Page<User> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public User findById(int id) {
        return repository.findById(id);
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void remove(int id) {

    }
}
