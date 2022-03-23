package com.codegym.casestudy.service.employee.impl;

import com.codegym.casestudy.model.employee.Division;
import com.codegym.casestudy.repository.employee.IDivisionRepository;
import com.codegym.casestudy.service.employee.IDivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionServiceImpl implements IDivisionService {

    @Autowired
    private IDivisionRepository repository;

    @Override
    public List<Division> fillAll() {
        return repository.findAll();
    }
//
//    @Override
//    public Division findById(int id) {
//        return repository.findById(id).orElse(null);
//    }
//
//    @Override
//    public void save(Division division) {
//        repository.save(division);
//    }
//
//    @Override
//    public void remove(int id) {
//        repository.deleteById(id);
//    }
}
