package com.codegym.casestudy.repository.employee;

import model.EducationDegree;

import java.util.List;

public interface IEducationDegreeServiceRepository {
    List<EducationDegree> findAll();
}
