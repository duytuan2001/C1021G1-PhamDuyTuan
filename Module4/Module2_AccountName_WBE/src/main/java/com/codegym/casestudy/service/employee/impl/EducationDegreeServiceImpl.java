package com.codegym.casestudy.service.employee.impl;

import com.codegym.casestudy.model.employee.EducationDegree;
import com.codegym.casestudy.repository.employee.IEducationDegreeRepository;
import com.codegym.casestudy.service.employee.IEducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EducationDegreeServiceImpl implements IEducationDegreeService {

    @Autowired
    private IEducationDegreeRepository repository;

    @Override
    public List<EducationDegree> fillAll() {
        return repository.findAll();
    }

//    @Override
//    public EducationDegree findById(int id) {
//        return repository.findById(id).orElse(null);
//    }
//
//    @Override
//    public void save(EducationDegree educationDegree) {
//        repository.save(educationDegree);
//    }
//
//    @Override
//    public void remove(int id) {
//        repository.deleteById(id);
//    }
}
