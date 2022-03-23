package com.codegym.casestudy.repository;

import com.codegym.casestudy.login.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String name);
}
