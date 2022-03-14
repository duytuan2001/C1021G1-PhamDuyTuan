package com.codegym.validationform.repository;

import com.codegym.validationform.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Integer> {
}
