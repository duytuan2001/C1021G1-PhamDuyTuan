package com.codegym.applicationborrowbooks.model;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nameBook;

    @ManyToOne
    @JoinColumn(name = "id_codeBoroow", referencedColumnName = "idCodeBorrow")
    private CodeBorrow codeBorrow;


    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public CodeBorrow getCodeBorrow() {
        return codeBorrow;
    }

    public void setCodeBorrow(CodeBorrow codeBorrow) {
        this.codeBorrow = codeBorrow;
    }
}
