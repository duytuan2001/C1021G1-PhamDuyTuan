package com.codegym.casestudy.service.employee.impl;

import com.codegym.casestudy.model.employee.Position;

import com.codegym.casestudy.repository.employee.IPositionRepository;
import com.codegym.casestudy.service.employee.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PositionServiceImpl implements IPositionService {

    @Autowired
    private IPositionRepository repository;

    @Override
    public List<Position> fillAll() {
        return repository.findAll();
    }

//    @Override
//    public Position findById(int id) {
//        return repository.findById(id).orElse(null);
//    }
//
//    @Override
//    public void save(Position position) {
//        repository.save(position);
//    }
//
//    @Override
//    public void remove(int id) {
//        repository.deleteById(id);
//    }
}
