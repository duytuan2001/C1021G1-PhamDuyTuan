package com.codegym.applicationborrowbooks.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class CodeBorrow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCodeBorrow;

    private String nameCodeBorrow;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeBorrow")
    private Set<Book> books;

    public CodeBorrow() {
    }

    public int getIdCodeBorrow() {
        return idCodeBorrow;
    }

    public void setIdCodeBorrow(int idCodeBorrow) {
        this.idCodeBorrow = idCodeBorrow;
    }

    public String getNameCodeBorrow() {
        return nameCodeBorrow;
    }

    public void setNameCodeBorrow(String nameCodeBorrow) {
        this.nameCodeBorrow = nameCodeBorrow;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
