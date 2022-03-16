package com.codegym.applicationborrowbooks.service;

import com.codegym.applicationborrowbooks.model.CodeBorrow;

import java.util.List;

public interface ICodeBorrowService {

    List<CodeBorrow> fillAll();

    CodeBorrow findById(int id);

    void save(CodeBorrow category);

    void remove(int id);

}
