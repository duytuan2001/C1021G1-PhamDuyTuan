package com.codegym.casestudy.service.login;

import com.codegym.casestudy.login.User;


import java.util.List;

public interface UserService {
    List<User> findAll();
    //    void save(User user);
//    void update(User user);
    User findById(int id);
}