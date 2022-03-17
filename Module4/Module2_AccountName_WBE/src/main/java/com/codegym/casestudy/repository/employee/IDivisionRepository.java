package com.codegym.casestudy.repository.employee;

import model.Division;

import java.util.List;

public interface IDivisionRepository {
    List<Division> findAll();
}
